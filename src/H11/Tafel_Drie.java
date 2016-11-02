package H11;
//opdracht 11.4

/**
 * Created by HP on 29-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tafel_Drie extends Applet {

    public void init() {
    }

    int teller = 1;
    int y = 20;
    int x = 20;
    int A = 1;
    int B = 3;
    int C = 0;

    public void paint(Graphics g) {
        while (teller <= 10)
        {
            C = A * B;
            A++;

            x += 20;
            g.drawString("" + C, x, y);
            teller++;

        }
    }
}