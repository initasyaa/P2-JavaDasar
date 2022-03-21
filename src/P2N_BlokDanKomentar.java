import  java.util.Scanner;
public class P2N_BlokDanKomentar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int intNumber = input.nextInt();
        if(intNumber>5){
            System.out.println("The number you entered is great than 5!");
        }
        System.out.println("Thanks for the input!");

        System.out.println("\nEnter a number between 10-20:");
        int a = input.nextInt();
        if (a>=10 &&a<=20){
            System.out.println("The condition has been met.");
        }else{
            System.out.println("You did it wrong.");
        }
    }
}
