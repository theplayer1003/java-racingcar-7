package racingcar.domain.car;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.CarMoveScore;

public class CarMoveScoreTest {
    private CarMoveScore test1;
    private CarMoveScore test3;
    private CarMoveScore test5;
    private CarMoveScore test8;
    private CarMoveScore test10;
    private CarMoveScore test10_2;

    @BeforeEach
    void init() {
        test1 = new CarMoveScore(1);
        test3 = new CarMoveScore(3);
        test5 = new CarMoveScore(5);
        test8 = new CarMoveScore(8);
        test10 = new CarMoveScore(10);
        test10_2 = new CarMoveScore(10);
    }

    @Test
    void 두_객체_값이_같을때() {
        assertTrue(test10.equals(test10_2));
    }

    @Test
    void 두_객체_값_비교() {
        assertTrue(test3.compareTo(test1) > 0);
        assertTrue(test1.compareTo(test3) < 0);
        assertTrue(test10.compareTo(test10_2) == 0);
    }
}
