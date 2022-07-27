

public class FibonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_of_terms=10;
		int first_term=0;
		int second_term=1;
		//System.out.println(first_term+" "+second_term);
		for(int i=0;i<num_of_terms;i++)
		{
			System.out.print(first_term+" ");
			int next=first_term+second_term;
			first_term=second_term;
			second_term=next;
		}
	}

}
