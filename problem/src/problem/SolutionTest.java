package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
	
	@Test
	@DisplayName("Test Constructeur")
	void testconstructeur() {
		Solution c=new Solution();
		assertTrue(c.getdiv3().equals(new Math(3)));
		assertTrue(c.getDiv5().equals( new Math(5)));
	}
	
	@Test
	@DisplayName("Test compute 15")
	void testcompute1(){
		Solution c=new Solution();
		assertEquals(c.compute(15),"Gestform");		
	}
	
	@Test 
	@DisplayName("Test compute 12")
	void testcompute2() {
		Solution c=new Solution();
		assertEquals(c.compute(12),"Geste");
	}
	
	@Test 
	@DisplayName("Test compute 10")
	void testcompute3() {
		Solution c=new Solution();
		assertEquals(c.compute(10),"Forme");
	}
	@Test 
	@DisplayName("Test compute 7")
	void testcompute4() {
		Solution c=new Solution();
		assertEquals(c.compute(7),Integer.toString(7));
	}

}
