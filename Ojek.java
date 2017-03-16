
/**
 * Write a description of class Ojek here.
 * 
 * @author (your name) 
 * @6 Maret 2017 
 */
public class Ojek
{
    // instance variables - replace the example below with your own
    private int x;
    private static String status = "idle";
    private static Pesanan pesanan_sekarang = null;
    private static Lokasi posisiSekarang;
    private static int id;
    private static String nama;

    /**
     * Constructor for objects of class Ojek
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setID(int id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setPesanan(Pesanan pesan){
        pesanan_sekarang = pesan;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public int getID(){
        return id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public Pesanan getPesanan(){
        return pesanan_sekarang;
    }
        
    public Lokasi getPosisi(){
        return posisiSekarang;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void printData(){
        String temp;
        temp = Integer.toString(id);
        System.out.println("Ojek:");
        System.out.println("ID = " + temp);
        System.out.println("Nama = " + nama);
    }
}
