
/**
 * Write a description of class Lokasi here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @6 Maret 2017 
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private static double x;
    private static double y;
    private static String nama_lokasi;
    private static String keterangan_lokasi;

    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi(String nama_lokasi, double x, double y, String keterangan_lokasi)
    {
        this.nama_lokasi = nama_lokasi;
        this.x = x;
        this.y = y;
        this.keterangan_lokasi = keterangan_lokasi;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public String getNama(){
        return nama_lokasi;
    }
    
    public String getKeteranganLokasi(){
        return keterangan_lokasi;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public void setNama(String nama_lokasi){
        this.nama_lokasi = nama_lokasi;
    }
    
    public void setKeteranganLokasi(String keterangan_lokasi){
        this.keterangan_lokasi = keterangan_lokasi;
    }
}
