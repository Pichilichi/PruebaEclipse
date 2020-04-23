package Operations;

import Model.Plane;

public class Helper {

	public static void addWeight(Plane p, float weigthToAdd) {
		p.setWeight(p.getWeight() + weigthToAdd);
		if(p.getWeight() > p.getMaxWeight()) {
			System.out.println("Maximum load reached. Cannot add anymore.");
			p.setWeight(p.getMaxWeight());
		}
	}
	
	public static void newMaxSpeed(Plane p, int sp) {
		p.setMaxSpeed(sp);
	}
}
