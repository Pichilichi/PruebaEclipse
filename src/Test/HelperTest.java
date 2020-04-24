package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Plane;
import Operations.Helper;

class HelperTest {

	@Test
	void addWeight() {
		Plane p1 = new Plane("a", "a", "1", "3", 
				"a", "A",2810,5670,1941,354,true);
		Helper.addWeight(p1, 1000);
		assertEquals(3810,p1.getWeight());
		
	}

	@Test
	void stillOperating() {
		Plane p2 = new Plane("b", "b", "3", "1", 
				"B", "b",2810,5670,1943,354,false);
		Helper.stillOperating(p2, "yes");
		assertEquals(true,p2.getOperating());
		
	}


}
