package H13;

// Opdracht 13.2

/**
 * Created by Elton on 17-11-2016.
 */

import java.applet.*;
import java.awt.*;

public class Driehoek extends Applet {
    int x1, y1, x2, y2, x3;

    @Override
    public void init() {
        x1 = 80;
        y1 = 10;
        x2 = 10;
        y2 = 100;
        x3 = 150;
    }

    @Override
    public void paint(Graphics g) {
        tekenDriehoek(g, x1, y1, x2, y2, x3);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3) {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y2);
        g.drawLine(x3, y2, x1, y1);
    }
}
