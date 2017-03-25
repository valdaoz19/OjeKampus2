import java.util.*;

/**
 * Write a description of class DatabasePesanan here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @6 Maret 2017 
 */
public class DatabasePesanan
{
    //Variabel Instance
    private static ArrayList<Pesanan>  list_pesanan = new ArrayList<>();

    /**
     * Constructor yang telah dibuat saat kelas DatabasePesanan dibuat.
     */
    public DatabasePesanan()
    {
        //Belum ada isi yang dibutuhkan
    }
    
    /**
     * Method untuk mendapatkan database dari list pesanan pada arraylist
     * @return mengembalikan nilai dari list_pesanan untuk dimasukkan dalam
     * database
     */
    public static ArrayList<Pesanan> getDatabase(){
        return list_pesanan;
    }
    
    /**
     * Method untuk Mendapatkan pesanan berdasarkan list pesanan pada arraylist yang
     * telah dibuat jika ada pada list pesanan maka nilainya akan dikembalikan
     * @return list_pesanan mengembalikan nilai pesan
     */
    public static Pesanan getPesanan(Pelanggan pengguna)
    {
        for(Pesanan pesan : list_pesanan){
            if(pesan.getPelanggan().equals(pengguna)){
                 return pesan;
            }
        }
       return null;
    }
    
    /**
     * Method untuk Menambahkan pesanan baru dari method getPesanan
     * @param pesan untuk menambahkan pesan
     * @return true mengembalikan nilai benar jika ada pesanan
     */
    public static boolean addPesanan(Pesanan pesan)
    {
        Pelanggan pengguna = pesan.getPelanggan();
        if(getPesanan(pengguna)==null){
            System.out.println("Pesanan berhasil dilakukan");
            list_pesanan.add(pesan);
            return true;
        }
        System.out.println("Pesanan gagal");
        return false;
    }
    
    /**
     * Method untuk Menghapus pesanan yang telah dipesan
     * @param pesan untuk menghapus pesan
     * @return true mengembalikan nilai salah jika null dan benar jika ada
     * 
     */
    public static boolean hapusPesanan(Pesanan pesan)
    {
        if(pesan.getPelayan()== null){
            return false;
        }
        list_pesanan.remove(pesan);
        return true;
    }
    
    /**
     * Method untuk menghapus pesanan dari method getPesanan
     * @return list_pesanan mengembalikan nilai pesan
     */
    public static boolean hapusPesanan(Pelanggan pengguna)
    {
        Pesanan pesan = getPesanan(pengguna);
        if(pesan.getPelayan()== null){
            list_pesanan.remove(pesan);
            return true;
        }
        
        return false;
    }
}
