
public class Monster_Goblin extends Monster {

	int power;
	int defense;
	int hp;
	int mp;
	String name;
	int level;
	int exp;
	int money;
	String item [];
	
	public int normalattack() {
		System.out.println(name + " 데미지는 " + power + " 입니다.");
		return power;
	}
	
	public void attacked(int totaldamage) {
		if(defense >= totaldamage) {
			hp = hp - 0;
		}
		else
		hp = hp + defense - totaldamage;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
