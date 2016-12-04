package main.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class KeyInput implements KeyListener {
	
	private FiredKeyEvent eventHandler;
	
	private List<Key> keys = new ArrayList<Key>();
	
	public KeyInput(FiredKeyEvent eventHandler) {
		this.eventHandler = eventHandler;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Unused
	}

	@Override
	public void keyPressed(KeyEvent e) {
		togglePressed(e.getKeyCode(), true);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		togglePressed(e.getKeyCode(), false);
	}
	
	public void togglePressed(int keyCode, boolean isPressed) {
		
	}

}
