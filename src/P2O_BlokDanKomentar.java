import java.util.Scanner;

public class P2O_BlokDanKomentar {
    public static void main(String[] args) {
        //membuat varibel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.println("Inputan nilai:");
        nilai = scan.nextInt();

        //higung gradenya
        if (nilai>=85){ grade = "A";
        }else if (nilai>=75) { grade = "B+";
        }else if (nilai>=65) { grade = "B";
        }else if (nilai>=60) { grade = "C+";
        }else if (nilai>=55) { grade = "C";
        }else if (nilai>=44) { grade = "D";
        }else { grade = "E";
        }
        //cetak hasilnya
        System.out.println("Grade: " +grade);
    }
}
