package racingcar.io;

import java.util.Map;

public class OutputHandler {
    public static void printRoundResult(Map<String, String> result) {
        result.entrySet().stream()
                .forEach(entry -> {
                    String carName = entry.getKey();
                    String roundScore = makeRepeatScore(entry.getValue());
                    Printer.printMessageWithFormat("%s : %s", carName, roundScore);
                });
    }

    private static String makeRepeatScore(String score) {
        int scoreNumber = Integer.parseInt(score);
        return "-".repeat(scoreNumber);
    }
}
