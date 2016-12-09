package ROBOT_SPACESHIP_BATTLE;

import javax.swing.JFrame;

public class Robot_Battle{
	static Robot_Battle RO;  
	static final int gWidth = 1000;
	static final int gHight = 1300;
	JFrame main;
	public static void main(String[] args) {
		Robot_Battle RO = new Robot_Battle();
		RO.setup();;
	}
	public Robot_Battle() {
		main = new JFrame();
		setup();
	}
	
	
	void setup(){
		main.setVisible(true);
		main.setSize(gWidth, gHight);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}