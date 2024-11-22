package racingcar.io;

public class InputHandler {
    public static String getCarNames() {
        Printer.printMessage("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        Printer.printNewLine();

        return Reader.getString();
    }

    public static String getRoundNumber() {
        Printer.printMessage("시도할 횟수는 몇 회인가요?");
        Printer.printNewLine();

        return Reader.getString();
    }
}
