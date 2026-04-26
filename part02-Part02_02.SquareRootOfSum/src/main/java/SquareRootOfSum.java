
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = Integer.valueOf(scanner.nextLine());
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        int result = firstNumber + secondNumber;
        double squareRoot = Math.sqrt(result);
        
        System.out.println(squareRoot);
    }
}
