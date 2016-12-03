package main.processing;

public class Vector2 {

	public int x = 0;
	public int y = 0;
	
	public Vector2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector2 mag(Vector2 vector) {
		return new Vector2((int) Math.sqrt(vector.x*vector.x), (int) Math.sqrt(vector.y*vector.y));
	}
	
}
