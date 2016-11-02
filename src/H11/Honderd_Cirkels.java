package H11;

//opdracht 11.8

/**
 * Created by HP on 28-10-2016.
 */

import java.awt.*;
import java.applet.*;


public class Honderd_Cirkels extends Applet {

    public void init() {}
    int teller = 1;
    int x = 50;
    int y = 50;
    int x1 = 20;
    int y1 = 20;

    public void paint(Graphics g) {
        for (teller = 0; teller <= 100; teller++)
        {
            x -= 1;
            y -= 1;
            x1 += 10;
            y1 += 10;

            g.drawOval(x, y, x1, y1);

        }
    }
}