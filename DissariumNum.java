package numbersprograms;
import java.util.Scanner;

public class DissariumNum {
		
	public static void main(String args[])
	{
		int num,temp,rem=0,sum=0,i,count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to check dissarium or not :");
		num=sc.nextInt();
		
		//to check count of digit
		temp=num;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		num=temp;
		for(i=count;i>0&&num>0;i--)
		{
			
			rem=num%10;
			sum=sum+(int)Math.pow(rem, i);
			num=num/10;
			
		}
		
		if(temp==sum)
				System.out.println(sum+" is dissarium number.");
		else
			System.out.println(sum+" is not a dissarium number.");
		
	}
}
