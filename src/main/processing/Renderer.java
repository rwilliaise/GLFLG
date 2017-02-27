/**
 * @author admin
 **/
package main.processing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

import main.oop.Box;
import main.oop.Polygon;
import main.oop.Quad;
import main.oop.Sprite;
import main.oop.Text;

public class Renderer extends JPanel implements ActionListener {

	/**
	 * @serialField
	 */
	private static final long serialVersionUID = 1L;

	private List<Polygon> polys = new ArrayList<>();
	private List<Quad> quads = new ArrayList<>();
	private List<Box> boxes = new ArrayList<>();
	private List<Text> texts = new ArrayList<>();
	private List<Sprite> sprites = new ArrayList<>();

	public boolean wireframe = false;

	public Font font;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		render(g);
	}

	public Renderer() {
		new Timer(60, this).start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public void addPolygon(Polygon poly) {
		polys.add(poly);
	}

	public void addQuadMesh(Quad quad) {
		quads.add(quad);
	}

	public void renderText(Text text) {
		texts.add(text);
	}

	public void renderBox(int x, int y, int xto, int yto, Color color) {
		boxes.add(new Box(x, y, xto, yto, color));
	}

	public void renderSprite(Sprite sprite) {
		sprites.add(sprite);
	}

	private void render(Graphics g) {
		g.setFont(font);
		for (Polygon poly : polys) {
			poly.update(new Object[] { wireframe, g });
		}
		for (Quad quad : quads) {
			quad.poly1.update(new Object[] { wireframe, g });
			quad.poly2.update(new Object[] { wireframe, g });
			quad.update(new Object[] {});
		}
		for (Box box : boxes) {
			box.render(wireframe, g);
		}
		for (Text string : texts) {
			string.render(g);
		}
		for (Sprite sprite : sprites) {
			sprite.render(g, this);
		}
	}

	public void renderBox(Box box) {
		boxes.add(box);
	}

	public void clear() {
		polys.clear();
		quads.clear();
		boxes.clear();
		texts.clear();
		sprites.clear();
		removeAll();
	}

}
