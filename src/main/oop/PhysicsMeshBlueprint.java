package main.oop;

public class PhysicsMeshBlueprint extends Blueprint {

	public float gravity = 0;
	
	@Override
	public void update(Object[] args) {
		gravity += 0.0001f;
		((Quad)parent).y += (int) gravity;
	}

}
