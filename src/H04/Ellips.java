package H04;

/**
 * Created by HP on 14-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Ellips extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(50, 50, 400, 200, 90, 360);


    }
}