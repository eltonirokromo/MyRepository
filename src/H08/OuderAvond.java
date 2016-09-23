package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by HP on 22-9-2016.
 */
public class OuderAvond extends Applet {
    //koppen
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    //getallen
    int J;
    int M;
    int M2;
    int V;
    //Tekstvakken
    TextField Jongens;
    TextField Meisjes;
    TextField Man;
    TextField Vrouw;

    @Override
    public void init() {
        //student jongen
        J=0;
        Jongens = new TextField(""+J, 2);
        b1 = new Button("Jongens");
        b1.addActionListener(new Button1());
        //student meisje
        M=0;
        Meisjes = new TextField(""+J, 2);
        b2 = new Button("Meisjes");
        b2.addActionListener(new Button2());
        //ouder man
        M2=0;
        Man = new TextField(""+J, 2);
        b3 = new Button("Man");
        b3.addActionListener(new Button3());
        //ouder vrouw
        V=0;
        Vrouw = new TextField(""+J, 2);
        b4 = new Button("Vrouw");
        b4.addActionListener(new Button4());

        //layout
        add(b1);
        add(Jongens);
        add(b2);
        add(Meisjes);
        add(b3);
        add(Man);
        add(b4);
        add(Vrouw);

    }
    class Button1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            J=J+1;
            Jongens.setText(""+J);

            repaint();
        }
    }
    class Button2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            M=M+1;
            Meisjes.setText(""+M);

            repaint();
        }
    }
    class Button3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            M2=M2+1;
            Man.setText(""+M2);

            repaint();
        }
    }
    class Button4 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            V=V+1;
            Vrouw.setText(""+V);

            repaint();
        }
    }
}