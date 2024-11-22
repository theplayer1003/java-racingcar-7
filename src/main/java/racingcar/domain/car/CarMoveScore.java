package racingcar.domain.car;

public class CarMoveScore implements Comparable<CarMoveScore> {
    private static final int INIT_SCORE = 0;

    private final int moveScore;

    public CarMoveScore() {
        this(INIT_SCORE);
    }

    public CarMoveScore(int moveScore) {
        this.moveScore = moveScore;
    }

    public CarMoveScore addMoveScore(CarMoveScore other) {
        return new CarMoveScore((this.moveScore + other.moveScore));
    }


    @Override
    public int hashCode() {
        return Integer.hashCode(moveScore);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        CarMoveScore otherCarMoveScore = (CarMoveScore) other;
        return this.moveScore == otherCarMoveScore.moveScore;
    }

    @Override
    public int compareTo(CarMoveScore other) {
        return Integer.compare(this.moveScore, other.moveScore); // > 양수, = 0, < 음수
    }
}
