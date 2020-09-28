/**
 * Regex Example 1
 */

/**
 * @author prashant
 *
 */
import java.util.regex.*;
import java.util.Scanner;
public class PinCodeCheck {
	public static void main(String args[]) {
		//System.out.println("Enter the String :");
		//Scanner sc = new Scanner(System.in);
		//String inputString =  sc.nextLine();
		System.out.println(Pattern.matches("[0-9]{6}","400088"));	
	}
}
