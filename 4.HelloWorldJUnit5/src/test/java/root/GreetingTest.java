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
	void hello1Test() {
		System.out.println(greeting.hello1());
	}
	
	@Test
	void hello2Test() {
		System.out.println(greeting.hello2("KSC"));
	}
	

}
