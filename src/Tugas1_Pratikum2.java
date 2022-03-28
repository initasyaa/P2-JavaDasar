import javax.swing.JOptionPane;
public class Tugas1_Pratikum2{
    public static void main(String[] args) {

        int jam_awal, menit_awal, jam_akhir, menit_akhir, durasi_menit, menit_terakhir,jam_terakhir, durasi_jam, total;

        String jl=JOptionPane.showInputDialog("Masukkan jam awal: ");
        String ml=JOptionPane.showInputDialog("Masukkan menit awal: ");
        String jr=JOptionPane.showInputDialog("Masukkan jam akhir: ");
        String mr=JOptionPane.showInputDialog("Masukkan menit akhir: ");

        jam_awal=Integer.parseInt(jl);
        menit_awal=Integer.parseInt(ml);
        jam_akhir=Integer.parseInt(jr);
        menit_akhir=Integer.parseInt(mr);

        if((menit_akhir-menit_awal)<0){
            menit_terakhir=60+menit_akhir;
            durasi_menit=menit_terakhir-menit_awal;
            jam_terakhir=jam_akhir-1;
            durasi_jam=jam_terakhir-jam_awal;
            total=(durasi_jam*60)+durasi_menit;
            String Msg="Durasi waktu antara pukul "+jam_awal+"."+menit_awal+" s/d pukul "+jam_akhir+"."+menit_akhir+" adalah "+total+" menit";
            JOptionPane.showMessageDialog(null,Msg);
        }

        else if((menit_awal-menit_akhir)<0){
            menit_terakhir=60+menit_akhir;
            durasi_menit=menit_terakhir-menit_awal;
            jam_terakhir=jam_akhir-1;
            durasi_jam=jam_terakhir-jam_awal;
            total=(durasi_jam*60)+durasi_menit;
            String End="Durasi waktu antara pukul "+jam_awal+"."+menit_awal+" " +
                    "s/d pukul "+jam_akhir+"."+menit_akhir+" adalah "+total+" menit";
            JOptionPane.showMessageDialog(null,End);
        }
    }
}