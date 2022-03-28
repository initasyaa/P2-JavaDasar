import java.util.Scanner;

public class Tugas5_Pratikum2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.printf("Masukkan bilangan Faktorial: ");
        int n=s.nextInt();
        int b=1;
        if(n>0){
            for(int i=1;i<n;i++)
                b=b*(n-i);
            b=b*n;
        }
        else
            b=1;
        System.out.printf(n+"! = "+b);
    }
}
