
/**
 * Write a description of class StatusOjek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum StatusOjek
{
    Antar("Mengantar"), Idle("Idle"), Jemput("Jemput");
    private String deskripsi;
    private StatusOjek(String deskripsi)
    {
       
        this.deskripsi = deskripsi;
    }

    public String getStringValue()
    {
        return deskripsi;
    }
}
