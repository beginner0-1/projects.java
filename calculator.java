import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        double num1 = sc.nextDouble();

        System.out.print("enter second number : ");
        double num2 = sc.nextDouble();
        
        System.out.print("enter operator(+,-,*,/):");
        char operator = sc.next().charAt(0);

        double result;

                switch(operator) {

            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if(num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid Operator");
        }

sc.close();
    }

    
}
