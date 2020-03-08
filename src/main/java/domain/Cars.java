package domain;

import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars = new ArrayList<>();

    public Cars(String inputCars,int position){
        String[] stringCars = StringUtils.stringParse(inputCars);

        insertCars(position, stringCars);
        validateCarsSize(stringCars);
    }

    private void insertCars(int position, String[] stringCars) {
        for (String stringCar : stringCars) {
            cars.add(new Car(new CarName(stringCar), new Position(position)));
        }
    }

    private void validateCarsSize(String[] stringCars) {
        if(stringCars.length != cars.size()){
            throw new IllegalArgumentException("리스트가 정상적으로 생성되지 않았습니다.");
        }
    }
}
