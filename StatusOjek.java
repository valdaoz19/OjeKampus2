
/**
 * Write a description of class StatusOjek here.
 * 
 * @author (Valda Orchidea Z) 
 * @version (20 Maret 2017)
 */
public enum StatusOjek
{
    Antar("Mengantar"), Idle("Idle"), Jemput("Jemput");
    private String deskripsi;
    private StatusOjek(String deskripsi)
    {
       
        this.deskripsi = deskripsi;
    }

    public String toString()
    {
        return this.deskripsi;
    }
}
