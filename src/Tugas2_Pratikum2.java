import java.util.Scanner;

public class Tugas2_Pratikum2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan integer: ");
        int num=scan.nextInt();
        int binary=Integer.parseInt(Integer.toBinaryString(num));
        System.out.println(String.format("Susunan bit dari %d adalah %032d",
                num, binary));
    }
}