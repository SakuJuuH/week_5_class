import static org.junit.jupiter.api.Assertions.assertEquals;

class CalTest {

	Cal cal = new Cal();

	@org.junit.jupiter.api.Test
	void add() {
		assertEquals(2, cal.add(1, 1));
	}

	@org.junit.jupiter.api.Test
	void sub() {
		assertEquals(4, cal.sub(8, 4));
	}

	@org.junit.jupiter.api.Test
	void mult() {
		assertEquals(10, cal.mult(2, 5));
	}

	@org.junit.jupiter.api.Test
	void div() {
		assertEquals(2, cal.div(10, 5));
	}
}