package Leauge_Invaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
GameObject gObject = new GameObject();
int x = gObject.x;
int y = gObject.y;
int width = gObject.width;
int height = gObject.width;
int speed = 5;
void update() {
	

}
void draw(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);
}

}
