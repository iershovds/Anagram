package anagram;

import static org.apache.commons.lang3.StringUtils.*;

public class Reverse {

    public String reverse(String input) {
        if (checkInputForException(input)) {
            return input;
        }
        String[] words = input.split(SPACE);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            output.append(SPACE + reverseWord(words[i]));
        }
        return output.toString().replaceFirst(SPACE, EMPTY);
    }

    private String reverseWord(String wordForReverse) {
        char[] letters = wordForReverse.toCharArray();
        int rightIterator = letters.length - 1;
        int leftIterator = 0;
        while (leftIterator < rightIterator) {
            if (Character.isLetter(letters[leftIterator]) && Character.isLetter(letters[rightIterator])) {
                char tmp = letters[leftIterator];
                letters[leftIterator] = letters[rightIterator];
                letters[rightIterator] = tmp;
                leftIterator++;
                rightIterator--;
            } else if (!Character.isLetter(letters[leftIterator])) {
                leftIterator++;
            } else {
                rightIterator--;
            }
        }
        return String.valueOf(letters);
    }

    private boolean checkInputForException(String input) {
        return input == null || input.replaceAll(SPACE, EMPTY).length() == 0;
    }
}