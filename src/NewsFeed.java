import java.util.ArrayList;

/**
 * Die Klasse NewsFeed speichert neue Einsendungen f�r den Newsfeed einer 
 * Sozialen-Netzwerk-Anwendung (wie Facebook oder Google+).
 * 
 * Derzeit wird das Anzeigen der Einsendungen durch die Ausgabe auf die Konsole simuliert.
 * (Sp�ter soll die Anzeige in einem Webbrowser erfolgen.)
 * 
 * Diese Version speichert keine Daten auf Festplatte. Auch gibt es keine Unterst�tzung f�r
 * das Durchsuchen oder Anordnen der Einsendungen.
 */
public class NewsFeed
{
    private ArrayList<NachrichtenEinsendung> nachrichten;
    private ArrayList<FotoEinsendung> fotos;

    /**
     * Erzeuge einen leeren Newsfeed.
     */
    public NewsFeed()
    {
        nachrichten = new ArrayList<NachrichtenEinsendung>();
        fotos = new ArrayList<FotoEinsendung>();
    }

    /**
     * F�ge dem Newsfeed eine eingesendete Nachricht hinzu.
     * 
     * @param text  der eingesendete Text, der hinzugef�gt werden soll.
     */
    public void erfasseNachricht(NachrichtenEinsendung nachricht)
    {
        nachrichten.add(nachricht);
    }

    /**
     * F�ge dem Newsfeed ein eingesendetes Foto hinzu.
     * 
     * @param foto  das eingesendete Foto, das hinzugef�gt werden soll.
     */
    public void erfasseFoto(FotoEinsendung foto)
    {
        fotos.add(foto);
    }

    /**
     * Gib den Newsfeed aus auf die Kommandozeile. Derzeit werden die Details des Newsfeed auf die
     * Konsole ausgegeben. (Noch zu tun: ersetze diesen Code durch die Anzeige im
     * Webbrowser.)
     */
    public void zeigen()
    {
        // alle Text-Einsendungen anzeigen
        for(NachrichtenEinsendung nachricht : nachrichten) {
            nachricht.anzeigen();
            System.out.println();   // leere Zeile zwischen den Einsendungen
        }

        // alle Fotos anzeigen
        for(FotoEinsendung foto : fotos) {
            foto.anzeigen();
            System.out.println();   // leere Zeile zwischen den Einsendungen
        }
    }
}
