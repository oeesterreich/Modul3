import java.util.ArrayList;

/**
 * Diese Klasse speichert Informationen über eine Einsendung innerhalb eines sozialen 
 * Netzwerks. Der Hauptteil der Einsendung besteht aus einem Foto und einer Überschrift. 
 * Weitere Daten, wie Autor und Datum, werden ebenfalls gespeichert.
 * 
 */
public class FotoEinsendung extends Einsendung
{

    private String dateiname;
    private String ueberschrift;

    public FotoEinsendung(String benutzername, long zeitstempel, String dateiname, String ueberschrift) {
        super(benutzername, zeitstempel);
        this.dateiname = dateiname;
        this.ueberschrift = ueberschrift;
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

    public String gibUeberschrift()
    {
        return ueberschrift;
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
        System.out.println("Dateiname: " + "[" + dateiname + "]");
        System.out.println("Überschrift: " + ueberschrift);
       super.anzeigen();
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
