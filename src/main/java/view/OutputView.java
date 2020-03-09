package view;

import java.util.List;

public class OutputView {
    public static void printResultConstant(){
        System.out.println("실행 결과");
    }

    public static void printCarState(List<ResponseDTO> responseDTO){
        responseDTO.forEach(x-> System.out.printf("5%s : %s",x.getCarName(),x.getPosition()));
    }

    public static void printWinner(List<String> winner){
        System.out.print("우승자는 ");
        System.out.println(String.join(",", winner));
    }
}
