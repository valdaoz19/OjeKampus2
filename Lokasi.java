
/**
 * Write a description of class Lokasi here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @6 Maret 2017 
 */
public class Lokasi
{
    //Variabel Instance
    private double x;
    private double y;
    private String nama_lokasi;
    private String keterangan_lokasi;

    /**
     * Constructor yang telah dibuat saat kelas Lokasi dibuat berisi koordinat, nama dan keterangan.
     * @param x untuk koordinat x
     * @param y untuk koordinat y
     * @param nama_lokasi untuk nama lokasi
     * @param keterangan_lokasi untuk keterangan_lokasi
     */
    public Lokasi(double x, double y, String nama_lokasi, String keterangan_lokasi)
    {
        this.x = x;
        this.y = y;
        this.nama_lokasi = nama_lokasi;
        this.keterangan_lokasi = keterangan_lokasi;
    }
    
    /**
     * Method toString digunakan untuk dapat menampilkan lokasi agar berubah menjadi string.
     */
    public String toString(){
        //Hanya return untuk menampilkan string dari Lokasi
        return "X: " + x + ", "+ "Y: " + y + ", "
                + "Lokasi: " + nama_lokasi + ", "
                + "Keterangan: " + keterangan_lokasi + ".";
    }

    
    /**
     * Method untuk Mendapatkan koordinat X
     * @return x = nilai koordinat X
     */
    public double getX()
    {
        return x;
    }
    
     /**
     * Method untuk Mendapatkan koordinat Y
     * @return y = nilai koordinat Y
     */
    public double getY()
    {
        return y;
    }
    
     /**
     * Method untuk Mendapatkan nama lokasi
     * @return nama_lokasi = nilai nama lokasi
     */
    public String getNama()
    {
        return nama_lokasi;
    }
    
     /**
     * Method untuk Mendapatkan keterangan lokasi
     * @return keterangan_lokasi = nilai keterangan lokasi
     */
    public String getKeteranganLokasi()
    {
        return keterangan_lokasi;
    }
    
    /**
     * Method untuk Men-set koordinat X
     * @param x untuk koordinat X
     */
    public void setX(double x)
    {
        this.x=x;
    }
    
    /**
     * Method untuk Men-set koordinat Y
     * @param y untuk koordinat Y
     */
    public void setY(double y)
    {
        this.y=y;
    }
    
    /**
     * Method untuk Men-set nama lokasi
     * @param nama_lokasi untuk nama lokasi
     */
    public void setNama(String nama_lokasi)
    {
        this.nama_lokasi=nama_lokasi;
    }
    
    /**
     * Method untuk Men-set keterangan lokasi
     * @param keterangan_lokasi untuk keterangan lokasi
     */
    public void getKeteranganLokasi(String keterangan_lokasi)
    {
        this.keterangan_lokasi=keterangan_lokasi;
    }
}
