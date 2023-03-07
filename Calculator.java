import java.util.Scanner;

public class Calculator {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);  
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Enter operator (+,-,*,/,%)");        
        char oprt = sc.next().charAt(0);

        double ans =0;

        switch (oprt) {

            case '+':
                ans= num1+num2;
                break;

            case '-':
                ans= num1-num2;
                break;

            case '*':
                ans= num1*num2;
                break;

            case '/':
                ans= num1/num2;
                break;

            case '%':
                ans= num1%num2;
                break;

            default:
                System.out.println("Wrong Input");
                break;
        }

        System.out.println("Result:");            

        System.out.println(num1+""+oprt+""+num2+""+"="+""+ans);           

    }
}