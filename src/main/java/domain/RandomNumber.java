package domain;

public class RandomNumber implements MovingRule {
    private static final int MIN_BOUND = 0;
    private static final int MAX_BOUND = 9;
    private static final int MOVE_STANDARD = 4;

    private int randomNumber;

    public RandomNumber(int randomNumber) {
        if(randomNumber < MIN_BOUND || randomNumber > MAX_BOUND){
            throw new IllegalArgumentException("오류");
        }
        this.randomNumber = randomNumber;
    }

    @Override
    public boolean rule() {
        return randomNumber >= MOVE_STANDARD;
    }
}
