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
		
		//UC1
		System.out.println(Pattern.matches("[0-9]{6}","400088"));	
		
		//UC2
		System.out.println(Pattern.matches("[0-9]{6}","A400088"));
		
		//UC3
		System.out.println(Pattern.matches("^[0-9]{6}$","400088B"));
		
		//UC3 extended
		System.out.println(Pattern.matches("^[0-9]{3}[: -:][0-9]{3}$","400-088"));
		//[: :] can also be used instead of \\ {0,1} and vice versa
		
	}
}
