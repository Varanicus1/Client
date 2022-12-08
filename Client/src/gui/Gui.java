package gui;
import javax.swing.*;
import config.*;


public class Gui { 
    
    public Gui(){

       //erstellt ein fenster 
        Var.jf1 = new JFrame();
        Var.jf1.setSize(Var.screenwidth, Var.screenheight); //Größe
        Var.jf1.setTitle("Pong"); //Titel des Fensters
        Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //wenn man über x schließt wird das programm auch im hintergrund beendet 
        Var.jf1.setLayout(null); //setzt das fenster auf container
        Var.jf1.setResizable(false); //man kann das fenster nicht größer machen mit der maus
        Var.jf1.setVisible(true); // zeigt das Fenster an
        Var.jf1.setLocationRelativeTo(null);  // zentriert das fenster
        Var.jf1.addKeyListener(new KeyHandler());  // verbindet das Gui mit dem Keyhandler
        Var.jf1.requestFocus();  

        //erstellt eine Zeichenfläche in dem fenster (Aufruf von Draw.java)
        Draw lblDraw = new Draw();   
        lblDraw.setBounds(0, 0, Var.screenwidth, Var.screenheight);
        lblDraw.setVisible(true);
        Var.jf1.add(lblDraw);
    }
}
