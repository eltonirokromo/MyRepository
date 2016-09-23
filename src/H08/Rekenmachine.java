package H08;

/**
 * Created by HP on 22-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Rekenmachine extends Applet {
    TextField tekstvak;
    TextField tekstvak1;
    double getal;
    double getal1;
    double uitkomst;
    Button keer;
    Button delen;
    Button Plus;
    Button min;
    String g1;
    String g2;

    public void init() {
        //Tekstvakken
        tekstvak = new TextField("", 10);
        tekstvak.addActionListener(new TekstvakListener());
        tekstvak1 = new TextField("", 10);
        tekstvak1.addActionListener(new TekstvakListener1());

        //Buttons
        keer = new Button("*");
        keer.addActionListener(new KnopListener());
        delen = new Button("/");
        delen.addActionListener(new KnopListener1());
        min = new Button("-");
        min.addActionListener(new KnopListener3());
        Plus = new Button("+");
        Plus.addActionListener(new KnopListener2());

        //Layout
        add(tekstvak);
        add(tekstvak1);
        add(keer);
        add(delen);
        add(Plus);
        add(min);

        g1 = "";
        g2 = "";
    }

    public void paint(Graphics g) {
        g.drawString("" + uitkomst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String g1 = tekstvak.getText();
            getal = Double.parseDouble(g1);
            repaint();
        }
    }
    class TekstvakListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String g2 = tekstvak.getText();
            getal1 = Double.parseDouble(g2);
            repaint();
        }
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            g1 = tekstvak.getText();
            g2 = tekstvak1.getText();
            uitkomst = getal*getal1;
            getal = Double.parseDouble(g1);
            getal1 = Double.parseDouble(g2);
            repaint();

        }
    }
    class KnopListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            g1 = tekstvak.getText();
            g2 = tekstvak1.getText();
            uitkomst = getal/getal1;
            getal = Double.parseDouble(g1);
            getal1 = Double.parseDouble(g2);
            repaint();

        }
    }    class KnopListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            g1 = tekstvak.getText();
            g2 = tekstvak1.getText();
            uitkomst = getal+getal1;
            getal = Double.parseDouble(g1);
            getal1 = Double.parseDouble(g2);
            repaint();

        }
    }    class KnopListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            g1 = tekstvak.getText();
            g2 = tekstvak1.getText();
            uitkomst = getal-getal1;
            getal = Double.parseDouble(g1);
            getal1 = Double.parseDouble(g2);
            repaint();

        }
    }
}
