package H14;

/**
 * Created by Elton on 12-12-2016.
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Random;

public class Opdr_Een extends Applet {

    private String[] soorten = {"klaver", "schoppen", "harten", "ruiten"};
    private String[] nummers = {"aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "koning"};
    private String[] deck = new String[52];
    Button knop;
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


    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random kaart = new Random();
            int r = kaart.nextInt(52);
            k = r;
            geklikt = true;
            repaint();
        }
    }
    public void paint(Graphics g) {
        knop.setBackground(Color.RED);
        knop.setForeground(Color.WHITE);

        if (geklikt == true) {
            g.drawString("" + deck[k], 50, 60);
        }
    }
}
