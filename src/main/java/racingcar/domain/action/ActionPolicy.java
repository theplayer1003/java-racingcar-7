package racingcar.domain.action;

import racingcar.domain.car.Car;
import racingcar.domain.car.CarMoveScore;

public interface ActionPolicy {
    CarMoveScore moveCar(Car car);
}
