

import java.io.*;
import java.util.*;


public class Knight extends Character{

	//public String INSTANCE= "KNIGHT";

	public Knight(String s, int hp, int pow){
		super(s, hp, pow, "KNIGHT");
	}

	public static void intro(Scanner scan){
		System.out.println("Press [ENTER] to progress through the story");
		System.out.println("Amidst the chaos of battle, the Knights of Shamir stand at the ready.");
		scan.nextLine();
		System.out.println("An army of evil marches onward, seemingly unstoppable.");
		scan.nextLine();
		System.out.println("However, you are a Knight, sworn to protect the Kingdom from evil, and you shall not let it pass.");
		scan.nextLine();
		System.out.println("As you hold your sword up ready to fight, a loud screech sounds overhead.");
		scan.nextLine();
		System.out.println("A dragon, blood red against the bright blue sky, soars through the air, raining fire on enemies and allies alike.");
		scan.nextLine();
		System.out.println("It is as the Grandmaster warned, evil has possessed even the purest of hearts and turned them into mindless beasts.");
		scan.nextLine();
		System.out.println("The dragons were once a proud and noble species, but as your companions shield themselves from the heat, you grip your sword and leap right into the fray");
		scan.nextLine();
		
	}
}
