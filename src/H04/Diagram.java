package H04; /**
 * Created by HP on 14-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Diagram extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.black);
        g.drawLine(80, 110, 100, 110);
        g.drawLine(80, 50, 170, 50);
        g.drawLine(80, 70, 240, 70);

        g.setColor(Color.pink);
        g.fillRect(100, 110, 50, 140);

        g.setColor(Color.yellow);
        g.fillRect(170, 50, 50, 200);

        g.setColor(Color.green);
        g.fillRect(240, 70, 50, 180);

        g.setColor(Color.pink);
        g.drawString("40kg", 50, 115 );

        g.setColor(Color.green);
        g.drawString("100kg", 45, 55 );

        g.setColor(Color.yellow);
        g.drawString("80kg", 50, 75 );

        g.setColor(Color.pink);
        g.drawString("Valerie", 100, 270 );

        g.setColor(Color.yellow);
        g.drawString("Jeroen", 170, 270 );

        g.setColor(Color.green);
        g.drawString("Hans", 240, 270 );



    }
}