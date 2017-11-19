
import java.io.*;
import java.util.*;
import javax.swing.JComponent;
import javax.swing.InputMap;
import javax.swing.ActionMap;
import javax.swing.Action;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class Character{
	String name;
	private int health;

	public Character(String s, int hp){
		name = s;
		health= hp;
	}

	public void loseHP(int dmg){
		health -= dmg;
	}

	public void gainHP(int hp){
		health +=hp;
	}

	public int getHP(){
		return health;
	}


}

public class Mage extends Character{
	public Mage(String s, int hp){
		super(s, hp);
	}

	public static void intro(){

	}
}

public class Knight extends Character{
	public Knight(String s, int hp){
		super(s, hp);
	}

	public static void intro(){
		
	}
}

public class Ranger extends Character{
	public Ranger(String s, int hp){
		super(s, hp);
	}

	public static void intro(){
		
	}
}

public class Druid extends Character{
	public Druid(String s, int hp){
		super(s, hp);
	}

	public static void intro(){
		
	}
}

public class Brawler extends Character{
	public Brawler(String s, int hp){
		super(s, hp);
	}

	public static void intro(){
		
	}
}

/*Possible Classes:
	Knight
	Mage
	Ranger
	Druid
	Brawler

*/

public class Dragon{

	private int health;

	public Dragon(){

	}
	public void loseHP(int dmg){
		health -= dmg;
	}

	public int getHP(){
		return health;
	}
}

public class Loot{
	String seed;
	int gold;
	public Loot(String s){
		seed = s;
		//gold = somethng using the seed 
	}
}

public class RandomGame{
	
	Scanner scan= new Scanner(System.in);
	Character player;
	JComponent comp = new JComponent();
	ActionMap actions;
	InputMap inputs;
	String bitString = "";

	public static voic main(String[] args){
		System.out.println();
        System.out.println("Please enter your character's name:");
        name = scan.nextLine();
        System.out.println("Please choose a class for your character:");
        System.out.println("Your options are: \n" +
                " Mage \n" +
                " Knight \n" +
                " Ranger \n" +
                " Druid \n" +
                " Brawler");
		//create character
        if(slection.equals("Mage")){
            player = new Mage(name);
            player.setHealth();
        }
        if(slection.equals("Knight")){
            player = new Mage(name);
            player.setHealth();
        }
        if(slection.equals("Ranger")){
            player = new Mage(name);
            player.setHealth();
        }
        if(slection.equals("Druid")){
            player = new Mage(name);
            player.setHealth();
        }
        if(slection.equals("Brawler")){
            player = new Mage(name);
            player.setHealth();
        }



		newGame(comp, actions, inputs, player);



	}

	/*Function to set up a new game by creating the appropriate key bindings*/	
	public void newGame(Character play, Dragon boss){
		component = 
		actions= new ActionMap();
		inputs = new InputMap();

		component.getInputMap().put(KeyStroke.getKeyStroke("1"),
                            "basic");
		component.getActionMap().put("basic",
	                             basic(boss));

		component.getInputMap().put(KeyStroke.getKeyStroke("5"),
                            "healthRegen");
		component.getActionMap().put("healthRegen",
                             play.gainHP(150));

		/*Set up Key bindings */
		if (play instanceof Mage){
			
			component.getInputMap().put(KeyStroke.getKeyStroke("2"),
	                            "FlameStrike");
			component.getActionMap().put("FlameStrike",
	                             flamestrike(boss));
			component.getInputMap().put(KeyStroke.getKeyStroke("3"),
	                            "FrostNova");
			component.getActionMap().put("FrostNova",
	                             frost_nova(boss));
			component.getInputMap().put(KeyStroke.getKeyStroke("4"),
                            "ArcaneBlast");
			component.getActionMap().put("ArcaneBlast",
	                             arcane_blast(boss));
			Mage.intro();

		}
		if (play instanceof Knight){
			
			component.getInputMap().put(KeyStroke.getKeyStroke("2"),
	                            "DivineStrength");
			component.getActionMap().put("DivineStrength",
	                             divine_strength(boss));
			component.getInputMap().put(KeyStroke.getKeyStroke("3"),
	                            "HammerOfWrath");
			component.getActionMap().put("HammerOfWrath",
	                             hammer_of_wrath(boss));
			component.getInputMap().put(KeyStroke.getKeyStroke("4"),
                            "DesperateStand");
			component.getActionMap().put("DesperateStand",
	                             desperate_stand(boss));
			Knight.intro();

		}
		if (play instanceof Ranger){
			
			component.getInputMap().put(KeyStroke.getKeyStroke("2"),
	                            "healthRegen");
			component.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			component.getInputMap().put(KeyStroke.getKeyStroke("3"),
	                            "healthRegen");
			component.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			component.getInputMap().put(KeyStroke.getKeyStroke("4"),
                            "healthRegen");
			component.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			Ranger.intro();

		}
		if (play instanceof Druid){
			
			component.getInputMap().put(KeyStroke.getKeyStroke("2"),
	                            "healthRegen");
			component.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			component.getInputMap().put(KeyStroke.getKeyStroke("3"),
	                            "healthRegen");
			component.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			component.getInputMap().put(KeyStroke.getKeyStroke("4"),
                            "healthRegen");
			component.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			Druid.intro();

		}
		if (play instanceof Brawler){
			
			component.getInputMap().put(KeyStroke.getKeyStroke("2"),
	                            "healthRegen");
			component.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			component.getInputMap().put(KeyStroke.getKeyStroke("3"),
	                            "healthRegen");
			component.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			component.getInputMap().put(KeyStroke.getKeyStroke("4"),
                            "healthRegen");
			component.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			Brawler.intro();

		}

	}


/*THESE NEED TO BE CONVERTED TO ACTIONS!!*/
	//Generic
	Action basic_attack = new AbstractAction(){
		public void basic(){
			boss.loseHP(50);
			bitString += "1";
		}
	}

	//Mage
	Action attackFS= new AbstractAction(){
	public void flamestrike(ActionEvent e){
		boss.loseHP(100);
		bitString += "1";
	}};

	Action attackFN = new AbstractAction(){
	public void frost_nova(ActionEvent e){
		boss.loseHP(150);
		bitString += "0";
	} };

	Action attackAB= new AbstractAction(){
	public void arcane_blast(ActionEvent e){
		boss.loseHP(200);
		bitString += "0";
	}};

	//Knight
	Action attackDS= new AbstractAction(){
	public void divine_strength(ActionEvent e){
		boss.loseHP(100);
		bitString += "0";
	}};
	Action attackHoW= new AbstractAction(){
	public void hammer_of_wrath(ActionEvent e){
		boss.loseHP(150);
		bitString += "0";
	}};

	Action attackDes= new AbstractAction(){
	public void desperate_stand(ActionEvent e){
		boss.loseHP(200);
		bitString += "1";
	}};



	public String battle(Character player, Dragon boss){
		int attack;
		bitString = "";
		while(boss.getHp() > 0){

			



		}

	}

}