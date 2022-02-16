import java.util.Random;

public class Monster extends Creature {

	int power;
	int defense;
	int hp;
	int mp;
	String name;
	int level;
	int exp;
	int money;
	
	
	public int normalattack() {
		System.out.println(name + " 데미지는 " + power + " 입니다.");
		return power;
	}
	
	public void attacked() {
		
	}
	
	public void itemdrop() {
		
	}
	
	
			
				
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
