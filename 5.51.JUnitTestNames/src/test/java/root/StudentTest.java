package root;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentTest {
		
		@Test
		@DisplayName(value = "Group assertion test example")
		void test() {
			// Given
			Student student = new StudentBuilder()
					.firstName("Tom")
					.lastName("Hanks")
					.build();
			
			//Then
			assertAll("Test student properties"
						,() -> assertEquals("Tom", student.getFirstName(), () -> "First name mismatched")
						,() -> assertEquals("Hanks", student.getLastName(), () -> "Last name mismatched")
						);
			
		}
		
		@Test
		@DisplayName(value = "Dependent group assertion test example")
		void nestedAssertAlltest() {
			// Given
			Student student = new StudentBuilder()
					.firstName("Tom")
					.lastName("Hanks")
					.build();
			
			//Then
			assertAll("1st level assertAll",
					() -> assertAll("second student level assertAll1"
								,() -> assertEquals("Tom", student.getFirstName(), () -> "First name mismatched")
								,() -> assertEquals("Hanks", student.getLastName(), () -> "Last name mismatched")
							),
					() -> assertAll("second student level assertAll2"
							,() -> assertEquals("Tom", student.getFirstName(), () -> "First name mismatched")
							,() -> assertEquals("Hanks", student.getLastName(), () -> "Last name mismatched")
						)
					);
			
		}

}
