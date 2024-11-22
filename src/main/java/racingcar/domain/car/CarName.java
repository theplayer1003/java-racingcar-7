package racingcar.domain.car;

public class CarName {
    private final String carName;

    public CarName(String carName) {
        isNotBlank(carName);
        isNotContainWhitespace(carName);
        isShorterThanFive(carName);
        this.carName = carName;
    }

    @Override
    public String toString() {
        return carName;
    }

    private void isNotContainWhitespace(String carName) {
        if (carName.contains(" ")) {
            throw new IllegalArgumentException("자동차 이름에 공백이 들어갈 수 없습니다.");
        }
    }

    private void isNotBlank(String carName) {
        if (carName.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");
        }
    }

    private void isShorterThanFive(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
