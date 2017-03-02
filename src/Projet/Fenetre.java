package Projet;

import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
  public Fenetre(){
    this.setTitle("Ma premi�re fen�tre Java");
    this.setSize(500, 500);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
    this.setAlwaysOnTop(false);
    this.setUndecorated(true);
    }
 
  
}