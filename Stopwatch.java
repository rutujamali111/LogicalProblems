

import java.util.Scanner;

public class Stopwatch 
{
	public static void main(String[] args) {
		double dif;
		Scanner scn=new Scanner(System.in);
        System.out.println("Start the stop watch:");
		double start = scn.nextDouble();
		start = System.currentTimeMillis();

		System.out.println("Stop the stop watch:");
		double stop = scn.nextDouble();
		stop = System.currentTimeMillis();

		if (stop == 0) {
			double now = System.currentTimeMillis();
			dif = now - start;
		} else {
			dif = stop - start;
		}
		
		System.out.println("elapsed time is: " + dif + "ms");
		
	}	
	}