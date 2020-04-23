package Controller;

import java.util.ArrayList;

import Model.Plane;
import Operations.Helper;

public class main {

	public static void main(String[] args) {
		ArrayList<Plane> plane_list = new ArrayList<Plane>();
		
		Plane p1 = new Plane("Germany", "Junkers", "11,1m", "3,9m", 
				"Junkers Ju 87D", "Stuka",2810,5670,1941,354);
		
		System.out.println(p1.toString());
		Helper.newMaxSpeed(p1, 344);
		System.out.println(p1.toString());
		Helper.addWeight(p1, 3000);
		System.out.println(p1.toString());

		Plane p2 = new Plane("Russia", "Yakovlev", "8,48m", "2,64m", 
				"Yakovlev Yak-1", "Yak-1",2316,2884,1940,592);
		Plane p3 = new Plane("United States of America", "North American Aviation", "9,83m", "11,28m", 
				"North-American P-51 Mustang", "P-51",3465,4175,1942,580);
		
		plane_list.add(p1);plane_list.add(p2);plane_list.add(p3);
		
		System.out.println("-----------------------------");
		
		
		for (Plane plane : plane_list) {
			System.out.println(plane.toString());
		}
	}

}
