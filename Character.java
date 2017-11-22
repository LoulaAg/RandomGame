public class Character{
	String name;
	private int health;
	private int maxhealth;

	public Character(String s, int hp){
		name = s;
		health= hp;
		maxhealth = hp;
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

	public int maxHP(){
		return maxhealth;
	}
}