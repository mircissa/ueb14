
/**
 * Klasse Person um ein Person-Object mit den eigenschaften vorname und nachname zu erzeugen
 * 
 * @author Samantha Maaß & Huseein Abbas 
 * @version 14.04.2019
 */
public class Person 
{
    //attribute
    private String vorname;
    private String nachname;

    /**
     * Konstruktor für Objekte der Klasse Person
     * 
     * @param vorname, nachname
     * @return Person Object
     */
    public Person(String vorname, String nachname)
    {
        Check.check(vorname !=null || vorname.trim().isEmpty(), "vorname darf nicht leer sein");
        Check.check(nachname !=null || nachname.trim().isEmpty(), "nachname darf nicht leer sein");
        
        this.vorname  = vorname;
        this.nachname = nachname;  
    }
    
    //toString
    public String toString()
    {
        return vorname + " " + nachname;
    }

}
