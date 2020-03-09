package view;

import domain.Car;
import domain.Cars;
import domain.WinningCars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResponseDTO {

    public static final char BAR = '-';
    private String carName;
    private String position;

    public ResponseDTO(Car car) {
        this.carName = car.getCarName();
        this.position = makeDistanceBar(car.getPosition());
    }

    public static List<ResponseDTO> getResponseDTOList(Cars cars){
        return cars.getCars().stream()
                .map(ResponseDTO::new)
                .collect(Collectors.toList());
    }

    public static List<String> getWinnerDTO(WinningCars winningCars){
        return winningCars.getWinningCars();
    }

    private String makeDistanceBar(int distance) {
        char[] bars = new char[distance];
        Arrays.fill(bars, BAR);
        return String.valueOf(bars);
    }

    public String getCarName() {
        return carName;
    }

    public String getPosition() {
        return position;
    }
}
