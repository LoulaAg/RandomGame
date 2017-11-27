
import java.io.*;
import java.util.*;


public class Mage extends Character{

	//public String INSTANCE= "MAGE";

	public Mage(String s, int hp, int pow){
		super(s, hp, pow, "MAGE");
	}

	public static void intro(Scanner scan){
		System.out.println("The Grandmaster looks at you, his eyes barely focusing.");
		scan.nextLine();
		System.out.println("He has already seen it all, all that has yet to happen, but he cannot change it.");
		scan.nextLine();
		System.out.println("Even from atop Wegman-Carter Tower, you can hear the distan sounds of battle, of war.");
		scan.nextLine();
		System.out.println("Magic flows through you, pulsing right beneath your skin, waiting to be released.");
		scan.nextLine();
		System.out.println("This is what you trained for.");
		scan.nextLine();
		System.out.println("The Grandmaster learned how to see the future, you learned to mould it, to alter it.");
		scan.nextLine();
		System.out.println("The Grandmaster sighs and closes his eyes. You don't know what this means for you, but as the dragon's cry echoes throught the tower, you are ready.");
		scan.nextLine();
		System.out.println("You call fire, water, earth, and wind to your side and ready to unleash it all.");
	}
}
