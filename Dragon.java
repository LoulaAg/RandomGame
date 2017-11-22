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