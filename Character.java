public class Character{
	public String name;
	private int health;
	private int maxhealth;
	private int power;
	public String type= "";

	public Character(String s, int hp, int pow, String c){
		name = s;
		health= hp;
		maxhealth = hp;
		power= pow;
		this.type= c;
		//System.out.println(instance);
	}

	public String getInst(){
		return this.type;
	}

	public synchronized void loseHP(int dmg){
		health -= dmg;
	}

	public synchronized void gainHP(int hp){
		health +=hp;
	}

	public synchronized int getHP(){
		return health;
	}

	public synchronized int maxHP(){
		return maxhealth;
	}

	public synchronized int getPower(){
		return power;
	}

	public synchronized void gainPower(int pow){
		power+= pow;
	}

	public synchronized void usePower(int pow){
		power-= pow;
	}

	

}