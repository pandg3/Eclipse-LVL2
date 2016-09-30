package Leauge_Invaders;

import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class Leauge_Invaders{
	static Leauge_Invaders LI = new Leauge_Invaders();
	static final int gWidth = 500;
	static final int gHight = 800;
	JFrame main = new JFrame();
	GamePanel GPan = new GamePanel();
	public static void main(String[] args) {
		LI.setup();
	}
	void setup(){
		main.add(GPan);
		main.addKeyListener(GPan);
		main.setSize(gWidth, gHight);
		main.setVisible(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GPan.startGame();
	}
}
