package H08;

/**
 * Created by HP on 22-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Inclusief_Btw extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    Button Ok;
    String s;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Prijs inclusief BTW");
        tekstvak.addActionListener( new TekstvakListener() );
        Ok = new Button ("Ok");
        Ok.addActionListener( new KnopListener());

        add(label);
        add(tekstvak);
        add (Ok);

        s = "";
    }

    public void paint(Graphics g) {

        g.drawString("" + getal*121/100, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();

        }
    }
    }
