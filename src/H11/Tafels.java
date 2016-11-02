package H11;

//Praktijkopdracht H11
/**
 * Created by HP on 1-11-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Tafels extends Applet {

    int x = 50;
    private int y = 30;
    private int tafel = 3;
    private TextField tf;
    private Font font = new Font("default", Font.BOLD, 20);
    private Boolean TrueFalse;

    @Override
    public void init() {
        super.init();
        TafelListener tl = new TafelListener();
        tf = new TextField("", 5);
        add(tf);
        tf.addActionListener((tl));

        Label label = new Label("Type een getal in");
        add(label);

        Button ok = new Button("Enter");
        ok.addActionListener((tl));
        add(ok);

        TafelListenerRepeat ntl = new TafelListenerRepeat();
        Button next = new Button("Next");
        next.addActionListener((ntl));
        add(next);
    }


    private class TafelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            tafel = Integer.valueOf(tf.getText());
            tf.setText("");
            TrueFalse = true;
            repaint();

        }
    }
    private class TafelListenerRepeat implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            tafel++;
            repaint();
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (TrueFalse) {
            for (int teller=1; teller <= 10; teller++) {
                y += 20;


                int antwoord = tafel * teller;
                g.setFont(font);
                g.drawString(teller + " x " + tafel + " = " + antwoord, x, y);

            }
            y=30;
        }
    }
}