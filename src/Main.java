import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the equation");
        String key = scanner.nextLine();

        String[] tokens = key.split(" ");
        System.out.println(Arrays.toString(tokens));
        for(String s: tokens){
            ExpressionParser.parse(s);
        }
    }
}
