package Toetsen;

/**
 * Created by Elton on 12-10-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Toets_Java_Een extends Applet {
    private TextField tekstvak;
    private Label label;

    private String s;

    private Button ok;

    private int Invoer, xposition, yposition, TijdinIstanbul, TijdinNewYork, TijdinLasvegas, TijdinLondon;

    public void init() {
        tekstvak = new TextField("", 20);
        TekstvakListener tl = new TekstvakListener();
        tekstvak.addActionListener(tl);

        label = new Label("Voer een uur in");

        ok = new Button("Toon tijden");
        ok.addActionListener(tl);

        add(label);
        add(tekstvak);
        add(ok);

        xposition = 50;
        yposition = 60;
    }

    public void paint(Graphics g) {
        //string Tijdsverschillen
            if (Invoer >= 0 && Invoer < 24) {
                g.drawString("Tijd in Istanbul: " + TijdinIstanbul + ":00", xposition, yposition);
                g.drawString("Tijd in London: " + TijdinLondon + ":00", xposition, yposition + 20);
                g.drawString("Tijd in Las Vegas: " + TijdinLasvegas + ":00", xposition, yposition + 40);
                g.drawString("Tijd in New York: " + TijdinNewYork + ":00", xposition, yposition + 60);
            }
            else {
                g.drawString("Ongeldig getal", xposition, yposition);
            }
        }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();

            //integer.parseInt tijden
            Invoer = Integer.parseInt(s);
            TijdinIstanbul = Integer.parseInt(s);
            TijdinIstanbul = Invoer + 1;

            TijdinLondon = Integer.parseInt(s);
            TijdinLondon = Invoer - 1;

            TijdinLasvegas = Integer.parseInt(s);
            TijdinLasvegas = Invoer - 9;

            TijdinNewYork = Integer.parseInt(s);
            TijdinNewYork = Invoer - 6;

            //Wanneer het getal hoger dan 23 of kleiner dan 0 is word het getal - 24 of + 24 gedaan.
            if (TijdinIstanbul > 23) {
                TijdinIstanbul = TijdinIstanbul - 24;
            }
            if (TijdinLondon < 0) {
                TijdinLondon = TijdinLondon + 24;
            }
            if (TijdinLasvegas < 0) {
                TijdinLasvegas = TijdinLasvegas + 24;
            }
            if (TijdinNewYork < 0){
                TijdinNewYork = TijdinNewYork + 24;
            }


            repaint();

        }
    }
}
