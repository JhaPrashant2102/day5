
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

	}
}
