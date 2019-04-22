
/**
 * Klasse Mitarbieter um ein Mittarbeiter-Object erzeugen
 * Eigenschaften werden von der Klasse Person geerbt und um das Attribut email erweitert
 * 
 * dieser Mitarbeiter kann dazu noch mit der Methode reserviere einen Raum reservieren
 * 
 * @author Samantha Maaß & Huseein Abbas 
 * @version 14.04.2019
 */
public class Mitarbeiter extends Person
{
    //Attribut
    private String email;

    /**
     * Konstruktor für Objekte der Klasse Mitarbeiter
     * 
     * @param Vorname, nachname, email
     * @return mitarbeiter object
     */
    public Mitarbeiter(String vorname, String nachname, String email)
    {
      super(vorname, nachname);
        
      Check.check(email !=null || email.trim().isEmpty(), "email darf nicht leer sein");
      
      this.email = email;
    }
    
    /**
     * Methode für einen Mitarbeiter einen Raum zu reservieren
     * erstellt ein Reservierungs-Object innerhalb der Klasse Reservierung und 
     * fügt es innerhalb der Klasse Raum zu der passenden liste hinzu
     * 
     * @param Raum, Uhrzeit beginn & ende, bemerkung
     */
    public void reserviere (Raum raum,Uhrzeit beginn, Uhrzeit ende, String bemerkung)
    {
       Reservierung reservierung = new Reservierung(beginn,ende,raum,this,bemerkung);
       raum.addReservierung(reservierung);
    }
    
    //tostring
    public String toString()
    {
       return super.toString() + " (" + email + ")";
    }
}
