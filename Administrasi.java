
/**
 * Write a description of class Administrasi here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @version (16 03 2016)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
    }

    public static void pesananDitugaskan(Pesanan pesan, Ojek pelayan)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setPelayan(pelayan);
        ojekAmbilPesanan(pesan,pelayan);
    }
    
    public static void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan)
    {
       pelayan.setStatus(StatusOjek.Jemput);
       pelayan.setPesanan(pesan);
    }
    
    public static void ojekLepasPesanan(Ojek pelayan)
    {
        pelayan.setStatus(StatusOjek.Idle);
        pelayan.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Ojek pelayan)
    {
        Pesanan pesan = pelayan.getPesanan();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    public static void pesananSelesai(Ojek pelayan)
    {
        Pesanan pesan = pelayan.getPesanan();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        pesan.setPelayan(null);
    }
    
    public static void pesananSelesai(Pesanan pesan)
    {
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setStatusDiproses(true);
        pesan.setStatusSelesai(false);
        pesan.setPelayan(null);
    }
}
