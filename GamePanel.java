import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JComponent;
import javax.swing.InputMap;
import javax.swing.ActionMap;
import javax.swing.Action;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;


public class GamePanel extends JPanel
{
	static Character player;
	static Dragon boss;
	static String bitString;
	static GamePanel comp;
	//JComponent comp;
	private JLabel message = new JLabel("Dragon Fight!", SwingConstants.CENTER);
	public GamePanel(Character play, Dragon dragoon)
	{
		this.add(message);
		this.setupKeyShit();
		player= play;
		boss= dragoon;
		bitString = "";
		//comp= jcomp;
	}
	
	public void setupKeyShit()
	{

		Action basic_attack = new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e){
				boss.loseHP(50);
				bitString += "1";
				System.out.println("Basic Attack!");
				message.setText("Dragon's Health: " + boss.getHP());
				//this.add(message); 
			}
		};
	    Action regen = new AbstractAction(){
	    	@Override
	        public void actionPerformed(ActionEvent e){
	            if(player.getHP() <= (player.maxHP()/2)){
	                bitString += "1";
	            }
	            else{
	                bitString += "0";
	            }
	            player.gainHP(75);
	        }
	    };

		//Mage
		Action attackFS= new AbstractAction(){
		@Override	
		public void actionPerformed(ActionEvent e){
			if(player.getPower()> 10){
				boss.loseHP(100);
				player.usePower(10);
			}
			bitString += "0";
		}};

		Action attackFN = new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			if(player.getPower()> 20){
				boss.loseHP(250);
				player.usePower(20);
			}
			bitString += "0";
		} };

		//AcraneBlast

		Action attackAB= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			if(player.getPower()> 50){
				boss.loseHP(600);
				player.usePower(50);
			}
			bitString += "1";
		}};

		//Knight
		//Divine Strength
		Action attackDS= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(100);
			bitString += "0";
		}};

		//Hammer of Wrath
		Action attackHoW= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(150);
			bitString += "0";
		}};

		//Desperate Stand
		Action attackDes= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(200);
			bitString += "1";
		}};

		//Ranger

		Action attackDSh= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(150);
			bitString += "0";
		}};


		Action attackFoK= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(150);
			bitString += "0";
		}};

		Action attackCOTW= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(200);
			bitString += "1";
		}};

		//DRUID

		Action attackSW= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(100);
			System.out.println("SolarWrath");
			bitString += "0";
		}};

		Action attackLS= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(150);
			bitString += "0";
		}};

		Action attackSF= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(200);
			bitString += "1";
		}};

		//BRAWLER

		Action attackFSK= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(100);
			bitString += "0";
		}};

		Action attackWDP= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(150);
			bitString += "0";
		}};

		Action attackMS= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(200);
			bitString += "1";
		}};


		message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_1, 0),
                            "basic");
		message.getActionMap().put("basic",
	                             basic_attack);

		message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0),
                            "healthRegen");
		message.getActionMap().put("healthRegen",
                             regen);
		/*Set up Key bindings */
		//System.out.println(player.getInst());
		
		//if (player.getInst().equals("MAGE")){
			
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "FlameStrike");
			message.getActionMap().put("FlameStrike",
	                             attackFS);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "FrostNova");
			message.getActionMap().put("FrostNova",
	                             attackFN);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "ArcaneBlast");
			message.getActionMap().put("ArcaneBlast",
	                             attackAB);
			//Mage.intro();

		/*}
		if (player.getInst().equals("KNIGHT")){
			
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "DivineStrength");
			message.getActionMap().put("DivineStrength",
	                             attackDS);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "HammerOfWrath");
			message.getActionMap().put("HammerOfWrath",
	                             attackHoW);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "DesperateStand");
			message.getActionMap().put("DesperateStand",
	                             attackDes);
			Knight.intro();

		}
		if (player.getInst().equals("RANGER")){
			
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "DeadlyShot");
			message.getActionMap().put("DeadlyShot",
	                             attackDSh);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "FanOfKnives");
			message.getActionMap().put("FanOfKnives",
	                             attackFoK);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "CallOfTheWild");
			message.getActionMap().put("CallOfTheWild",
	                             attackCOTW);
			Ranger.intro();

		}
		//System.out.println(player getInstof Druid);
		if (player.getInst().equals("DRUID")){
			
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "SunWrath");
			message.getActionMap().put("SunWrath",
	                             attackSW);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "LunarStrike");
			message.getActionMap().put("LunarStrike",
	                             attackLS);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "StarFall");
			message.getActionMap().put("StarFall",
	                             attackSF);
			Druid.intro();

		}
		if (player.getInst().equals("BRAWLER")){
			
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "FlyingSerpeantKick");
			message.getActionMap().put("FlyingSerpeantKick",
	                             attackFSK);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "WhirlingDragonPunch");
			message.getActionMap().put("WhirlingDragonPunch",
	                             attackWDP);
			message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "MortalStrike");
			message.getActionMap().put("MortalStrike",
	                             attackMS);
			Brawler.intro();

		}*/
			//Generic
		
		}
	
	public void setMessage(String m)
	{
		message.setText(m);
		message.paintImmediately(message.getVisibleRect());
	}
	
	public static String setup(Character play, Dragon dragoon)
	{
		JFrame f = new JFrame();
		comp = new GamePanel(play, dragoon);
		
		f.add(comp);
		
		f.setSize(800,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		System.out.println("Here");
		RandomGame.battle(player, boss);
		System.out.println(bitString);
		return bitString;
	}
	/*
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		GamePanel l = new GamePanel();
		
		f.add(l);
		
		f.setSize(200,100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	} */
}
