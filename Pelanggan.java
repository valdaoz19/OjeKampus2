
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
public class Pelanggan
{
    //Variabel Instance
    private int id;
    private String nama, telefon, email;
    private Date dob;

    /**
     * Constructor yang telah dibuat saat kelas Pelanggan dibuat berisi nama dan id.
     * @param id untuk id pelanggan
     * @param nama untuk nama pelanggan
     */
    public Pelanggan(int id, String nama, String telefon)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
        this.setTelefon(telefon);
    }
    
    /**
     * Method toString untuk menampilkan data dari pelanggan.
     */
    public String toString(){
        if(DatabasePesanan.getPesanan(this) == null){
            return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + "|";
        }
        Pesanan temp = DatabasePesanan.getPesanan(this);
        return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + " Pelanggan Awal :" + temp.getPenggunaAwal() + "|";
    } 
    
    /**
     * Method untuk Mendapatkan ID pelanggan
     * @return id mengembalikan nilai ID pelanggan
     */
    public int getID()
    {
        // put your code here
        return id;
    }
    
    /**
     * Method untuk Mendapatkan nama pelanggan
     * @return nama mengembalikan nilai nama pelanggan
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk Mendapatkan no telefon pelanggan
     * @return telefon mengembalikan nilai no telefon pelanggan
     */
    public String getTelefon(){
        return telefon;
    }
    
    /**
     * Method untuk Mendapatkan email pelanggan
     * @return email mengembalikan nilai email pelanggan
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * Method untuk Mendapatkan dob pelanggan
     * @return dob mengembalikan nilai dob pelanggan
     */
    public Date getDOB()
    {
        return dob;
    }
    
    /**
     * Method untuk Men-set id pelanggan
     * @param id untuk id pelanggan
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk Men-set nama pelanggan
     * @param nama untuk nama pelanggan
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public void setDOB(int day, int month, int year)
    {
        dob = new GregorianCalendar(year,month,day).getTime();
    }
    
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
    
}
