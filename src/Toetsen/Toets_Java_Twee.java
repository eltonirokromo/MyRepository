package Toetsen;

/**
 * Created by Elton on 16-12-2016.
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Random;
import java.net.URL;

public class Toets_Java_Twee extends Applet {
    Button knop;
    Button koopknop;

    private Image afbeelding[] = new Image [20];
    private Image afbeelding1;
    private Image afbeelding2;
    private Image afbeelding3;
    private URL pad;

    int punten;
    String gewonnen;
    String gewonnen1;

    private boolean geklikt;
    private boolean gewonnentrue;
    private boolean gewonnentrue1;

    public void init() {
        knop = new Button("Speel");
        knop.addActionListener(new KnopListener());
        knop.setEnabled(true);
        add(knop);

        koopknop = new Button("Koop 10 Kredietpunten");
        koopknop.addActionListener(new KnopListener1());
        koopknop.setEnabled(false);
        add(koopknop);

        punten = 10;
    }

    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int random1 = new Random().nextInt(20);
            int random2 = new Random().nextInt(20);
            int random3 = new Random().nextInt(20);

            pad = Toets_Java_Twee.class.getResource("/Images/");
            int teller = 0;
            for (int i = 0; i < 20 ; i++) {
                afbeelding[i] = getImage(pad, "fruit_"+ teller +".jpg");
                teller++;
            }

            afbeelding1 = afbeelding[random1];
            afbeelding2 = afbeelding[random2];
            afbeelding3 = afbeelding[random3];
            geklikt = true;

            punten -= 1;

            if (punten == 0) {
                koopknop.setEnabled(true);
                knop.setEnabled(false);
            }

            int a = random1;
            int b = random2;
            int c = random3;
            if (a == b || a == c || b == c) {
                punten += 4;
                gewonnen = "Gewonnen!! 4 krediet derbij";
                gewonnentrue = true;
            } else {
                gewonnen = "";
            }

            if (a == b && a == c) {
                punten += 10;
                gewonnen1 = "Jackpot!! 10 krediet derbij";
                gewonnentrue1 = true;
            } else {
                gewonnen1 = "";
            }

            repaint();
        }
    }

    private class KnopListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            punten += 10;
            if (punten == 10) {
                knop.setEnabled(true);
                koopknop.setEnabled(false);
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawImage(afbeelding1, 90, 60, 71, 165, this);
        g.drawImage(afbeelding2, 163, 60, 71, 165, this);
        g.drawImage(afbeelding3, 236, 60, 71, 165, this);
        g.drawString("Krediet: " + punten, 90, 255);
        if (gewonnentrue) {
         g.drawString("" + gewonnen, 90, 275);
        }
        if(gewonnentrue1) {
            g.drawString("" + gewonnen1, 90, 275);
        }
    }
}
