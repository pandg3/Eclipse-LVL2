package Leauge_Invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	int gifTime = 1;
	int speed = 5;

	void update() {
		super.update();
	}

	void draw(Graphics g) {
		 System.out.println(gifTime);
		if (gifTime < 10.1){
		g.drawImage(GamePanel.rocketImg0, x, y, width, height, null);
		gifTime++;
		}
		else if (gifTime > 10.9 &&gifTime <19.1){
		g.drawImage(GamePanel.rocketImg1, x, y, width, height, null);
		gifTime++;
		
		}
	
	
	else 
		gifTime=0;
	}
	}


