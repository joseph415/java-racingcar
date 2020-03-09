package view;

public class RequestDTO {
    private String cars;
    private String playRound;

    public RequestDTO(String cars, String playRound) {
        this.cars = cars;
        this.playRound = playRound;
    }

    public String getCars() {
        return cars;
    }

    public String getPlayRound() {
        return playRound;
    }
}
