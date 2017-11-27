
import java.io.*;
import java.util.*;


public class Ranger extends Character{

	//public String INSTANCE= "RANGER";

	public Ranger(String s, int hp, int pow){
		super(s, hp, pow, "RANGER");
	}

	public static void intro(Scanner scan){
		System.out.println("The Rangers of forest Shannon have long protected the the forest and all who live in it.");
		scan.nextLine();
		System.out.println("As their newest memeber, you are eager to prove yourself. Patrol duty does not seem like the best way to do so though. ");
		scan.nextLine();
		System.out.println("You scour the woods, ready to fight any evil.");
		scan.nextLine();
		System.out.println("Suddenly, you hear leaves rustling.");
		scan.nextLine();
		System.out.println("You reach for your bow as you turn to find the source of the noise. It is an elf.");
		scan.nextLine();
		System.out.println("\"Help! You must help us, a dragon is attacking our village!\", she calls to you.");
		scan.nextLine();
		System.out.println("This is your chance. \"Lead the way\" you say and spring into action, as you follow the elf to face your first foe.");
		scan.nextLine();
	}
}