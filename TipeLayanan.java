
/**
 * Write a description of class TipeLayanan here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @6 Maret 2017 
 */
  enum TipeLayanan
{
    AntarBarang("Antar Barang"), AntarOrang("Antar Orang"), BeliBarang("Beli Barang");
    
    //variabel instance
    private String deskripsi;
    
    /**
     * Method untuk mendapatkan TipeLayanan
     * @param deskripsi untuk deskripsi dari enum yang dibuat
     */
    TipeLayanan(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }

    /**
     * Method untuk menampilkan deskripsi yang sudah dibuat
     */
    public String toString()
    {
        return deskripsi;
    }
}
