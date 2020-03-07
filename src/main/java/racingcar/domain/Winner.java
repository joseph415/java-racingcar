package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private final List<String> winners = new ArrayList<>();

    public List<String> getWinners(List<Car> racingCars) {
        int max = getWinnerPosition(racingCars);

        racingCars.stream().filter(car -> car.isWinner(max)).forEach(car -> winners.add(car.getName()));

        return winners;
    }

    private int getWinnerPosition(List<Car> racingCars) {
        return racingCars.stream().mapToInt(Car::getPosition).max().orElseThrow(IllegalArgumentException::new);
    }

}
