package numbersprograms;
import java.util.Scanner;

public class HarshadNivenNum {
	public static void main(String args[])
	{
		int num,rem,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Etner a number :");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		if(temp%sum==0)
		{
			System.out.println(temp+" is a harshad or niven number");
		}
		else 
			System.out.println(temp+" is not an harshad or niven number");

		
	}
}
