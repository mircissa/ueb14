import java.util.ArrayList;
/**
 * Klasse raum um ein Raum-object mit den Attributen gebaeude(geb), etage und raum
 * dem Object wird eine array liste hinzugefügt in der mithilfe von der Methode 
 * addReservierung Reservierungen gespeichert werden
 * nebenbei wird die anzahl in dem Attribut anzahl gespeichert
 * 
 * @author Samantha Maaß & Huseein Abbas 
 * @version 14.04.2019 
 */
public class Raum
{
    //attribute
    private int geb;
    private int etage;
    private int raum;
    private int anzahl;
    private Reservierung[] reservierungen;

    /**
     * Konstruktor für Objekte der Klasse Raum
     * 
     * @param gebaeude (geb), etage, raum
     * @return raum object
     */
    public Raum(int geb, int etage, int raum)
    {
        Check.check(geb   >= 0, "ungültige Raumnummer");
        Check.check(etage >= 0, "ungültige Raumnummer");
        Check.check(raum  >= 0, "ungültige Raumnummer");
        
        this.etage  = etage;
        this.raum   = raum;
        this.geb    = geb;
        this.anzahl = 0;
        
        reservierungen= new Reservierung[10];
    }
    
    /**
     * Get Methode um die Anzahl der reservierungen abzufragen
     * 
     * @return anzahl der Reservierungen
     */
    public int getAnzahl ()
    {
        return anzahl;
    }
    
    /**
     * Methode um der Reserveirungs-liste eine hinzuzufügen
     * zählt die anzahl hoch
     * 
     * @param Reservierungs object
     */
    public void addReservierung(Reservierung reservierung)
    {
       reservierungen[getAnzahl()]= reservierung;
       anzahl++;
    }
    
    //toString
    public String toString()
    {
        String res = "";
        for (int i=0; i < anzahl ; i++) 
        {
            res = res + reservierungen[i] + "\n";
        }
        
        return "Raum" + geb + "-" + etage + "." + raum + "\n" + res; 
        
    }
    

}
