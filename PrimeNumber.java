

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int num=sc.nextInt();
		if(isPrime(num))
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
