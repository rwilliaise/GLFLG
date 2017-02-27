package main.oop;

import java.awt.Color;
import java.awt.Graphics;

public class Text {

	int x;
	int y;
	String text;
	Color color;

	public Text(int x, int y, String text, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.text = text;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void render(Graphics g) {
		g.setColor(color);
		g.drawString(text, x, y);
	}
}
