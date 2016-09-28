package H10;

/**
 * Created by HP on 28-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    Button ok;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        TekstvakListener tl = new TekstvakListener();
        tekstvak.addActionListener( tl );

        label = new Label("Type hier je cijfer in");
        tekst = "";

        ok = new Button("enter");
        ok.addActionListener( tl );

        add(label);
        add(tekstvak);
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s);
            switch(cijfer) {
                case 1:
                    tekst = "Slecht, mag je wel beter doen..";
                    break;
                case 2:
                    tekst = "Slecht, mag je wel beter doen..";
                    break;
                case 3:
                    tekst = "Slecht, mag je wel beter doen..";
                    break;
                case 4:
                    tekst = "Onvoldoende, mag je wel beter doen..";
                    break;
                case 5:
                    tekst = "Matig, kan het niet beter?";
                    break;
                case 6:
                    tekst = "Voldoende, kan er wel mee door..";
                    break;
                case 7:
                    tekst = "Voldoende, kan er wel mee door..";
                    break;
                case 8:
                    tekst = "Goed, ik ben trots op je!!";
                    break;
                case 9:
                    tekst = "Goed, Nog beter dan een 8!!";
                    break;
                case 10:
                    tekst = "Goed, er is niks beter dan perfectie!";
                    break;
                default:
                    tekst = "Hoger dan een 10? Mag je dromen..";
                    break;
            }
            repaint();
        }
    }
}