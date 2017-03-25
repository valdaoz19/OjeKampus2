
/**
 * Write a description of class Pesanan here.
 * 
 * @author Valda Orchidea Zahwa 
 * @6 Maret 2017 
 */
public class Pesanan
{
    //Variabel Instance
    private Ojek pelayan=null;
    private Pelanggan pengguna;
    private String pelanggan_awal;
    private String pelanggan_akhir;
    private double biaya;
    private TipeLayanan layanan;
    private Lokasi lokasi_awal;
    private Lokasi lokasi_akhir;
    private boolean diproses;
    private boolean selesai;

   /**
     * Constructor yang telah dibuat saat kelas Pesanan dibuat berisi pelanggan, lokasi, biaya.
     * @param pengguna untuk nama pengguna yang memesan pesanan
     * @param layanan untuk jenis layanan
     * @param lokasi_awal untuk lokasi awal 
     * @param lokasi_akhir untuk lokasi akhir
     * @param pelanggan_awal untuk nama pelanggan yang memesan
     * @param pelanggan_akhir untuk nama pelanggan yang memesan (berbeda bila untuk antar barang)
     * @param biaya untuk biaya yang dibayar
     */
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, 
                    Lokasi lokasi_awal, Lokasi lokasi_akhir, 
                    String pelanggan_awal, String pelanggan_akhir, 
                    double biaya)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;
        this.biaya = biaya;
    }
    
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, 
                    Lokasi lokasi_awal, Lokasi lokasi_akhir, 
                    String pelanggan_awal)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
    }
    
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, 
                    Lokasi lokasi_awal, Lokasi lokasi_akhir, 
                    String pelanggan_awal, String pelanggan_akhir)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;
    }

     /**
     * Method untuk menampilkan data pada kelas Pesanan
     */
    public String toString()
    {
        String final_status = "KOSONG";
        if(getStatusDiproses()==true && getStatusSelesai()==false)
        {
            final_status = "DIPROSES";
        }
        else if(getStatusDiproses()==false && getStatusSelesai()==false)
        {
            final_status = "KOSONG";
        }
        else if(getStatusDiproses()==false && getStatusSelesai()==true)
        {
            final_status = "SELESAI";
        }
        
        if(pelayan==null)
        {
            if(pelanggan_akhir != null)
            {
                return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal 
                + " di " + lokasi_awal.getNama() + " ke " + pelanggan_akhir + " di " + 
                lokasi_akhir.getNama() + " dengan layanan " + layanan + " status " 
                + final_status + "|");
            }
            else
            {
                return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal 
                + " di " + lokasi_awal.getNama() + " ke " + lokasi_akhir.getNama() + 
                " dengan layanan " + layanan + " status " 
                + final_status + "|");
            }
        }
        else
        {
            if(pelanggan_akhir != null)
            {
                return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal 
                + " di " + lokasi_awal.getNama() + " ke " + pelanggan_akhir + " di " + 
                lokasi_akhir.getNama() + " dengan layanan " + layanan + " status " 
                + final_status + " | Diproses oleh " + pelayan.getNama());
            }
            else
            {
                return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal 
                + " di " + lokasi_awal.getNama() + " ke "+ lokasi_akhir.getNama() + 
                " dengan layanan " + layanan + " status " 
                + final_status + " | Diproses oleh " + pelayan.getNama());
            }
        }
    }
    
    /**
     * Method untuk Mendapatkan status diproses
     * @return diproses mengembalikan nilai status diproses
     */
    public boolean getStatusDiproses()
    {
        return diproses;
    }
    
    /**
     * Method untuk Mendapatkan status selesai
     * @return diproses mengembalikan nilai status selesai
     */
    public boolean getStatusSelesai()
    {
        return selesai;
    }
    
    /**
     * Method untuk Mendapatkan pelanggan
     * @return pengguna = nilai pengguna
     */
    public Pelanggan getPelanggan()
    {
        return pengguna;
    }
    
    /**
     * Method untuk Mendapatkan ojek
     * @return pelayan = nilai pelayan (ojek)
     */
    public Ojek getPelayan()
    {
        return pelayan;
    }
    
    /**
     * Method untuk Mendapatkan lokasi awal
     * @return lokasi_awal = nilai lokasi awal
     */
    public Lokasi getLokasiAwal()
    {
        return lokasi_awal;
    }
    
    /**
     * Method untuk Mendapatkan lokasi akhir
     * @return lokasi_akhir = nilai lokasi akhir
     */
    public Lokasi getLokasiAkhir()
    {
        return lokasi_akhir;
    }
    
    /**
     * Method untuk Mendapatkan tipe layanan
     * @return layanan = nilai tipe layanan
     */
    public TipeLayanan getTipeLayanan()
    {
        return layanan;
    }
    
    /**
     * Method untuk Mendapatkan nama pengguna awal
     * @return pelanggan_awal = nilai pengguna awal
     */
    public String getPenggunaAwal()
    {
        return pelanggan_awal;
    }
    
    /**
     * Method untuk Mendapatkan nama pengguna akhir
     * @return pelanggan_akhir = nilai pengguna akhir
     */
    public String getPenggunaAkhir()
    {
        return pelanggan_akhir;
    }
  
    /**
     * Method untuk Mendapatkan biaya 
     * @return biaya = nilai biaya
     */
    public double getBiaya()
    {
        return biaya;
    }
       
    /**
     * Method untuk Men-set pelayan (ojek)
     * @param pelayan untuk pelayan (ojek)
     */
    public void setPelayan(Ojek pelayan)
    {
        this.pelayan = pelayan;
    }
    
    /**
     * Method untuk Men-set pelanggan
     * @param pengguna untuk pelanggan
     */
    public void setPelanggan(Pelanggan pengguna)
    {
        this.pengguna = pengguna;
    }
    
    /**
     * Method untuk Men-set pelanggan awal
     * @param pelanggan_awal untuk pelanggan awal
     */
    public void setPenggunaAwal(String pelanggan_awal)
    {
        this.pelanggan_awal = pelanggan_awal;
    }
    
    /**
     * Method untuk Men-set pelanggan akhir
     * @param pelanggan_akhir untuk pelanggan akhir
     */
    public void setPenggunaAkhir(String pelanggan_akhir)
    {
        this.pelanggan_akhir = pelanggan_akhir;
    }
    
    /**
     * Method untuk Men-set biaya
     * @param biaya untuk biaya
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    
    /**
     * Method untuk Men-set tipe layanan
     * @param layanan untuk tipe layanan
     */
    public void setTipeLayanan(TipeLayanan layanan)
    {
        this.layanan = layanan;
    }
    
    /**
     * Method untuk Men-set lokasi awal
     * @param lokasi_awal untuk lokasi awal
     */
    public void setLokasiAwal(Lokasi lokasi_awal)
    {
        this.lokasi_awal = lokasi_awal;
    }
    
    /**
     * Method untuk Men-set lokasi akhir
     * @param lokasi_akhir untuk lokasi akhir
     */
    public void setLokasiAkhir(Lokasi lokasi_akhir)
    {
        this.lokasi_akhir = lokasi_akhir;
    }
    
    /**
     * Method untuk Men-set status sedang diproses
     * @param diproses untuk status diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        this.diproses = diproses;
    }
    
    /**
     * Method untuk Men-set status sudah selesai
     * @param selesai untuk status selesai
     */
    public void setStatusSelesai(boolean selesai)
    {
        this.selesai = selesai;
    }
}
