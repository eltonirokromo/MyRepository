package H05;

/**
 * Created by HP on 15-9-2016.
 */
import com.sun.xml.internal.ws.developer.ValidationErrorHandler;

import java.awt.*;
import java.applet.*;

public class VariabelenStaafdiagram extends Applet {
    Color achtergrondkleur;
    Color tekstkleur;
    Color Valeriekleur;
    Color Jeroenkleur;
    Color Hanskleur;
    Color lijnkleur;
    int Valerie;
    int Jeroen;
    int Hans;


    public void init() {
        achtergrondkleur = Color.blue;
        setBackground(achtergrondkleur);
        tekstkleur = Color.black;
        Valeriekleur = Color.pink;
        Jeroenkleur = Color.yellow;
        Hanskleur = Color.green;
        lijnkleur = Color.black;

        //Gewichten
        Valerie = 20;
        Jeroen = 50;
        Hans = 60;
    }

    public void paint(Graphics g) {
        //Waardes Valerie
        g.setColor(Color.black);
        g.drawLine(80, 170, 290, 170);
        g.setColor(Valeriekleur);
        g.fillRect(100, 250-Valerie*2, 50, Valerie*2);
        g.setColor(Valeriekleur);
        g.drawString("40kg", 50, 175 );
        g.setColor(Valeriekleur);
        g.drawString("Valerie", 100, 270 );

        //Waardes Jeroen
        g.setColor(Color.black);
        g.drawLine(80, 50, 290, 50);
        g.setColor(Jeroenkleur);
        g.fillRect(170, 250-Jeroen*2, 50, Jeroen*2);
        g.setColor(Jeroenkleur);
        g.drawString("100kg", 45, 55 );
        g.setColor(Jeroenkleur);
        g.drawString("Jeroen", 170, 270 );

        //Waardes Hans
        g.setColor(Color.black);
        g.drawLine(80, 90, 290, 90);
        g.setColor(Hanskleur);
        g.fillRect(240, 250-Hans*2, 50, Hans*2);
        g.setColor(Hanskleur);
        g.drawString("80kg", 50, 95 );
        g.setColor(Hanskleur);
        g.drawString("Hans", 240, 270 );

        //waardes
        g.setColor(tekstkleur);
        g.drawString("60kg", 50, 135 );
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