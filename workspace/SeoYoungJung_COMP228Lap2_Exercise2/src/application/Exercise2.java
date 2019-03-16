package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise2 {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		Lotto lotto = new Lotto();
		boolean keepTry = true;
		boolean doesUserWin = false;
		int userSum = 0;
		int answerCount = 0;
		final int maxCount = 5;

		lotto.getTestLog();

		do
		{
			System.out.println("Please enter number (3 ~ 27):");
			int userInput = input.nextInt();

			if(3 <= userInput && 27 >= userInput)
			{
				userSum +=userInput;
				answerCount++;

				if(answerCount < 5)
				{
					System.out.printf("Your sum is %d. Do you wanna keep add?\nYou left %d times (Y/N)\n", userSum, maxCount - answerCount);
					String str = input.next();
					keepTry = (str.equals("y") || str.equals("Y") || str.equals("Yes") || str.equals("YES")) ? true : false;
				}
				else
				{
					System.out.println(" Finish! You played 5 times.");
					keepTry = false;
				}
			}
			else
			{
				System.out.println("you wrote wrong number, please write between 3 and 27");
			}
		}while(keepTry);

		System.out.printf("Your sum is %d.Thank you!\n", userSum);
		for(int i = 0;  i< lotto.getAnswer().length; ++i)
		{
			if(lotto.getAnswer()[i] == userSum)
			{
				doesUserWin = true;
				break;
			}
		}

		if(doesUserWin)
		{
			System.out.println("You are Win");
		}
		else
		{
			System.out.println("You are lose");
		}

	}
}
