package main.processing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import main.input.KeyInput;

public class Display extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1051756905947434548L;
	
	private Timer timer;
	
	public KeyInput input;
	
	public List<FLComponent> components = new ArrayList<FLComponent>();
	
	public Color backGroundColor = Color.DARK_GRAY;
	
	public Display(KeyInput input) {
		timer = new Timer(60, this);
		timer.setInitialDelay(0);
		timer.start();
		this.input = input;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(backGroundColor);
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(getForeground());
		try {
			for (FLComponent component : components) {
				renderComponent(component, g);
			}
		} catch(Exception e) {
			if (e.getMessage() != null) {
				g.drawString(e.getMessage(), 100, 100);
				timer.stop();
			}
		}
	}
	
	private void renderComponent(FLComponent component, Graphics g) {
		if (component.isImaged == false) {
			g.setColor(component.colour);
			g.fillRect(component.position.x, component.position.y, component.size.x, component.size.y);
		} else if (component.isImaged == true) {
			g.drawImage(component.image, component.position.x, component.position.x, this);
		}
	}
	
	public void addComponent(FLComponent component) {
		components.add(component);
	}
	
	public Image getImage(String path, Class<?> cl) {
		return new ImageIcon(cl.getResource(path)).getImage();
	}
	
	public URL getFile(String path, Class<?> cl) {
		return cl.getResource(path);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}
