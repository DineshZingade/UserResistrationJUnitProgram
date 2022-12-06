package UserResistrationProgramGradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserResistrationTest {
	UserResistration userRegistration = new UserResistration();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.validFirstName("Dinesh");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.validFirstName("dinesh");
		Assertions.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.validLastName("Zingade");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.validLastName("zingade");
		Assertions.assertFalse(result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.validEmail("dine12@gmail.com");
		Assertions.assertFalse(result);
	}

	@Test
	public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.validMobileNumber("91 9404291279");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.validMobileNumber("9404291279");
		Assertions.assertFalse(result);
	}

	@Test
	public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.validPasswordRule1("Di@ne-sh");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.validPasswordRule1("dinesh");
		Assertions.assertFalse(result);
	}

	@Test
	public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.validPasswordRule2("Di@ne-sh_Zingade");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.validPasswordRule2("zin-gade.din");
		Assertions.assertFalse(result);
	}

	@Test
	public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.validPasswordRule3("Din@esh123");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.validPasswordRule3("Din@e.sh");
		Assertions.assertFalse(result);
	}

	@Test
	public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.validPasswordRule4("Dinesh@12zingade");
		Assertions.assertTrue(result);
	}

	@Test
	public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.validPasswordRule4("Din1esh2zingade");
		Assertions.assertFalse(result);
	}

}
