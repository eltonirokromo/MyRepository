package H13;

// Opdracht 13.3

/**
 * Created by Elton on 17-11-2016.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Rode_Bakstenen extends Applet {


        public void init() {
            setSize(650, 400);

        }


        public void paint(Graphics g) {
            tekenBakstenen(g);
        }

        void tekenBakstenen(Graphics g) {
            int y, x, breedte, hoogte;
            x = 50;
            y = 50;
            breedte = 50;
            hoogte = 25;

            int breedte2=500;
            int hoogte2=250;

            g.setColor(Color.RED);
            g.fillRect(x, y+25, breedte2, hoogte2);

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
}