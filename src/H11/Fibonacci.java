package H11;
//opdracht 11.3

/**
 * Created by HP on 29-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Fibonacci extends Applet {

    public void init() {
    }

    int teller = 1;
    int y = 20;
    int x = 20;
    int A = 1;
    int B = 0;
    int C = 0;

    public void paint(Graphics g) {
        while (teller <= 10)
        {
            C = A + B;
            A = B;
            B = C;

            x += 20;
            g.drawString("" + C, x, y);
            teller++;

        }
    }
}