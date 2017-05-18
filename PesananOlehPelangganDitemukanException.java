
/**
 * Write a description of class PesananOlehPelangganDitemukanException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananOlehPelangganDitemukanException extends Exception
{
    private Pelanggan pelanggan_error;
    
    /**
     * Constructor for objects of class PesananOlehPelangganDitemukanException
     */
    public PesananOlehPelangganDitemukanException()
    {
    }
    
    /**
     * Constructor for objects of class PesananOlehPelangganDitemukanException
     */
    public PesananOlehPelangganDitemukanException(Pelanggan pelanggan_input)
    {
        super("Pesanan Oleh ");
        
        pelanggan_error = pelanggan_input;
    }

    public String GetMessage()
    {
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan";
    }
}