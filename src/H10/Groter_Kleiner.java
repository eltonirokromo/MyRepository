package H10;
//opdracht 10.1 en 10.2

/**
 * Created by HP on 28-9-2016.
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Groter_Kleiner extends Applet {
    TextField tekstvak;
    TextField tekstvak1;
    Label label;
    Button ok;

    int getal1;
    int getal2;

    String tekst;
    String tekst1;

    public void init() {
        //Tekstvak
        tekstvak = new TextField("", 5);
        VakListener vl = new VakListener();
        tekstvak.addActionListener(vl);
        tekst = "";

        tekstvak1 = new TextField("", 5);
        VakListener vl1 = new VakListener();
        tekstvak1.addActionListener(vl1);
        tekst1 = "";

        //Button
        ok = new Button("Enter");
        VakListener vl2 = new VakListener();
        ok.addActionListener(vl2);

        //Label
        label = new Label("type een getal in" );

        //Layout
        add( label );
        add( tekstvak );
        add( tekstvak1 );
        add( ok );
    }

    public void paint(Graphics g) {
        g.drawString("" + getal1 + " is groter dan " + getal2 + ": " + (getal1 > getal2), 50, 60 );
        g.drawString("" + getal1 + " is kleiner dan " + getal2 + ": " + (getal1 < getal2), 50, 80 );
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekst = tekstvak.getText();
            tekst1 = tekstvak1.getText();

            getal1 = Integer.parseInt( tekst );
            getal2 = Integer.parseInt( tekst1 );

            tekstvak.setText("");
            tekstvak1.setText("");
            repaint();
        }

    }
}
