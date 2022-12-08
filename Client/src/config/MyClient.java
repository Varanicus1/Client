package config;

import java.net.*;

import game.Player;
import gui.Gui;

import java.io.*;

public class MyClient {
	public static void main(String args[]) throws Exception {

		new Gui();
		new Var();
		new Player();
		Socket s = new Socket("localhost", 3333);
//"192.168.2.144"
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		String strx = "", stry = "";
		int varx=0,vary=0;
		while (!strx.equals("stop")) {
			
			strx = Integer.toString(Var.x);
			strx = "x" + strx;
			
			if(varx != Var.x) {
				dout.writeUTF(strx);
				dout.flush();
			}
			varx=Var.x;
			
			stry = Integer.toString(Var.y);
			stry = "y" + stry;
			
			if(vary != Var.y) {
			dout.writeUTF(stry);
			dout.flush();
			}
			vary=Var.y;
		}

		dout.close();
		s.close();
	}
}
