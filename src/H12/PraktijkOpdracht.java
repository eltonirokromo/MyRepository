package H12;

//Praktijopdracht H12

/**
 * Created by HP on 16-11-2016.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {

    private int[] nummer;
    private String[] naam;
    private TextField[] textFields;
    private int teller = 0;
    private boolean klikOk;


    @Override
    public void init() {
        textFields = new TextField[2];
        nummer = new int[10];
        Label label = new Label("Naam & Telefoonnummer");
        naam = new String[10];
        Button knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(label);
        for (int i = 0; i < textFields.length; i++) {
            textFields[i] = new TextField("", 10);
            textFields[i].addActionListener(kl);
            add(textFields[i]);
        }
        add(knop);
        setSize(600, 400);
    }


    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            if (teller < 10) {

                naam[teller] = textFields[0].getText();
                nummer[teller] = Integer.parseInt(textFields[1].getText());

                teller++;
            } else {
                klikOk = true;
                repaint();
            }
            textFields[0].setText("");
            textFields[1].setText("");
        }
    }


    @Override
    public void paint(Graphics g) {
        if (klikOk) {
            int x = 90;
            int y = 50;
            for (int i = 0; i < nummer.length; i++) {
                g.drawString(naam[i] + "   " + nummer[i], x, y);
                y += 25;
            }

        }
    }
}