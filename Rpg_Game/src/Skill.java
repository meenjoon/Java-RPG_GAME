import java.util.Scanner;

public class Skill {

	
	Skill_individual warrior_skills[] = new Skill_individual[3];
	
	public Skill() {
		warrior_skills[0] = new Skill_individual("���ǽ���", 0 , 0 , 5, 3, 5 );
		warrior_skills[1] = new Skill_individual("�����ĵ�", 0 , 0 , 10, 5, 10 );
		warrior_skills[2] = new Skill_individual("ȫ��'s �пջ�", 0 , 0 , 20, 10, 30 );	
	}
	
	public void skill_show_learn(Warrior me, Map map) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("���� ��ų����Ʈ�� " + me.skillpoint + "�Դϴ�.");
			for(int i=0; i<warrior_skills.length; i++) {
				System.out.println(i+1 + ". " + warrior_skills[i].name + " +" + warrior_skills[i].skilllevel);
			}
			System.out.println("��ų ���� ��ȣ�� �Է��ϰų� �ڷ� ���÷��� 4�� �Է��ϼ���.\n");
			int n = scanner.nextInt();
			
				if(n-1 == 0) {
					if(me.level >= warrior_skills[0].skilllimit && me.skillpoint >= 1) {
						warrior_skills[0].skilllevel += 1;
						warrior_skills[0].skilllimit += 1;
						me.skillpoint -= 1;
						for(int i=0; i<warrior_skills.length; i++) {
							System.out.println(warrior_skills[i].name + " +" + warrior_skills[i].skilllevel);
						}
					}
					else {
						System.out.println("���� ���ų� ��ų����Ʈ�� �����մϴ�.");
						
					}
				}
				if(n == 2) {
					if(me.level >= warrior_skills[1].skilllimit && me.skillpoint >= 1) {
						warrior_skills[1].skilllevel += 1;
						warrior_skills[1].skilllimit += 1;
						me.skillpoint -= 1;	
						for(int i=0; i<warrior_skills.length; i++) {
							System.out.println(warrior_skills[i].name + " +" + warrior_skills[i].skilllevel);
						}
					}
					else {
						System.out.println("���� ���ų� ��ų����Ʈ�� �����մϴ�.");

					}	
				}
				if(n == 3) {
					if(me.level >= warrior_skills[2].skilllimit && me.skillpoint >= 1) {
						warrior_skills[2].skilllevel += 1;
						warrior_skills[2].skilllimit += 1;
						me.skillpoint -= 1;	
						for(int i=0; i<warrior_skills.length; i++) {
							System.out.println(warrior_skills[i].name + " +" + warrior_skills[i].skilllevel);
						}
					}
					else {
						System.out.println("���� ���ų� ��ų����Ʈ�� �����մϴ�.");

					}
				}
				if(n == 4 ) {
					map.mapshow();
					break;
				}
			}
				
	}
	public void skilldamage(Warrior me, Monster monster, Skill skill, Map map) {
		
		Scanner scanner = new Scanner(System.in);
//		for(int i = 0; i<skills.length; i++) {
//			if(skills[i].skilllevel>0) {
//				System.out.println(i+1 + " "+skills[i].name);
//				skills[i].skilltotal = me.level * skills[i].skillincre;
//			}
//		}

		
		int c = scanner.nextInt();
		
		if(me.mp > warrior_skills[0].mpconsume && c == 1 && warrior_skills[0].skilllevel>0 && monster.hp > 0) {
			monster.hp = monster.hp - warrior_skills[0].skilltotal + monster.defense;
			System.out.println(me.name + "��ų �������� " + warrior_skills[0].skilltotal + " �Դϴ�.");
			System.out.println(monster.name + "���� " + (warrior_skills[0].skilltotal-monster.defense) + "��ŭ�� �������� �־� " +
					monster.name + "��" +monster.hp  + "�� ���ҽ��ϴ�.");
//			return skills[0].skilltotal;
		}
		else {
			System.out.println(monster.name + "�� óġ �Ͽ����ϴ�.");
			System.out.println("���θ޴� â���� ���ư��ڽ��ϴ�.");
			map.mapshow();
		}
		if(me.mp > warrior_skills[1].mpconsume && c == 2 && warrior_skills[1].skilllevel>0 && monster.hp > 0) {
			
			monster.hp = monster.hp - warrior_skills[1].skilltotal + monster.defense;
			System.out.println(me.name + "��ų �������� " + warrior_skills[1].skilltotal + " �Դϴ�.");
			System.out.println(monster.name + "���� " + (warrior_skills[1].skilltotal-monster.defense) + "��ŭ�� �������� �־� " +
					monster.name + "��" +monster.hp  + "�� ���ҽ��ϴ�.");
//			return skills[1].skilltotal;
		}
		else {
			System.out.println(monster.name + "�� óġ �Ͽ����ϴ�.");
			System.out.println("���θ޴� â���� ���ư��ڽ��ϴ�.");
			map.mapshow();
		}
		
		if(me.mp > warrior_skills[2].mpconsume &&c == 3 && warrior_skills[2].skilllevel>0 && monster.hp > 0) {
			monster.hp = monster.hp - warrior_skills[0].skilltotal + monster.defense;
			System.out.println(me.name + "��ų �������� " + warrior_skills[2].skilltotal + " �Դϴ�.");
			System.out.println(monster.name + "���� " + (warrior_skills[2].skilltotal-monster.defense) + "��ŭ�� �������� �־� " +
					monster.name + "��" +monster.hp  + "�� ���ҽ��ϴ�.");
//			return skills[2].skilltotal;
		}
		else {
			System.out.println(monster.name + "�� óġ �Ͽ����ϴ�.");
			System.out.println("���θ޴� â���� ���ư��ڽ��ϴ�.");
			map.mapshow();
		}
//		else if( monster.hp < 0)
//				System.out.println(monster.name + "�� óġ �Ͽ����ϴ�.");
//				System.out.println("���θ޴� â���� ���ư��ڽ��ϴ�.");
//				map.mapshow();
				
			
		
//		return c;
		
	}
	public void skillshow(Warrior me, Map map) {
		boolean learn = false;
		for(int i = 0; i<warrior_skills.length; i++) {
			if(warrior_skills[i].skilllevel>0) {
				learn = true;
				System.out.println(i+1 + " "+warrior_skills[i].name);
				
			}
			
			
			
//			else {
//				System.out.println("����Ͻ� ��ų�� �����ϴ�");
//
//				break;
//			}
//			skills[i].skilltotal = me.level * skills[i].skillincre;
//			System.out.println("��밡���� ���ݽ�ų�Դϴ�. ������ ��ų ��ȣ�� �Է��ϼ���.");
		}
		
	}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
