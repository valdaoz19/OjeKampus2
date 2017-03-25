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
    //Variabel Instance
    public static Ojek ojek_valda;
    public static DatabaseUser ojek_database;
    public static Lokasi ojek_lokasi;
    public static Pelanggan p_oz;
    public static DatabasePesanan p_database;
    public static Lokasi per_oz_awal;
    public static Lokasi per_oz_akhir;
    public static Pesanan pes_oz;
    
    
    /**
     * Constructor dari class ojekampus yang terbuat bila kelas dibuat.
     */
    public OjeKampus()
    {
        
    }

    /**
     * Method main
     * Method main atau utama dari projek ojekampus.
     * @param  String[] args untuk membuat main agar bisa dijalankan pada terminal.
     */
    public static void main(String[] args)
    {
        Lokasi lokasi1 = new Lokasi(1,2,"Kutek", "Depok");
        Ojek ojek1 = new Ojek(1,"valda", lokasi1);
        DatabaseUser.addOjek(ojek1);
        Lokasi lokasi2 = new Lokasi(11,12,"Kutek", "Tanggerang");
        Ojek ojek2 = new Ojek(2,"Aye", lokasi2);
        DatabaseUser.addOjek(ojek2);
        Lokasi lokasi3 = new Lokasi(21,22,"Kutek", "Bogor");
        Ojek ojek3 = new Ojek(3,"Faris", lokasi3);
        DatabaseUser.addOjek(ojek3);
        Pelanggan pelanggan1 = new Pelanggan(1, "Dito","081382226439");
        DatabaseUser.addPelanggan(pelanggan1);
        Pelanggan pelanggan2 = new Pelanggan(2, "Miko","085735040134");
        DatabaseUser.addPelanggan(pelanggan2);
        Pelanggan pelanggan3 = new Pelanggan(3, "rifqi","08123282883");
        DatabaseUser.addPelanggan(pelanggan3);
        
        Lokasi lokasi_awal_pesanan1 = new Lokasi(3,4,"FT", "Depok");
        Lokasi lokasi_akhir_pesanan1 = new Lokasi(13,14,"FT", "Jakarta");
        Pesanan pesanan1 = new Pesanan(pelanggan1,TipeLayanan.BeliBarang,lokasi_awal_pesanan1,lokasi_akhir_pesanan1,pelanggan1.getNama());
        DatabasePesanan.addPesanan(pesanan1);
        
        Lokasi lokasi_awal_pesanan2 = new Lokasi(13,14,"Pocin", "Jakarta");
        Lokasi lokasi_akhir_pesanan2 = new Lokasi(23,24,"Kober", "Bogor");
        Pesanan pesanan2 = new Pesanan(pelanggan2,TipeLayanan.AntarBarang,lokasi_awal_pesanan2,lokasi_akhir_pesanan2,pelanggan2.getNama(), "chandra");
        DatabasePesanan.addPesanan(pesanan2);
        
        Lokasi lokasi_awal_pesanan3 = new Lokasi(23,24,"Kukel", "Bogor");
        Lokasi lokasi_akhir_pesanan3 = new Lokasi(3,4,"Kutek", "Depok");
        Pesanan pesanan3 = new Pesanan(pelanggan3,TipeLayanan.AntarOrang,lokasi_awal_pesanan3,lokasi_akhir_pesanan3,pelanggan3.getNama());
        DatabasePesanan.addPesanan(pesanan3);
        
        System.out.println("\n");
        Administrasi.printAllDatabase();
        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        System.out.println("\n");
        Administrasi.pesananDibatalkan(pesanan1.getPelanggan());
        Administrasi.pesananDibatalkan(pesanan2.getPelayan());
        pesanan3.getPelayan().setStatus(StatusOjek.Antar);
        Administrasi.printAllDatabase();
        
        System.out.println("\n");
        Administrasi.pesananSelesai(pesanan3.getPelanggan());
        DatabasePesanan.hapusPesanan(pesanan3.getPelanggan());
        Administrasi.printAllDatabase();
    }
}
