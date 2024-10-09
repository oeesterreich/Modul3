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
    private ArrayList<Einsendung> einsendungen;

    public NewsFeed(ArrayList<Einsendung> einsendungen) {

        this.einsendungen = einsendungen;
    }

    /**
     * Erzeuge einen leeren Newsfeed.
     */



    public void Nachrichtenaufnehmen(Einsendung einsendung)
    {
        einsendungen.add(einsendung);
    }

    public void Nachrichtenlöschen(Einsendung einsendung)
    {
        einsendungen.remove(einsendung);
    }



    public void Nachrichtendurchsuchen(Einsendung e)
    {
        if (einsendungen.contains(e))
        {
            System.out.println("Nachrichten vorhanden.");
        } else {
        System.out.println("Nachricht nicht vorhanden.");
    }

    }

    public void Nachrichtenausgeben(int benutzer){
        einsendungen.get(benutzer).anzeigen();
    }

    /**
     * F�ge dem Newsfeed ein eingesendetes Foto hinzu.
     * 
     * @param foto  das eingesendete Foto, das hinzugef�gt werden soll.
     */

    /**
     * Gib den Newsfeed aus auf die Kommandozeile. Derzeit werden die Details des Newsfeed auf die
     * Konsole ausgegeben. (Noch zu tun: ersetze diesen Code durch die Anzeige im
     * Webbrowser.)
     */
    public void zeigen()
    {
        // alle Einsendungen anzeigen
        for(Einsendung einsendung : einsendungen) {
            einsendung.anzeigen();
            System.out.println();   // leere Zeile zwischen den Einsendungen
        }
    }

    @Override
    public String toString() {
        return "NewsFeed{" +
                "einsendungen=" + einsendungen +
                '}';
    }
}
