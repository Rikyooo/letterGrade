package letterGrade.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeTestA {

	Grade grade;
	
	@BeforeEach
	void setUp() throws Exception {
		grade = new Grade();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testA() {
		assertEquals(grade.letterGrade(99),'A');
	}
	@Test
	void testB() {
		assertEquals(grade.letterGrade(87),'B');
	}
	@Test
	void testC() {
		assertEquals(grade.letterGrade(75),'C');
	}
	@Test
	void testD() {
		assertEquals(grade.letterGrade(62),'D');
	}
	@Test
	void testF() {
		assertEquals(grade.letterGrade(50),'F');
	}
	@Test
	void testX() {
		assertEquals(grade.letterGrade(109),'X');
	}
	@Test
	void testX1() {
		assertEquals(grade.letterGrade(-3),'X');
	}

}
