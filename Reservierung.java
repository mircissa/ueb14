
/**
 * Klasse Reservierung um ein Reservierungs Object mit den Attributen Uhrzeit beginn & ende,
 * Raum, Mitarbeiter und einer bemerkung zu erzeugen
 * 
 * @author Samantha Maaß & Huseein Abbas 
 * @version 14.04.2019
 */
public class Reservierung
{   
    //Attribute
    private String bemerkung;
    private Uhrzeit beginn;
    private Uhrzeit ende;
    private Mitarbeiter mitarbeiter;
    private Raum raum;
    
    /**
     * Konstruktor für Objekte der Klasse Reservierung
     * 
     * @param Uhrzeit beginn & ende, raum, mitarbeiter, bemerkung
     * @return Reservierungs Object
     */
    public Reservierung(Uhrzeit beginn, Uhrzeit ende, Raum raum, Mitarbeiter mitarbeiter, String bemerkung)
    {
        this.beginn = beginn;
        this.ende   = ende;
        this.bemerkung = bemerkung;
        this.mitarbeiter = mitarbeiter;
        this.raum = raum;
    }
    
    //toString
    public String toString ()
    {
        return "gebucht von " + mitarbeiter + " von " + beginn + " bis " + ende + " für " + bemerkung ; 

    }
}
