package utils;

public class StringUtils {
    public static String[] stringParse(String names) {
        return names.split(",");
    }

    public static int parseStringToInteger(String input){
        return Integer.parseInt(input);
    }
}
