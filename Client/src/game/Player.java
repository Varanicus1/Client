package game;

import config.*;
import java.util.Timer;
import java.util.TimerTask;

//Bewegung des Spielers
public class Player {
	Timer move;

	public Player() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.moveleft == true) {
					if (Var.x >= 1) {
						Var.x = Var.x - 2;
					}
				}
				else if (Var.moveright == true) {
					if (Var.x <= Var.screenwidth - 42) {
						Var.x = Var.x + 2; 
					}
				}
				else if (Var.moveup == true) {
					if (Var.y >=1) {
						Var.y = Var.y - 2; 
					}
				}
				else if (Var.movedown == true) {
					if (Var.y <= Var.screenheight - 66) {
						Var.y = Var.y + 2; 
					}
				}
			}

		}, 0, 6);

	}
}
