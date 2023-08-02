package patternprograms;
import java.util.Scanner;
public class HollowSquarePattern {

		public static void drawPattern(int num)
		{
			for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=num;j++)
				{
					if(i==1 || i==num || j==1 || j==num)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		public static void main(String args[])
		{
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number :");
			num=sc.nextInt();
			
			drawPattern(num);
		}
		/*
		 Enter a number :8
********
*      *
*      *
*      *
*      *
*      *
*      *
********
		 */
	}


