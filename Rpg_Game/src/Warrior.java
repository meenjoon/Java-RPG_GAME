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
//		System.out.println("1���� �⺻���� 2���� ��ų���� 3���� �������� �Դϴ�.");
//		int x = scanner.nextInt();
//		if(x == 1) {
//			monster.hp = monster.hp - me.power + monster.defense;
//			System.out.println(me.name + " �������� " + me.power + " �Դϴ�.");	
//			System.out.println(monster.name + "���� " + me.power-monster.defense + "��ŭ�� �������� �־� " + monster.hp );
		}
	
	public void getexp(Monster monster ,Warrior me) {
		me.exp = me.exp + monster.exp;
		me.explimit = me.level * 100;
		me.money = me.money + monster.money;
		System.out.println();
		System.out.println(monster.money + "�� ��带 ȹ���Ͽ����ϴ�. ������ : " + me.money);
		System.out.println(monster.exp + "�� ����ġ�� ȹ���ϼ̽��ϴ�(" + me.level +"LV("+me.exp+"/"+me.explimit +"))" );
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
			
			
			System.out.println("�������Ͽ� ���� ������ " + me.level + " �Դϴ�.");
			System.out.println("ü��+30 ���� +30  �� +30 ���� +30 ��ų����Ʈ +1 �Ǿ����ϴ�.");
			System.out.println("���� ����) ü�� : " + me.maxhp + " ���� : " + me.maxmp + " �� : " + me.power + " ���� : " + me.defense + " ��ų����Ʈ : " + me.skillpoint );
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
