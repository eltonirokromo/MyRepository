package H10;
//opdracht 10.5

/**
 * Created by HP on 28-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;


public class Gemiddelde_Cijfer extends Applet {
    TextField tekstvak;
    TextField tekstvak1;
    Label label;
    Button ok;

    String s, tekst;
    String s1, tekst1;
    String tekst2;

    int cijferint;
    int cijfer1int;
    double cijferdouble;
    double cijfer1double;
    double gemiddelde;

    public void init() {
        //cijfer1
        tekstvak = new TextField("", 10);
        TekstvakListener tl = new TekstvakListener();
        tekstvak.addActionListener( tl );

        //cijfer2
        tekstvak1 = new TextField("", 10);
        tekstvak1.addActionListener( tl );

        //label
        label = new Label("Type hier je cijfers in");

        //Buttons
        ok = new Button("enter");
        ok.addActionListener( tl );

        //string
        tekst = "";
        tekst1 = "";
        tekst2 = "";

        //Layout
        add(label);
        add(tekstvak);
        add(tekstvak1);
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst1, 50, 80 );
        g.drawString(tekst2, 50, 100 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s1 = tekstvak1.getText();

            cijferint = Integer.parseInt(s);
            cijfer1int = Integer.parseInt(s1);
            cijferdouble = Double.parseDouble(s);
            cijfer1double = Double.parseDouble(s1);
            gemiddelde = Double.parseDouble(s);

            cijferdouble = cijferint;
            cijfer1double = cijfer1int;

            switch(cijferint) {
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

            switch(cijfer1int) {
                case 1:
                    tekst1 = "Slecht, mag je wel beter doen..";
                    break;
                case 2:
                    tekst1 = "Slecht, mag je wel beter doen..";
                    break;
                case 3:
                    tekst1 = "Slecht, mag je wel beter doen..";
                    break;
                case 4:
                    tekst1 = "Onvoldoende, mag je wel beter doen..";
                    break;
                case 5:
                    tekst1 = "Matig, kan het niet beter?";
                    break;
                case 6:
                    tekst1 = "Voldoende, kan er wel mee door..";
                    break;
                case 7:
                    tekst1 = "Voldoende, kan er wel mee door..";
                    break;
                case 8:
                    tekst1 = "Goed, ik ben trots op je!!";
                    break;
                case 9:
                    tekst1 = "Goed, Nog beter dan een 8!!";
                    break;
                case 10:
                    tekst1 = "Goed, er is niks beter dan perfectie!";
                    break;
                default:
                    tekst1 = "Hoger dan een 10? Mag je dromen..";
                    break;
            }
            repaint();

            gemiddelde = (cijferdouble + cijfer1double) / 2;
            if (gemiddelde >= 5.5 && gemiddelde <= 10) {
                tekst2 = ""+ gemiddelde + " Je bent geslaagd!!";
            }
            else {
                tekst2 = ""+ gemiddelde + " Je bent gezakt..";
            }
            repaint();
        }
    }
}