public class Dragon{

	private int health;

	public Dragon(){
		health = 10000;
	}
	public synchronized void loseHP(int dmg){
		health -= dmg;
		if(health <0 ){
			health = 0;
		}
	}

	public synchronized int getHP(){
		return health;
	}
}