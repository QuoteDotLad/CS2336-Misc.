import java.util.Scanner;
import java.util.Arrays;
public class Hangman 
{
		
	public static void main(String[] args)
	{
		String[] words = {"write", "that", "program", "mouse", "tuesday", "computer", "science", "sorry", "word", "hangman"};
		
		Scanner scan = new Scanner(System.in);
		String playAgain;
		do //playing han gman until they say they want to stop
		{
			int misses = 0; //Initialize variables
			char input;
			String correct = getWord(words);
			char word[] = new char[correct.length()];
			char[] hangman = new char[correct.length()];
			boolean[] mask = new boolean[word.length];
			
		for(int x = 0; x < correct.length(); x++)
		{
			word[x] = correct.charAt(x); //Filling word array with each char of the randomly selected word
		}
		
		for(int i = 0; i < correct.length(); i++)
		{
			hangman[i] = '*'; //Filling hang man array of chars with '*'
		}
		
		while(!(Arrays.equals(hangman,word))) //While word not solved
		{
			System.out.print("(Guess) Enter a letter in a word "); //Guess each letter
			for(int i = 0; i < correct.length(); i++)
			{
				System.out.print(hangman[i]); //Prints every letter of hang man, including when it has some letters in
			}
				System.out.print(" > ");
				
				input = scan.next().charAt(0);	//Take letter input
				compare(input, word, hangman); //Compares the hang man and the answer with relation to the input
				
				boolean miss = true;
				for(int y = 0; y < word.length; y++) //Counts misses
				{
					if(word[y] == input)
					{
						if(mask[y] != true)
						{
							mask[y] = true;
						}
						miss = false;
					}
				}
				if(miss)
				{
					misses++;
				}
		}
		
		System.out.print("The word is "); //Once solved
		for(int l = 0; l < word.length; l++) //Displays answer
		{
			System.out.print(word[l]);
		}
		System.out.println(". You missed " + misses + " time(s) ");
		
		System.out.println("Do you want to guess another word? Enter y or n > "); //Asks if they want to play again
		
		playAgain = scan.next();
		
		}while(playAgain.charAt(0) != 'n'); //If not 'n'they play again
		scan.close();
		System.out.println("Thanks for playing! "); //If 'n' it exits
		System.exit(0);
	}
	public static String getWord(String[] words)
	{
		int index = (int)(Math.random() * (words.length)); //Random number from 0 to 9, to pick which word in
															  //words array will be used
		return words[index];
	}
	public static char[] compare(char input, char word[], char[] hangman)
	{
		for(int k = 0; k < word.length; k++)
		{
			if(Character.toLowerCase(input) == hangman[k]) //If input is in hang man already
			{											  //It's a duplicate and message is displayed
				System.out.println(input + " is already in the word. ");
			}
			if(word[k] == Character.toLowerCase(input)) //If the input is part of the answer
			{
				hangman[k] = Character.toLowerCase(input); //Replaces asterisk in hang man with correct letter
			}
		}
		return hangman; //Returns hang man array to enter more letters
	}
}
