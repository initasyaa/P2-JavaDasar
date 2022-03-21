import java.util.Scanner;
public class P2Q_BlokDanKomentar {
    public static void main(String[] args) {

        //membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.println("Inputkan nama warna:");
        lampu = scan.nextLine();

        switch (lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, harap hati hait!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silakan jalan!");
                break;
            default:
                System.out.println("warna lampu salah!");
                break;
        }
    }
}
