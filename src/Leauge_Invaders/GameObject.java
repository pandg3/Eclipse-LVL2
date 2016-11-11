package Leauge_Invaders;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	boolean isAlive = true;
	int x;
	int y;
	int width;
	int height;
	Rectangle collisionBox;
	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		collisionBox = new Rectangle(x, y, width, height);
	}

	void update() {
		collisionBox.setBounds(x,y,width,height  );
	}

	void draw(Graphics g) {

	}
}
