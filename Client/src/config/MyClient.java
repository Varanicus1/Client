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
		Socket s = new Socket("192.168.2.112", 3333);
//"192.168.2.144"
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		//Output
		String strclientx = "", strclienty = "";
		int tmpclientx=0,tmpclienty=0;
		
		//Input
		String strenemy = "", strenemyx = "", strenemyy = "";
		char x = 'x';
		
		while (!strclientx.equals("stop")) {
			
			//Input
			strenemy = din.readUTF();
			if (x == strenemy.charAt(0)) {
				
				strenemyx = strenemy.substring(1);
				Var.enemyx=Integer.parseInt(strenemyx);
				
				System.out.println("X: " + strenemyx);
			} else {
				strenemyy = strenemy.substring(1);
				Var.enemyy=Integer.parseInt(strenemyy);
				System.out.println("Y: " + strenemyy);
			}
			
			
			//Output
			strclientx = Integer.toString(Var.clientx);
			strclientx = "x" + strclientx;
			
			if(tmpclientx != Var.clientx) {
				dout.writeUTF(strclientx);
				dout.flush();
			}
			tmpclientx=Var.clientx;
			
			strclienty = Integer.toString(Var.clienty);
			strclienty = "y" + strclienty;
			
			if(tmpclienty != Var.clienty) {
			dout.writeUTF(strclienty);
			dout.flush();
			}
			tmpclienty=Var.clienty;
			
			
		}

		din.close();
		dout.close();
		s.close();
	}
}
