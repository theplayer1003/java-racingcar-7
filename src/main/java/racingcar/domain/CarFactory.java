package racingcar.domain;

import racingcar.domain.action.ActionCondition;
import racingcar.domain.action.ActionPolicy;
import racingcar.domain.action.DefaultActionCondition;
import racingcar.domain.action.DefaultActionPolicy;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarMoveScore;
import racingcar.domain.car.CarName;

public class CarFactory {

    public Car createCar(String userInput) {
        CarName carName = new CarName(userInput);
        CarMoveScore carMoveScore = new CarMoveScore();
        ActionCondition actionCondition = new DefaultActionCondition();
        ActionPolicy actionPolicy = new DefaultActionPolicy(actionCondition);
        return new Car(carName,carMoveScore,actionPolicy);
    }
}
