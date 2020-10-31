package pboif2.pkg10119065.latihan26.latihanwaktusaatini;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan waktu saat ini
 */
import java.util.Date;
public class PBOIF210119065Latihan26LatihanWaktuSaatIni {
    
    public static void main(String[] args) {
        Date date = new Date();
        
       // menampilkan tanggal yang telah diformat
       System.out.printf("%s %tA, %<te %<tb %<tY %<tT", "Hari inii adalah hari :", date);
       System.out.println();
       System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
    }
    
}
