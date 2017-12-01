

import java.io.*;
import java.util.*;


public class Brawler extends Character{

	//public String INSTANCE= "BRAWLER";

	public Brawler(String s, int hp, int pow){
		super(s, hp, pow, "BRAWLER");
	}

	public static void intro(Scanner scan){
		System.out.println("Press [ENTER] to progress through the story");
		System.out.println("You've heard the whispers all over the city. They say evil is coming.");
		scan.nextLine();
		System.out.println("The town worries too, but little thought is given to it. Most are more worried about getting by.");
		scan.nextLine();
		System.out.println("Even amidst all the chatter of doom, you are eager to get to the market in Hamming City.");
		scan.nextLine();
		System.out.println("You gave up a life of fighting long ago. Now, you are just a blacksmith.");
		scan.nextLine();
		System.out.println("It's a quiet life, but you have finally found peace. Like all things though it must come to an end.");
		scan.nextLine();
		System.out.println("The roar starts before the screams and sounds louder than even thousands combined.");
		scan.nextLine();
		System.out.println("The dragon flies in circles, descending slowly, as though it is cherishing the terror below.");
		scan.nextLine();
		System.out.println("You stand almost perfectly still, and for a fleeting moment you consider running with the rest.");
		scan.nextLine();
		System.out.println("Then the moment passes and one hand tightens into a fist as the other grabs the shortsword you were about to sell");
		scan.nextLine();
		System.out.println("You leap into battle.");
		scan.nextLine();
	}
}
