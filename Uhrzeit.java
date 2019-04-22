
/**
 * Klasse Uhrzeit um ein Uhrzeit-Object mit den Attributen Stunde und Minute zu erzeugen
 * 
 * @author   Samantha Maaß & Huseein Abbas 
 * @version  14.04.2019
 */
public class Uhrzeit
{
    //Attribute
    private int minute;
    private int stunde;

    /**
     * Konstruktor für Objekte der Klasse Uhrzeit
     * 
     * @param   Minute und Stunden abgabe
     * @return  Object Uhrzeit
     */
    public Uhrzeit(int minute, int stunde)
    {
        this.minute = minute;
        this.stunde = stunde;
    }
    
    // toString
    public String toString()
    {
      return  stunde + ":" + minute + "Uhr"; 
    }
}
