package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {

public static void main(String[] args) {
// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter username");
	String uname=sc.next();
	System.out.println(Pattern.matches("^[A-Za-z]{7,}[@$!%*#?&]{1,}$", uname));

	System.out.println("Enter email Id");
	String email=sc.next();
	System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@(.+)$", email));

	System.out.println("Enter password");
	String pd=sc.next();
	System.out.println(Pattern.matches("^[a-zA-Z0-9._+-//*@]{8,16}", pd));

	System.out.println("Enter mobile no.");
	String mn=sc.next();
	System.out.println(Pattern.matches("[789]{1}[0-9]{9}",mn ));

	System.out.println("Enter city");
	String city=sc.next();
	System.out.println(Pattern.matches("^[a-zA-Z]{2,50}", city));

}

}