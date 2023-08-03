package numbersprograms;
import java.util.Scanner;

public class AbundantNum {
	static void checkNum(int num)
	{
		int i,sum=0;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(sum>num)
				System.out.println(num+" is an abundant number");
		else
			System.out.println(num+" is not an abundant number");
	}

	public static void main(String args[])
	{
		int num;
		System.out.print("Enter a number to check abundance or not: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		checkNum(num);
	}
}
