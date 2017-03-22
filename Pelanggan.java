
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
    public Pelanggan(int id, String nama)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
    }
    
    /**
     * Method printData untuk menampilkan data dari pelanggan.
     */
    //public void printData()
    //{
    //    System.out.println("Pelanggan dengan nama "+nama+" dan ID "+id+" telefon: "+telefon+" Email: "+email+" DOB: "+dob);
    //}

    public String toString()
    {
        if(DatabasePesanan.getPesanan().equals(null))
        {
            return nama + id + telefon;
        }
        else
        {
            return nama + id + telefon + DatabasePesanan.getPesanan().getPenggunaAkhir();
        }
    }
    
    /**
     * Method untuk Mendapatkan ID pelanggan
     * @return id = nilai ID pelanggan
     */
    public int getID()
    {
        // put your code here
        return id;
    }
    
    /**
     * Method untuk Mendapatkan nama pelanggan
     * @return inama = nilai nama pelanggan
     */
    public String getNama()
    {
        return nama;
    }
    
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
