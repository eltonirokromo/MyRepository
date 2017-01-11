package H13;

/**
 * Created by HP on 11-1-2017.
 */
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class Muren extends Applet {

    Button knop1;
    Button knop2;
    boolean geklikt1;
    boolean geklikt2;


    @Override
    public void init() {
        setSize (300,150);
        knop1 = new Button("Bakstenenmuur");
        knop1.addActionListener(new EersteKnop());
        knop2 = new Button("Betonnenmuur");
        knop2.addActionListener(new TweedeKnop());

        add(knop1);
        add(knop2);
    }

    class EersteKnop implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt1 = true;
            geklikt2 = false;
            repaint();
        }
    }

    class TweedeKnop implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt2 = true;
            geklikt1 = false;
            repaint();
        }
    }


    public void paint(Graphics g) {

        TekenMuren(g);
    }

    void TekenMuren(Graphics g) {
        if (geklikt1) {
            setSize(650, 400);
            int y, x, breedte, hoogte;
            x = 50;
            y = 50;
            breedte = 50;
            hoogte = 25;

            int breedte2 = 500;
            int hoogte2 = 250;

            g.setColor(Color.RED);
            g.fillRect(x, y + 25, breedte2, hoogte2);

            for (int i = 0; i < 5; i++) {
                x = 50;
                y += 25;
                for (int kolom = 0; kolom < 10; kolom++) {
                    g.setColor(Color.WHITE);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 50;
                }
                x = 25;
                y += 25;
                for (int kolom = 0; kolom < 11; kolom++) {
                    g.setColor(Color.WHITE);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 50;
                }
            }
        }

        if (geklikt2) {
            setSize(650, 400);

            int x, y, breedte, hoogte;

            x = 50;
            y = 25;
            breedte = 75;
            hoogte = 50;


            g.setColor(Color.GRAY);
            g.fillRect(x, 75, 525, 250);

            for (int i = 0; i < 4; i++) {
                x = 50;
                y += 50;
                for (int kolom = 0; kolom < 7; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 75;
                }
                x = 25;
                y += 50;
                for (int kolom = 0; kolom < 8; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 75;
                }
            }
        }
    }
}


