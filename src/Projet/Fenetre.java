package Projet;

import javax.swing.JFrame;
import java.awt.*;

public class Fenetre extends JFrame {
  public Fenetre(){
    this.setTitle("Ma premi�re fen�tre Java");
    this.setSize(40*30, 40*30);
    this.setLocationRelativeTo(null);
    GParking content = new GParking();
    this.setContentPane(content);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    }
  public void miseajour(){
    this.repaint();
  }
}