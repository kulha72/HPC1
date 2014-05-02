import java.util.Scanner;


public class main {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String inputString;
		
		System.out.println("Welcome to the guessing game, pick a number between 1-100");
		System.out.println("Type in higher or lower after each guess");
		
	
	
		
		int guess = 50;	
		int lastGuess = 50;
		int tempLastGuess;
		
		boolean quitBool = false;
		boolean firstBool = true;
		
		while(quitBool == false)
		{

		System.out.println("My guess is " + guess + ". Type higher, lower, or got it!");
		inputString = input.next();
	
			if(inputString.toUpperCase().equals("HIGHER"))
			{
				if(firstBool)
				{
					lastGuess = 100;
					firstBool = false;
				}
				tempLastGuess = lastGuess;
				lastGuess = guess; 
				guess = higher(guess, tempLastGuess);
			}
			else if(inputString.toUpperCase().equals("LOWER"))
			{
				if(firstBool)
				{
					lastGuess = 0;
					firstBool = false;
				}
				tempLastGuess = lastGuess;
				lastGuess = guess; 
				guess = lower(guess, tempLastGuess);
			
			}
			else if(inputString.toUpperCase().equals( "GOT"))
			{
				System.out.println("You cannot defeat the machine!!!");
				quitBool = true;
				
			}
			else{System.out.println("Did not register answer");}
		
		}
		
		
		
		}
		
	
	
	public static int higher(int g, int lg)
	{
		int newGuess = 0;

		if(lg > g)
		{
			int tg = lg-g;
			tg = (int) Math.ceil(tg/2.0);
			newGuess = g + tg;
			
		}
		else if(lg < g)
		{
			int tg = g-lg;
			tg = (int) Math.ceil(tg/2.0);
			newGuess = g + tg;
		
		}
		else{
			
		}
		if(newGuess > 100)
			newGuess = 100;
		
		return newGuess;
		
	}
	
	public static int lower(int g, int lg)
	{
		int newGuess = 0;

		if(lg > g)
		{
			int tg = lg-g;
			tg = (int) Math.ceil(tg/2.0);
			newGuess = g - tg;
			
		}
		else if(lg < g)
		{
			int tg = g-lg;
			tg = (int) Math.ceil(tg/2.0);
			newGuess = g - tg;
		
		}
		else{
			
		}
		if(newGuess < 0)
			newGuess = 0;
		
		return newGuess;
	}

	
}
