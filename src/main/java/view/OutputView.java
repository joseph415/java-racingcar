package view;

public class OutputView {
    public static void printResultConstant(){
        System.out.println("실행 결과");
    }
    public static void printCarState(CarDto carDto){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<carDto.getPosition();i++){
            stringBuilder.append("-");
        }
        System.out.printf("%s : %s",carDto.getCarName(),stringBuilder.toString());
    }
}
