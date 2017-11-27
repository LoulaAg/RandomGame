

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
            player = new Mage(name, 2000, 500);
            Mage.intro(scan);
        }
        if(selection.equals("K")){
            player = new Knight(name, 3000, 300);
            Knight.intro(scan);
        }
        if(selection.equals("R")){
            player = new Ranger(name, 2500, 400);
            Ranger.intro(scan);
        }
        if(selection.equals("D")){
            player = new Druid(name, 2000, 450);
        	Druid.intro(scan);
        }
        if(selection.equals("B")){
            player = new Brawler(name, 3000, 350);
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
		//System.out.println("After Setup" + bitString);
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream("RandomBitString"+ player.name + ".txt"), "utf-8"))) {
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
		if(player.getInst().equals("MAGE")){
			System.out.println("Controls: \n" +
								"1- Basic Attack\n"+
								"2- Flamestrike\n"+
								"3- Frost Nova\n"+
								"4- Arcane Blast\n"+ 
								"5- Heal");
				}	
				if(player.getInst().equals("KNIGHT")){
			System.out.println("Controls: \n" +
								"1- Basic Attack\n"+
								"2- Divine Strength\n"+
								"3- Hammer of Wrath\n"+
								"4- Desperate Stand\n"+ 
								"5- Heal");
				}
				if(player.getInst().equals("RANGER")){
			System.out.println("Controls: \n" +
								"1- Basic Attack\n"+
								"2- Deadly Shot\n"+
								"3- Fan of Knives\n"+
								"4- Call of the Wild\n"+ 
								"5- Heal");
				}
				if(player.getInst().equals("DRUID")){
			System.out.println("Controls: \n" +
								"1- Basic Attack\n"+
								"2- Sun Wrath\n"+
								"3- Lunar Strike\n"+
								"4- Star Fall\n"+ 
								"5- Heal");
				}
				if(player.getInst().equals("BRAWLER")){
			System.out.println("Controls: \n" +
								"1- Basic Attack\n"+
								"2- Flying Serpeant Kick\n"+
								"3- Whirling Dragon Punch\n"+
								"4- Mortal Strike\n"+ 
								"5- Heal");
				}
		while(boss.getHP() > 0){
			//System.out.print("");
			player.gainPower(1);
		    //https://stackoverflow.com/questions/18037576/how-do-i-check-if-the-user-is-pressing-a-key
		}
		//DISABLE KEYBINDING? or just ignore?
		System.out.println("VICTORY!");
	}

}



