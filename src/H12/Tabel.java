package H12;

/**
 * Created by HP on 2-11-2016.
 */
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Tabel extends Applet {
    int getal[];
    int gemiddelde;


    public void init() {
        getal = new int [10];
        for (int i = 0; i < getal.length; i ++) {
            getal[i] = 100 * i + 100;
            gemiddelde = gemiddelde + getal[i];

        }
        gemiddelde = gemiddelde / 10;
    }


    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
        }
        g.drawString("het gemiddelde is: " + gemiddelde, 100, 20);
    }
}