
/**
 * Write a description of class Pesanan here.
 * 
 * @author Valda Orchidea Zahwa 
 * @version (a version number or a date)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private static Ojek pelayan = null;
    private static Pelanggan pengguna;
    private static String pelanggan_awal;
    private static String pelanggan_akhir;
    private static double biaya;
    private static String layanan;
    private static Lokasi lokasi_awal;
    private static Lokasi lokasi_akhir;
    private static boolean diproses = false;
    private static boolean dibatalkan = false;

    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(Pelanggan pengguna, String layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, 
            String pelanggan_awal, String pelanggan_akhir, double biaya)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;
        this.biaya = biaya;
    }
       
    public void pesananDiambil(Ojek pelayan){
        
    }
    
        public boolean getStatusPesanan(){
        return true;
    }
    
    public Pelanggan getPelanggan(){
        return pengguna;
    }
    
    public Ojek getOjek(){
        return pelayan;
    }
    
    public void pesananDibatalkan(){
    }
    
    public Lokasi getLokasiAwal(){
        return lokasi_awal;
    }
    
    public Lokasi getLokasiAkhir(){
        return lokasi_akhir;
    }
    
    public String getTipeLayanan(){
        return layanan;
    }
    
    public String getPenggunaAwal(){
        return pelanggan_awal;
    }
    
    public String getPenggunaAkhir(){
        return pelanggan_akhir;
    }
    
    public double getBiaya(){
        return biaya;
    }
    
    public void printData(){
        System.out.println("Pesanan:");
        System.out.println("Pengguna = " + pengguna);
        System.out.println("Lokasi Awal = " + lokasi_awal);
        System.out.println("Lokasi Akhir = " + lokasi_akhir);
        System.out.println("Pelanggan Awal = " + pelanggan_awal);
        System.out.println("Pelanggan Akhir = " + pelanggan_akhir);
    }
}
