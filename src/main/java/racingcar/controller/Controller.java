package racingcar.controller;

import java.util.List;
import java.util.stream.IntStream;
import racingcar.controller.util.UserInputParser;
import racingcar.domain.CarFactory;
import racingcar.domain.ServiceHandler;
import racingcar.io.InputHandler;
import racingcar.io.OutputHandler;

public class Controller {
    private final CarFactory carFactory = new CarFactory();

    public void run() {
        List<String> carNames = makeCarNames();

        ServiceHandler serviceHandler = new ServiceHandler(carNames, carFactory);

        int round = getRoundNumber();
        for (int i = 0; i < round; i++) {
            playOneRound(serviceHandler);
        }

        printFinalResult(serviceHandler);
    }

    private void printFinalResult(ServiceHandler serviceHandler) {
        List<String> winners = serviceHandler.getWinners();
        OutputHandler.printWinners(winners);
    }

    private void playOneRound(ServiceHandler serviceHandler) {
        serviceHandler.moveSequence();
        OutputHandler.printRoundResult(serviceHandler.getResult());
    }

    private int getRoundNumber() {
        String round = InputHandler.getRoundNumber();
        return Integer.parseInt(round);
    }

    private List<String> makeCarNames() {
        String userInput = InputHandler.getCarNames();
        return UserInputParser.parseCarName(userInput);
    }
}
