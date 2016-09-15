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
        setBackground(Color.green);
        g.setColor(Color.blue);
        g.fillRect(50, 130, 200, 50);
        g.setColor(Color.white);
        g.fillRect(50, 80, 200, 50);
        g.setColor(Color.red);
        g.fillRect(50, 30, 200, 50);
        g.setColor(Color.white);
        g.fillRect(40, 30, 10, 300);

    }
}