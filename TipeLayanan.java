
/**
 * Write a description of class TipeLayanan here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @6 Maret 2017 
 */
    public enum TipeLayanan
    {
        AntarBarang("Antar Barang"), AntarOrang("Antar Orang"), BeliBarang("Beli Barang");
        private String deskripsi;
    
 private TipeLayanan(String deskripsi)
    {
       
        this.deskripsi = deskripsi;
    }
    
    public String getStringValue()
    {

        return this. deskripsi;
    }
    }

