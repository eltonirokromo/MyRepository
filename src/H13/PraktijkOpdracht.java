package H13;

/**
 * Created by Elton on 11-1-2017.
 */
import java.awt.*;
import java.applet.Applet;

public class PraktijkOpdracht extends Applet {
    Color achtergrondkleur = new Color(0, 153, 51);
    Color bruin = new Color(153, 102, 0);

    public void init() {
        setSize(500, 350);
        setBackground(achtergrondkleur);
    }


    public void paint(Graphics g) {
        tekenBoom(g);
    }

    void tekenBoom(Graphics g) {
        int x = 50;
        int y = 50;
        for (int rij = 0; rij < 2; rij++) {

            for (int i = 0; i < 5; i++) {
                g.setColor(Color.GREEN);
                g.fillOval(x, y, 45, 75);
                x += 55;
                g.setColor(bruin);
                g.fillRect(x - 37, y + 72, 10, 25);
            }

            x = 50;
            y += 100;
        }
    }
}