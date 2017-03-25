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
public class Ojek
{
    //Variabel Instance
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null;
    private int id;
    private String nama, telefon, email, no_plat;
    private Date dob;
    

    /**
     * Constructor yang telah dibuat saat kelas Ojek dibuat berisi id, nama, lokasi.
     * @param id untuk id ojek
     * @param nama untuk nama ojek
     * @param posisi_sekarang untuk lokasi ojek
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
        this.posisi_sekarang = posisi_sekarang;
    }

    /**
     * Method untuk menampilkan data pada kelas Ojek
     */
    public String toString(){
    if(pesanan_sekarang == null)
    {
        return "\nOjek" + " Id: "+id + " Nama: "+ nama + " Status:" + status.toString();
    }
    else
    {
        Pelanggan temp = pesanan_sekarang.getPelanggan();
        return "\nOjek" + " Id: "+id + " Nama: "+ nama + " Status:" + status.toString() + " Pelanggan:" + temp.getNama();
    }
   }
    
    /**
     * Method untuk Men-set ID ojek
     * @param id untuk id ojek baru
     */
    public void setID(int id)
    {
        // put your code here
        this.id=id;
    }
    
    /**
     * Method untuk Men-set nama ojek
     * @param nama untuk nama ojek baru
     */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    /**
     * Method untuk Men-set no telefon ojek
     * @param telefon untuk no telefon ojek baru
     * @return true mengembalikan nilai betul jika sesuai dengan pattern
     * @return true mengembalikan salah betul jika tidak sesuai dengan pattern
     */
    public boolean setTelefon(String telefon)
    {
        Pattern pattern = Pattern.compile("\\d{10,12}");
        Matcher matcher = pattern.matcher(telefon);
        if(matcher.matches())
        {
            this.telefon = telefon;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Method untuk Men-set email ojek
     * @param email untuk email ojek baru
     * @return true mengembalikan nilai betul jika sesuai dengan pattern
     * @return true mengembalikan salah betul jika tidak sesuai dengan pattern
     */
    public boolean setEmail(String email)
    {
        Pattern pattern = Pattern.compile("(.)+(@)(.)+\\.(.)+");
        Matcher matcher = pattern.matcher(email);
        this.email=email;
        if(matcher.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Method untuk Men-set DOB ojek
     * @param day,month,year untuk tanggal lahir ojek
     */
    public void setDOB(int day, int month, int year)
    {
        dob = new GregorianCalendar(year,month,day).getTime();
    }
    
    /**
     * Method untuk Men-set no plat ojek
     * @param no plat untuk no plat ojek baru
     * @return true mengembalikan nilai betul jika sesuai dengan pattern
     * @return true mengembalikan salah betul jika tidak sesuai dengan pattern
     */
    public boolean setNoPlat(String no_plat)
    {
        Pattern pattern = Pattern.compile("[A-Z]\\d{1,4}[A-Z]{1,3}");
        Matcher matcher = pattern.matcher(no_plat);
        if(matcher.matches())
        {
            this.no_plat = no_plat;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Method untuk Men-set pesan ojek
     * @param pesan untuk pesan ojek baru
     */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = pesan;
    }
    
    /**
     * Method untuk Men-set lokasi ojek sekarang
     * @param sekarang untuk lokasi ojek baru
     */
    public void setPosisi(Lokasi sekarang)
    {
        posisi_sekarang = sekarang;
    }
    
    /**
     * Method untuk Men-set status ojek
     * @param status untuk status ojek baru
     */
    public void setStatus(StatusOjek status)
    {
        this.status=status;
    }
    
    /**
     * Method untuk Mendapatkan ID ojek
     * @return id mengembalikan nilai ID ojek
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Method untuk Mendapatkan no telefon ojek
     * @return no telefon mengembalikan nilai no telefon ojek
     */
    public String getTelefon()
    {
        return telefon;
    }
    
    /**
     * Method untuk Mendapatkan email ojek
     * @return email mengembalikan nilai email ojek
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method untuk Mendapatkan DOB ojek
     * @return DOB mengembalikan nilai DOB ojek
     */
    public Date getDOB()
    {
        return dob;
    }
    
    /**
     * Method untuk Mendapatkan no plat ojek
     * @return no plat mengembalikan nilai no plat ojek
     */
    public String getNoPlat()
    {
        return no_plat;
    }
    
    /**
     * Method untuk Mendapatkan nama ojek
     * @return nama = nilai nama ojek
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk Mendapatkan pesanan ojek
     * @return pesan = nilai pesanan ojek
     */
    public Pesanan getPesanan()
    {
        return pesanan_sekarang;
    }
    
    /**
     * Method untuk Mendapatkan posisi ojek sekarang
     * @return posisi_sekarang = nilai posisi ojek sekarang
     */
    public Lokasi getPosisi()
    {
        return posisi_sekarang;
    }
    
    /**
     * Method untuk Mendapatkan status ojek
     * @return status = nilai status ojek
     */
    public StatusOjek getStatus()
    {
        return status;
    }
    
}
