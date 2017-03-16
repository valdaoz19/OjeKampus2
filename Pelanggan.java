
/**
 * Write a description of class Pelanggan here.
 * 
 * @author Valda Orchidea Zahwa 
 * @6 Maret 2017 
 */
public class Pelanggan
{
    // instance variables - replace the example below with your own
    private int x;
    int id;
    String nama;

    /**
     * Constructor for objects of class Pelanggan
    */ 
    public Pelanggan(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public int getID(){
        return id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setID(int id){
        this.id = id; 
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void printData(){
        String temp;
        temp = Integer.toString(id);
        System.out.println("Pelanggan:");
        System.out.println("ID = " + temp);
        System.out.println("Nama = " + nama);
    }
}
