package controlstatments;
import java.util.Scanner;
public class SwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		while(true)
		{
			char choice=input.next().trim().charAt(0);
		char[]array=new char[5];
		System.out.println("enter the character");
		for(int i=0;i<array.length;i++) {
			array[i]=input.next().trim().charAt(0);}
		System.out.println("enter the choice");
		System.out.println("B:print the vowels");
		System.out.println("C:print the symbol");
			switch(choice) {
			case 'B':
				for(int i=0;i<array.length;i++) {
				if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
					System.out.println(array[i]+"is a vowel");
				else
					System.out.println(array[i]+"is a consonent");
				}
				break;
			}
				
			}
		
	}
	}

