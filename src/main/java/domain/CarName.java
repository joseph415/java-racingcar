package domain;

public class CarName {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private String carName;

    public CarName(String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    private void validateCarName(String carName) {
        if (carName == null){
            throw new NullPointerException("null 입력. 재입력 해주세요");
        }
        if (carName.isEmpty() || carName.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("이름 입력 오류 입니다. 재입력해주세요");
        }
    }
}
