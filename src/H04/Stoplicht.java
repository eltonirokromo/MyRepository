package H04;

/**
 * Created by HP on 14-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.black);
        g.fillRect(50, 40, 120, 230);

        g.setColor(Color.red);
        g.fillOval(85, 55, 50, 50);

        g.setColor(Color.orange);
        g.fillOval(85, 125, 50, 50);

        g.setColor(Color.green);
        g.fillOval(85, 195, 50, 50);


    }
}