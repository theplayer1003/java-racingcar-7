package racingcar.domain.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import racingcar.domain.action.ActionPolicy;

public class Car {
    private final CarName name;
    private final ActionPolicy actionPolicy;
    private CarMoveScore score;

    public Car(CarName name, CarMoveScore score, ActionPolicy actionPolicy) {
        this.name = name;
        this.score = score;
        this.actionPolicy = actionPolicy;
    }

    public int getRandomNumber() {
        return RandomNumberGenerator.getRandomNumber();
    }

    public void updateMoveScore() {
        score = score.addMoveScore(actionPolicy.moveCar(this));
    }

    public void getNameAndScore(Map<String, String> NameAndScore) {
        NameAndScore.put(name.toString(), score.toString());
    }

    public CarMoveScore compareForHighScore(CarMoveScore otherScore) {
        if (score.compareTo(otherScore) >= 0) {
            return score;
        }

        return otherScore;
    }

    public CarName findHighScoreCarName(CarMoveScore highScore) {
        if (score.compareTo(highScore) == 0) {
            return name;
        }

        return null;
    }
}
