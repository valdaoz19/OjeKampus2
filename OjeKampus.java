import java.util.*;
/**
 * <h1>OjeKampus</h1>
 * This is a class to call objects from other class to make 
 * Ojek Kampus application
 * 
 * @author  Valda Orchidea Zahwa
 * @6 Maret 2017 
 */
public class OjeKampus
{
    // Single line comment : Variable Instance

    
    /* Multi line comment
     * Constructor Ojekampus
     * Constructor ini tidak perlu diberikan apapun, karena class ini tidak memerlukan apapun ketika
     */
    public OjeKampus()
    {
        
    }

    /**
     * Method Main. 
     * Metode utama pada project ojekampus yang akan dialankan ketika project di compile dan di run.
     * @param  String args[]    argumen yang diberikan untuk metode main.
     */
    public static void main(String args[])
    {

        Lokasi lokasi1 = new Lokasi("kutek",3,3,"depok");
        Lokasi lokasi2 = new Lokasi("FT",1,1,"depok");
        Lokasi lokasi3 = new Lokasi("Pusgiwa",4,4,"depok");
                
        Ojek ojek1 = new Ojek(DatabaseUser.getIDOjekTerakhir(),"ojek1",lokasi1);
        DatabaseUser.addOjek(ojek1);
        
        DatabaseUser.addOjek(ojek1);
        
        Ojek ojek2 = new Ojek(DatabaseUser.getIDOjekTerakhir(),"ojek2",lokasi2);
        DatabaseUser.addOjek(ojek2);
        
        Ojek ojek3 = new Ojek(DatabaseUser.getIDOjekTerakhir(),"ojek3",lokasi3);
        DatabaseUser.addOjek(ojek3);
        

        Pelanggan pelangga1 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(),"valda","0877-11111111");
        DatabaseUser.addPelanggan(pelangga1);
        
        Pelanggan pelangga2 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(),"orchidea","0877-22222222");
        DatabaseUser.addPelanggan(pelangga2);
        
        Pelanggan pelangga3 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(),"zahwa","0877-33333333");            
        DatabaseUser.addPelanggan(pelangga3);
        

        TipeLayanan layan1 = TipeLayanan.AntarBarang;
        TipeLayanan layan2 = TipeLayanan.AntarOrang;
        TipeLayanan layan3 = TipeLayanan.BeliBarang;
        
        Pesanan p1 = new Pesanan(pelangga1,layan1,lokasi1,lokasi2,"pelanggan1");
        Pesanan p2 = new Pesanan(pelangga2,layan2,lokasi2,lokasi3,"pelanggan2");
        Pesanan p3 = new Pesanan(pelangga3,layan3,lokasi3,lokasi1,"pelanggan3");
        Pesanan p4 = new Pesanan(pelangga1,layan1,lokasi1,lokasi2,"pelanggan1");

        try{
         DatabasePesanan.addPesanan(p1);
         DatabasePesanan.addPesanan(p2);
         DatabasePesanan.addPesanan(p3);
         DatabasePesanan.addPesanan(p1);
         DatabasePesanan.addPesanan(p4);
        }
        catch(PesananSudahAdaException a){
            System.out.println(a.GetMessage());
        }
        

        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        Administrasi.printAllDatabase();

        Administrasi.pesananDibatalkan(pelangga3);
        Administrasi.printAllDatabase();
   		
   
        Administrasi.pesananDibatalkan(pelangga1);
        Administrasi.printAllDatabase();
        
     
        Administrasi.pesananSelesai(pelangga2);
        Administrasi.printAllDatabase();
        
    }
    
     public static void antarBarang()
    {
    }
    
    public static void antarOrang()
    {
    }
    
    public static void ojekMembatalkan()
    {
    }
    
    public static void ojekMengubahStatus()
    {
    }
    
    public static void pembelianBarang()
    {
    }
    
    public static void penggunaMembatalkan()
    {
    }
    
    public static void penggunaMenghapusPesanan()
    {
    }
    
    public static void penggunaMenyelesaikanPesanan()
    {
    }
    
    public static void registrasiOjek()
    {
    }
    
    public static void registrasiPengguna()
    {
    }
    
    public static void startSistemPengawas(int waktu_cek)
    {
        SistemPengawas sistem1 = new SistemPengawas("Pesanan", waktu_cek);
        sistem1.start();
    }
    
    public static void menungguSistem(int a)
    {
        try
        {
            Thread.sleep(a);
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread interrupted.");
        }
    }
}
