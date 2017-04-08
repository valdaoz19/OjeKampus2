
/**
 * Write a description of class StatusOjek here.
 * 
 * @author (Valda Orchidea Z) 
 * @version (20 Maret 2017)
 */
public enum StatusOjek
{
    Idle("Idle"),Jemput("Menjemput"),Antar("Mengantar");
    private String deskripsi;
    StatusOjek (String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public String getIDStatus(){
        return deskripsi;
    }
    
}