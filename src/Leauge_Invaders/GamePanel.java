package Leauge_Invaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.naming.ldap.ManageReferralControl;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer time = new Timer(1000/60, this);
Font titleFont = new Font("Serif", Font.PLAIN, 48);
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = 0;
ObjectManager manager = new ObjectManager();
public GamePanel() {
	manager.addObject(Rckt);
}
Rocketship Rckt = new Rocketship();
public void paintComponent(Graphics g){
	if(currentState == MENU_STATE){
		drawMenuState(g);
	}else if(currentState == GAME_STATE){
		drawGameState(g);
	}else if(currentState == END_STATE){
		drawEndState(g);
	}


}
void startGame(){
	time.start();	
	
}
void updateMenuState(){
	
}
void updateGameState(){

}
void updateEndState(){
	
}
void drawMenuState(Graphics g){
	
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, Leauge_Invaders.gWidth, Leauge_Invaders.gHight);    
	g.setFont(titleFont);
	g.setColor(Color.GREEN);
	g.drawString("League Invaders", 100, 300);
}
void drawGameState(Graphics g){
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, Leauge_Invaders.gWidth, Leauge_Invaders.gHight);  
	manager.draw(g);
}
void drawEndState(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(0, 0, Leauge_Invaders.gWidth, Leauge_Invaders.gHight);  
}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	repaint();
	if(currentState == MENU_STATE){
		
		updateMenuState();
	}else if(currentState == GAME_STATE){
		updateGameState();
	}else if(currentState == END_STATE){
		updateEndState();
	}
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_ENTER){
			System.out.println("enter");
			if(currentState > 1){
				System.out.println("change");
				currentState = 0;
			}
			else{
				currentState++;
			}
			System.out.println(e.getID());
			System.out.println(e.getKeyCode());
		
		

		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT){
			System.out.println("Right");
			Rckt.x+=Rckt.speed;
			Rckt.update();
		}
		else if (e.getKeyCode()==KeyEvent.VK_LEFT){
			System.out.println("Left");
			Rckt.x-=Rckt.speed;
			Rckt.update();
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP){
			System.out.println("up");
			Rckt.y-=Rckt.speed;
			Rckt.update();
		}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN){
			System.out.println("Down");
			Rckt.y+=Rckt.speed;
			Rckt.update();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Release");
	}
 
}
