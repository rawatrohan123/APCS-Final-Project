import java.util.ArrayList;

import javax.swing.JOptionPane;

import processing.core.PApplet;
import processing.core.PImage;
public class Game extends PApplet {
	float x1;
	float y1;
	float diameter;
	float xSpeed1;
	float ySpeed1;
	float w;
	float h;
	float x2;
	float y2;
	float xSpeed2;
	float ySpeed2;
	int points1 = 0;
	int points2 = 0;
	int livesLeft = 3;
	int health1 = 100;
	int health2 = 100;
	int r;
	double timer = 0;
	boolean playerHasWon = false;
	boolean moveLeft1 = false;
	boolean moveRight1 = false;
	boolean moveLeft2 = false;
	boolean moveRight2 = false;
	Player player1;
	Player player2;
	ArrayList<Bullet1> bullets1 = new ArrayList<Bullet1>();
	ArrayList<Bullet2> bullets2 = new ArrayList<Bullet2>();
	
	public void setup() {
		size(600, 600);
		x1 = 100;
		y1 = 510;
		h = 50;
		w = 30;
		x2 = 470;
		y2 = 510;
		xSpeed2 = -2;
		r = 10;
	}
	
	public void draw() {
		timer = timer + 0.5;
		background(255);  
		fill(153);
		rect(x1, y1, w, h);
		fill(204, 102, 0);
		rect(x2, y2, w, h);
		stroke(0);
		line(0, 560, 600, 560);
		line(100, 350, 200, 350);
		line(369, 350, 469, 350);
		line(50, 150, 519, 150);
		if (points1 == 50) {
			playerHasWon = true;
			JOptionPane.showMessageDialog(null, "Player 1 wins!");
			System.exit(0);
		}
		if (points2 == 50) {
			playerHasWon = true;
			JOptionPane.showMessageDialog(null, "Player 2 wins!");
			System.exit(0);
		}
		if (moveRight1 == true) {
			x1 = x1 + 5;
		}
		if (moveRight2 == true) {
			x2 = x2 + 5;
		}
		if (moveLeft1 == true) {

			x1 = x1 - 5;
		}
		if (moveLeft2 == true) {
			x2 = x2 - 5;
		}
		if (y1 <= 0) {
			y1 = 0;
		}
		if (y2 <= 0) {
			y2 = 0;
		}
		if (y1 > 510) {
			y1 = 510;
			ySpeed1 = 0;
		}
		if (y2 > 510) {
			y2 = 510;
			ySpeed2 = 0;
		}
		if (x1 <= 0) {
			x1 = 0;
		}
		if (x2 <= 0) {
			x2 = 0;
		}
		if (x1 >= 569) {
			x1 = 569;
		}
		if (x2 >= 569) {
			x2 = 569;
		}
		if (y2 <= 350 - h && y2 >= 348 - h && x2 >= 369 && x2 <= 469) {
			ySpeed2 = 0;
		
			
		}
		if (y1 <= 350 - h && y1 >= 348 - h && x1 >= 369 && x1 <= 469) {
			ySpeed1 = 0;
		}
		if (y2 <= 350 - h && y2 >= 348 - h && x2 >= 100 && x2 <= 200) {
			ySpeed2 = 0;
		}
		if (y1 <= 350 - h && y1 >= 348 - h && x1 >= 100 && x1 <= 200) {
			ySpeed1 = 0;
		}
		if (y2 <= 150 - h && y2 >= 148 - h && x2 >= 50 && x2 <= 519) {
			ySpeed2 = 0;
			
		}
		if (y1 <= 150 - h && y1 >= 148 - h && x1 >= 50 && x1 <= 519) {
			ySpeed1 = 0;
		}
		fill(50);
		text("Player 1: " + points1 + " points", 10, 20, 70);
		text((timer/10) + " seconds", 10, 30, 70);
		text("Player 2: " + points2 + " points", 500, 20, 70);
		y1 = y1 + ySpeed1;
		ySpeed1 = (float) (ySpeed1 + 0.25);
		y2 = y2 + ySpeed2;
		ySpeed2 = (float) (ySpeed2 + 0.25);
		for (int i = 0; i < bullets1.size(); i++) {
			Bullet1 bullet = bullets1.get(i);
			ellipse(bullet.x1, bullet.y1, bullet.diameter, bullet.diameter);
			bullet.x1 = bullet.x1 + bullet.xSpeed1;
			if (bullet.x1 >= 600 || bullet.x1 <= 0) {
				bullets1.remove(bullet);
			}
			if (x1 > x2){
				 if (bullet.x1 <= x2 + w && (bullet.y1 >= y2 && bullet.y1 <= (y2 + h))) {
					points1++;
					bullets1.remove(bullet);
						 }
				}
				else {
				 if (bullet.x1 >= x2 && (bullet.y1 >= y2 && bullet.y1 <= (y2 + h))) {
						points1++;
						bullets1.remove(bullet);
				 }
				}
				if (bullet.x1 <= 0) {
					bullets1.remove(bullet);
				}
			
		}
		for (int i = 0; i < bullets2.size(); i++) {
			Bullet2 bullet = bullets2.get(i);
			ellipse(bullet.x2, bullet.y2, bullet.diameter, bullet.diameter);

			bullet.x2 = bullet.x2 + bullet.xSpeed2;
			if (x2 > x1){
			 if (bullet.x2 <= x1 + w && (bullet.y2 >= y1 && bullet.y2 <= (y1 + h))) {
				points2++;
				bullets2.remove(bullet);
					 }
			}
			else {
			 if (bullet.x2 >= x1 && (bullet.y2 >= y1 && bullet.y2 <= (y1 + h))) {
					points2++;
					bullets2.remove(bullet);
			 }
			}
			if (bullet.x2 <= 0) {
				bullets2.remove(bullet);
			}
			
		}
	}

	
	public void keyPressed() {
		if (key == 'w') {
			ySpeed1 = -5;
		}
		if (key == 'a') {
			moveLeft1 = true;
		}
		if (key == 'd') {
			moveRight1 = true;
		}
		if (key == CODED) {
			if (keyCode == RIGHT) {
				moveRight2 = true;
			}
			if (keyCode == LEFT) {
				moveLeft2 = true;
			}
			if (keyCode == UP) {
				ySpeed2 = -5;
			}
		}
	}
	
	public void keyReleased() {
		if (key == 'a') {
			moveLeft1 = false;
		}
		if (key == 'd') {
			moveRight1 = false;
		}
		if (key == '1') {
			Bullet2 b = new Bullet2((x2), (y2 + (h / 2)));
			bullets2.add(b);
			b.xSpeed2 = -9;
		}
		if (key == '3') {
			Bullet2 b = new Bullet2((x2 + w), (y2 + (h / 2)));
			bullets2.add(b);
			b.xSpeed2 = 9;
		}
		if (keyCode == RIGHT) {
			moveRight2 = false;
		}
		if (keyCode == LEFT) {
			moveLeft2 = false;
		}
		if (key == 'e') {
			Bullet1 b = new Bullet1((x1 + (w)), (y1 + (h / 2)));
			bullets1.add(b);	
			b.xSpeed1 = 9;
		}
		if (key == 'q') {
			Bullet1 b = new Bullet1((x1), (y1 + (h / 2)));
			bullets1.add(b);	
			b.xSpeed1 = -9;
		}
	}
}
