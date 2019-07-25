# JUnit5 from Udemy by SpringFramework Guru

4.HelloWorldJUnit5 - This illustrarte Junit test Life cycle. <br />
5.47.JUnitAssertion - <br />
5.48-49.JUnitGroupAssertion - usage of assertAll() - it will be used to assert multiple fields of an pojo in single assert using lambda expression <br />
5.50 - Skipping JUnit Tests <br />
		- use @Disabled with @Test - @Disabled(value = <reason-why-we-disabled it>) <br />
		- do not use @Test over a method <br />
		- make test method private <br />
5.51 - Giving JUnit Test case name <br />
	 - use @DisplayName(value = <more-readable-test-name>) <br />
		- <more-readable-test-name> will be dipalyed in place of test method name in JUnit window view <br />
		- How can we display these names during maven test life cycle phase ? <br />
		
5.52 - Testing expected exception <br />
	 - use assertThrows <br />
