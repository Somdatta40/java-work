package controlstatments;
import java.util.Scanner;
import java.util.StringTokenizer;  
public class SimpleDemo{  
 public static void main(String args[]){  
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the String:");
	 String s= sc.nextLine();
   StringTokenizer st = new StringTokenizer(s," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}
