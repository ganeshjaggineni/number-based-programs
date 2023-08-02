package numbersprograms;
import java.util.Scanner;

public class PronicNum {
	public static void main(String args[])
	{
		int num,flag=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Etner a number to check whether it is pronic number or not :");
		num=sc.nextInt();
		
		i=0;
		while(i!=num)
		{
			if(i*(i+1)==num)
			{
				flag=1;
				break;
			}
			i++;
		}
		if(flag==1)
		{
			System.out.println(num+" is a pronic number");
		}
		else
			System.out.println(num+" is not a pronic number");

	}
}
