package Leauge_Invaders;

import java.awt.Graphics;

public class GameObject {
int x;
int y;
int width;
int height;
void update(){
	x++;
	y++;
}
void draw(Graphics g){
	g.fillRect(x, y, 100, 100);
	}
}
