import java.util.InputMismatchException;
import java.util.Scanner;

public class P2ZZZ_BlokDanKomentar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Masukkan nilai (integer): ");
            int value = input.nextInt();
            System.out.println("Hasil nilai masukkan x 2= "+(value*2));
        }catch (InputMismatchException ex){
            System.out.println("Periksa kembali inputan anda.");
        }finally{
            System.out.println("Terimakasih!");
        }
    }
}
