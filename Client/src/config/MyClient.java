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
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		String strclientx = "", strclienty = "";
		int tmpclientx=0,tmpclienty=0;
		while (!strclientx.equals("stop")) {
			
			strclientx = Integer.toString(Var.x);
			strclientx = "x" + strclientx;
			
			if(tmpclientx != Var.x) {
				dout.writeUTF(strclientx);
				dout.flush();
			}
			tmpclientx=Var.x;
			
			strclienty = Integer.toString(Var.y);
			strclienty = "y" + strclienty;
			
			if(tmpclienty != Var.y) {
			dout.writeUTF(strclienty);
			dout.flush();
			}
			tmpclienty=Var.y;
		}

		dout.close();
		s.close();
	}
}
