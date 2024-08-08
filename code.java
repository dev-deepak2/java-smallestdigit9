//Starts Here

import java.util.Scanner;

public class Smallestdigit2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number :");
		int n=s.nextInt();
		
		int smallestDigit=9;
		while(n!=0)
		{
			int rem=n%10;
			
			if(rem<smallestDigit) {
				smallestDigit=rem;
			}
			n=n/10;
		}
		System.out.println(smallestDigit);

	}

}
