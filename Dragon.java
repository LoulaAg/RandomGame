public class Dragon{

	private int health;

	public Dragon(){
		health = 200;
	}
	public synchronized void loseHP(int dmg){
		health -= dmg;
	}

	public synchronized int getHP(){
		return health;
	}
}