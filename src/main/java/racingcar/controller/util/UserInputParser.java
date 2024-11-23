package racingcar.controller.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInputParser {
    public static List<String> parseCarName(String userInput) {
        return Arrays.asList(userInput.trim().split(","));
    }

    public static int parseInteger(String userInput) {
        return Integer.parseInt(userInput);
    }
}
