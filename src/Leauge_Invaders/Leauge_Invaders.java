package Leauge_Invaders;

import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class Leauge_Invaders{
	static Leauge_Invaders LI;  
	static final int gWidth = 500;
	static final int gHight = 800;
	JFrame main;
	GamePanel GPan;
	public static void main(String[] args) {
		LI = new Leauge_Invaders();
		LI.setup();
		
	}
	void setup(){
		main = new JFrame();
		GPan = new GamePanel();
		main.add(GPan);
		main.addKeyListener(GPan);
		main.setSize(gWidth, gHight);
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GPan.startGame();
	}
}
