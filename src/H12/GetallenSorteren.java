package H12;

//opdracht 12.3

/**
 * Created by HP on 3-11-2016.
 */
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GetallenSorteren extends Applet {
    TextField[] tekstvelden;
    int[] getallen;
    Button knop;

    public void init() {
        tekstvelden = new TextField[5];
        getallen = new int[5];

        for (int i = 0; i < tekstvelden.length; i++) {
            TextField tf = new TextField ("", 5);
            tekstvelden[i] = tf;
            add(tekstvelden[i]);
        }

        knop = new Button("ok");
        add(knop);
        knop.addActionListener(new Knoplistener());

    }

    class Knoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvelden.length; i++) {
                getallen[i] = Integer.parseInt(tekstvelden[i].getText());

            }

            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                tekstvelden[i].setText(String.valueOf(getallen[i]));
            }
        }
    }
}
