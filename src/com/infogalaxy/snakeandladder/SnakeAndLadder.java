package com.infogalaxy.snakeandladder;


import java.util.Random;
import java.util.Scanner;


public class SnakeAndLadder
{

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int playerPosition = 0;
		int option;
		int dieNo;
		int dieCount = 0;
		private static final int STAY = 0;
		private static final int LADDER = 1;
		private static final int SNAKE = 2;
		private static final int WINNING_NO = 100;
		
		public void show()
		{
			while (playerPosition != WINNING_NO)
			{
			System.out.println(" Position of a Player is : " +playerPosition);
			dieNo = random.nextInt(6) + 1;
			dieCount++;
			option = random.nextInt(3);
			
			switch (option)
			{
				case STAY:
					playerPosition = playerPosition;
					break;
				case LADDER:
					if(playerPosition +dieNo > WINNING_NO) 
					{
						continue;
					}
					playerPosition = playerPosition + dieNo;
					break;
				case SNAKE:
					playerPosition = playerPosition - dieNo;
					if(playerPosition < 0)
					{
						playerPosition = 0;
					}
					break;
			}
			System.out.println(" The Value of a Option is = "+option);
			System.out.println(" The Number on Die is = "+dieNo);
			System.out.println(" The New Position of a Player = " +playerPosition); 
			System.out.println(" The Total Die Required to Win the Game is = " +dieCount);
			
			}
		}
		public static void main(String[] args)
		{
			SnakeAndLadder Player1 = new SnakeAndLadder();
			Player1.show();
			
		}

		
}
