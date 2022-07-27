

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(reverse(num));
	}

	private static int reverse(int num) {
		// TODO Auto-generated method stub
		int rev_num=0;
		while(num>=1)
		{
			int rem=num%10;
			rev_num=rev_num*10+rem;
			num=num/10;
		}
		return rev_num;
	}

}
