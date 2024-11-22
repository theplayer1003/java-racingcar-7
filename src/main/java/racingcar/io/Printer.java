package racingcar.io;

public class Printer {
    public static void printNewLine() {
        System.out.println();
    }

    public static void printMessage(String message) {
        System.out.printf(message);
    }

    public static void printMessageWithFormat(String format, Object... args) {
        System.out.printf(format, args);
    }
}
