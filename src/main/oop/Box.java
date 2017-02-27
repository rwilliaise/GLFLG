package main.oop;

import java.awt.Color;
import java.awt.Graphics;

public class Box {

	int x;
	int y;
	int xto;
	int yto;
	Color color;
	
	public Box(int x, int y, int xto, int yto, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.xto = xto;
		this.yto = yto;
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
	public int getXto() {
		return xto;
	}
	public void setXto(int xto) {
		this.xto = xto;
	}
	public int getYto() {
		return yto;
	}
	public void setYto(int yto) {
		this.yto = yto;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void render(boolean wireframe, Graphics g) {
		g.setColor(color);
		if (wireframe) {
			g.drawRect(x, y, xto-x, yto-y);
		} else {
			g.fillRect(x, y, xto-x, yto-y);
		}
	}
}
