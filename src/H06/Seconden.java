package H06;

/**
 * Created by HP on 21-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class Seconden extends Applet {
    int Seconden, Uur, Dag, Jaar;
    int Uitkomst;
    int Uitkomst1;
    int Uitkomst2;

    public void init() {
        Seconden = 1;
        Uur = 3600;
        Dag = 24;
        Jaar = 365;
        Uitkomst = Seconden * Uur;
        Uitkomst1 = Seconden * Uur * Dag;
        Uitkomst2= Seconden * Uur * Dag * Jaar;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + Uitkomst, 20, 20);
        g.drawString("De uitkomst is: " + Uitkomst1, 20, 40);
        g.drawString("De uitkomst is: " + Uitkomst2, 20, 60);
    }
}