
/**
 * Here we,ll check the constraints for each user
 */

/**
 * @author prashant
 *
 */
import java.util.*;
import java.util.regex.*;

public class ValidationClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String firstName;

		// UC1
		while (true) {
			System.out.println("Enter the first name :");
			firstName = sc.nextLine();
			String regex = "^[A-Z][a-zA-Z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(firstName);
			if (matcher.matches()) {
				break;
			} else {
				System.out.println("Wrong format you'll have to go again!");
			}
		}

		String lastName;

		// UC2
		while (true) {
			System.out.println("Enter the last name :");
			lastName = sc.nextLine();
			String regex = "^[A-Z][a-zA-Z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(lastName);
			if (matcher.matches()) {
				break;
			} else {
				System.out.println("Wrong format you'll have to go again!");
			}
		}

		String emailId;
		// UC3
		while (true) {
			System.out.println("Enter the emailId :");
			emailId = sc.nextLine();
			String regex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9]+)*@([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,3}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(emailId);
			if (matcher.matches()) {
				break;
			} else {
				System.out.println("Wrong format you'll have to go again!");
			}
		}

		String phoneNumber;
		// UC4
		while (true) {
			System.out.println("Enter the phone Number :");
			phoneNumber = sc.nextLine();
			String regex = "^[0-9]{2}[: :][0-9]{10}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(phoneNumber);
			if (matcher.matches()) {
				break;
			} else {
				System.out.println("Wrong format you'll have to go again!");
			}
		}

		String password;
		// UC5
		while (true) {
			System.out.println("Enter your password :");
			password = sc.nextLine();
			String regex = "^(.){8,}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(password);
			if (matcher.matches()) {
				break;
			} else {
				System.out.println("Wrong format you'll have to go again!");
			}
		}

	}
}
