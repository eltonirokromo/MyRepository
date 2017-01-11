package H14;

/**
 * Created by Elton on 10-1-2017.
 */

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.net.URL;

public class PraktijkOpdracht extends Applet {
    Button ok;
    Button reset;
    TextField nummer;

    int spel = 23;
    int getal;

    boolean geklikt;
    boolean spelen = true;
    boolean gewonnen;
    boolean verloren;
    boolean winface;
    boolean test = true;

    int hulp1;
    int hulp2;

    private Image afbeelding1;
    private Image afbeelding2;
    private Image smiley;
    private Image pokerface;
    private URL pad;


    @Override
    public void init() {
        ok = new Button("Reset");
        ok.addActionListener(new RestartKnopListener());
        setSize(300, 400);


        reset = new Button("Ok");
        reset.addActionListener(new SpelKnopListener());
        nummer = new TextField("", 5);
        nummer.addActionListener(new SpelKnopListener());
        add(ok);
        add(nummer);
        add(reset);


        pad = PraktijkOpdracht.class.getResource("/Images/");
        afbeelding1 = getImage(pad, "gewonnen.jpg");
        afbeelding2 = getImage(pad, "verloren.jpg");
        smiley = getImage(pad, "smiley.jpg");
        pokerface = getImage(pad, "Pokerface.jpg");


    }


    public class RestartKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            spel = 23;
            verloren = false;
            gewonnen = false;
            spelen = true;
            winface = false;
            test = true;
            repaint();
        }
    }

    public class SpelKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            updateSpel();
        }
    }


    public void updateSpel() {
        int invoer = 0;
        if (test) {
            invoer = Integer.valueOf(nummer.getText());
        }
        nummer.setText("");
        if (invoer > 0 && invoer < 4 && spel > 0 && spel >= invoer) {
            spel -= invoer;
            hulp2 = invoer;
            hulp1 = 69;

            geklikt = true;
            if (spel != 21 && spel > 20) {
                int hulp = spel - 21;
                spel -= hulp;
                winface = true;
            } else if (spel != 17 && spel > 16 && spel < 21) {
                int hulp = spel - 17;
                spel -= hulp;
                winface = true;
            } else if (spel != 13 && spel > 12 && spel < 17) {
                int hulp = spel - 13;
                spel -= hulp;
                winface = true;
            } else if (spel != 9 && spel > 8 && spel < 13) {
                int hulp = spel - 9;
                spel -= hulp;
                winface = true;
            } else if (spel != 5 && spel > 4 && spel < 9) {
                int hulp = spel - 5;
                spel -= hulp;
                winface = true;
            } else if (spel != 1 && spel > 0 && spel < 5) {
                int hulp = spel - 1;
                spel -= hulp;
                winface = true;
            } else {
                int random = new Random().nextInt(3) + 1;
                spel -= random;
                getal = random;
                hulp1 = getal;
                hulp2 = 69;
                repaint();
            }
            //win/lose
            if (spel <= hulp2 && hulp1 == 69) {
                geklikt = false;
                spelen = false;
                gewonnen = false;
                verloren = true;
                test = false;
            }
            if (spel <= hulp1 && hulp2 == 69) {
                geklikt = false;
                spelen = false;
                gewonnen = true;
                verloren = false;
                test = false;
            }
        }

        repaint();
    }


    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        if (spelen) {
            if (geklikt) {
                g.drawString("De computer pakt: " + getal + " smileys", x, y);
                y += 25;
            }
            g.drawString("Aantal Smileys: " + spel, x, y);

        }


        int x2 = 50;
        int y2 = 35;

        for (int i = 0; i < spel; i++) {
            if (i % 4 == 0) {
                x2 = 50;
                y2 += 50;
            }
            if (winface) {
                g.drawImage(smiley, x2, y2, 50, 50, this);
            } else {
                g.drawImage(pokerface, x2, y2, 50, 50, this);
            }
            x2 += 50;
        }


        //hier heb je gewonnen
        if (gewonnen) {
            g.drawString("Je hebt gewonnen!", 50, 50);
            g.drawImage(afbeelding1, 50, 60, 200, 200, this);
        }
        //hier heb je verloren
        if (verloren) {
            g.drawString("Je hebt verloren...!", 50, 50);
            g.drawImage(afbeelding2, 50, 60, 200, 200, this);
        }

    }
}