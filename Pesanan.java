
/**
 * Write a description of class Pesanan here.
 * 
 * @author Valda Orchidea Zahwa 
 * @6 Maret 2017 
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private Ojek pelayan = null;
    private Pelanggan pengguna;
    private String pelanggan_awal;
    private String pelanggan_akhir;
    private double biaya;
    private TipeLayanan layanan;
    private Lokasi lokasi_awal;
    private Lokasi lokasi_akhir;
    private boolean diproses = false;
    private boolean dibatalkan = false;
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, 
            String pelanggan_awal)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
    }
      
     public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, 
            String pelanggan_awal, String biayapelanggan_akhir)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;
 
    }
    
     public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, 
            String pelanggan_awal, String biayapelanggan_akhir, double biaya)
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
    
    public TipeLayanan getTipeLayanan(){
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
    
    public void setPelayan(Ojek pelayan){
        
    }
    
    public void setPelanggan(Pelanggan pengguna){
        
    }
    
    public void setPenggunaAwal(String pelanggan_awal){
    
    }
    
    public void setPenggunaAkhir(String pelanggan_akhir){
        
    }
    
    public void setBiaya(double biaya){
    
    }
    
    public void setTipeLayanan(TipeLayanan layanan){
    
    }
    
    public void setLokasiAwal(Lokasi lokasi_awal){
        
    }
    
    public void setLokasiAkhir(Lokasi lokasi_akhir){
    }
    
    public void setStatusDiproses(Boolean diproses){
    }
    
    public void setStatusSelesai(Boolean selesai){
        
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
