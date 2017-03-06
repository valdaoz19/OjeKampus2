
/**
 * <h1>OjeKampus</h1>
 * This is a class to call objects from other class to make 
 * such a simulation about Ojek Kampus application
 * 
 * @author  Valda Orchidea Zahwa
 * @version 
 */
public class OjeKampus
{
    public OjeKampus ()
    {
        
    }
    
    public static void main (String[] args )
    {
     /*
        Pelanggan pelanggan1 = new Pelanggan();
        pelanggan1.setID(84);
        pelanggan1.setNama("Valda");
        temp = Integer.toString(pelanggan1.getID());
        System.out.println("Pelanggan1:");
        System.out.println("ID = " + temp);
        System.out.println("Nama = " + pelanggan1.getNama());
        
        Ojek ojek1 = new Ojek();
        ojek1.setID(14);
        ojek1.setNama("Oz");
        temp2 = Integer.toString(ojek1.getID());
        System.out.println("\nOjek1:");
        System.out.println("ID = " + temp2);
        System.out.println("Nama = " + ojek1.getNama());
        */
       Lokasi mLokasi;
       Ojek ojek_valda = new Ojek(DatabaseUser.getIDOjekTerakhir(), "Valda", 
            mLokasi = new Lokasi("FT", 14, 06, "Halte"));
       Pelanggan p_oz = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), "Oz");
       Lokasi per_oz_awal = new Lokasi("Kutek", 6, 0, "Al-hikam");
       Lokasi per_oz_akhir = new Lokasi("Pondok Cina", 5, 4, "Stasiun Pondok Cina");
       Pesanan pes_oz = new Pesanan(p_oz, "Cepat", per_oz_awal,
            per_oz_akhir, "aye", "dito", 5000);
       DatabaseUser.addOjek(ojek_valda);
       DatabaseUser.addPelanggan(p_oz);
       DatabasePesanan.addPesanan(pes_oz);
       
       String temp;
       temp = Integer.toString(DatabaseUser.getIDOjekTerakhir());
       System.out.println("Data : ");
       System.out.println("Oz = " + temp);
       temp = Integer.toString(DatabaseUser.getIDPelangganTerakhir());
       System.out.println("Valda = " + temp);   
    }
    
   
}
