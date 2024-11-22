package racingcar.domain.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarMoveScore;

public class DefaultActionPolicy implements ActionPolicy {
    public static final int MOVE_ZERO = 0;
    public static final int MOVE_ONE_STEP = 1;
    private List<ActionCondition> conditions = new ArrayList<>();

    public DefaultActionPolicy(ActionCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    @Override
    public CarMoveScore moveCar(Car car) {
        for (ActionCondition each : conditions) {
            if (each.isSatisfiedBy(car)) {
                return new CarMoveScore(MOVE_ONE_STEP);
            }
        }
        return new CarMoveScore(MOVE_ZERO);
    }
}
