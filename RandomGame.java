

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
                " Mage \n" +
                " Knight \n" +
                " Ranger \n" +
                " Druid \n" +
                " Brawler");
        String selection = scan.nextLine();
		//create character
        if(selection.equals("Mage")){
            player = new Mage(name, 3000);
        }
        if(selection.equals("Knight")){
            player = new Mage(name, 5000);
        }
        if(selection.equals("Ranger")){
            player = new Mage(name, 4000);
        }
        if(selection.equals("Druid")){
            player = new Mage(name, 3000);
        }
        if(selection.equals("Brawler")){
            player = new Mage(name, 45000);
        }

       // comp.addKeyListener(new KeyListener());



		newGame();



	}

	/*Function to set up a new game by creating the appropriate key bindings*/	
	public static void newGame(){
		//actions= comp.getActionMap();
		//inputs = comp.getInputMap();
		GamePanel.setup(player, boss);
		

	}


/*THESE NEED TO BE CONVERTED TO ACTIONS!!*/
	/*

	public void actionPerformed(ActionEvent e){
		return;
	}
*/
	public String battle(Character player, Dragon boss){
		int attack;
		int counter = 0;
		bitString = "";
		while(boss.getHP() > 0){

		    //https://stackoverflow.com/questions/18037576/how-do-i-check-if-the-user-is-pressing-a-key
		}
		return bitString;
	}

}



