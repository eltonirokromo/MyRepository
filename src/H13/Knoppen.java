package H13;

// Opdracht 13.1

/**
 * Created by Elton on 17-11-2016.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Knoppen extends Applet{

    Button[] knop = new Button [5];
    String s;

    @Override
    public void init() {

        knop [0] = new Button("Groen");
        add(knop [0]);
        knop[0].addActionListener( new KnopListener());
        knop [1] = new Button("Rood");
        add(knop [1]);
        knop[1].addActionListener( new KnopListener1());
        knop [2] = new Button("Wit");
        add(knop [2]);
        knop[2].addActionListener( new KnopListener2());
        knop [3] = new Button("Geel");
        add(knop [3]);
        knop[3].addActionListener( new KnopListener3());
        knop [4] = new Button("Blauw");
        add(knop [4]);
        knop[4].addActionListener( new KnopListener4());

    }


    @Override
    public void paint(Graphics g) {
        knop[0].setBackground(Color.GREEN);
        knop[1].setBackground(Color.RED);
        knop[2].setBackground(Color.WHITE);
        knop[3].setBackground(Color.YELLOW);
        knop[4].setBackground(Color.BLUE);
        int x = 50, y = 50;
        g.drawString(s,x,y);
    }


    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = "Groen";
            repaint();
        }
    }
    private class KnopListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = "Rood";
            repaint();
        }
    }
    private class KnopListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = "Wit";
            repaint();
        }
    }
    private class KnopListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = "Geel";
            repaint();
        }
    }
    private class KnopListener4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = "Blauw";
            repaint();
        }
    }
}
