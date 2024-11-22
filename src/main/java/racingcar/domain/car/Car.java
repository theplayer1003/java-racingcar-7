package racingcar.domain.car;

import java.util.Map;
import racingcar.domain.action.ActionPolicy;

public class Car {
    private CarMoveScore score;
    private final CarName name;
    private final ActionPolicy actionPolicy;

    public Car(CarMoveScore score, CarName name, ActionPolicy actionPolicy) {
        this.score = score;
        this.name = name;
        this.actionPolicy = actionPolicy;
    }

    public int getRandomNumber() {
        return RandomNumberGenerator.getRandomNumber();
    }

    public void updateMoveScore() {
        score = score.addMoveScore(actionPolicy.moveCar(this));
    }

    public void getNameAndScore(Map<String, String> NameAndScore) {
        NameAndScore.put(name.toString(),score.toString());
    }
}
