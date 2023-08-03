package numbersprograms;
import java.util.Scanner;

public class AutomorphicNum {
	
	static void checkNum(long num)
	{
		long temp,sqrnum,lastdigit;
		int count=0;
		long digit;
		sqrnum=num*num;
		temp=num;
		while(num>0)
		{
			digit=num%10;
			count++;
			num=num/10;
		}
		lastdigit=sqrnum%(long)Math.pow(10, count);
		if(temp==lastdigit)
			System.out.println(temp+" is an automorphic number ");
		else
			System.out.println(temp+" is not an automorphic number ");
	}

	public static void main(String args[])
	{
		long num;
		System.out.print("Enter a number to check automorphic number or not: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		checkNum(num);
	}
}
