package controller;

import domain.Cars;
import domain.PlayRound;
import domain.WinningCars;
import view.InputView;
import view.OutputView;
import view.RequestDTO;
import view.ResponseDTO;

public class Controller {

    public void play() {
        RequestDTO requestDTO = InputView.inputRequest();
        Cars cars = new Cars(requestDTO.getCars(), 0);
        PlayRound playRound = new PlayRound(requestDTO.getPlayRound());

        OutputView.printResultConstant();
        for (int i = 0; i < playRound.getPlayRound(); i++) {
            cars.CarsMove();
            OutputView.printCarState(ResponseDTO.getResponseDTOList(cars));
        }

        WinningCars winningCars = new WinningCars();
        winningCars.generateWinningCars(cars);

        OutputView.printWinner(ResponseDTO.getWinnerDTO(winningCars));
    }

}
