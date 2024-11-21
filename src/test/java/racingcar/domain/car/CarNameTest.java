package racingcar.domain.car;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarNameTest {
    private CarName test1;
    private CarName test2;
    private CarName test3;

    @BeforeEach
    void init() {
        test1 = new CarName("pobi");
        test2 = new CarName("poobi");
        test3 = new CarName("jun");
    }

    @Test
    void 다섯_글자_초과일시_예외() {
        assertThrows(IllegalArgumentException.class, () -> new CarName("pooobi"));
    }

    @Test
    void 다섯_글자_이하일시_정상생성() {
        assertNotNull(test1);
        assertNotNull(test2);
        assertNotNull(test3);
    }

    @Test
    void 이름이_공백일시_예외() {
        assertThrows(IllegalArgumentException.class, () -> new CarName(""));
    }

    @Test
    void 이름이_널값일때_예외() {
        assertThrows(NullPointerException.class, () -> new CarName(null));
    }
}
