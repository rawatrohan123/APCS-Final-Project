public class Player {
	float size;
	float x;
	float y;
	float xSpeed;
	float ySpeed;

	public Player(float x, float y) {
		this.x = x;
		this.y = y;
		size = 10;
		xSpeed = 0;
		ySpeed = 0;

	}

	public Player(float size, float x, float y, float xSpeed, float ySpeed) {
		super();
		this.size = size;
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float getsize() {
		return size;
	}

	public void setsize(float size) {
		this.size = size;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getySpeed() {
		return ySpeed;
	}

	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

}