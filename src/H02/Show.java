package H02;

/**
 * Created by HP on 14-9-2016.
 */
import java.awt.*;
import java.applet.*;

    public class Show extends Applet {

        public void init() {
            setBackground(Color.white);
        }

        public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.drawString("Elton", 50, 60 );
            g.setColor(Color.blue);
            g.drawString("Elton", 80, 60 );
            g.setColor(Color.red);
            g.drawString("Irokromo", 80, 70 );

        }
    }
