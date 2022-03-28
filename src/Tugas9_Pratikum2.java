import javax.swing.JOptionPane;
public class Tugas9_Pratikum2 {
    public static void main(String[] args) {
        int tahun=Integer.parseInt(JOptionPane.showInputDialog("masukkan tahun (1900-2005) : "));
        if(tahun>=1900){
            if(tahun<=2005){
                if(tahun%4==0){
                    System.out.println(tahun+" adalah tahun kabisat");
                }else{
                    System.out.println(tahun+" adalah bukan tahun kabisat");
                }
            }else{
                System.out.println("Maaf, tahun diatas 2005");
            }
        }else{
            System.out.println("Maaf, tahun inputan dibawah 1900");
        }
    }
}