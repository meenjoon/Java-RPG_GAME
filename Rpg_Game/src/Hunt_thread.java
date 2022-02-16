import java.util.Random;


public class Hunt_thread implements Runnable {
	 Warrior me;
	 int a;
	 Monster monster;
	 Skill_individual goblinboss_skills;
	 Map map;
	 boolean stop;
	 Skill_individual nightmare_skills[];

//	 static Music background = new Music("/Users/minbyeongjun/Desktop/java/RPG_game/쓰레드_음악/background.mp3");
	 
//	 static Music monsterattack = new Music("/Users/minbyeongjun/Desktop/java/RPG_game/쓰레드_음악/monsterattack.mp3");
	 Music background;
//	 static Music hunt = new Music("/Users/minbyeongjun/Desktop/java/RPG_game/쓰레드_음악/background.mp3");
	 Music hunt;
//	 Music death = new Music("/Users/minbyeongjun/Desktop/java/RPG_game/쓰레드_음악/death.mp3");
	 Music death;
	 Music monsterattack;
	public Hunt_thread(Warrior me, int a, Monster monster, Skill_individual monster_skills, Map map,  Skill_individual nightmare_skills[],Music hunt, Music death ,Music monsterattack, Music background) {
		super();
		this.me = me;
		this.a = a;
		this.monster = monster;
		this.goblinboss_skills = monster_skills;
		this.map = map;
		this.stop = false;
		this.nightmare_skills = nightmare_skills;
		this.hunt =  hunt;
		this.death = death;
		this.monsterattack = monsterattack;
		this.background = background;
	}
	
	
	
	@SuppressWarnings("deprecation")
	public  void run() {
		if(monsterattack.getState() == Thread.State.NEW) {
			
			
			monsterattack.start();
//			break;
			}
		

		
		
		
		
		while(!stop) {
			try {
				
			Thread.sleep(1300);
			
			
		if( a == 3) { //그 중 몬스터가 고블린 보스 일 경우가 있는데 고블린보스는 기본공격과 스킬공격 둘 다 가지고 있기 때문에 기본공격과 스킬공격 2가지로 나누어서 공격턴을 설정했다.
			Random rand = new Random(System.currentTimeMillis()); // 자바의 랜덤 util을 이용하여 랜덤 객체를 생성한다.
			int w = Math.abs(rand.nextInt(2)+1); // 1,2를 랜덤으로 받아와 1을 받았을때 고블린보스는 기본공격을 / 2를 받았을때 고블린보스는 스킬공격을 하게된다.
			
				if ( w==1) { //고블린 보스의 기본공격 차례일 경우
					
					if(me.defense<monster.power) { //몬스터의 공격력이 나의 방어력보다 쌜 경우
						
					System.out.println("                                                             몬스터의 차례입니다."); 
					
					
					
					me.hp = me.hp - monster.power + me.defense; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
					if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
						me.hp = 0; // 워리어의 피는 0으로 고정한다.
						System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
						System.out.println();
						System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
						System.out.println("                                                             체력과 마나가 1이 되었습니다.");
						me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
						me.mp=1;
						hunt.stop();
						death.start();
						death.sleep(1990);
						death.stop();
						background.resume();
						monsterattack.stop();
//						Thread.sleep(2000);
						
						
						
						break;
				//		map.mapshow(); //다시 메인메뉴로 돌아간다.
//						break;
					}
					else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다.
					System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
					System.out.println();
					}
				}
					else if(me.defense>=monster.power) { //나의 방어력이 몬스터의 공격력보다 높을 경우

						System.out.println("                                                             몬스터의 차례입니다."); 
						
						
						
						me.hp = me.hp - 1; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
						if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
							me.hp = 0; // 워리어의 피는 0으로 고정한다.
							System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
							System.out.println();
							System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
							System.out.println("                                                             체력과 마나가 1이 되었습니다.");
							me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
							me.mp=1;
							hunt.stop();
							death.start();
							death.sleep(1990);
							death.stop();
							background.resume();
							monsterattack.stop();
							Thread.sleep(2000);
							
							break;
						//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//							break;
						}
						else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다. 하지만 나의 방어력이 높기에 1만 깎인다.
						System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
						System.out.println();
						}
					
						
					}
				}
				else if (w==2){ //고블린 보스의 스킬공격 차례일 경우
					
					if(me.defense<goblinboss_skills.skilltotal) {
					
//					System.out.println("몬스터의 차례입니다.");
					 //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
					monster.mp = monster.mp - goblinboss_skills.mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
					if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
						System.out.println("                                                             몬스터의 차례입니다.");
						
						
						me.hp = 0;
						System.out.println("                                                             몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
								+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
						System.out.println();
						System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
						System.out.println("                                                             체력과 마나가 1이 되었습니다.");
						me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
						me.mp=1;
						hunt.stop();
						death.start();
						death.sleep(1990);
						death.stop();
						background.resume();
						monsterattack.stop();
//						Thread.sleep(2000);
						
						break;
					//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//						break;
					}
					else if(me.hp>0 ) { //나의 체력이 0이상 일 때
						if(monster.mp>=goblinboss_skills.mpconsume){
							me.hp = me.hp - goblinboss_skills.skilltotal + me.defense;
							System.out.println("                                                             몬스터 차례입니다");
							
							System.out.println("                                                             몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
								+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
						System.out.println("                                                             남은 몬스터 mp : " + monster.mp);
						System.out.println();
						}
						else {
							me.hp = me.hp - monster.power + me.defense;	
							System.out.println("                                                             몬스터 차례입니다");
							System.out.println();
						System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
						System.out.println();
							
						}
					}
				}
					
					else if(me.defense>=goblinboss_skills.skilltotal) {

						System.out.println("                                                             몬스터의 차례입니다.");
						
						me.hp = me.hp - 1; //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
						monster.mp = monster.mp - goblinboss_skills.mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
						if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
							me.hp = 0;
							System.out.println("                                                             몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
									+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
							System.out.println();
							System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
							System.out.println("                                                             체력과 마나가 1이 되었습니다.");
							me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
							me.mp=1;
						//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//							break;
							hunt.stop();
							death.start();
							death.sleep(1990);
							death.stop();
							background.resume();
							monsterattack.stop();
//							Thread.sleep(2000);
							
							break;
						}
						else { //나의 체력이 0이상 일 때
							System.out.println("                                                             몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
									+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
		
						}
					
					
					}
					
				}
					
			}
			
		
		if( a == 4) { //그 중 몬스터가 고블린 보스 일 경우가 있는데 고블린보스는 기본공격과 스킬공격 둘 다 가지고 있기 때문에 기본공격과 스킬공격 2가지로 나누어서 공격턴을 설정했다.
			Random rand = new Random(System.currentTimeMillis()); // 자바의 랜덤 util을 이용하여 랜덤 객체를 생성한다.
			int w = Math.abs(rand.nextInt(2)+1); // 1,2를 랜덤으로 받아와 1을 받았을때 고블린보스는 기본공격을 / 2를 받았을때 고블린보스는 스킬공격을 하게된다.
			
				if ( w==1) { //고블린 보스의 기본공격 차례일 경우
					
					if(me.defense<monster.power) { //몬스터의 공격력이 나의 방어력보다 쌜 경우
						
					System.out.println("                                                             몬스터의 차례입니다."); 
					
					me.hp = me.hp - monster.power + me.defense; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
					if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
						me.hp = 0; // 워리어의 피는 0으로 고정한다.
						System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
						System.out.println();
						System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
						System.out.println("                                                             체력과 마나가 1이 되었습니다.");
						me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
						me.mp=1;
						hunt.stop();
						death.start();
						death.sleep(1990);
						death.stop();
						background.resume();
						monsterattack.stop();
//						Thread.sleep(2000);
						
						break;
				//		map.mapshow(); //다시 메인메뉴로 돌아간다.
//						break;
					}
					else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다.
					System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
					System.out.println();
					}
				}
					else if(me.defense>=monster.power) { //나의 방어력이 몬스터의 공격력보다 높을 경우

						System.out.println("                                                             몬스터의 차례입니다."); 
						
						me.hp = me.hp - 1; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
						if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
							me.hp = 0; // 워리어의 피는 0으로 고정한다.
							System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
							System.out.println();
							System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
							System.out.println("                                                             체력과 마나가 1이 되었습니다.");
							me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
							me.mp=1;
							
							hunt.stop();
							death.start();
							death.sleep(1990);
							death.stop();
							background.resume();
							monsterattack.stop();
//							Thread.sleep(2000);
							
							break;
						//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//							break;
						}
						else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다. 하지만 나의 방어력이 높기에 1만 깎인다.
						System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
						System.out.println();
						}
					
						
					}
				}
				else if (w==2){ //나이트메의 스킬공격 차례일 경우
					Random rands = new Random(System.currentTimeMillis()); // 자바의 랜덤 util을 이용하여 랜덤 객체를 생성한다.
					int e = Math.abs(rands.nextInt(3)+1); // 1,2를 랜덤으로 받아와 1을 받았을때 고블린보스는 기본공격을 / 2를 받았을때 고블린보스는 스킬공격을 하게된다.
					
					if(e==1) {
					
					if(me.defense<nightmare_skills[0].skilltotal) {
					
//					System.out.println("몬스터의 차례입니다.");
					 //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
					 //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
					if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
						monster.mp = monster.mp - nightmare_skills[0].mpconsume;
						System.out.println("                                                             몬스터의 차례입니다.");
						
						me.hp = 0;
						System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[0].name+ " 로 인해 " 
								+  nightmare_skills[0].skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
						System.out.println();
						System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
						System.out.println("                                                             체력과 마나가 1이 되었습니다.");
						me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
						me.mp=1;
						
						hunt.stop();
						death.start();
						death.sleep(1990);
						death.stop();
						background.resume();
						monsterattack.stop();
//						Thread.sleep(2000);
						
						break;
					//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//						break;
					}
					else if(me.hp>0 ) { //나의 체력이 0이상 일 때
						if(monster.mp>=nightmare_skills[0].mpconsume){
							monster.mp = monster.mp - nightmare_skills[0].mpconsume;
							me.hp = me.hp - nightmare_skills[0].skilltotal + me.defense;
							System.out.println("                                                             몬스터 차례입니다");
							
							System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[0].name+ " 로 인해 " 
								+  nightmare_skills[0].skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
						System.out.println("                                                             남은 몬스터 mp : " + monster.mp);
						System.out.println();
						}
						else {
							me.hp = me.hp - monster.power + me.defense;	
							System.out.println("                                                             몬스터 차례입니다");
							
						System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
						System.out.println();
							
						}
					}
				}
					
					else if(me.defense>=nightmare_skills[0].skilltotal) {

						System.out.println("                                                             몬스터의 차례입니다.");
						
						me.hp = me.hp - 1; //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
						//고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
						if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
							monster.mp = monster.mp - nightmare_skills[0].mpconsume; 
							me.hp = 0;
							System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[0].name+ " 로 인해 " 
									+  nightmare_skills[0].skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
							System.out.println();
							System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
							System.out.println("                                                             체력과 마나가 1이 되었습니다.");
							me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
							me.mp=1;
						//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//							break;
							hunt.stop();
							death.start();
							death.sleep(1990);
							death.stop();
							background.resume();
							monsterattack.stop();
//							Thread.sleep(2000);
							break;
						}
						else { //나의 체력이 0이상 일 때
							if(monster.mp>=nightmare_skills[0].mpconsume){
							monster.mp = monster.mp - nightmare_skills[0].mpconsume; 
							System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[0].name+ " 로 인해 " 
									+  nightmare_skills[0].skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
		
							System.out.println("                                                             남은 몬스터 mp : " + monster.mp);
							System.out.println();
						}
							else {
								me.hp = me.hp - monster.power + me.defense;	
								System.out.println("                                                             몬스터 차례입니다");
								
							System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
							System.out.println();
								
							}
						}
					
					
					}
					
				}
					
					if(e==2) {
						
						if(me.defense<nightmare_skills[1].skilltotal) {
						
//						System.out.println("몬스터의 차례입니다.");
						 //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
						monster.mp = monster.mp - nightmare_skills[1].mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
						if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
							System.out.println("                                                             몬스터의 차례입니다.");
							
							me.hp = 0;
							System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[1].name+ " 로 인해 " 
									+  nightmare_skills[0].skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
							System.out.println();
							System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
							System.out.println("                                                             체력과 마나가 1이 되었습니다.");
							me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
							me.mp=1;
							
							hunt.stop();
							death.start();
							death.sleep(1990);
							death.stop();
							background.resume();
							monsterattack.stop();
//							Thread.sleep(2000);
							
							break;
						//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//							break;
						}
						else if(me.hp>0 ) { //나의 체력이 0이상 일 때
							if(monster.mp>=nightmare_skills[1].mpconsume){
								me.hp = me.hp - nightmare_skills[1].skilltotal + me.defense;
								System.out.println("                                                             몬스터 차례입니다");
								
								
								
								
								System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[1].name+ " 로 인해 " 
									+  nightmare_skills[1].skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
							System.out.println("                                                             남은 몬스터 mp : " + monster.mp);
							System.out.println();
							}
							else {
								me.hp = me.hp - monster.power + me.defense;	
								System.out.println("                                                             몬스터 차례입니다");
								
							System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
							System.out.println();
								
							}
						}
					}
						
						else if(me.defense>=nightmare_skills[1].skilltotal) {

							System.out.println("                                                             몬스터의 차례입니다.");
							
							me.hp = me.hp - 1; //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
							monster.mp = monster.mp - nightmare_skills[1].mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
							if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
								me.hp = 0;
								System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[1].name+ " 로 인해 " 
										+  nightmare_skills[1].skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
								System.out.println();
								System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
								System.out.println("                                                             체력과 마나가 1이 되었습니다.");
								me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
								me.mp=1;
							//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//								break;
								hunt.stop();
								death.start();
								death.sleep(1990);
								death.stop();
								background.resume();
								monsterattack.stop();
//								Thread.sleep(2000);
								
								break;
							}
							else { //나의 체력이 0이상 일 때
								System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[1].name+ " 로 인해 " 
										+  nightmare_skills[1].skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
			
							}
						
						
						}
						
					}
					
					if(e==3) {
						
						if(me.defense<nightmare_skills[2].skilltotal) {
						
//						System.out.println("몬스터의 차례입니다.");
						 //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
						monster.mp = monster.mp - nightmare_skills[2].mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
						if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
							System.out.println("                                                             몬스터의 차례입니다.");
							
							me.hp = 0;
							System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[2].name+ " 로 인해 " 
									+  nightmare_skills[0].skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
							System.out.println();
							System.out.println("김                                                             홍기가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
							System.out.println("                                                             체력과 마나가 1이 되었습니다.");
							me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
							me.mp=1;
							
							hunt.stop();
							death.start();
							death.sleep(1990);
							death.stop();
							background.resume();
							Thread.sleep(2000);
							monsterattack.stop();
//							
							break;
						//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//							break;
						}
						else if(me.hp>0 ) { //나의 체력이 0이상 일 때
							if(monster.mp>=nightmare_skills[2].mpconsume){
								me.hp = me.hp - nightmare_skills[2].skilltotal + me.defense;
								System.out.println("                                                             몬스터 차례입니다");
								
								System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[2].name+ " 로 인해 " 
									+  nightmare_skills[2].skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
							System.out.println("                                                             남은 몬스터 mp : " + monster.mp);
							System.out.println();
							}
							else {
								me.hp = me.hp - monster.power + me.defense;	
								System.out.println("                                                             몬스터 차례입니다");
								
							System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
							System.out.println();
								
							}
						}
					}
						
						else if(me.defense>=nightmare_skills[2].skilltotal) {

							System.out.println("                                                             몬스터의 차례입니다.");
							
							
							me.hp = me.hp - 1; //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
							monster.mp = monster.mp - nightmare_skills[2].mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
							if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
								me.hp = 0;
								System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[2].name+ " 로 인해 " 
										+  nightmare_skills[2].skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
								System.out.println();
								System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
								System.out.println("                                                             체력과 마나가 1이 되었습니다.");
								me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
								me.mp=1;
							//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//								break;
								hunt.stop();
								death.start();
								death.sleep(1990);
								death.stop();
								background.resume();
								monsterattack.stop();
//								Thread.sleep(2000);
								
								break;
							}
							else { //나의 체력이 0이상 일 때
								System.out.println("                                                             몬스터의 스킬 공격 " +nightmare_skills[2].name+ " 로 인해 " 
										+  nightmare_skills[2].skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
			
							}
						
						
						}
						
					}
					
					
		}
					
			}
		
		
		
			else { //일반 몬스터의 기본공격일 경우
				
				if(me.defense<monster.power) { //몬스터의 공격력이 나의 방어력보다 쌜 경우
				
		
				System.out.println("                                                             몬스터의 차례입니다."); 
				
				me.hp = me.hp - monster.power + me.defense; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
				if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
					me.hp = 0; // 워리어의 피는 0으로 고정한다.
					System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
					System.out.println();
					System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
					System.out.println("                                                             체력과 마나가 1이 되었습니다.");
					System.out.println();
					me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
					me.mp=1;
				//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//					map.mapshow();
//					System.out.println(me.hp + " @@@ " + me.mp); 
					
//					map.mapshow();
					
//					stop=true;
					hunt.stop();
					death.start();
					death.sleep(1990);
					death.stop();
					background.resume();
					monsterattack.stop();
//					Thread.sleep(2000);
					
//					map.mapshow();
//					map.mapshow();
//					System.exit(0);
					
//					while (!Thread.interrupted()) {
//						System.out.println(" 끝  ");
//						break;
//					}
			
				//	stop = true;
					break;
//					stop = true;
//					break;
					
					
				}
				else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다.
				System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
				System.out.println();
				}
			}
				else if(me.defense>=monster.power) { //나의 방어력이 몬스터의 공격력보다 높을 경우

					System.out.println("                                                             몬스터의 차례입니다."); 
					
					me.hp = me.hp - 1; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
					if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
						me.hp = 0; // 워리어의 피는 0으로 고정한다.
						System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
						System.out.println();
						System.out.println("                                                             김홍기가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
						System.out.println("                                                             체력과 마나가 1이 되었습니다.");
						me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
						me.mp=1;
						hunt.stop();
						death.start();
						death.sleep(1990);
						death.stop();
						background.resume();
						monsterattack.stop();
//						Thread.sleep(2000);
						
						break;
					//	map.mapshow(); //다시 메인메뉴로 돌아간다.
//						break;
//						stop = true;
					}
					else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다. 하지만 나의 방어력이 높기에 1만 깎인다.
					System.out.println("                                                             몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
					System.out.println();
					}
				
					
				}
			}
		
		
		
//			Thread.sleep(1000);
//			System.out.println("ddddddddddddd");
		if(me.hp<=1 || monster.hp <=1)
		{
			hunt.stop();
			monsterattack.stop();
		}
		
		
		
			
			}
			
		catch (Exception e) {
//			System.out.println(e);
			return;
		}
		
		
		
		}
		
	}
	
	public void Stop(boolean stop) {
		this.stop = stop;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Huntthread h2 = new Huntthread(me,  a,  monster,  monster_skills, map );
//		h2.start( me,  a,  monster,  monster_skills ,  map);@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//		}
//		System.out.println(a);
//		System.out.println(me.hp);

		
	}

	

	
}
