package calcuator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcSPE {
    private static final Logger logger = LogManager.getLogger(CalcSPE.class);
    public CalcSPE() {
    }

    public static void main(String[] args) {

        CalcSPE calc = new CalcSPE();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 for Square Root\nPress 2 to Factorial\nPress 3 to find Logarithm\nPress 4 to find Power\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:

                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root of "+num1+" is : " + calc.sqroot(num1));
                    System.out.println("\n");

                    break;
                case 2:

                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Factorial of "+num1+" is : " + calc.fact(num1));
                    System.out.println("\n");


                    break;
                case 3:


                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Natural log of "+num1+" is : " + calc.naturallog(num1));
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Format num1 raised to power num2 ");
                    System.out.print("Enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1+ " Result : " + calc.power(num1, num2));
                    System.out.println("\n");
                    break;



                default:
                    System.out.println("Bye !!");
                    return;
            }
        } while (true);
    }

    public double fact(double num) {
        logger.info("[FACTORIAL] - " + num);
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        logger.info("[RESULT - FACTORIAL] - " + facto);
        return  facto;
    }


    public double sqroot(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        double result = Math.sqrt(number1);
        if(number1<0){
            logger.error("Negtive number");
        }
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }


    public double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double naturallog(double number1) {
        logger.info("[NATURAL LOG] - " + number1);
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

}