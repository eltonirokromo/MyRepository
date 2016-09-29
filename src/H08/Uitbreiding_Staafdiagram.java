package H08;

/**
 * Created by HP on 23-9-2016.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Uitbreiding_Staafdiagram extends Applet {
         //kleuren
        Color achtergrondkleur;
        Color tekstkleur;
        Color Valeriekleur;
        Color Jeroenkleur;
        Color Hanskleur;
        Color lijnkleur;

        //Verandering
        TextField vak1;
        TextField vak2;
        TextField vak3;
        Label v1;
        Label J1;
        Label H1;
        Button Update;

        int getal1;
        int getal2;
        int getal3;
        int V;
        int J;
        int H;



    @Override
        public void init() {
        super.init();
            //Staafdiagram_Layout
            achtergrondkleur = Color.white;
            setBackground(achtergrondkleur);
            tekstkleur = Color.black;
            Valeriekleur = Color.pink;
            Jeroenkleur = Color.yellow;
            Hanskleur = Color.green;
            lijnkleur = Color.black;

        //class
        UpdateKnopListener ukl = new UpdateKnopListener();
        UpdateKnopListener1 ukl1 = new UpdateKnopListener1();
        UpdateKnopListener2 ukl2 = new UpdateKnopListener2();
        UpdateKnopListener3 ukl3 = new UpdateKnopListener3();

        //TextFields
        vak1 = new TextField("", 3);
        vak1.addActionListener(ukl);

        vak2 = new TextField("", 3);
        vak2.addActionListener(ukl1);

        vak3 = new TextField("", 3);
        vak3.addActionListener(ukl2);

        //Label
        v1 = new Label("Valerie");
        J1 = new Label("Jeroen");
        H1 = new Label("Hans");

        //Buttons
        Update = new Button ("update");
        Update.addActionListener(ukl3);


        //layout
        add(v1);
        add(vak1);
        add (J1);
        add(vak2);
        add(H1);
        add(vak3);
        add (Update);

    }

    class UpdateKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(vak1.getText());
            V = getal1 - 40;
            repaint();
        }
    }

    class UpdateKnopListener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal2 = Integer.parseInt(vak2.getText());
            J = getal2 - 100;
            repaint();
        }
    }

    class UpdateKnopListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal3 = Integer.parseInt(vak3.getText());
            H = getal3 - 80;
            repaint();
        }
    }

    class UpdateKnopListener3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(vak1.getText());
            getal2 = Integer.parseInt(vak2.getText());
            getal3 = Integer.parseInt(vak3.getText());
            V = getal1 - 40;
            J = getal2 - 100;
            H = getal3 - 80;
            repaint();
        }
    }
        public void paint(Graphics g) {
            //Waardes Valerie
            g.setColor(Color.black);
            g.drawLine(80, 170, 290, 170);
            g.setColor(Valeriekleur);
            g.fillRect(100, 250-(40+V)*2, 50, (40+V)*2);
            g.setColor(Valeriekleur);
            g.drawString("Valerie", 107, 270 );

            //Waardes Jeroen
            g.setColor(Color.black);
            g.drawLine(80, 50, 290, 50);
            g.setColor(Jeroenkleur);
            g.fillRect(170, 250-(100+J)*2, 50, (100+J)*2);
            g.setColor(Jeroenkleur);
            g.drawString("Jeroen", 175, 270 );

            //Waardes Hans
            g.setColor(Color.black);
            g.drawLine(80, 90, 290, 90);
            g.setColor(Hanskleur);
            g.fillRect(240, 250-(80+H)*2, 50, (80+H)*2);
            g.setColor(Hanskleur);
            g.drawString("Hans", 250, 270 );

            //waardes
            g.setColor(tekstkleur);
            g.drawString("100kg", 45, 55 );
            g.drawString("80kg", 50, 95 );
            g.drawString("60kg", 50, 135 );
            g.drawString("40kg", 50, 175 );
            g.drawString("20kg", 50, 215 );
            g.drawString("00kg", 50, 255 );

            //lijnen
            g.setColor(lijnkleur);
            g.drawLine(80, 50, 290, 50);
            g.drawLine(80, 90, 290, 90);
            g.drawLine(80, 130, 290, 130);
            g.drawLine(80, 170, 290, 170);
            g.drawLine(80, 210, 290, 210);
            g.drawLine(80, 250, 290, 250);
            g.drawLine(90,50, 90, 250);
        }
    }