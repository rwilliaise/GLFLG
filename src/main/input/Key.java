package main.input;

public class Key {
	private boolean isPressed = false;
	
	public void togglePress(boolean press) {
		isPressed = press;
	}
	
	public Key(FiredKeyEvent event) {
		
	}
}
