
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Write a description of class Pelanggan here.
 * 
 * @author Valda Orchidea Zahwa 
 * @6 Maret 2017 
 */
public class Pelanggan extends User
{
    // instance variables - replace the example below with your own
    /**
     * Constructor Pelanggan. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas pelanggan diciptakan.
     * @param int id    id pelanggan untuk object pelanggan baru.
     * @param String nama   nama pelanggan untuk object pelanggan baru.
     */
    public Pelanggan(int id, String nama, String telefon) 
    {
        // initialise instance variables
        super(id,nama);
        setTelefon(telefon);
    }
    
    /**
     * printData. 
     * Metode untuk mencetak data pelanggan.
     */    
    public String toString(){
        if(DatabasePesanan.getPesanan(this) == null){
            return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + "||";
        }
        Pesanan temp = DatabasePesanan.getPesanan(this);
        return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + " Pelanggan Awal :" + temp.getPenggunaAwal() + "||";
    } 
    
}
