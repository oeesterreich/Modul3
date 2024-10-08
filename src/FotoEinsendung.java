import java.util.ArrayList;

/**
 * Diese Klasse speichert Informationen über eine Einsendung innerhalb eines sozialen 
 * Netzwerks. Der Hauptteil der Einsendung besteht aus einem Foto und einer Überschrift. 
 * Weitere Daten, wie Autor und Datum, werden ebenfalls gespeichert.
 * 
 */
public class FotoEinsendung extends Einsendung
{


    /**
     * Konstruktor f�r Objekte der Klasse FotoEinsendung.
     * 
     * @param autor          der Benutzername des Einsenders.
     * @param dateiname      der Dateiname des Bildes in dieser Einsendung.
     * @param ueberschrift   eine �beschrift f�r das Bild
     */
    public FotoEinsendung(String autor, String dateiname, String ueberschrift)
    {
        benutzername = autor;
        this.dateiname = dateiname;
        this.ueberschrift = ueberschrift;
        zeitstempel = System.currentTimeMillis();
        gefielWieOft = 0;
        kommentare = new ArrayList<String>();
    }

    /**
     * Halte fest, dass das Bild von einem Benutzer mit 'gef�llt' bewertet wurde.
     */


    /**
     * Halte fest, dass ein Benutzer seine 'gef�llt'-Bewertung zur�ckgezogen hat.
     */


    /**
     * F�ge der Einsendung einen Kommentar hinzu.
     * 
     * @param text  der neu hinzuzuf�gende Kommentar.
     */


    /**
     * Liefere den Dateinamen des Bildes aus der Einsendung.
     * 
     * @return den Namen der Bilddatei.
     */
    public String gibBilddateiname()
    {
        return dateiname;
    }

    /**
     * Liefere die �berschrift des Bildes aus der Einsendung.
     * 
     * @return die �berschrift des Bildes.
     */


    /**
     * Liefere die Zeit, zu der die Einsendung erstellt wurde.
     * 
     * @return die Zeit, zu der die Einsendung erstellt wurde (als Systemzeit-Wert).
     */


    /**
     * Zeige die Details der Einsendung an.
     * 
     * (Aktuell werden die Daten auf die Konsole ausgegeben, wodurch momentan die 
     * Anzeige im Webbrowser simuliert werden soll.)
     */
    public void anzeigen()
    {
        super.anzeigen();
        System.out.println(benutzername);
        System.out.println("  [" + dateiname + "]");
        System.out.println("  " + ueberschrift);
        System.out.print(zeitString(zeitstempel));
        
        if(gefielWieOft > 0) {
            System.out.println("  -  " + gefielWieOft + " Person(en) gefaellt dies.");
        }
        else {
            System.out.println();
        }
        
        if(kommentare.isEmpty()) {
            System.out.println("   Keine Kommentare.");
        }
        else {
            System.out.println("   " + kommentare.size() + 
                               " Kommentar(e). Zum Einsehen hier klicken.");
        }
    }
    
    /**
     * Erzeuge einen String, der einen in der Vergangenheit liegenden Zeitpunkt im 
     * Vergleich zur aktuellen Zeit beschreibt, also beispielsweise "vor 30 Sekunden"  
     * oder "vor 7 Minuten". Derzeit werden nur Sekunden und Minuten f�r den String 
     * verwendet.
     * 
     * @param zeit  der umzuwandelnde Zeitwert (in System-Millisekunden)
     * @return      eine relative Zeitbeschreibung f�r den gegebenen Zeitwert
     */
    

}
