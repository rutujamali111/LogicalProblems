

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		boolean result=IsPerfect(num);
		if(result)
			System.out.println("Perfect number:");
		else
			System.out.println("not a perfect number");
	}

	private static boolean IsPerfect(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
			return true;
		else	
			return false;
	}

}
