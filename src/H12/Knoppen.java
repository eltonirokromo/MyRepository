package H12;

//opdracht 12.2

/**
 * Created by HP on 16-11-2016.
 */

import java.applet.*;
import java.awt.*;


public class Knoppen extends Applet {

    private Button[] knop = new Button[25];

    @Override
    public void init() {

        for (int i = 0; i <knop.length ; i++) {
            knop[i] = new Button("Knop");
            add(knop[i]);
        }
    }
}