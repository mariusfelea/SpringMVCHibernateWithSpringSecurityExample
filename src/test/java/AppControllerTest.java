import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppControllerTest {

	@Test
	public void sum() {
		int first = 2;
		int second = 2;
		
		int sum = 3;
		
		assertTrue("Error sum not equal with first + second", sum == first + second);
	}
}
