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
	Character player;
	Dragon boss;
	static String bitString;
	static GamePanel comp;
	//JComponent comp;
	private JLabel message = new JLabel("CHANGE WITH KEY EVENTS", SwingConstants.CENTER);
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
			boss.loseHP(100);
			bitString += "1";
		}};

		Action attackFN = new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(150);
			bitString += "0";
		} };

		//AcraneBlast

		Action attackAB= new AbstractAction(){
		@Override
		public void actionPerformed(ActionEvent e){
			boss.loseHP(200);
			bitString += "0";
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

		message.getInputMap(JPanel.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_1, 0),
                            "basic");
		message.getActionMap().put("basic",
	                             basic_attack);

		message.getInputMap(WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0),
                            "healthRegen");
		message.getActionMap().put("healthRegen",
                             regen);

		/*Set up Key bindings */
		if (player instanceof Mage){
			
			message.getInputMap(WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "FlameStrike");
			message.getActionMap().put("FlameStrike",
	                             attackFS);
			message.getInputMap(WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "FrostNova");
			message.getActionMap().put("FrostNova",
	                             attackFN);
			message.getInputMap(WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "ArcaneBlast");
			message.getActionMap().put("ArcaneBlast",
	                             attackAB);
			Mage.intro();

		}
		if (player instanceof Knight){
			
			message.getInputMap(WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "DivineStrength");
			message.getActionMap().put("DivineStrength",
	                             attackDS);
			message.getInputMap(WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "HammerOfWrath");
			message.getActionMap().put("HammerOfWrath",
	                             attackHoW);
			message.getInputMap(WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "DesperateStand");
			message.getActionMap().put("DesperateStand",
	                             attackDes);
			Knight.intro();

		}/*
		if (play instanceof Ranger){
			
			message.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "healthRegen");
			message.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			message.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "healthRegen");
			message.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			message.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "healthRegen");
			message.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			Ranger.intro();

		}
		if (play instanceof Druid){
			
			message.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "healthRegen");
			message.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			message.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "healthRegen");
			message.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			message.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "healthRegen");
			message.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			Druid.intro();

		}
		if (play instanceof Brawler){
			
			message.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),
	                            "healthRegen");
			message.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			message.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),
	                            "healthRegen");
			message.getActionMap().put("healthRegen",
	                             play.gainHP(150));
			message.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),
                            "healthRegen");
			message.getActionMap().put("healthRegen",
	                             play.gainHP(150));
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
		
		f.setSize(200,100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

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
