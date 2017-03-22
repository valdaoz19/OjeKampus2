
/**
 * Write a description of class DatabaseUser here.
 * 
 * @author (your name) 
 * @6 Maret 2017 
 */
public class DatabaseUser
{
    //Variabel Instance
    private static Pelanggan pelanggan_database;
    private static Ojek ojek_database;
    private static int id_ojek_terakhir=1;
    private static int id_pelanggan_terakhir=1;

    /**
     * Constructor yang telah dibuat saat kelas DatabaseUser dibuat.
     */
    public DatabaseUser()
    {
        //Belum ada isi yang dibutuhkan
    }

    public void printData ()
    {
       System.out.println("Ojek" +ojek_database);
       System.out.println("Pelanggan" +pelanggan_database);
    }
    
    /**
     * Method untuk Menambahkan pelanggan baru
     * @param baru untuk menambahkan pelanggan baru
     * @return true = nilai benar jika ada pelanggan baru
     */
    public static boolean addPelanggan(Pelanggan baru)
    {
        // put your code here
        pelanggan_database = baru;
        System.out.println("Penambahan Pelanggan Berhasil");
        return true;
    }
    
    /**
     * Method untuk Menghapus pelanggan
     * @param id untuk menghapus id pelanggan
     * @return true = nilai benar jika id pelanggan null (tidak ada)
     */
    public static boolean removePelanggan(int id)
    {
        pelanggan_database = null;
        return true;
    }
    
    /**
     * Method untuk Menambahkan ojek baru
     * @param baru untuk menambahkan ojek baru
     * @return true = nilai benar jika ada ojek baru
     */
    public static boolean addOjek(Ojek baru)
    {
        ojek_database = baru;
        System.out.println("Penambahan Ojek Berhasil");
        return true;
    }
    
    /**
     * Method untuk Menghapus ojek
     * @param id untuk menghapus id ojek
     * @return true = nilai benar jika id ojek null (tidak ada)
     */
    public static boolean removeOjek(int id)
    {
        ojek_database = null;
        return true;
    }
    
    /**
     * Method untuk Mendapatkan ID ojek terakhir
     * @return id_ojek_terakhir = nilai id ojek terakhir
     */
    public static int getIDOjekTerakhir()
    {
        return id_ojek_terakhir;
    }
    
    /**
     * Method untuk Mendapatkan ID pelanggan terakhir
     * @return id_pelanggan_terakhir = nilai id pelanggan terakhir
     */
    public static int getIDPelangganTerakhir()
    {
        return id_pelanggan_terakhir;
    }
    
    /**
     * Method untuk Mendapatkan id ojek
     * @return ojek_database = nilai id ojek
     */
    public static Ojek getUserOjek()
    {
        return ojek_database;
    }   
    
    /**
     * Method untuk Mendapatkan id pelanggan
     * @return ojek_pelanggan = nilai id pelanggan
     */
    public static Pelanggan getUserPelanggan()
    {
        return pelanggan_database;
    }

    /**
     * Method pada UML lama belum didefinisikan
     */
    public static String[] getOjekDatabase()
    {
        return null;
    }
    
    /**
     * Method pada UML lama belum didefinisikan
     */
    public static String[] getPelangganDatabase()
    {
        return null;
    }
}
