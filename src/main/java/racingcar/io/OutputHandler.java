package racingcar.io;

import java.util.List;
import java.util.Map;

public class OutputHandler {
    public static void printRoundResult(Map<String, String> result) {
        Printer.printNewLine();
        Printer.printMessage("실행 결과");
        Printer.printNewLine();

        result.entrySet().stream()
                .forEach(entry -> {
                    String carName = entry.getKey();
                    String roundScore = makeRepeatScore(entry.getValue());
                    Printer.printMessageWithFormat("%s : %s", carName, roundScore);
                    Printer.printNewLine();
                });

        Printer.printNewLine();
    }

    public static void printWinners(List<String> winners) {
        String finalResult = makefinalResult(winners);
        Printer.printMessageWithFormat("최종 우승자 : %s", finalResult);
    }

    private static String makefinalResult(List<String> winners) {
        return String.join(", ", winners);
    }

    private static String makeRepeatScore(String score) {
        int scoreNumber = Integer.parseInt(score);
        return "-".repeat(scoreNumber);
    }
}
