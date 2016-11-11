package Leauge_Invaders;

import java.awt.Color;
import java.awt.Graphics;

public class aliens extends GameObject {
	int xspeed = 3;
	public aliens(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	void update() {
		super.update();
		y += 2;
		
		x += xspeed;

		if (x > 450 || x<0) {
			
				xspeed*=-1;
 			

			
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
