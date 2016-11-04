package Leauge_Invaders;

import java.awt.Color;
import java.awt.Graphics;

public class aliens extends GameObject {

	public aliens(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	void update() {
		y += 2;
		int xsped = 3
		x += 3;

		if (x > 450) {
			x = -x;

			System.out.println("bounce!");
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
