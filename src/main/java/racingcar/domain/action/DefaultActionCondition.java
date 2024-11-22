package racingcar.domain.action;

import racingcar.domain.car.Car;

public class DefaultActionCondition implements ActionCondition {
    private static final int MOVE_THRESHOLD = 4;

    @Override
    public boolean isSatisfiedBy(Car car) {
        if (car.getRandomNumber() > MOVE_THRESHOLD) {
            return true;
        }
        return false;
    }
}
