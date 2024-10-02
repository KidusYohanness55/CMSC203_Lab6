package mypack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private static GradeBook grades1;
	private static GradeBook grades2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		grades1 = new GradeBook(5);
		grades2 = new GradeBook(5);
		grades1.addScore(94);
		grades1.addScore(68);
		grades2.addScore(99);
		grades2.addScore(76);
		grades2.addScore(53);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		grades1 = null;
		grades2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(grades1.toString().equals("94.0 68.0"));
		assertTrue(grades2.toString().equals("99.0 76.0 53.0"));
		assertEquals(2, grades1.getScoreSize(), 0.001);
		assertEquals(3, grades2.getScoreSize(), 0.001);
	}

	@Test
	void testSum() {
		assertEquals(162, grades1.sum(), 0.001);
		assertEquals(228, grades2.sum(), 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(68, grades1.minimum(), 0.001);
		assertEquals(53, grades2.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(94, grades1.finalScore(), 0.001);
		assertEquals(175, grades2.finalScore(), 0.001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, grades1.getScoreSize(), 0.001);
		assertEquals(3, grades2.getScoreSize(), 0.001);
	}

	@Test
	void testToString() {
		assertTrue(grades1.toString().equals("94.0 68.0"));
		assertTrue(grades2.toString().equals("99.0 76.0 53.0"));
	}

}
