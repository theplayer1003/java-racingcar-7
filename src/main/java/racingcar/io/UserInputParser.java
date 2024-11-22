package racingcar.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInputParser {
    public static List<String> parseCarName(String userInput) {
        List<String> carNames = new ArrayList<>();

        carNames = Arrays.asList(userInput.trim().split(","));

        return carNames;
    }

    public static int parseInteger(String userInput) {
        return Integer.parseInt(userInput);
    }
}
