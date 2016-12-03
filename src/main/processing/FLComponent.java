package main.processing;

import java.awt.Color;
import java.awt.Image;

public class FLComponent {
	
	boolean isImaged;
	
	public Image image;
	
	public Vector2 size = new Vector2(0, 0);
	public Vector2 position = new Vector2(0, 0);
	
	public Color colour = new Color(0,0,0);
	
	public FLComponent(Vector2 size, Vector2 position, Color colour) {
		this.colour = colour;
		this.size = size;
		this.position = position;
	}
	
	public FLComponent(Vector2 position, Image img) {
		this.position = position;
		this.image = img;
		this.isImaged = true;
	}
	
}
