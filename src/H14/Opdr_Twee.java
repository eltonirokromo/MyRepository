package H14;

/**
 * Created by Elton on 14-12-2016.
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Random;

public class Opdr_Twee extends Applet {

    /***** Kaarten *****/
    private String[] soorten = {"klaver", "schoppen", "harten", "ruiten"};
    private String[] nummers = {"aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "koning"};
    private String[] deck = new String[52];

    /***** spelers *****/
    private String[] speler1 = new String[13];
    private String[] speler2 = new String[13];
    private String[] speler3 = new String[13];
    private String[] speler4 = new String[13];

    private Button knop;
    int k;

    boolean geklikt;

    public void init() {
        knop = new Button("Deel kaart");
        knop.addActionListener(new KnopListener());
        add(knop);

        int index = 0;
        //vul deck met kaarten
        for (int i = 0; i < soorten.length; i++) {
            String soort = soorten[i];
            for (int j = 0; j < nummers.length; j++) {
                String nummer = nummers[j];
                deck[index] = soort + " " + nummer;
                index++;
            }
        }
    }

    private String deelkaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] deck1 = new String[deck.length - 1];
        int index = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                deck1[index] = deck[i];
                index++;
            }
        }
        deck = deck1;
        return kaart;
    }


    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setSize(750, 425);
            geklikt = true;
            deck = new String[52];
            int index = 0;

            for (int i = 0; i < soorten.length; i++) {
                String kleur = soorten[i];
                for (int j = 0; j < nummers.length; j++) {
                    String kaart = nummers[j];
                    deck[index] = kleur + " " + kaart;
                    index++;
                }
            }

            for (int i = 0; i < 13; i++) {
                speler1[i] = deelkaart();
                speler2[i] = deelkaart();
                speler3[i] = deelkaart();
                speler4[i] = deelkaart();
            }


            repaint();
        }
    }

    public void paint(Graphics g) {
        knop.setBackground(Color.RED);
        knop.setForeground(Color.WHITE);

        int x1 = 50;
        int x2 = 250;
        int x3 = 450;
        int x4 = 650;
        int y = 70;
        int y1 = 105;

        if (geklikt == true) {
            g.drawString("Speler 1", x1, y);
            g.drawString("Speler 2", x2, y);
            g.drawString("Speler 3", x3, y);
            g.drawString("Speler 4", x4, y);
            for (int i = 0; i < 13; i++) {
                g.drawString(speler1[i], x1, y1);
                g.drawString(speler2[i], x2, y1);
                g.drawString(speler3[i], x3, y1);
                g.drawString(speler4[i], x4, y1);
                y1 += 25;
            }
        }
    }
}
