package H04;

/**
 * Created by HP on 14-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class NLVlag extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(200, 200, 100, 100);
        g.drawRect(270, 225, 15, 15);
        g.drawRect(225, 250, 25, 50);
        g.drawLine(200, 200, 300, 200);
        g.drawLine(250, 125, 300, 200);
        g.drawLine(250, 125, 200, 200);

    }
}