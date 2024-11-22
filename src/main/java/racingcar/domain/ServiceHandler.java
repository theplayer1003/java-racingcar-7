package racingcar.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.domain.car.Car;

public class ServiceHandler {
    private final List<Car> carList;

    public ServiceHandler(List<String> carNames, CarFactory carFactory) {
        List<Car> carList = new ArrayList<>();

        for(String each : carNames) {
            carList.add(carFactory.createCar(each));
        }
        this.carList = carList;
    }

    public void moveSequence() {
        for(Car car : carList) {
            car.updateMoveScore();
        }
    }

    public Map<String,String> getResult() {
        Map<String,String> result = new HashMap<>();
        for(Car car : carList) {
            car.getNameAndScore(result);
        }

        return result;
    }
}
