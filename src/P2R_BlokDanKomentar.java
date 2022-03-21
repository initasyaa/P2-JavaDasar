import java.util.Scanner;
public class P2R_BlokDanKomentar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Welcome to our calculator");
        System.out.println("Enter The firs number:");
        double a= input.nextDouble();
        System.out.println("Enter the second number:");
        double b= input.nextDouble();
        System.out.println("choose one of the following operations:");
        System.out.println("1 -addition");
        System.out.println("2 -subtraction");
        System.out.println("3 -multiplication");
        System.out.println("4 -division");
        int choice = input.nextInt();
        double result = 0.0;
        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
            default:
                break;
        }
        if ((choice>0)&&(choice<5)){
            System.out.println("result: " + result);
        }else{
            System.out.println("Invalide choice");
        }
        System.out.println("thank u for using our calculator");
    }
}
