
/**
 * <h1>OjeKampus</h1>
 * This is a class to call objects from other class to make 
 * Ojek Kampus application
 * 
 * @author  Valda Orchidea Zahwa
 * @6 Maret 2017 
 */
public class OjeKampus
{
    //Variabel Instance
    public static Ojek ojek_valda;
    public static DatabaseUser ojek_database;
    public static Lokasi ojek_lokasi;
    public static Pelanggan p_oz;
    public static DatabasePesanan p_database;
    public static Lokasi per_oz_awal;
    public static Lokasi per_oz_akhir;
    public static Pesanan pes_oz;
    public static Administrasi administrasi;
    private TipeLayanan layanan;
    
    
    /**
     * Constructor dari class ojekampus yang terbuat bila kelas dibuat.
     */
    public OjeKampus()
    {
        
    }

    /**
     * Method main
     * Method main atau utama dari projek ojekampus.
     * @param  String[] args untuk membuat main agar bisa dijalankan pada terminal.
     */
    public static void main(String[] args)
    {
        ojek_database = new DatabaseUser();
        ojek_lokasi = new Lokasi(14,06,"Kutek","Depok");
        ojek_valda = new Ojek(ojek_database.getIDOjekTerakhir(),"valda", ojek_lokasi);
        p_database = new DatabasePesanan();
        p_oz = new Pelanggan(ojek_database.getIDPelangganTerakhir(),"oz");
        per_oz_awal = new Lokasi(5,3,"Jurasik","Depok");
        per_oz_akhir = new Lokasi(2,0,"Kampus","Depok");
        pes_oz = new Pesanan(p_oz, TipeLayanan.AntarOrang, per_oz_awal, per_oz_akhir,
        "Fariz", "Aye", 10000);
        ojek_database.addOjek(ojek_valda);
        ojek_database.addPelanggan(p_oz);
        p_database.addPesanan(pes_oz);
        administrasi = new Administrasi();
        
       
        System.out.println(ojek_valda.getNama());
        System.out.println(p_oz.getNama());
        ojek_valda.setNoPlat("S4598J");
        System.out.println(ojek_valda.getNoPlat());
        ojek_valda.setTelefon("081382226439");
        System.out.println(ojek_valda.getTelefon());
        ojek_valda.setDOB(05,01,1996);
        System.out.println("Tanggal Lahir "+ojek_valda.getDOB().toString());
    }
}
