package controlstatments;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("the numbers are:");
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0) {
				System.out.println("the no. is zero"+numbers[i]);
				continue;
			}else {
				System.out.println("the no. is not zero"+numbers[i]);
			}
				
		}
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0) {
				System.out.println("the no. is zero"+numbers[i]);
				break;
			}else {
				System.out.println("the no. is not zero"+numbers[i]);
			}
				
		}
		
	}

}
