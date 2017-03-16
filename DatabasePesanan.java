
/**
 * Write a description of class DatabasePesanan here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @6 Maret 2017 
 */
public class DatabasePesanan
{
    private static Pesanan list_pesanan;


    /**
     * Constructor for objects of class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
    }
    
    public static boolean addPesanan(Pesanan pesan){
        return true;
    }
    
    public static boolean hapusPesanan(Pesanan pesan){
        return true;
    }
    
    public static boolean hapusPesanan(Pelanggan pengguna){
        return true;
    }
    
    public static Pesanan getPesanan(){
        return list_pesanan;
    }
    
    public static String[] getDatabase(){
        return new String[10];
    }
    
    public static void pesananDibatalkan(Pesanan pesan){
        
    }
    
    public static void pesananDibatalkan(Pelanggan pengguna){
        
    }
    
}