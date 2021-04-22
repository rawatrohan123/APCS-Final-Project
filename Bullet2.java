public class Bullet2 {
	float x2;
	float y2;
	float w;
	float h;
	float xSpeed2;
	float diameter;

	public Bullet2(float x2, float y2) {
		this.x2 = x2;
		this.y2 = y2;
		xSpeed2 = 0;
		w = 40;
		h = 40;
		diameter = 5;
	}

	public Bullet2(float diameter, float x2, float y2, float w, float h, float xSpeed2) {
		super();
		this.diameter = diameter;
		this.x2 = x2;
		this.y2 = y2;
		this.w = w;
		this.h = h;
		this.xSpeed2 = xSpeed2;
	}

	public float getX2() {
		return x2;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public void setX2(float x2) {
		this.x2 = x2;
	}

	public float getY2() {
		return y2;
	}

	public void setY2(float y2) {
		this.y2 = y2;
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

	public float getxSpeed2() {
		return xSpeed2;
	}

	public void setxSpeed2(float xSpeed2) {
		this.xSpeed2 = xSpeed2;
	}
}

