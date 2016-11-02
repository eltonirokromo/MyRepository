package H11;
//opdracht 11.1

/**
 * Created by HP on 29-9-2016.
 */
        import java.awt.*;
        import java.applet.*;

public class Tien_Strepen extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller <= 10; teller++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + teller, 305, y );
        }
    }
}