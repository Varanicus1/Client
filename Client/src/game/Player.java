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
					if (Var.clientx >= 1) {
						Var.clientx = Var.clientx - 1;
					}
				}
				else if (Var.moveright == true) {
					if (Var.clientx <= Var.screenwidth - 42) {
						Var.clientx = Var.clientx + 1; 
					}
				}
				else if (Var.moveup == true) {
					if (Var.clienty >=1) {
						Var.clienty = Var.clienty - 1; 
					}
				}
				else if (Var.movedown == true) {
					if (Var.clienty <= Var.screenheight - 66) {
						Var.clienty = Var.clienty + 1; 
					}
				}
			}

		}, 0, 6);

	}
}
