
/**
 * Write a description of class DatabasePesanan here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @6 Maret 2017 
 */
public class DatabasePesanan
{
    //Variabel Instance
    private static Pesanan list_pesanan;

    /**
     * Constructor yang telah dibuat saat kelas DatabasePesanan dibuat.
     */
    public DatabasePesanan()
    {
        //Belum ada isi yang dibutuhkan
    }

    public void printData ()
    {
       System.out.println("Pesanan" +list_pesanan);
    }
    
    /**
     * Method untuk Menambahkan pesanan baru
     * @param pesan untuk menambahkan pesan
     * @return true = nilai benar jika ada pesanan
     */
    public static boolean addPesanan(Pesanan pesan)
    {
        list_pesanan = pesan;
        System.out.println("Pesanan Berhasil Dilakukan");
        return true;
    }
    
    /**
     * Method untuk Menghapus pesanan
     * @param pesan untuk menghapus pesan
     * @return true = nilai benar jika pesanan null (tidak ada)
     */
    public static boolean hapusPesanan(Pesanan pesan)
    {
        list_pesanan = null;
        return true;
    }
    
    /**
     * Method untuk Mendapatkan pesanan
     * @return list_pesanan = nilai pesanan
     */
    public static Pesanan getPesanan()
    {
        return list_pesanan;
    }
    
    /**
     * Method pada UML lama belum didefinisikan
     */
    public static boolean hapusPesananPengguna(String pengguna)
    {
        return false;
    }
    
    /**
     * Method pada UML lama belum didefinisikan
     */
    public static String[] getDatabase()
    {
        return null;
    }
    
    /**
     * Method pada UML lama belum didefinisikan
     */
    public static void pesananDibatalkan(String pesan)
    {
    }
    
    /**
     * Method pada UML lama belum didefinisikan
     */
    public static void pesananDibatalkanPengguna(String pengguna)
    {
    }
}
