import java.util.Scanner;
import java.lang.Math;
class numbergame
{
	public static void main(String args[])
	{
		int a=(int)(Math.random() * 100)+1;
		int i=5;	
		Scanner obj=new Scanner(System.in);
		boolean right=false;
		System.out.println("you have five tries left to guess the number");
		while(i>0)
		{
			System.out.println("ENTER YOUR GUESSED NUMBER:");
			int b= obj.nextInt();
			if (b==a)
			{
				System.out.println("you have gessed the correct number\n YOU win!!");
				break;
			}
			else if(b>a)
			{
				System.out.println("the guessed number is greater then the real number\n"+(i-1)+"TRIES LEFT!!GUESS THE CORRECT NUMBER");
				
			}
			else 
			{
				System.out.println("your guess is smaller then the real number\n"+(i-1)+"TRIES LEFT!!GUESS THE CORRECT NUMBER");
				
			}
			i--;
		}
		if (right==true)
		{
			System.out.println("YOU HAVE GUESSED THE CORRECT NUMBER ");
		}
		else
		{
			System.out.println("YOU LOSE!!!you have no tries left\n");
		}
	}
}