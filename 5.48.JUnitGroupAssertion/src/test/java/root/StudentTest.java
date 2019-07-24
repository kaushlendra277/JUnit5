package root;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StudentTest {
	
	@Test
	void test() {
		// Given
		Student student = new StudentBuilder()
				.firstName("Tom")
				.lastName("Hanks")
				.build();
		
		//Then
		assertAll("Test student properties"
					,() -> assertEquals("Tom", student.getFirstName(), () -> "First name mismatched")
					// beauty of JUint 5, even though this will fail it will keep executing 3 Executor
					,() -> assertEquals("empty", student.getId(), () -> "Id mismatched")
					,() -> assertEquals("Hanks", student.getLastName(), () -> "Last name mismatched")
					);
		
	}

}
