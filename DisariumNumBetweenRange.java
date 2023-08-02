package numbersprograms;
import java.util.Scanner;

public class DisariumNumBetweenRange {
		
	public static void main(String args[])
	{
		int num,temp,digit=0,sum=0,i,pos=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to check disarium numbers upto it");
		num=sc.nextInt();
		temp=num;
		for(i=1;i<=temp;i++)
		{
			num=i;
			sum=0;
			digit=0;
			pos=0;
			while(num>0)
			{
				pos++;
				num=num/10;
			}
			num=i;
			while(num>0)
			{
				digit=num%10;
				sum=sum+(int)Math.pow(digit, pos);
				pos--;
				num=num/10;
			}

			
			if(i==sum)
				System.out.print(i+" ");
		}
		
		
		
		
	}
}
