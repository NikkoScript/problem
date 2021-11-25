package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Test Class Math")
class MathTest {

	@Test
	@DisplayName("Test constructueur base")
	void testconstructeur() {
		Math c=new Math();
		assertTrue(c.getFacteur()==1);		
	}
	
	@Test
	@DisplayName("Test Constructeur init a 7")
	void testconstructeur2() {
		Math c=new Math(7);
		assertTrue(c.getFacteur()==7);
	}
	
	@Test
	@DisplayName("test divisible par 5")
	void testdiviseur() {
		Math c= new Math(5);
		assertTrue(c.diviseur(15));			
		}
	@Test
	@DisplayName("test non divisible par 5")
	void testdiviseur2() {
		Math c = new Math(15);
		assertFalse(c.diviseur(14));
		
	}
	@Test
	@DisplayName("test division 0")
	void testdiviseur3() {
		Math c = new Math(0);
		assertFalse(c.diviseur(16));
	}

	@Test
	@DisplayName("Test == true")
	void testequals() {
		Math a= new Math(1);
		Math b= new Math(1);
		assertTrue(a.equals(b));
	}
	@Test 
	@DisplayName("Test == false")
			void testequals2() {
				Math a= new Math(1);
				Math b= new Math(5);
				assertFalse(a.equals(b));
			}
}
