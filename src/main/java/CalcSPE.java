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
            System.out.println("Scientific Calculator, please select an operation");
            System.out.print("Enter 1 for Square Root\nEnter 2 for Factorial\nEnter 3 for Logarithm\nEnter 4 for Power\n" +
                    "Enter 5 for Sum\nEnter 6 for Subtraction \nEnter 7 for Multiplication\nEnter 8 for Divison\nEnter 9 for Random Number\n"+
                    "Enter 10 for Remainder\nEnter 0 to Quit\nEnter Your Choice : ");
            int choice;
            try {
                choice = scanner.nextInt();
                if(choice <0 || choice > 10)
                {
                    System.out.println("Not a valid option");
                    System.out.println("");
                    continue;
                }
            } catch (InputMismatchException error) {
                System.out.println("Wrong Choice!!");
                System.out.println("Exiting!!");

                return ;
            }


                switch (choice) {

                    case 1:

                        System.out.print("Enter a number : ");
                        num1 = scanner.nextDouble();
                        System.out.println("Square root of " + num1 + " is : " + calc.sqroot(num1));
                        System.out.println("\n");

                        break;
                    case 2:

                        System.out.print("Enter a number : ");
                        num1 = scanner.nextDouble();
                        System.out.println("Factorial of " + num1 + " is : " + calc.fact(num1));
                        System.out.println("\n");


                        break;
                    case 3:


                        System.out.print("Enter a number : ");
                        num1 = scanner.nextDouble();
                        System.out.println("Natural log of " + num1 + " is : " + calc.naturallog(num1));
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("Format num1 raised to power num2 ");
                        System.out.print("Enter the first number : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num2 = scanner.nextDouble();
                        System.out.println(num1 + " Result : " + calc.power(num1, num2));
                        System.out.println("\n");
                        break;

                    case 5:

                        System.out.print("Enter the first number : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num2 = scanner.nextDouble();
                        System.out.println(" Result : " + num1 + " + " + num2 + " is : " + calc.add(num1, num2));
                        System.out.println("\n");
                        break;
                    case 6:
                        System.out.print("Enter the first number : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num2 = scanner.nextDouble();
                        System.out.println(" Result : " + num1 + " + " + num2 + " is : " + calc.sub(num1, num2));
                        System.out.println("\n");
                        break;
                    case 7:
                        System.out.print("Enter the first number : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num2 = scanner.nextDouble();
                        System.out.println(" Result : " + num1 + " X " + num2 + " is : " + calc.mul(num1, num2));
                        System.out.println("\n");
                        break;
                    case 8:
                        System.out.print("Enter the first number : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num2 = scanner.nextDouble();
                        System.out.println(" Result : " + num1 + " / " + num2 + " is : " + calc.div(num1, num2));
                        System.out.println("\n");
                        break;
                    case 9:
                        System.out.print("Enter the Max Range: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the Min Range: ");
                        num2 = scanner.nextDouble();
                        System.out.println(" Random Number  is :" + calc.rand(num1, num2));
                        System.out.println("\n");
                        break;
                    case 10:
                        System.out.print("Enter the first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        num2 = scanner.nextDouble();
                        System.out.println(" Remainder  is :" + calc.remain(num1, num2));
                        System.out.println("\n");
                        break;

                    default:
                        System.out.println("Bye !!");
                        return;
                }

        } while (true);
    }

    public double remain(double number1, double number2) {
        logger.info("[REMAINDER OF - " + number1 + " AND] " + number2);
        double result = number1 % number2;
        logger.info("[RESULT - REMAINDER] - " + result);
        return result;
    }

    public double rand(double number1, double number2) {
        logger.info("[RANDOM NUMBER BETWEEN  - " + number1 + " AND] " + number2);
        double range = number1 - number2 + 1;
        double rand = (int) (Math.random() * range) + number2;
        logger.info("[RESULT - RANDOM NUMBER] - " + rand);
        return rand;
    }

    public double sub(double number1, double number2)
    {
        logger.info("[SUBTRACTION OF - " + number2 + " FROM] " + number1);
        double result = number1 - number2;
        logger.info("[RESULT - SUBTRACTION] - " + result);
        return result;

    }


    public double mul(double number1, double number2)
    {
        logger.info("[MULTIPLICATION OF - " + number1 + " WITH] " + number2);
        double result = number1 * number2;
        logger.info("[RESULT - MULTIPLICATION] - " + result);
        return result;

    }

    public double div(double number1, double number2)
    {
        logger.info("[DIVISON OF - " + number2 + " BY] " + number1);
        double result = number1 / number2;
        logger.info("[RESULT - DIVISON] - " + result);
        return result;

    }

    public double add(double number1, double number2)
    {
        logger.info("[ADDITION OF - " + number1 + " WITH] " + number2);
        double result = number1 + number2;
        logger.info("[RESULT - ADDITION] - " + result);
        return result;

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
        String res = String.format("%.3f", result);
        result = Double.parseDouble(res);
        return result;
    }

}