package UserResistrationProgramGradle;

import java.util.Scanner;

public class UserResistrationMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter the options:\n1. Validate First Name\n2. Validate Last Name\n3. Validate Email ID\n4. Validate Mobile Number\n5. Validate Password Rule1\n6. Validate Password Rule2\n7. Validate Password Rule3\n8. Validate Password Rule4");
		switch (scanner.nextInt()) {
		case 1:
			UserResistration.validFirstName("Dinesh");
			break;
		case 2:
			UserResistration.validLastName("Zingade");
			break;
		case 3:
			UserResistration.validEmail("abc.xyz@bl.co.in");
			break;
		case 4:
			UserResistration.validMobileNumber("91 9404291279");
			break;
		case 5:
			UserResistration.validPasswordRule1("Di@ne-sh");
			break;
		case 6:
			UserResistration.validPasswordRule2("Di@ne-sh_Zingade");
			break;
		case 7:
			UserResistration.validPasswordRule3("Din@esh112");
			break;
		case 8:
			UserResistration.validPasswordRule4("Dinesh@12Zingade");
			break;
		}
	}
}
