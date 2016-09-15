package H04;

/**
 * Created by HP on 14-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(100, 200, 300, 200);
        g.drawLine(200, 75, 300, 200);
        g.drawLine(200, 75, 100, 200);
    }
}