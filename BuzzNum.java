package numbersprograms;
import java.util.Scanner;

public class BuzzNum {
	
	static void checkNum(long num)
	{
		if(num%7==0 || num%10==7)
			System.out.println(num+" is a buzz number");
		else
			System.out.println(num+" is not an buzz number");

	}

	public static void main(String args[])
	{
		long num;
		System.out.print("Enter a number to check buzz number or not: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		checkNum(num);
	}
}
