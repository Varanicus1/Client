package config;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{ //Integration mit der Tastatur
    
    //wenn eine taste gedrückt wird
    @Override public void keyTyped(KeyEvent e){ 
    }

    // wenn eine taste gehalten wird
    @Override public void keyPressed(KeyEvent e){ 
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            Var.moveleft = true;
        }  
        else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            Var.moveright = true;
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            Var.moveup = true;
        }
        else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            Var.movedown = true;
        }
}

   //wenn eine taste losgelassen wird
    @Override public void keyReleased(KeyEvent e){ 
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            Var.moveleft = false;
        }
        else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            Var.moveright = false;
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            Var.moveup = false;
        }
        else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            Var.movedown = false;
        }
    }
}
