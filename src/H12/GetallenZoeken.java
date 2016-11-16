package H12;

//opdracht 12.4 & 12.5

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.*;

/**
 * Created by HP on 8-11-2016.
 */
public class GetallenZoeken extends Applet {

    private int[] getallen = {33, 44, 68, 106, 20, 37, 55, 17};

    private TextField textField;
    private String schermTekst;

    @Override
    public void init() {
        textField = new TextField("", 8);
        textField.addActionListener(new KnopListener());
        add(textField);
        Button button = new Button("Kies");
        button.addActionListener(new KnopListener());
        add(button);
        schermTekst = "";
    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 80;
        g.drawString(schermTekst, x, y);
    }

    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(textField.getText());
            boolean isGevonden = false;
            int index = 0;
            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == invoer) {
                    isGevonden = true;
                    index = i;
                }

            }
            if (isGevonden) {
                schermTekst = "Waarde is gevonden. Index is " + index;
            } else {
                schermTekst = "Waarde is niet gevonden";
            }
            repaint();
        }
    }
}