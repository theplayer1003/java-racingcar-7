package racingcar.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarMoveScore;
import racingcar.domain.car.CarName;

public class ServiceHandler {
    private final List<Car> carList;

    public ServiceHandler(List<String> carNames, CarFactory carFactory) {
        List<Car> carList = new ArrayList<>();

        for (String each : carNames) {
            carList.add(carFactory.createCar(each));
        }
        this.carList = carList;
    }

    public void moveSequence() {
        for (Car car : carList) {
            car.updateMoveScore();
        }
    }

    public Map<String, String> getResult() {
        Map<String, String> result = new HashMap<>();
        for (Car car : carList) {
            car.getNameAndScore(result);
        }

        return result;
    }

    public List<String> getWinners() {
        CarMoveScore highScore = findHighScore();
        List<String> winners = findWinners(highScore);
        return winners;
    }

    private List<String> findWinners(CarMoveScore highScore) {
        List<String> winners = new ArrayList<>();
        for (Car car : carList) {
            CarName winner = car.findHighScoreCarName(highScore);
            if (winner != null) {
                winners.add(winner.toString());
            }
        }

        return winners;
    }

    private CarMoveScore findHighScore() {
        CarMoveScore tmpScore = new CarMoveScore();
        for (Car car : carList) {
            tmpScore = car.compareForHighScore(tmpScore);
        }

        return tmpScore;
    }
}
