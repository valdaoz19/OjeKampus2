import java.util.*;

/**
 * Write a description of class DatabasePesanan here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @6 Maret 2017 
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan> list_pesanan = new ArrayList<>();
    /**
     * Constructor for objects of class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise inance variables
        
    }

    /**
     * This method is used to add ojek order to database
     * 
     * @param pesan Parameter used to pass the order to database.
     * @return boolean This returns true.  
     */
    public static boolean addPesanan(Pesanan pesan) throws PesananSudahAdaException
    {
        // put your code here
        if(list_pesanan.contains(pesan)){
            System.out.println("Gagal menambahkan pesanan!\n");
            throw new PesananSudahAdaException(pesan);            
        }else{
            list_pesanan.add(pesan);
            System.out.println("Berhasil Menambahkan Pesanan!\n");
        	return true;
		}
    }
    
    /**
     * This method is used to remove ojek order from database
     * 
     * @param pesan Parameter used to pass the order to database.
     * @return boolean This returns true.  
     */
    public static boolean hapusPesanan(Pesanan pesan) throws PesananTidakDitemukanException
    {
        // put your code here
        if(list_pesanan.contains(pesan)){
            if(pesan.getPelayan()!=null){
                Administrasi.pesananSelesai(pesan);
                list_pesanan.remove(pesan);
                System.out.println("Pesanan sudah dihapus!");
            }
            throw new PesananTidakDitemukanException(pesan);
        }
        return true;
    }
    
    /**
     * This method is used to remove ojek order from database
     * 
     * @param pengguna Parameter used to pass the order to database.
     * @return boolean This returns false.  
     */
    public static boolean hapusPesanan(Pelanggan pengguna) throws PesananOlehPelangganDitemukanException
    {
        // put your code here
        Pesanan pesan = getPesanan(pengguna);
        if(list_pesanan.contains(pesan)){
            if(pesan.getPelayan()!=null){
                Administrasi.pesananSelesai(pesan);
                list_pesanan.remove(pesan);
                System.out.println("Pesanan sudah dihapus!");
            }
            throw new PesananOlehPelangganDitemukanException(pengguna);
        }
        return true;
    }

    /**
     * This method is used to get the information
     * related to the order.
     *
     * @return Pesanan This returns the current active order.  
     */
    public static Pesanan getPesanan(Pelanggan pengguna){
        int i,j=0;
        for(i=0;i<list_pesanan.size();i++){
            if(list_pesanan.get(i).getPelanggan().equals(pengguna)){
                j=j+1;
                break;
            }
        }
        
        if(j>0){
            return list_pesanan.get(i);
        }else{
            return null;
        }
    }
    
    /**
     * This method is used to get the database itself.
     *
     * @return String[] Returns null.  
     */
    public static ArrayList<Pesanan> getDatabase()
    {
        // put your code here
        return list_pesanan;
    }
    
    /**
     * This method is used to cancel the order.
     *
     * @param pesan This parameter is the order that will be canceled.
     * @return Nothing.  
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        // put your code here
  
    }
    
    /**
     * This method is used to cancel the order.
     *
     * @param pengguna This parameter specify who's cancelling the order.
     * @return Nothing.  
     */
    public static void pesananDibatalkan(Pelanggan pengguna)
    {
        // put your code here
  
    }
}
