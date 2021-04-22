import java.awt.Graphics;

public class Bullet1 {
	float x1;
	float y1;
	float w;
	float h;
	float xSpeed1;
	float diameter;

	public Bullet1(float x1, float y1) {
		this.x1 = x1;
		this.y1 = y1;
		xSpeed1 = 0;
		diameter = 5;
		w = 40;
		h = 40;
	}
	
	public Bullet1(float diameter, float x1, float y1, float w, float h, float xSpeed1) {
		super();
		this.diameter = diameter;
		this.x1 = x1;
		this.y1 = y1;
		this.w = w;
		this.h = h;
		this.xSpeed1 = xSpeed1;
	} 

              

   

	
	public float getDiameter() {
		return diameter;
	}
	
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public float getX1() {
		return x1;
	}

	public void setX1(float x1) {
		this.x1 = x1;
	}

	public float getY1() {
		return y1;
	}

	public void setY1(float y1) {
		this.y1 = y1;
	}

	public float getW() {
		return w;
	}

	public void setW(float w) {
		this.w = w;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float getxSpeed1() {
		return xSpeed1;
	}

	public void setxSpeed1(float xSpeed1) {
		this.xSpeed1 = xSpeed1;
	}
}
