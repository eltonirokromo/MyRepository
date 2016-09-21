package H06;

/**
 * Created by HP on 21-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class PosNegatief extends Applet {
    int a, b;
    int Uitkomst;

    public void init() {
        a = 2147483647;
        b = 13;
        Uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + Uitkomst, 20, 20);
    }
}