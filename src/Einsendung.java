import java.util.ArrayList;

public class Einsendung {

    private String benutzername;  // Benutzername des Einsenders
    private String ueberschrift;  // einzeilige Bildüberschrift
    private long zeitstempel;
    private int gefielWieOft;
    private ArrayList<String> kommentare;

    public void anzeigen(){

    }

    public String gibBenutzername(){
        return benutzername;
    }

    public void gefaellt()
    {
        gefielWieOft++;
    }

    public void gefaelltNicht()
    {
        if (gefielWieOft > 0) {
            gefielWieOft--;
        }
    }

    public void erfasseKommentar(String text)
    {
        kommentare.add(text);
    }

    public String gibUeberschrift()
    {
        return ueberschrift;
    }

    public long gibZeitstempel()
    {
        return zeitstempel;
    }

    private String zeitString(long zeit)
    {
        long aktuell = System.currentTimeMillis();
        long vergangeneMillis = aktuell - zeit;   // vergangene Zeit in Millisekunden
        long sekunden = vergangeneMillis/1000;
        long minuten = sekunden/60;
        if(minuten > 0) {
            return "vor " + minuten + " Minuten";
        }
        else {
            return "vor " + sekunden + " Sekunden";
        }
    }

}
