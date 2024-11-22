package racingcar.controller;

import java.util.List;
import java.util.stream.IntStream;
import racingcar.controller.util.UserInputParser;
import racingcar.domain.CarFactory;
import racingcar.domain.ServiceHandler;
import racingcar.io.InputHandler;
import racingcar.io.OutputHandler;

public class Controller {
    public void run() {
        String userInput = InputHandler.getCarNames();
        List<String> carNames = UserInputParser.parseCarName(userInput);

        CarFactory carFactory = new CarFactory();
        ServiceHandler serviceHandler = new ServiceHandler(carNames, carFactory);

        String round = InputHandler.getRoundNumber();
        for (int i = 0; i < Integer.parseInt(round); i++) {
            serviceHandler.moveSequence();
            OutputHandler.printRoundResult(serviceHandler.getResult());
        }


    }
}
