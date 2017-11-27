

import java.io.*;
import java.util.*;
import javax.swing.JComponent;
import javax.swing.InputMap;
import javax.swing.ActionMap;
import javax.swing.Action;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;


/*Possible Classes:
	Knight
	Mage
	Ranger
	Druid
	Brawler
*/
//https://stackoverflow.com/questions/20844144/how-do-i-make-a-rectangle-move-across-the-screen-with-key-bindings/20844242#20844242


public class RandomGame{
	
	static Scanner scan= new Scanner(System.in);
	static Character player;
	static Dragon boss;
	//static JComponent comp = new JComponent();
	static ActionMap actions;
	static InputMap inputs;
	static String bitString = "";

	public static void main(String[] args){
		System.out.println();
        System.out.println("Please enter your character's name:");
        String name = scan.nextLine();
        System.out.println("Please choose a class for your character:");
        System.out.println("Your options are: \n" +
                "M: Mage \n" +
                "K: Knight \n" +
                "R: Ranger \n" +
                "D: Druid \n" +
                "B: Brawler");
        String selection = scan.nextLine();
		//create character
        if(selection.equals("M")){
            player = new Mage(name, 3000, 500);
            Mage.intro(scan);
        }
        if(selection.equals("K")){
            player = new Knight(name, 5000, 300);
            Knight.intro(scan);
        }
        if(selection.equals("R")){
            player = new Ranger(name, 4000, 400);
            Ranger.intro(scan);
        }
        if(selection.equals("D")){
            player = new Druid(name, 3000, 450);
        	Druid.intro(scan);
        }
        if(selection.equals("B")){
            player = new Brawler(name, 45000, 350);
            Brawler.intro(scan);
        }
        //System.out.println(player.getInst());

       // comp.addKeyListener(new KeyListener());
		newGame();



	}

	/*Function to set up a new game by creating the appropriate key bindings*/	
	public static void newGame(){
		//actions= comp.getActionMap();
		//inputs = comp.getInputMap();
		boss= new Dragon();
		bitString = GamePanel.setup(player, boss);
		System.out.println("After Setup" + bitString);
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream("RandomBitString.txt"), "utf-8"))) {
		   writer.write(bitString);
		} catch(IOException e){
			System.out.println("Error Writing to file!");
		}

	}


/*THESE NEED TO BE CONVERTED TO ACTIONS!!*/
	/*

	public void actionPerformed(ActionEvent e){
		return;
	}
*/
	public static void battle(Character player, Dragon boss){
		//int attack;
		//int counter = 0;
		System.out.println("In Battle!");
		bitString = "";
		while(boss.getHP() > 0){
			//System.out.print("");
			player.gainPower(1);
		    //https://stackoverflow.com/questions/18037576/how-do-i-check-if-the-user-is-pressing-a-key
		}
		//DISABLE KEYBINDING? or just ignore?
		System.out.println("VICTORY!");
	}

}



