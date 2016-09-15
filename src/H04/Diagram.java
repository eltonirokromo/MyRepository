package H04; /**
 * Created by HP on 14-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Diagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //Waardes Valerie
        g.setColor(Color.black);
        g.drawLine(80, 170, 290, 170);
        g.setColor(Color.pink);
        g.fillRect(100, 110, 50, 140);
        g.setColor(Color.pink);
        g.drawString("40kg", 50, 175 );
        g.setColor(Color.pink);
        g.drawString("Valerie", 100, 270 );

        //Waardes Jeroen
        g.setColor(Color.black);
        g.drawLine(80, 50, 290, 50);
        g.setColor(Color.yellow);
        g.fillRect(170, 50, 50, 200);
        g.setColor(Color.yellow);
        g.drawString("100kg", 45, 55 );
        g.setColor(Color.yellow);
        g.drawString("Jeroen", 170, 270 );

        //Waardes Hans
        g.setColor(Color.black);
        g.drawLine(80, 90, 290, 90);
        g.setColor(Color.green);
        g.fillRect(240, 70, 50, 180);
        g.setColor(Color.green);
        g.drawString("80kg", 50, 95 );
        g.setColor(Color.green);
        g.drawString("Hans", 240, 270 );

        //waardes
        g.setColor(Color.black);
        g.drawString("60kg", 50, 135 );
        g.drawString("20kg", 50, 215 );
        g.drawString("00kg", 50, 255 );

        //lijnen
        g.setColor(Color.black);
        g.drawLine(80, 50, 290, 50);
        g.drawLine(80, 90, 290, 90);
        g.drawLine(80, 130, 290, 130);
        g.drawLine(80, 170, 290, 170);
        g.drawLine(80, 210, 290, 210);
        g.drawLine(80, 250, 290, 250);
        g.drawLine(90,50, 90, 250);
    }
}