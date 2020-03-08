package domain;

public class Position {
    private static final int INIT_POSITION_NUMBER = 0;
    private  int position;

    public Position(int position) {
        validatePosition(position);
        this.position = position;
    }

    private void validatePosition(int position) {
        if(position != INIT_POSITION_NUMBER){
            throw new IllegalArgumentException("포지션의 초기 값은 0 입니다.");
        }
    }

    public void movePosition(boolean isMove) {
        if(isMove){
            position++;
        }
    }
}
