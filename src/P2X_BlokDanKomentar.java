import java.util.Scanner;
public class P2X_BlokDanKomentar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        String goOn;
        do {
            System.out.print("Enter the first number : ");
            double a = Double.parseDouble(input.nextLine());
            System.out.print("Enter the second number : ");
            double b = Double.parseDouble(input.nextLine());
            System.out.println("Choose one of the following operations : ");
            System.out.println("1 -addition");
            System.out.println("2 -subtraction");
            System.out.println("3 -multiplication");
            System.out.println("4 -division");
            System.out.println("Enter ur choice: ");
            int choice = Integer.parseInt(input.nextLine());
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
            if ((choice > 0) && (choice < 5)) {
                System.out.println("result: " + result);
            } else {
                System.out.println("Invalide choice");
            }
            System.out.print("Would u like to make another calculation? [yes/no]: ");
            goOn = input.nextLine();
        }while(goOn.equals("yes"));
        System.out.println("Thank u for using our calculator.");
        }
    }
