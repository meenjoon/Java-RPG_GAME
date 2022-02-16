import java.util.Scanner;

public class Warrior extends Job {
	String name;
	int hp;
	int maxhp;
	int mp;
	int maxmp;
	String skill;
	int skillpoint;
	int level;
	int exp;
	int explimit;
	int power;
	int defense;
	int money;
	String item[];
	String job;
	int weponmax;
	int armormax;
	
	
	public void attack() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("1번은 기본공격 2번은 스킬공격 3번은 도망가기 입니다.");
//		int x = scanner.nextInt();
//		if(x == 1) {
//			monster.hp = monster.hp - me.power + monster.defense;
//			System.out.println(me.name + " 데미지는 " + me.power + " 입니다.");	
//			System.out.println(monster.name + "에게 " + me.power-monster.defense + "만큼의 데미지를 주어 " + monster.hp );
		}
	
	public void getexp(Monster monster ,Warrior me) {
		me.exp = me.exp + monster.exp;
		me.explimit = me.level * 100;
		me.money = me.money + monster.money;
		System.out.println();
		System.out.println(monster.money + "의 골드를 획득하였습니다. 현재골드 : " + me.money);
		System.out.println(monster.exp + "의 경험치를 획득하셨습니다(" + me.level +"LV("+me.exp+"/"+me.explimit +"))" );
		System.out.println();
		if(me.explimit<=me.exp) {
			me.level++;
			me.skillpoint++;
			
			me.maxhp += 30;
			me.hp = me.maxhp;
			
			me.maxmp += 30;
			me.mp = me.maxmp;
			
			me.power += 10;
			me.defense += 10;
			
			me.exp = me.exp - me.explimit;
			
			
			System.out.println("레벨업하여 현재 레벨은 " + me.level + " 입니다.");
			System.out.println("체력+30 마나 +30  힘 +30 방어력 +30 스킬포인트 +1 되었습니다.");
			System.out.println("현재 정보) 체력 : " + me.maxhp + " 마나 : " + me.maxmp + " 힘 : " + me.power + " 방어력 : " + me.defense + " 스킬포인트 : " + me.skillpoint );
		}
		
	}
	
	
	public void attacked(int totaldamage) {
		if(defense >= totaldamage) {
			hp = hp - 0;
		}
		else
		hp = hp + defense - totaldamage;
	}
	
	public void rest(Warrior me) {

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
