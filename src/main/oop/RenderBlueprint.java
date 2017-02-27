package main.oop;

import java.awt.Graphics;

public class RenderBlueprint extends Blueprint {
	@Override
	public void update(Object[] args) {
		if (!(args.length <= 0)) {
			((Polygon) parent).render((boolean) args[0], (Graphics) args[1]);
		}
	}

}
