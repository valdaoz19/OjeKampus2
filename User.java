import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Write a description of class User here.
 * 
 * @author Valda Orchidea Zahwa  
 * @6 Maret 2017 
 */
public abstract class User
{
    protected int id;
    protected String nama,telefon,email;
    protected Date dob;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_NUM_ID = Pattern.compile("^08[0-9]{9,}$");

    /**
     * Constructor for objects of class User
     */
    public User(int id, String nama)
    {
        // initialise instance variables
       this.id = id;
       this.nama = nama;
    }
    
    /**
     * getID. 
     * Metode yang akan mengembalikan nilai id pelanggan ketika dipanggil.
     * @return int id   nilai id pelanggan.
     */    
    public int getID()
    {
        return id;
    }
    
    public String getTelefon(){
        return telefon;
    }
    
    public String getEmail(){
        return email;
    }
    
    public Date getDOB(){
        return dob;
    }
    
    /**
     * getNama. 
     * Metode yang akan mengembalikan nama pelanggan ketika dipanggil.
     * @return String nama  nama pelanggan.
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * setID. 
     * Metode untuk merubah nilai id pelanggan.
     * @param int id   nilai id baru pelanggan.
     */
    public void setID(int id){
        this.id = id;
    }
    
    /**
     * setNama. 
     * Metode untuk merubah nama pelanggan.
     * @param String nama   nama baru pelanggan.
     */
    public void setNama(String nama){
        this.nama = nama;
    }
  
    
    public void setDOB(Date dob){
        this.dob = dob;
    }
   
    public void setTelefon(String telefon){
        if(tlp_validate(telefon)){
            this.telefon = telefon;
        }
    }
    
    public void setEmail(String email){
        if(validate(email)){
            this.email = email;
        }
    }

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }

    public static boolean tlp_validate(String telefon) {
        Matcher matcher = VALID_PHONE_NUM_ID.matcher(telefon);
        return matcher.find();
    }
}

