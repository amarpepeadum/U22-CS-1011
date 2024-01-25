import java.util.Scanner;

public class MainCalculator{
    public static void main(String[] args){

        double firstNumber, secondNumber, result;

        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");

        firstNumber = scanner.nextDouble();

        System.out.print("Input second number: ");

        secondNumber = scanner.nextDouble();

        System.out.print("Input your operator: ");

        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            
            case '-':
                result = firstNumber - secondNumber;
                System.out.println(result);
                break;
                
            case '*':
                result = firstNumber * secondNumber;
                System.out.println(result);
                break;

            case '/':
                result = firstNumber / secondNumber;
                System.out.println(result);
                break;

            default:
            System.out.println("You don do mistake boss!");
                break;
        }


    }
}