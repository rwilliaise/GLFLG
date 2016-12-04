package main.input;

public class Key {
	private boolean isPressed = false;
	
	public int keyCode;
	
	public void togglePress(boolean press) {
		isPressed = press;
	}
	
	public Key(int keyCode) {
		this.keyCode = keyCode;
	}
}
