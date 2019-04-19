package com.WednesdayClass;

public class Nuntendo64 extends GameConsole {
	public static void main(String[] args) {
		Nuntendo64 obj = new Nuntendo64();
		obj.numberOfController = 10;
		obj.controller = "red &blue";
		obj.ifTvNeeded = true;
		obj.cd = false;
		obj.powerSource = "outlet";

		// ------------------------below are attributes-----------------------
		System.out.println(obj.numberOfController + " controle color");
		System.out.println(obj.controller + "number of controlle");
		System.out.println(obj.ifTvNeeded + " if TV is need");
		System.out.println(obj.cd + "if cd is requared");
		System.out.println(obj.powerSource + " is power soaurse is needed");

		// ----------------------------below are
		// behaivoure----------------------------------
		// System.out.println(obj.portable()+" is gane system portable");
		// System.out.println(obj.surfWeb()+" able to surf");
		obj.ableToPlay();
		// obj.surfWeb(); to old to play to do anything
		System.out.println(obj.canPlayMarioGame()+" can play Mario Game");
	}

	boolean canPlayMarioGame() {
		return true;

	}
}
