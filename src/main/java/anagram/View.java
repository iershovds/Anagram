package anagram;

import static anagram.Constants.*;

import java.util.Scanner;

public class View {

    private Scanner sourceInput = new Scanner(System.in);

    public void printUnreversedData(String inputData) {
        System.out.println(INPUT_TITLE + inputData);
    }

    public void printReversedData(String outputData) {
        System.out.println(OUTPUT_TITLE + outputData);
    }

    public void printAskForInput() {
        System.out.println(ASK_USER_TO_ENTER_DATA);
    }

    public void printInputDataForReverse() {
        System.out.println(INPUT_FOR_REVERSE);
    }

    public void printWrongAnswer() {
        System.out.println(INCORRECT_ANSWER);
        System.out.println(ENTER_CORRECT_ANSWER);
    }

    public void printShutDownApp() {
        System.out.println(SHUT_DOWN_APP);
    }

    public String getUserAnswer() {
        return sourceInput.nextLine().toUpperCase();
    }

    public String getUserData() {
        return sourceInput.nextLine();
    }

    public void closeInputSource() {
        sourceInput.close();
    }
}