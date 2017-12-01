
import java.io.*;
import java.util.*;


public class Druid extends Character{

	//public String INSTANCE= "DRUID";

	public Druid(String s, int hp, int pow){
		super(s, hp, pow, "DRUID");
	}

	public static void intro(Scanner scan){
		System.out.println("Press [ENTER] to progress through the story");
		System.out.println("The moon rises higher and higher, and you stand with your fellow druids waiting for the moon to reach its peak.");
		scan.nextLine();
		System.out.println("The Huffman Circle is a sacred ritual, druids from all around the kingdom come together for it once a year.");
		scan.nextLine();
		System.out.println("The excitment is almost palpable as the moon grows bigger and brighter.");
		scan.nextLine();
		System.out.println("You feel it calling you and you yearn to answer its call.");
		scan.nextLine();
		System.out.println("Though you draw power from all things in the sky, the moon has always been special to you. A particularly strong source of power.");
		scan.nextLine();
		System.out.println("Everything is silent, as though the world is holding its breath, as the moon slips into position.");
		scan.nextLine();
		System.out.println("Before anyone can even exhale, a shadow falls across the moon.");
		scan.nextLine();
		System.out.println("No one has to look up to know what it is, though they do anyway. The oultine of the shadow on the ground is unmistakable.");
		scan.nextLine();
		System.out.println("Even with the moon hidden, you feel it inside you and call to it. Gathering the power that surges through you as the dragon attacks.");
		scan.nextLine();
	}
}
