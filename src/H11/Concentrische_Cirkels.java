package H11;

//opdracht 11.6

/**
 * Created by HP on 28-10-2016.
 */
import java.awt.*;
import java.applet.*;

public class Concentrische_Cirkels extends Applet {

    public void init() {}
    int teller = 1;
    int x = 100;
    int y = 100;
    int x1 = 20;
    int y1 = 20;

    public void paint(Graphics g) {
        for (teller = 0; teller <= 5; teller++)
        {
            x -= 5;
            y -= 5;
            x1 += 10;
            y1 += 10;

            g.drawOval(x, y, x1, y1);

        }
    }
}