package H04;

/**
 * Created by HP on 14-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20, 20, 220, 20);
        g.drawRect(20, 40, 200, 100);
        g.drawRoundRect(20, 160, 200, 100, 10, 10);

        g.setColor(Color.magenta);
        g.fillRect(240, 40, 200, 100);
        g.fillArc(240, 160, 200, 100, 90, 360);
        g.fillArc(460, 40, 200, 100, 0, 45);

        g.setColor(Color.black);
        g.drawArc(240, 40, 200, 100, 90, 360);
        g.drawArc(460, 40, 200, 100, 90, 360);
        g.drawArc(505, 160, 100, 100, 90, 360);

        g.setColor(Color.black);
        g.drawString("Lijn", 100, 32 );
        g.drawString("Rechthoek", 85, 153 );
        g.drawString("Afgeronde rechthoek", 65, 273 );
        g.drawString("Gevulde rechthoek met ovaal", 260, 153 );
        g.drawString("Gevulde ovaal", 295, 273 );
        g.drawString("Taartpunt met ovaal eromheen", 480, 153 );
        g.drawString("Cirkel", 535, 273 );


    }
}