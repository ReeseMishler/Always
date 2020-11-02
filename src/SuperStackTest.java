import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuperStackTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testIsEmpty() {
		// create an empty stack and check if it is empty
		SuperStack<Integer> stack = new SuperStack<Integer>(1);
		boolean result = stack.isEmpty();
		assertTrue(result);

		stack.push(new Integer(0));
		result = stack.isEmpty();
		assertFalse(result);

		// add a few elements and check to see if it is empty
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
