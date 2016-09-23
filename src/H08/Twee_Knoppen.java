package H08;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * Created by HP on 22-9-2016.
 */

public class Twee_Knoppen extends Applet {
    TextField tekstvak;
    Button OkButton;
    Button ResetButton;
    String s;

    public void init() {
        tekstvak = new TextField("", 30);
        OkButton = new Button ("Ok");
        ResetButton = new Button ("Reset");

        //ActionListener
        OkButton.addActionListener(new KnopListener());
        ResetButton.addActionListener(new ResetKnopListener());

        //Layout
        add(tekstvak);
        add(OkButton);
        add(ResetButton);

        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
     class ResetKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            s = "";
            repaint();
        }
    }
}
