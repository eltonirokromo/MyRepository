package H10;
//opdracht 10.3 & 10.4

/**
 * Created by HP on 28-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Schrikkeljaar_Maanden extends Applet {
    TextField tekstvak;
    Label label;
    TextField tekstvak1;
    Label label1;

    Button ok;

    int jaartal;
    int Maand;

    String s1, tekst1;
    String s, tekst;

    public void init() {
        //tekstvak_Maand
        tekstvak = new TextField("", 5);
        label = new Label("Maand");
        TekstvakListener tl = new TekstvakListener();
        tekstvak.addActionListener(tl);
        tekst = "";

        //tekstvak_Jaar
        tekstvak1 = new TextField("", 5);
        label1 = new Label("Jaar");
        tekstvak1.addActionListener(tl);
        tekst1 = "";

        //Button
        ok = new Button("Enter");
        tekstvak1.addActionListener(tl);
        ok.addActionListener(tl);

        //layout
        add(label1);
        add(tekstvak1);
        add(label);
        add(tekstvak);
        add(ok);

    }

    public void paint(Graphics g) {
        g.drawString(tekst1, 50, 80);
        g.drawString(tekst, 50, 100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s1 = tekstvak1.getText();
            Maand = Integer.parseInt(s);
            switch (Maand) {
                case 1:
                    tekst = "Januari, 31 dagen";
                    break;
                case 2:
                    tekst = "Februari, 29 dagen";
                    break;
                case 3:
                    tekst = "Maart, 31 dagen";
                    break;
                case 4:
                    tekst = "April, 30 dagen";
                    break;
                case 5:
                    tekst = "Mei, 31 dagen";
                    break;
                case 6:
                    tekst = "Juni, 30 dagen";
                    break;
                case 7:
                    tekst = "Juli, 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus, 31 dagen";
                    break;
                case 9:
                    tekst = "September, 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober, 31 dagen";
                    break;
                case 11:
                    tekst = "November, 30 dagen";
                    break;
                case 12:
                    tekst = "December, 31 dagen";
                    break;
                default:
                    tekst = "Er zijn maar 12 maanden in een jaar..!!!";
                    break;
            }
            repaint();


            jaartal = Integer.parseInt(s1);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst1 = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst1 = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
