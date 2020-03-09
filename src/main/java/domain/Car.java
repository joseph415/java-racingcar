package domain;

public class Car {
    private CarName carName;
    private Position position;

    public Car(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void move(boolean isMove){
        position.movePosition(isMove);
    }

}
