package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    private RacingGame() {
    }

    public static List<String> resultRacingGame(List<Car> racingCarList) {
        Winner winner = new Winner();

        return winner.getWinners(racingCarList);
    }

    public static void startRace(List<Car> racingCarList) {
        racingCarList.forEach(car -> {
            RandomNumber randomNumber = new RandomNumber(MakeRandomNumber.generateRandomIntIntRange());
            car.move(randomNumber);
        });
    }

    public static List<Car> generateCars(String[] carNames) {
        return Arrays.stream(carNames)
                .map(Car::new) // 메서드 레퍼런스 활용 ->  .map(Car::new)
                .collect(Collectors.toList());
    }
}
