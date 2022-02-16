import java.util.Scanner;

public class Skill {

	
	Skill_individual warrior_skills[] = new Skill_individual[3];
	
	public Skill() {
		warrior_skills[0] = new Skill_individual("불의심판", 0 , 0 , 5, 3, 5 );
		warrior_skills[1] = new Skill_individual("검의파동", 0 , 0 , 10, 5, 10 );
		warrior_skills[2] = new Skill_individual("홍기's 패왕색", 0 , 0 , 20, 10, 30 );	
	}
	
	public void skill_show_learn(Warrior me, Map map) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("현재 스킬포인트는 " + me.skillpoint + "입니다.");
			for(int i=0; i<warrior_skills.length; i++) {
				System.out.println(i+1 + ". " + warrior_skills[i].name + " +" + warrior_skills[i].skilllevel);
			}
			System.out.println("스킬 찍을 번호를 입력하거나 뒤로 가시려면 4를 입력하세요.\n");
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
						System.out.println("렙이 낮거나 스킬포인트가 부족합니다.");
						
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
						System.out.println("렙이 낮거나 스킬포인트가 부족합니다.");

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
						System.out.println("렙이 낮거나 스킬포인트가 부족합니다.");

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
			System.out.println(me.name + "스킬 데미지는 " + warrior_skills[0].skilltotal + " 입니다.");
			System.out.println(monster.name + "에게 " + (warrior_skills[0].skilltotal-monster.defense) + "만큼의 데미지를 주어 " +
					monster.name + "의" +monster.hp  + "가 남았습니다.");
//			return skills[0].skilltotal;
		}
		else {
			System.out.println(monster.name + "을 처치 하였습니다.");
			System.out.println("메인메뉴 창으로 돌아가겠습니다.");
			map.mapshow();
		}
		if(me.mp > warrior_skills[1].mpconsume && c == 2 && warrior_skills[1].skilllevel>0 && monster.hp > 0) {
			
			monster.hp = monster.hp - warrior_skills[1].skilltotal + monster.defense;
			System.out.println(me.name + "스킬 데미지는 " + warrior_skills[1].skilltotal + " 입니다.");
			System.out.println(monster.name + "에게 " + (warrior_skills[1].skilltotal-monster.defense) + "만큼의 데미지를 주어 " +
					monster.name + "의" +monster.hp  + "가 남았습니다.");
//			return skills[1].skilltotal;
		}
		else {
			System.out.println(monster.name + "을 처치 하였습니다.");
			System.out.println("메인메뉴 창으로 돌아가겠습니다.");
			map.mapshow();
		}
		
		if(me.mp > warrior_skills[2].mpconsume &&c == 3 && warrior_skills[2].skilllevel>0 && monster.hp > 0) {
			monster.hp = monster.hp - warrior_skills[0].skilltotal + monster.defense;
			System.out.println(me.name + "스킬 데미지는 " + warrior_skills[2].skilltotal + " 입니다.");
			System.out.println(monster.name + "에게 " + (warrior_skills[2].skilltotal-monster.defense) + "만큼의 데미지를 주어 " +
					monster.name + "의" +monster.hp  + "가 남았습니다.");
//			return skills[2].skilltotal;
		}
		else {
			System.out.println(monster.name + "을 처치 하였습니다.");
			System.out.println("메인메뉴 창으로 돌아가겠습니다.");
			map.mapshow();
		}
//		else if( monster.hp < 0)
//				System.out.println(monster.name + "을 처치 하였습니다.");
//				System.out.println("메인메뉴 창으로 돌아가겠습니다.");
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
//				System.out.println("사용하실 스킬이 없습니다");
//
//				break;
//			}
//			skills[i].skilltotal = me.level * skills[i].skillincre;
//			System.out.println("사용가능한 공격스킬입니다. 공격할 스킬 번호를 입력하세요.");
		}
		
	}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
