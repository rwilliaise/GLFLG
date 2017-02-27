package main.oop;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Sprite {

	public Image image;

	public int x;
	public int y;

	public Sprite(Image image2, int x, int y) {
		super();
		this.image = image2;
		this.x = x;
		this.y = y;
	}

	public void render(Graphics g, ImageObserver observer) {
		g.drawImage(image, x, y, observer);
	}

}
