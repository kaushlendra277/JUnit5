package root;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

	private Greeting greeting ;
	
	@BeforeAll
	public static void oneTimeSetUp() {
		System.out.println("oneTimeSetUpp#########################");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("setUp***********");
		greeting = new Greeting();
	}
	
	@AfterEach
	void cleanUp() {
		System.out.println("cleanUp************************");
	}
	
	@AfterAll
	static void oneTimeCleanUp() {
		System.out.println("oneTimeCleanUp#########################");
	}
	
	@Test
	void indexTest1() {
		// 1
		assertEquals("index", greeting.index()); 
		// 2 // recommended over 1
		assertEquals("index", greeting.index(), "Values mismathed");
		
		// 3 // recommended over 1 and 2 if failure message is expensive to build
		assertEquals("index", greeting.index(), () -> "Values mismathed EXPENSIVE FAILURE MESSAGE");
	}
	
}
