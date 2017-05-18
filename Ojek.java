import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Write a description of class Ojek here.
 * 
 * @author (your name) 
 * @6 Maret 2017 
 */
public class Ojek extends User
{
    // instance variables - replace the example below with your own
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisiSekarang;
    private Pesanan pesanan_sekarang=null;
    private String no_plat;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_NUM_ID = Pattern.compile("^08[0-9]{9,}$");
    public static final Pattern VALID_PLAT_NUM_ID = Pattern.compile("^[A-Z]{1,3}+[0-9]{1,4}+[A-Z]{1,4}$",  Pattern.CASE_INSENSITIVE);
    /**
     * Constructor Ojek. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas ojek diciptakan.
     * @param int id    id untuk object ojek baru.
     * @param String nama   nama untuk object ojek baru.
     * @param Lokasi posisiSekarang     posisi dari object ojek baru.
     */
    public Ojek(int id, String nama, Lokasi posisiSekarang)
    {
        // initialise instance variables
        super(id,nama);
        this.posisiSekarang = posisiSekarang;
    }
    
    /**
     * printData. 
     * Metode untuk mencetak data ojek.
     */ 
    public String toString(){
        if(pesanan_sekarang == null){
        return "Ojek" + " Id : "+id + " Nama : "+  nama + " Status :" + status.getIDStatus()+ "||";
    }
        Pelanggan temp = pesanan_sekarang.getPelanggan();
        return "Ojek" + " Id : "+id + " Nama : "+  nama + " Status :" + status.getIDStatus() + " Pelanggan" + temp.getNama()+ "||";
    }
    
    public void setNoPlat(String no_plat){
        if(plat_validate(no_plat)){
            this.no_plat = no_plat;
        }
    }
    
    /**
     * setPesanan. 
     * Metode untuk merubah pesanan yang sedang diambil ojek.
     * @param Pesanan pesan   Pesanan baru ojek.
     */
    public void setPesanan(Pesanan pesan){
        pesanan_sekarang = pesan;
    }
    
    /**
     * setPosisi. 
     * Metode untuk merubah posisi ojek.
     * @param Lokasi sekarang   Posisi baru ojek.
     */
    public void setPosisi(Lokasi sekarang){
        posisiSekarang = sekarang;
    }
    
    /**
     * setStatus. 
     * Metode untuk merubah status ojek.
     * @param String status   status baru ojek.
     */
    public void setStatus(StatusOjek status){
        this.status = status;
    }
    
    public String getNoPlat(){
        return no_plat;
    }
    
    /**
     * getPesanan. 
     * Metode yang akan mengembalikan pesanan yang diambil ojek ketika dipanggil.
     * @return Pesanan pesanan_sekarang   pesanan yang diambil ojek.
     */  
    public Pesanan getPesanan(){
        return pesanan_sekarang;
    }
    
    /**
     * getPosisi. 
     * Metode yang akan mengembalikan posisi ojek ketika dipanggil.
     * @return Lokasi posisiSekarang   posisi ojek sekarang.
     */ 
    public Lokasi getPosisi(){
        return posisiSekarang;
    }
    
    /**
     * getStatus. 
     * Metode yang akan mengembalikan status ojek ketika dipanggil.
     * @return String statusa   status ojek.
     */ 
    public StatusOjek getStatus(){
        return status;
    }
    
    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
    
    public static boolean tlp_validate(String telefon) {
        Matcher matcher = VALID_PHONE_NUM_ID.matcher(telefon);
        return matcher.find();
    }
    
    public static boolean plat_validate(String plat) {
        Matcher matcher = VALID_PLAT_NUM_ID.matcher(plat);
        return matcher.find();
    }
    
}
