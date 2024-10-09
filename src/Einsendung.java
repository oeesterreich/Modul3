import java.util.ArrayList;

public class Einsendung {

    private String benutzername;  // Benutzername des Einsenders
    private long zeitstempel;
    private int gefielWieOft;
    private ArrayList<String> kommentare = new ArrayList<>();

    public Einsendung(String benutzername, long zeitstempel) {
        this.benutzername = benutzername;
        this.zeitstempel = zeitstempel;
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

    public void anzeigen(){
        System.out.println("Benutzername: " + benutzername);

        System.out.print("Post gesendet: " + zeitString(zeitstempel));

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
