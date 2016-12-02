package Leauge_Invaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer time = new Timer(1000 / 60, this);
	Font titleFont = new Font("Serif", Font.PLAIN, 48);
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg0;
	public static BufferedImage rocketImg1;
	public static BufferedImage rocketImg2;
	public static BufferedImage bulletImg;

	int score;
	int currentState = 0;
	ObjectManager manager;  
	Rocketship Rckt;  
	public GamePanel() {
		manager = new ObjectManager();
		Rckt=new Rocketship(250, 700, 50, 50);
		manager.addObject(Rckt);
		try {
			//alienImg = ImageIO.read(this.getClass().getResourceAsStream(""));
			rocketImg0 = ImageIO.read(this.getClass().getResourceAsStream("Rocket0.png"));			
			rocketImg1 = ImageIO.read(this.getClass().getResourceAsStream("Rocket1.png"));
			rocketImg2 = ImageIO.read(this.getClass().getResourceAsStream("Rocket2.png"));
			//bulletImg = ImageIO.read(this.getClass().getResourceAsStream(""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	void startGame() {
		time.start();

	}

	void updateMenuState() {

	}

	void updateGameState() {
		score = manager.getScore();
		
		manager.update();
		manager.manageEnemies();
		manager.checkCollision();
		if (!Rckt.isAlive){
			System.out.println("DEAD!");
			currentState = END_STATE;
			manager.reset();
			Rckt = new Rocketship(250, 700, 50, 50);
			manager.addObject(Rckt);
			
		}
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {

		g.setColor(Color.BLUE);
		g.fillRect(0, 0, Leauge_Invaders.gWidth, Leauge_Invaders.gHight);
		g.setFont(titleFont);
		g.setColor(Color.GREEN);
		g.drawString("League Invaders", 100, 300);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Leauge_Invaders.gWidth, Leauge_Invaders.gHight);
		manager.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, Leauge_Invaders.gWidth, Leauge_Invaders.gHight);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {

			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			if (currentState > 1) {

				currentState = 0;
			} else {
				currentState++;
			}

		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

			Rckt.x += Rckt.speed;
			Rckt.update();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

			Rckt.x -= Rckt.speed;
			Rckt.update();
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {

			Rckt.y -= Rckt.speed;
			Rckt.update();
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

			Rckt.y += Rckt.speed;
			Rckt.update();
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addObject(new Projectile(Rckt.x + 24, Rckt.y, 10, 10));
			System.out.println(Rckt.x);
			System.out.println(Rckt.y);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Release");
	}

}
