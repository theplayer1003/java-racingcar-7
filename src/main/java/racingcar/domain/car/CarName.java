package racingcar.domain.car;

public class CarName {
    private final String carName;

    public CarName(String carName) {
        isNotBlank(carName);
        isShorterThanFive(carName);
        this.carName = carName;
    }

    private void isNotBlank(String carName) {
        if (carName.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
        }
    }

    private void isShorterThanFive(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
