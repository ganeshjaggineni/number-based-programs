package numbersprograms;
import java.util.Scanner;

public class HappyNum {
	public static void main(String args[])
	{
		int num,temp,sum=0,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextInt();
		temp=num;
		
		while(num>10)
		{
			sum=0;
			while(num>0)
			{
				rem=num%10;
				sum=sum+rem*rem;
				num=num/10;
			}
			num=sum;
			
		}
		if(sum==1)
		{
			System.out.println(temp+" is a happy number ");
		}
		else
			System.out.println(temp+" is not a happy number ");

	}

}
