package Projet;

import javax.swing.*;
import java.awt.*;

public class GParking extends JPanel {
    public void paintComponent(Graphics g) {
        int carre = 40;
        int i = 0, j = 0;
        for (int y = carre; y <= carre * 22; y += carre) {
            for (int x = carre; x <= carre * 22; x += carre) {
                if(!Parking.getParking(i,j)){
                    g.setColor(Color.black);
                    g.drawRect(x, y, 20, 30);
                }else {
                    g.setColor(Color.red);
                    g.fillRect(x,y, 20,30);
                }
                j++;
            }
            i++;
            j=0;
        }

    }
}
