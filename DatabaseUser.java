import java.util.*;
/**
 * Write a description of class DatabaseUser here.
 * 
 * @author (your name) 
 * @6 Maret 2017 
 */
public class DatabaseUser
{
    //Variabel Instance
    private static ArrayList<Pelanggan>  pelanggan_database = new ArrayList<>();
    private static ArrayList<Ojek>  ojek_database = new ArrayList<>();
    private static int id_ojek_terakhir=1;
    private static int id_pelanggan_terakhir=1;

    /**
     * Constructor yang telah dibuat saat kelas DatabaseUser dibuat.
     */
    public DatabaseUser()
    {
        //Belum ada isi yang dibutuhkan
    }
    
    /**
     * Method untuk mendapatkan database dari ojek pada arraylist
     * @return mengembalikan nilai dari ojek_database untuk dimasukkan dalam
     * database
     */
    public static ArrayList<Ojek> getOjekDatabase(){
        return ojek_database;
    }
    
    /**
     * Method untuk mendapatkan database dari pelanggan pada arraylist
     * @return mengembalikan nilai dari pelanggan_database untuk dimasukkan dalam
     * database
     */
    public static ArrayList<Pelanggan> getPelangganDatabase(){
        return pelanggan_database;
    }
    
    /**
     * Method untuk Menambahkan pelanggan baru
     * @param baru untuk menambahkan pelanggan baru
     * @return true = nilai benar jika ada pelanggan baru
     */
    public static boolean addPelanggan(Pelanggan baru)
    {
        for(Pelanggan pengguna_temp : pelanggan_database){
            if(pengguna_temp.equals(baru)){
                System.out.println("Penambahan pelanggan gagal");
                 return false;
            }
        }
        pelanggan_database.add(baru);
        System.out.println("Penambahan pelanggan berhasil");
        return true;
    }
    
    /**
     * Method untuk Menghapus pelanggan
     * @param id untuk menghapus id pelanggan
     * @return true = nilai benar jika id pelanggan null (tidak ada)
     */
    public static boolean removePelanggan(int id)
    {
        Pelanggan pengguna_temp = getUserPelanggan(id);
        if(pengguna_temp == null){
            System.out.println("ID tidak terdaftar, penghapusan gagal");
            return false;
        }
        pelanggan_database.remove(pengguna_temp);
        System.out.println("Penghapusan Pelanggan dengan id " + id + " Berhasil");
        return true;
    }
    
    /**
     * Method untuk Menambahkan ojek baru
     * @param baru untuk menambahkan ojek baru
     * @return true = nilai benar jika ada ojek baru
     */
    public static boolean addOjek(Ojek baru)
    {
        for(Ojek ojek_temp : ojek_database){
            if(ojek_temp.equals(baru)){
                System.out.println("Penambahan ojek gagal");
                 return false;
            }
        }
        ojek_database.add(baru);
        System.out.println("Penambahan ojek berhasil");
        return true;
    }
    
    /**
     * Method untuk Menghapus ojek
     * @param id untuk menghapus id ojek
     * @return true = nilai benar jika id ojek null (tidak ada)
     */
    public static boolean removeOjek(int id)
    {
        Ojek ojek_temp = getUserOjek(id);
        if(ojek_temp == null){
            System.out.println("ID tidak terdaftar, penghapusan gagal");
            return false;
        }
        ojek_database.remove(ojek_temp);
        System.out.println("Penghapusan Ojek dengan id " + id + " Berhasil");
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
    public static Ojek getUserOjek(int id)
    {
        for(Ojek ojek_temp : ojek_database){
            if(ojek_temp.getID() == id){
                 return ojek_temp;
            }
        }
        return null;
    }  
    
    /**
     * Method untuk Mendapatkan id pelanggan
     * @return ojek_pelanggan = nilai id pelanggan
     */
    public static Pelanggan getUserPelanggan(int id)
    {
       for(Pelanggan pengguna_temp : pelanggan_database){
            if(pengguna_temp.getID() == id){
                 return pengguna_temp;
            }
        }
        return null;
    }
}
