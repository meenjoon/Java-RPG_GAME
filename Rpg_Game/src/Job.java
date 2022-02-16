
public class Job extends Creature{
	String name;
	int hp;
	int mp;
	String skill;
	int skillpoint;
	int level;
	int exp;
	int power;
	int defense;
	int money;

	public int normalattack() {
		System.out.println(name + " 데미지는 " + power + " 입니다.");
		return power;
	}
	
	public void skillattack() {
		
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
