package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WinningCars {
    private List<String> winningCars = new ArrayList<>();

    public void generateWinningCars(Cars cars){
        int position = getMaxPosition(cars);

        winningCars = cars.getCars()
                .stream()
                .filter(car-> isSamePosition(position, car))
                .map(this::mapCarNameToStringCarName)
                .collect(Collectors.toList());
    }

    private String mapCarNameToStringCarName(Car car) {
        return String.valueOf(car.getCarName());
    }

    private boolean isSamePosition(int InputPosition, Car car) {
        return car.getPosition() == InputPosition;
    }

    private int getMaxPosition(Cars cars){
        Car MaxPositionCar = cars.getCars().stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .orElseThrow(IllegalAccessError::new);

        return MaxPositionCar.getPosition();
    }


    public List<String> getWinningCars() {
        return Collections.unmodifiableList(winningCars);
    }
}
