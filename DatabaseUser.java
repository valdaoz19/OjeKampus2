
/**
 * Write a description of class DatabaseUser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DatabaseUser
{
    // instance variables - replace the example below with your own
     private int x;
    private static Pelanggan pelanggan_database;
    private static Ojek ojek_database;
    private static int id_ojek_terakhir = 1;
    private static int id_pelanggan_terakhir = 1;
    /**
     * Constructor for objects of class DatabaseUser
     */
    public DatabaseUser()
    {
        // initialise instance variables
    }
  
    public static boolean addPelanggan(Pelanggan baru){
        pelanggan_database = baru;
        return true;
    }
    
    public static boolean removePelanggan(int id){
        pelanggan_database = null;
        return true;
    }
    
    public static boolean addOjek(Ojek baru){
        ojek_database = baru;
        return true;
    }
    
    public static boolean removeOjek(int id){
        ojek_database = null;
        return true;
    }
    
    public static int getIDOjekTerakhir(){
        return id_ojek_terakhir;
    }
    
    public static int getIDPelangganTerakhir(){
        return id_pelanggan_terakhir;
    }
    
    public static Ojek getUserOjek(){
        return ojek_database;
    }
    
    public static Pelanggan getUserPelanggan(){
        return pelanggan_database;
    }
    
}
