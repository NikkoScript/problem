package problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class ListeRandomTest {

	@RepeatedTest(100)
	@DisplayName("Test Init répété 100 fois")
	void test() {
		ListeRandom c=new ListeRandom();
		c.init(1000);
		for(Integer i :c.getList() ) {
			assertTrue((i<ListeRandom.getMax())&&(i>-ListeRandom.getMax()));
		}
	}

}
