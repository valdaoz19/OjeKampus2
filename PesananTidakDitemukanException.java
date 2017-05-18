
/**
 * Write a description of class PesananTidakDitemukanException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananTidakDitemukanException extends Exception
{
    private Pesanan pesanan_error;
    
     /**
     * Constructor for objects of class PesananTidakDitemukanException
     */
    public PesananTidakDitemukanException()
    {
    }
    
    public PesananTidakDitemukanException(Pesanan pesanan_input)
    {
        super("Pesanan yang dipesan oleh ");
        
        pesanan_error = pesanan_input;
    }
    
    public String GetMessage()
    {
        return super.getMessage()+pesanan_error.getPelanggan().getNama()+" tidak ditemukan";
    }
}