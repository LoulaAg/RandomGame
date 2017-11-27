
import java.io.*;
import java.util.*;


public class Druid extends Character{

	//public String INSTANCE= "DRUID";

	public Druid(String s, int hp, int pow){
		super(s, hp, pow, "DRUID");
	}

	public static void intro(Scanner scan){
		System.out.println("The moon rises higher and higher, and you stand with your fellow druids waiting for it to reach its peak.");
		scan.nextLine();
		System.out.println("The Huffman Circle is a sacred ritual, druids from all around the kingdom come together for it once a year.");
		scan.nextLine();
		System.out.println("The excitment is almost pallpable as the moon grows bigger and brighter.");
		scan.nextLine();
		System.out.println("You feel it calling you and yearn to answer it's call.");
		scan.nextLine();
		System.out.nextLine("Though you draw power from all things in the sky, the moon has always been special to you. A particularly strong source of power.");
		scan.nextLine();
		System.out.println("Everything is silent, as thought the world is holding its breath, as the moon slips into position.");
		scan.nextLine();
		System.out.println("Before anyone can even exhale, a shadow falls across the moon.");
		scan.nextLine();
		System.out.println("No one has to look up to know what it is, thought they do anyway. The oultine of the shadow on the ground though is unmistakable.");
		scan.nextLine();
		System.out.println("Even with the moon hidden you feel it inside you, and call to it. Gathering the power the surges through you as the dragon attacks.");
		scan.nextLine();
	}
}
