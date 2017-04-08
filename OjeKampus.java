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
    public static Pelanggan p_oz;
    public static Ojek ojek_Faris;
    public static DatabaseUser database;
    public static DatabasePesanan p_database;
    public static Lokasi ojek_lokasi;
    public static Lokasi per_oz_awal;
    public static Lokasi per_oz_akhir;
    public static Pesanan pes_oz;
    
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
        //Modul 5 Tugas 4
        System.out.println("\n");
        Lokasi lokasi_ojek1 = new Lokasi("Kutek",03,04,"FT");
        Ojek ojek1 = new Ojek(1,"Faris", lokasi_ojek1);
        DatabaseUser.addOjek(ojek1);
        Lokasi lokasi_ojek2 = new Lokasi("FT",9,11,"Kukel");
        Ojek ojek2 = new Ojek(2,"Miko", lokasi_ojek2);
        DatabaseUser.addOjek(ojek2);
        Lokasi lokasi_ojek3 = new Lokasi("Pusgiwa",8,9,"Depok");
        Ojek ojek3 = new Ojek(3,"Adam", lokasi_ojek3);
        DatabaseUser.addOjek(ojek3);
        Pelanggan pelanggan1 = new Pelanggan(1, "Valda","082211386865");
        DatabaseUser.addPelanggan(pelanggan1);
        Pelanggan pelanggan2 = new Pelanggan(2, "Aye","083344386865");
        DatabaseUser.addPelanggan(pelanggan2);
        Pelanggan pelanggan3 = new Pelanggan(3, "Rifqi","085566386865");
        DatabaseUser.addPelanggan(pelanggan3);
        
        Lokasi lokasi_awal_pesanan1 = new Lokasi("Kutek",04,05,"Depok");
        Lokasi lokasi_akhir_pesanan1 = new Lokasi("Kober",14,15,"Depok");
        Pesanan pesanan1 = new Pesanan(pelanggan1,TipeLayanan.BeliBarang,lokasi_awal_pesanan1,lokasi_akhir_pesanan1,pelanggan1.getNama());
        DatabasePesanan.addPesanan(pesanan1);
        
        Lokasi lokasi_awal_pesanan2 = new Lokasi("Kober",14,15,"Depok");
        Lokasi lokasi_akhir_pesanan2 = new Lokasi("Kukel",24,25,"Depok");
        Pesanan pesanan2 = new Pesanan(pelanggan2,TipeLayanan.AntarBarang,lokasi_awal_pesanan2,lokasi_akhir_pesanan2,pelanggan2.getNama(), "Irfan");
        DatabasePesanan.addPesanan(pesanan2);
        
        Lokasi lokasi_awal_pesanan3 = new Lokasi("Kukel",24,25,"Depok");
        Lokasi lokasi_akhir_pesanan3 = new Lokasi("Kutek",04,05,"Depok");
        Pesanan pesanan3 = new Pesanan(pelanggan3,TipeLayanan.AntarOrang,lokasi_awal_pesanan3,lokasi_akhir_pesanan3,pelanggan3.getNama());
        DatabasePesanan.addPesanan(pesanan3);
        
        Administrasi.printAllDatabase();
        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        Administrasi.pesananDibatalkan(pesanan1.getPelanggan());
        Administrasi.pesananDibatalkan(pesanan2.getPelayan());
        pesanan3.getPelayan().setStatus(StatusOjek.Antar);
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        Administrasi.pesananSelesai(pesanan3.getPelanggan());
        DatabasePesanan.hapusPesanan(pesanan3.getPelanggan());
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        
    }
}
