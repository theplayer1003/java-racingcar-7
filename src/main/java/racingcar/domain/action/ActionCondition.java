package racingcar.domain.action;

import racingcar.domain.car.Car;

public interface ActionCondition {
    boolean isSatisfiedBy(Car car);
}
