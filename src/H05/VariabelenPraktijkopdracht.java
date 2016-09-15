package H05;

/**
 * Created by HP on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class VariabelenPraktijkopdracht extends Applet {
    Color achtergrondkleur;
    Color lijnkleur;
    Color fillkleur;
    Color Tekstkleur;
    int Breedte;
    int Hoogte;

    public void init() {
        achtergrondkleur = Color.white;
        lijnkleur = Color.black;
        fillkleur = Color.magenta;
        Tekstkleur = Color.black;
        Breedte = 200;
        Hoogte = 100;
        setBackground(achtergrondkleur);

    }

    public void paint(Graphics g) {
        //Lijn
        g.setColor(lijnkleur);
        g.drawLine(20, 20, 220, 20);
        g.setColor(Tekstkleur);
        g.drawString("Lijn", 100, 32 );

        //Rechthoek
        g.setColor(lijnkleur);
        g.drawRect(20, 40, Breedte, Hoogte);
        g.setColor(Tekstkleur);
        g.drawString("Rechthoek", 85, 153 );

        //Afgeronde rechthoek
        g.setColor(lijnkleur);
        g.drawRoundRect(20, 160, Breedte, Hoogte, 10, 10);
        g.setColor(Tekstkleur);
        g.drawString("Afgeronde rechthoek", 65, 273 );

        //Gevulde rechthoek met ovaal
        g.setColor(fillkleur);
        g.fillRect(240, 40, Breedte, Breedte);
        g.setColor(lijnkleur);
        g.drawArc(240, 40, Breedte, Hoogte, 90, 360);
        g.setColor(Tekstkleur);
        g.drawString("Gevulde rechthoek met ovaal", 260, 153 );

        //Gevulde ovaal
        g.setColor(fillkleur);
        g.fillArc(240, 160, Breedte, Hoogte, 90, 360);
        g.setColor(Tekstkleur);
        g.drawString("Gevulde ovaal", 295, 273 );

        //Taartpunt met ovaal eromheen
        g.setColor(fillkleur);
        g.fillArc(460, 40, Breedte, Hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawArc(460, 40, Breedte, Hoogte, 90, 360);
        g.setColor(Tekstkleur);
        g.drawString("Taartpunt met ovaal eromheen", 480, 153 );

        //Cirkel
        g.setColor(lijnkleur);
        g.drawArc(505, 160, Breedte-100, Hoogte, 90, 360);
        g.setColor(Tekstkleur);
        g.drawString("Cirkel", 535, 273 );

    }
}