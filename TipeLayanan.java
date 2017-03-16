
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
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getStringValue()
    {

        return deskripsi;
    }
    }

