package H06;

/**
 * Created by HP on 21-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class Verdeling extends Applet {
    int Verdiend, Personen, uitkomst;

    public void init() {
        Verdiend = 113;
        Personen = 4;
        uitkomst = Verdiend / Personen;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}