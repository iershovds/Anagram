package anagram;

import static anagram.Constants.*;

public class Controller {
    private View app;
    private Reverse reverse;

    public void startApplication() {
        startApp();
        while (checkUserAnswer(app.getUserAnswer())) {
            String inputData = app.getUserData();
            app.printUnreversedData(inputData);
            app.printReversedData(reverse.reverse(inputData));
            continueApp();
        }
        app.closeInputSource();
    }

    private void startApp() {
        app = new View();
        reverse = new Reverse();
        continueApp();
    }

    private void continueApp() {
        app.printAskForInput();
    }

    private boolean checkUserAnswer(String answerInput) {
        String answer = processUserAnswer(answerInput);
        if (YES.equals(answer)) {
            app.printInputDataForReverse();
            return true;
        } else {
            app.printShutDownApp();
            return false;
        }
    }

    private String processUserAnswer(String answer) {
        if (YES.equals(answer) || NO.equals(answer)) {
            return answer;
        } else {
            return processIncorrectAnswer();
        }
    }

    private String processIncorrectAnswer() {
        app.printWrongAnswer();
        return processUserAnswer(app.getUserAnswer());
    }
}
