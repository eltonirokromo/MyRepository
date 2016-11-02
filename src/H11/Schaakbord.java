package H11;

//opdracht 11.9

/**
 * Created by HP on 1-11-2016.
 */
import java.awt.*;
import java.applet.*;

public class Schaakbord extends Applet {

    public void paint(Graphics g) {

        setBackground(Color.GRAY);

        int x;
        int y = 0;
        int breedte = 30;
        int hoogte = 30;

        Color zwart = Color.black;
        Color wit = Color.white;

        for (int loop = 0; loop < 4; loop++) {
            y += 30;
            x = 50;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(zwart);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(wit);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }

            //tweede rij
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(wit);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(zwart);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
        }
    }
}