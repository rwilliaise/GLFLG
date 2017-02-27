package main.oop;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import main.processing.Renderer;

public class Quad {
	
	public static List<Blueprint> blueprints = new ArrayList<Blueprint>();
	
	public Polygon poly1;
	public Polygon poly2;
	
	public int x = 0;
	public int y = 0;
	public int scalex = 0;
	public int scale = 0;

	public Color color;
	
	public Quad(int xu, int yu, int scalexu, int scaleyu, Renderer renderer, Color color) {
		this.x = xu;
		this.y = yu;
		this.scalex = scalexu;
		this.scale = scaleyu;
		this.color = color;
		poly1 = new Polygon(new int[][]{{x + scalex, x + scalex, x + (scalex * 2), x + scalex},
			{y + scale, y + (scale * 2), y + scale, y + scale}},4,color);
		poly1.addComponent(new RenderBlueprint());
		
		poly2 = new Polygon(new int[][]{{x + (scalex * 2), x + (scalex * 2), x + scalex, x + (scalex * 2)},
			{y + scale, y + (scale * 2), y + (scale * 2), y + scale}},4,color);
		poly2.addComponent(new RenderBlueprint());
		
		renderer.addQuadMesh(this);
	}
	
	public void update(Object[] args) {
		poly1.verticies = new int[][]{{x + scale, x + scale, x + (scale * 2), x + scale},
			{y + scale, y + (scale * 2), y + scale, y + scale}};
		poly2.verticies = new int[][]{{x + (scale * 2), x + (scale * 2), x + scale, x + (scale * 2)},
			{y + scale, y + (scale * 2), y + (scale * 2), y + scale}};
		for (Blueprint blueprint : blueprints) {
			blueprint.update(args);
		}
	}

	public void addComponent(Blueprint blueprint) {
		blueprint.parent = this;
		blueprints.add(blueprint);
	}
	
	
}
