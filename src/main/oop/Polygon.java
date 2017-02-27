package main.oop;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Polygon {

	public int[][] verticies;
	
	public int verticeCount;
	
	public Color color = Color.RED;
	
	public static List<Blueprint> blueprints = new ArrayList<Blueprint>();
	
	public Polygon(int[][] vertices, int verticeCount, Color color) {
		this.verticies = vertices;
		this.verticeCount = verticeCount;
		this.color = color;
	}
	
	public void update(Object[] args) {
		for (Blueprint blueprint : blueprints) {
			blueprint.update(args);
		}
	}

	public void addComponent(Blueprint blueprint) {
		blueprint.parent = this;
		blueprints.add(blueprint);
	}
	
	public void render(boolean wireframe, Graphics g) {
		g.setColor(color);
		if (wireframe) {
			g.drawPolygon(verticies[0], verticies[1], verticeCount);
		} else {
			g.fillPolygon(verticies[0], verticies[1], verticeCount);
		}
	}
	
}
