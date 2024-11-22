package racingcar.domain.car;

import racingcar.domain.action.ActionPolicy;

public class Car {
    private final CarMoveScore score;
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
        score.addMoveScore(actionPolicy.moveCar(this));
    }
}
