package H05;

/**
 * Created by HP on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class VariabelenStaafdiagram extends Applet {
    Color achtergrondkleur;
    Color tekstkleur;
    Color Valerie;
    Color Jeroen;
    Color Hans;
    Color lijnkleur;
    int Breedte;
    int Hoogte;

    public void init() {
        achtergrondkleur = Color.blue;
        setBackground(achtergrondkleur);
        tekstkleur = Color.black;
        Valerie = Color.pink;
        Jeroen = Color.yellow;
        Hans = Color.green;
        Breedte = 50;
        Hoogte = 100;
        lijnkleur = Color.black;
    }

    public void paint(Graphics g) {
        //Waardes Valerie
        g.setColor(Color.black);
        g.drawLine(80, 170, 290, 170);
        g.setColor(Valerie);
        g.fillRect(100, 170, Breedte, Hoogte-20);
        g.setColor(Valerie);
        g.drawString("40kg", 50, 175 );
        g.setColor(Valerie);
        g.drawString("Valerie", 100, 270 );

        //Waardes Jeroen
        g.setColor(Color.black);
        g.drawLine(80, 50, 290, 50);
        g.setColor(Jeroen);
        g.fillRect(170, 50, Breedte, Hoogte+100);
        g.setColor(Jeroen);
        g.drawString("100kg", 45, 55 );
        g.setColor(Jeroen);
        g.drawString("Jeroen", 170, 270 );

        //Waardes Hans
        g.setColor(Color.black);
        g.drawLine(80, 90, 290, 90);
        g.setColor(Hans);
        g.fillRect(240, 90, Breedte, Hoogte+60);
        g.setColor(Hans);
        g.drawString("80kg", 50, 95 );
        g.setColor(Hans);
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