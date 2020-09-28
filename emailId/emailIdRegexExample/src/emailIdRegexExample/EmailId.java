/**
 * Regex example 2
 */
package emailIdRegexExample;
import java.util.regex.*;
import java.util.*;
/**
 * @author prashant
 *
 */
public class EmailId {
	public static void main(String args[]) {
		//System.out.println("Enter the emailID :");
		//Scanner sc = new Scanner(System.in);
		//String emailId = sc.nextLine();
		
		//UC1
		System.out.println(Pattern.matches("^([a-zA-Z0-9]+)", "abcde"));
		//^[a-zA-Z0-9]{1,}
		
		//UC2
		System.out.println(Pattern.matches("^(.+)@[a-zA-Z0-9]+(.+)$", "ab@yahooss"));
		//@bridgelabz  ^([a-zA-Z0-9]+)
		
		//UC3 . and com
		System.out.println(Pattern.matches("^(.+)@[a-zA-Z0-9]+\\.[a-zA-Z]{3}$", "ab@yahoo.com"));
		
		//UC4 .xyz
		System.out.println(Pattern.matches("^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{3}$", "abc_.xyz@yahoo.com"));
		
		//UC5
		System.out.println(Pattern.matches("^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9]+)*@([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,3}$", "abc_.xyz@yahoo.corporate.com"));
		
		List<String> emailList = new ArrayList<String>();
		emailList.add("abc@yahoo.com");
		emailList.add("abc-100@yahoo.com");
		emailList.add("abc.100@yahoo.com");
		emailList.add("abc111@abc.com");
		emailList.add("abc-100@abc.net");
		emailList.add("abc.100@abc.com.au");
		emailList.add("abc@1.com");
		emailList.add("abc@gmail.com");
		emailList.add("abc+100@gmail.com");
		emailList.add("abc");
		emailList.add("abc@.com.my");
		emailList.add("abc123@gmail.a");
		emailList.add("abc123@.com");
		emailList.add("abc123@.com.com");
		emailList.add(".abc@yahoo.com");
		emailList.add("abc()*@yahoo.com");
		emailList.add("abc@%*.com");
		emailList.add("abc..2002@gmail.com");
		emailList.add("abc.@gmail.com");
		emailList.add("abc@abc@gmail.com");
		emailList.add("abc@gmail.com.1a");
		emailList.add("abc@yahoo.com.aa.uu");
		
		String regex = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9]+)*@([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,3}$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emailList){
		    Matcher matcher = pattern.matcher(email);
		    System.out.println(email +" : "+ matcher.matches());
		}
		
		
	}
}
