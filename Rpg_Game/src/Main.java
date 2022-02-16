import java.util.Scanner;
import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Main extends Thread  {
//	
	
String typing ;
	

	public Main(String string) {
	
	this.typing = string;
}

	public void run() {
		try {
			  for (int i = 0; i < typing.length(); i++) {
			      Thread.sleep(1);
				  System.out.print( typing.charAt(i) );
			    }
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
//	JLabel blThread;
//	JPanel pnl;
//	JButton btnStart;
////	Timelimit_thread Timelimit_thread = new Timelimit_thread();
////	Timelimit_thread.start();
//	
//	
//	Main() {
//		blThread = new JLabel();
//		pnl = new JPanel();
//		this.add(pnl);
//		pnl.add(blThread);
//		
//		pnl.setPreferredSize(new Dimension(400,300));
//		pnl.setLayout(new FlowLayout(FlowLayout.CENTER));
//		blThread.setPreferredSize(new Dimension(380,90));
//		
//		blThread.setBackground(Color.white);
//		
//		blThread.setOpaque(true);
//		
//		
//		btnStart = new JButton("Start!");
//		btnStart.setPreferredSize(new Dimension(380,40));
//		btnStart.addActionListener(this);
//		pnl.add(btnStart);
//		
//		pack();
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setVisible(true);
//		
//		
//		
//	}

	
	
	
//	Monster monster = new Monster(); //몬스터 클
//
//
//
//	@SuppressWarnings("deprecation")
//	
//	
//	
	
	
	@SuppressWarnings({ "removal", "deprecation" })
	public static void main(String[] args) throws InterruptedException {	
		TimerEx xx = new TimerEx();
		
    	Music background = new Music("background.mp3",true);
    	background.start();
    	
    	
    	
//		Music introMusic = new Music("introMusic.mp3",true);
//		introMusic.start();
//		new Main();
		//		TimeGUI timer = new TimeGUI();
		
		
//		Timelimit_thread Timelimit_thread = new Timelimit_thread();
//		Timelimit_thread.start();
		
		
		int x1 ;
		
		Scanner scanner = new Scanner(System.in);
		
		
		Map map = new Map(); // 1.내정보 보여주기 2.사냥하기 3.휴식 4.스킬창 5.인벤토리 6.상점 맵 정보의 메소드이다.
		
		Inventory inventory = new Inventory();
		
		Item items[] = new Item[11]; //아이템 객체 배열 공간을 만들어 주었다.
		/*만들어준 객체 배열 공간은 이 게임에 사용될 아이템 전체를 넣을 것이고, 이 객체 배열 공간에 매개변수를 넣어 객체를 넣었고 생성자를 이용해 값을 저장해 주었다.
		(String name, int level, int hp ,int mp, int power, int defense, int price, int sellprice, int count, int countmax, int wepon, int armor, int weponspace, int armorspace)
		count는 장착을 위한 공간 변수 이고 countmax는 실질적인 아이템 개수의 변수 이고
		wepon은 무기인지 확인하는 변수이고 armor는 방어구인지 확인하는 변수이다.
		weponspace는 무기 공간은 1개라고 제약을 걸어두기 위한 공간 변수이고, armorspace는 방어구 공간 변수이다.*/
		items[0] = new Item("언데드의 심장",0,0,0,0,0,0,100,0,0,9999,9999,-9999,-9999);
		items[1] = new Item("고블린의 사념",0,0,0,0,0,0,300,0,0,9999,9999,-9999,-9999);
		items[2] = new Item("고블린 대장의 원혼",0,0,0,0,0,0,800,0,0,9999,9999,-9999,-9999);
		
		items[3] = new Item("나무검",3,30,10,30,10,500,200,0,0,1,9999,0,0);
		items[4] = new Item("청동검",8,100,30,50,20,1500,800,0,0,1,9999,0,0);
		items[5] = new Item("무형검",13,300,60,100,50,3000,1500,0,0,1,9999,0,0);
		
		items[6] = new Item("천갑옷",3,100,10,30,20,500,200,0,0,9999,1,0,0);
		items[7] = new Item("청동갑옷",8,200,30,20,50,1500,800,0,0,9999,1,0,0);
		items[8] = new Item("루이비똥 드레스",13,500,60,50,100,3000,1500,0,0,9999,1,0,0);
		
		items[9] = new Item("HP포션",1,100,0,0,0,100,50,0,0,9999,9999,-9999,-9999);
		items[10] = new Item("MP포션",1,0,100,0,0,100,50,0,0,9999,9999,-9999,-9999);
		
		//스킬을 쓰는 몬스터가 있어 스킬 클래스를 이용하여 몬스터스킬 객체를 만들었다.
		Skill_individual goblinboss_skills = new Skill_individual("돌뿌리기", 0 , 100 , 5, 0, 0);
		
		Skill_individual nightmare_skills[] = new Skill_individual[3];
		nightmare_skills[0] = new Skill_individual("불의심판", 1 , 200 , 5, 0, 0 );
		nightmare_skills[1] = new Skill_individual("검의파동", 1 , 300 , 10, 0, 0 );
		nightmare_skills[2] = new Skill_individual("홍기's 패왕색", 1 , 500 , 20, 0, 0 );	
		
		/*스킬 클래스에 대한 객체 배열을 3개 만들어서 그 공간을 캐릭터가 사용할 공간으로 사용하기로 했다.
		만들어준 이 객체 배열 공간에 매개변수를 넣었고 생성자를 이용해 값을 저장해 주었다.
		(String name, int skilllevel, int skilltotal, int mpconsume, int skilllimit,int skillincre)의 매개변수를 넣어준다.
		skillevel은 스킬을 배울때 증가하는 스킬레벨을 저장하는 공간이고, skilltotal은 캐릭터의 힘과 레벨과 skillincre의 증가값을 이용하여 스킬의 총데미지를 저장할 공간이다.
		mpconsume은 스킬을 사용할때 소모되는 마나를 저장하는 공간이고, skilllimit은 스킬을 배울 수 있는 레벨을 저장할 수 있는 공간이고 
		skillincre는 스킬을 배울때 데미지가 일정하게 얼마나 증가하는지의 값이다. */
		Skill_individual warrior_skills[] = new Skill_individual[3];
		warrior_skills[0] = new Skill_individual("불의심판", 0 , 0 , 5, 3, 5 );
		warrior_skills[1] = new Skill_individual("검의파동", 0 , 0 , 10, 5, 10 );
		warrior_skills[2] = new Skill_individual("홍기's 패왕색", 0 , 0 , 20, 10, 30 );	
		
		//캐릭터의 속성을 상속받은 Warrior클래스로부터 me라는 객체를 생성하였다.
		Warrior me = new Warrior();
		//Warrior의 생성자는 별도로 만들어주지 않았고, Warrior라는 클래스로부터 객체를 생성하면 아래의 초기값을 설정해두도록 하였다.
		me.defense=20;
		me.power=30;
		me.level=1;
		me.hp=10000;
		me.maxhp = me.hp;
		me.mp=40;
		me.maxmp = me.mp;
		me.money=1000;
		me.skillpoint=10;
		me.name="신찬식 2세";
		me.job="검사";
		me.weponmax = 0;
		me.armormax = 0;
		
		while(true) {
		
			boolean allstop = false;
			
			if (allstop == true) {
				break;
			}
			
			
			
//		System.out.println("신찬식 2세님 rpg 게임에 오신것을 환영합니다\n");
//		System.out.println("당신은 검사로 선택받았습니다.\n");
		

		
		
//		for(int i=0; i<5; i++) {
//			System.out.println("...");
//		}
//		System.out.println("프롤로그........");
//		// 1을 누르면 프롤로그를 보고 다시 0을 눌러 메인메뉴로 가고 2를 누르면 바로 메인메뉴로 이동하게 된다.
//		System.out.println("프롤로그를 보실려면 1, 스킵하려면 2 를 입력하세요"); 
//		System.out.print(">>");
//		int n = scanner.nextInt();
		
//		if(n == 1) {
			Intro intro = new Intro("\n"
					+ "신찬식 2세님 rpg 게임에 오신것을 환영합니다\n"
					+ "당신은 검사로 선택받았습니다.\n"
					+ "...\n"
					+ "...\n"
					+ "...\n"
					+ "...\n"
					+ "...\n"
					+ "프롤로그........\n"
					
					+ "  신찬식 2세는 아버지인 왕의 말에 따르면 너는 아직 "
					+ "나약하고 엄살이 많다. \n"
					+ "  힘을 키우기 전까지 왕좌를 물려 줄 수 없다...\n  라는"
					+ "말을 듣게 되어 충격을 받아 힘을 키우기 위해 여행을 떠나는데....."
					+ "\n"
					+ "\n"
					);
			
			intro.start();
			Thread.sleep(10900);
			map.mapshow();
//			System.out.println("\n0을 입력하면 게임창으로 이동합니다.");
//			System.out.println("  신찬식 2세 2세는 아버지인 왕의 말에 따르면 너는 아직 "
//					+ "나약하고 엄살이 많다. \n"
//					+ "  힘을 키우기 전까지 왕좌를 물려 줄 수 없다...\n  라는"
//					+ "말을 듣게 되어 충격을 받아 힘을 키우기 위해 여행을 떠나는데.....");
//			System.out.println("\n0을 입력하면 게임창으로 이동합니다.");
//			System.out.print(">> ");
//			int x = scanner.nextInt();
//			if(x==0) {
//				
//				map.mapshow();
//			}
//			else {
//				System.out.println("유효하지 않은 값을 입력하였습니다");
//				System.out.println();
//				continue;
//			}
				
			
//		}
//		if(n == 2) {
//			map.mapshow();
//		}
//		else {
//			System.out.println("유효하지 않은 값을 입력하였습니다");
//			System.out.println();
//			continue;
//		}

		while(true ) {
		 //무한 반복문이다. 즉, 1.내정보 보여주기 2.사냥하기 3.휴식 4.스킬창 5.인벤토리 6.상점 의 맵을 계속해서 오가게 하기 위한 목적이다.
			
			System.out.print(">>");
			int x = scanner.nextInt();
			
			
			if(x == 1) { //제일 큰 while문의 스캐너의 값 1을 눌렀을때 내 정보를 보여주는 코드이다.
				while(true) {
				System.out.println();
				System.out.println("------------------------------------------------------------");	
				System.out.println("현재 당신의 이름은 " + me.name);
				me.explimit = me.level * 100; //레벨업을 할 때 레벨에 따른 경험치의 양을 저장하는 공간 변수를 explimit로 하였고 레벨 * 100이라 설정하였다.
				if(me.exp>0)
					System.out.println("현재 당신의 레벨/경험치 " + me.level +"LV("+me.exp+"/"+me.explimit +")");
				else
					System.out.println("현재 당신의 레벨/경험치는 " +  me.level +"LV("+"0" + "/" +me.explimit+")");
				//현재 hp는 hp 변수로 설정하였고, 최대 hp는 maxhp 변수로 설정하였다. (마나도 마찬가지다)
				System.out.println("현재 당신의 hp는 " + me.hp+"/"+me.maxhp);
				System.out.println("현재 당신의 mp는 " + me.mp+"/"+me.maxmp);
				System.out.println("현재 당신의 힘은 " + me.power);
				System.out.println("현재 당신의 방어력은 " + me.defense);
				
				//돈이 0보다 많으면 그대로 출력 0이거나 0보다 작을때는 0골드를 출력한다.
				if(me.money>0) 
					System.out.println("현재 당신의 돈은 " + me.money+"골드");
				else
					System.out.println("현재 당신의 돈은 " + "0골드" );
				
				System.out.print("현재 당신이 가진 스킬 : "); //현재 사용 가능한 스킬 목록을 보여준다.
				for(int i = 0; i<warrior_skills.length; i++) { //Warrior_skills 객체 배열의 공간수 만큼 반복문을 돌린다.
					if(warrior_skills[i].skilllevel>0) { //그 중에서 skilllevel 이 0보다 큰 수만 추출한다. 그 이유는 스킬을 배우게 되면 skilllevel이 올라 0보다 크기 때문이다.
						
						System.out.print(warrior_skills[i].name + " ");
					}
					
				}
				System.out.println();
				System.out.println("현재 당신의 스킬포인트는 " + me.skillpoint); // 스킬을 배울 수 있는 스킬포인트이다.
				System.out.println("------------------------------------------------------------");
				System.out.println("0을 누르면 메인메뉴로 이동합니다. " );
				System.out.print(">>");
				int z = scanner.nextInt();
				
				if(z == 0) { //0을 누르면 1.내정보 보여주기 2.사냥하기 3.휴식 4.스킬창 5.인벤토리 6.상점의 맵을 가지고 있는 메소드로 가게 된다.
					map.mapshow();
					break;
				}
			
			}
		}
			if(x == 2) { //제일 큰 while문의 스캐너의 값 2를 눌렀을때 샤낭터에 들어가서 사냥을 하는 코드이다.
				
				background.suspend();
				
				Main ending = new Main("████████████████████████████████████████▓▓██████████████▓▓██████████████▒█████████████████████████▓\r\n"
						+ "▓████████████████████████████████████████▓▒▓████▓▓▓▓████▓▒█████████████████████████████████████████▓\r\n"
						+ "▓█████████████████████████████████████████▒▒▓▓▓▓▒▒░▒▓▓▓▓▒▒█████████████████████████████████████████▓\r\n"
						+ "▓██████████████████▓██████████████████████▓▒▒░▒▓▒▒░▒▓▒▒▒▒▓█████████████████████████████████████████▓\r\n"
						+ "▓██████████████████████████████████████████▓▒▒▒▓▒▒▓▒▓▒▒▒▓██████████████████████████████████████████▓\r\n"
						+ "▓████▓██████████████████████████████████████▓▓▓▓▓▓█▓▓▒▓████████████████████████████████████████████▓\r\n"
						+ "▓███████████▒▓█████████████████████████████████▓▒▓▓▒▓██████████████████████████████████████████████▓\r\n"
						+ "▓███████████▒███████████▓██████████████████████▓▒▒▒▒▓██████████████████████████████████████████████▓\r\n"
						+ "▓███████████████████████████████████████████████▓▒▒▓███████████████████████████████████████████████▓\r\n"
						+ "▓████████▒▓██████████████████████████████████████████▓█████████▓▓██████████████████████████████▓███▓\r\n"
						+ "▓████████████████████████████████████████████████████▓▓████████████████████████████████████████████▓\r\n"
						+ "▓█████████████████████▓███▓▓▓▓▓█████▓██▓███▓█▓███▓▓▓█▓███████▓▓▓████████▓▓▓█▓█▓████████████████████▓\r\n"
						+ "▓███████████████████▒─░░░░░░░░░░░██░─░░░░░░░░░▒██─░░░░██████░░░░░▓██─░░░░░░░░░░░▓██████████████████▓\r\n"
						+ "▓██████████████████▒░─░░─░░░░░─░░█░░░░░─░░─░░░░▒█░─░─░░▓███░░░─░░▓▓░─░░░───░░──░▓██████████████████▓\r\n"
						+ "▓██████▓███████████▒░░────░░░──░░█░░░░░─────░──░█░░──░░░▓█▒░░──░░▓▓░░░░░░──░░──░▓██████████████████▓\r\n"
						+ "▓██████████████████░░───░░░░░░─░░█░░░──░░░░─░░░░█░───░░░░▒░░░──░░▓▓░░░─░░░░░░░░░▓███████▓██████████▓\r\n"
						+ "▓██████████████████▒░░──▒▒░░░░░░▒█░░───▒▒▒░░░░░░█░─░░─░░░─░░░─░░░▓▓░░──░░░░░▒▒▒▒▓██████████████████▓\r\n"
						+ "▓██████████████████░───░██████████░───░███▓░░─░░█░─░──░░░─░░──░─░▓▓───░▒███████████████████████████▓\r\n"
						+ "▓██████████████████░─░░░█▒░░░░░▒██░░──░░░░░░░─░░█░────░░──░▒──░─░▓▓─░░░░░░░▓███████████████████████▓\r\n"
						+ "▓██████████████████░─░░░█▒─░─░░░░█░░░─░────░░░░░█░─░──▓▒░░░▓░░░░░▓▓─░░─░░─░▓████████▓██████████████▓\r\n"
						+ "▓██████████████████▒─░░░█▒░░░░─░░█░░░░░░░░░░░─░░█░░░░░▓▓▒░▓█░░░░░▓▓░░░░░░░░▓███████▒▒▓█░▒█▒▓█▓█████▓\r\n"
						+ "▓██████████████████░░░░░▓▓▒▒░░─░░█░─░░░▒▒▒▒░░─░░█░░░░░██▓▒██░░░░░▓▓─░──░▒▒▒█▓██▓███▒░▒▓░▒█▒▒▓▓█████▓\r\n"
						+ "▓██████████████████░░░░░▓██▓░──░░█░─░░░███▓░░─░░█░░░░░██████░░░░░▓▓──░─▒▓▓█████▓████▓██▓██▓████████▓\r\n"
						+ "▓██████████████████░─░░░░░░░░░─░░█░░░─░███▓░░─░░█░─░─░██████░░░░░▓▓─░─░░░░░░░░░░▓██████████████████▓\r\n"
						+ "▓██████▓▓██████████░─░──░░░────░░█░░──░███▓░░─░░█░───░██████░░░░░▓▓░─░░░░░░─░─░░███████▒▒▒▒▒▒▒▒▒▒▒▓▒\r\n"
						+ "▓█████░░░░█████████▒░────░░░░─░░░█░░░─░███▓░░░░▒█░──░░██████░░─░░▓▓░░░░░░░░──░─░▓██████▒▒▒▓▒▒▓▒▒▒▒▓▒\r\n"
						+ "▓████▓░░▒░█████████▓▒░░░░░░░░░░░▒█░░░░░███▓░──░▒█░░░░░█▓████░░░░░▓▓▒░─░░──░─░░░░▓██████▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n"
						+ "▓█████▒░░▓██████████▓▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▓██▓▒▒▒▒▒█▒▒▒▒▒██████▒▒▒▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▓██████▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n"
						+ "▓███████▒▓█████████████████████████████████████████████▓███████████████████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n"
						+ "▓████████████████████████████████████████████████████████████████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓█▓▓\r\n"
						+ "▓███████▓▓▓▓█████████████████████████████████████████████████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█████▓\r\n"
						+ "▓███████▓▒▒▒███████████████████████▓█▓██▓███▓███▓██▓▓████████████████████▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█████▓\r\n"
						+ "▓███████▓░░▒████████████████████░─░░░░▓░▒─█░▒██▓░░░░─▓░░░░█─█▒░░▒▓─██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████▓\r\n"
						+ "▓██████▓░░░░▒███████████████████▒░░▒░░▒░█░▒▒▒██▓░░░░─▓▓▓▒░█─█░▒▒░▓░██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█████▓\r\n"
						+ "▓██████▒▒▒░░░████████████████████░░░░░▓░▒░▓░▒██▓▓▓▓▒░▓▒░░░█░█░▓▓░░░██████████▓█▓██▓█▓█▓▓▓▓█▓███████▓\r\n"
						+ "▓██████▒▒▒▒░▒████████████████████░░░░░█▓▓█▓▓▓██▓▒▒▒▒▒▓░░░░█░█░▓▓░▒─████████████████████████████████▓\r\n"
						+ "▓██████▒▒▒░░░███████████████████▒░█▒░░▓░░▒▒░▒██▓░░▒░─▓░░▓▓█░█░▒▒░▓░████████████████████████████████▓\r\n"
						+ "▓█▓▓▓▓▓▓▒▒▒▒▓▓██████████████████░██▒░░▓░░▒░░▒██▓─░░░░▓░░░░▒░▓▒░░▒▓░████████████████████████████████▓\r\n"
						+ "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██████████████████████▓█▓▓█▓▓████▓▓▓▓▓███▓▓█▓██████▒████████████████████████████████▓\r\n"
						+ "▒▒▒▒▒▒▒▒▒▒▒░░░▓█████████████████████████████▓█▓█▓█▓▓███████████████████████████████████████████████▓\r\n"
						+ "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████████████████████████▓▓▓▓▓▓▓█▓▓█▓▓▓▓▓█████████████████████████████████████████▓\r\n"
						+ "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████████████████████████████▓▓▓▓▓▓█▓▓▓▓▓▓▓▓███████████████████████████████▓▓▓▓▓▓▓▓▓▓▒\r\n"
						+ "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██████████████▓▓███████████████▓███████████████████████▓█████▓███████████▓▒▒▒▒▒▒▒▒▓▒▒\r\n"
						+ "▓██████████████▓█████▓██████████████████████████████████████████████████████████████████▓▒▒▒▒░▒▒▒▒▒▒\r\n"
						+ "▓████▓█▓█████▓▓▓██████████████████████████▓▓███████████▓████████████████▓▓▓█▓▓▓▓████████▓▒▒▒▒▒▒▒▒▒▒▒\r\n"
						+ "▓████████████▓███░░░░░░░░░░▓█▒░░░░██████████░░░░░░░░░░░▓██░░░░░░▒░░▒██▓▓▓▒▓▓▒▒▒▒▓▓█▓████▓▒▒▒▒▒▒▒▒▒▒▒\r\n"
						+ "▓███████████████▒░░░░░░░░─░░▓▒░░░░████████▓░░░░░░░░░─░░▓▓▒─░░░░░░░░░▒█░░░░░░░░░░░░▓██████▓▓▓▓▓▓▓▓▓▓▒\r\n"
						+ "▓███████████████░░─────────░▒▒░░─░████████▓░░─░───░░░░░▓▓░░░░░░░░░░░░▓░░░──░░░░░░░░████████████████▓\r\n"
						+ "▓███████████████░░──░░░░░─░░▒▒░░─░████████▓░░░░░░░░░░░░▓▓░░──░░░░░░░░▓░░░──░░░░░──░████████████████▓\r\n"
						+ "▓███████████████░─░░░▒▒▒░░░░▒▒░░░░████████▓░░░─▒▒▒▒▒▒▒▒▓▓░░░░▒▒▒░░░░░▓░░░░░▒░▒░──░░████████████████▓\r\n"
						+ "▓███████████▓███░─░░▒▓██░░░░▒▒░░░░▓███████▓░░░░▒▓▓▓█████▓░░░░▓▓▓▒░░░░▓▒░░░░▓▓▓░░░░░████████████████▓\r\n"
						+ "▓███████████████░░─░▒███▒▒░░▓▒░─░░███▓████▓░░░░░░─░█████▓░░░░░─░░░░─░▓▒░░░░▒░░░░░░▒████████████████▓\r\n"
						+ "▓███████████████░░─░▒█▓█▓█▓▓█▒░░░░▓██▓████▓░──░░░░░█████▓░─░░────░░─░▓▒────░░─░─░░▓████████████████▓\r\n"
						+ "▓███████████████░──░▒███░░░░▒▒░─░░▓███████▓░───░▒▒▒█████▓░─░░░░░░─░░░▓░────░░░───░▓████████████████▓\r\n"
						+ "▓███████████████░──░▒███░░─░▒▒───░▓███████▓░──░▒▓▓▓▓████▓░─░░▒▓▓▒───░▓░───░▒▒▒░──░░████████████████▓\r\n"
						+ "▓███████████████░──░░░░░░░──▒▒░─░░░░░░░░░░▓░░─░░░░░░░░░▓▓░──░▓██▒░░─░▓░──░░█▓█░░░░░████████████████▓\r\n"
						+ "▓███████████████░───░░░░░░──▒▒░░░░─░─░░░░░▒░░░░░░░░░░░░▓▓░──░▓██▓░░─░▓░─░░░███░░░░░██▓█▓███████████▓\r\n"
						+ "▓███████████████░─░░─░──░░░░▒▒░░░░─░─────░▒░───░░░░─░░░▓▒░──░▓██▒░░─░▓░─░░░███░░░░░████████████████▓\r\n"
						+ "▓███████████████▒░░░░░░░░░░▒▓▒░─░░░░░░░░░░▓▒░░░░░░░░░░░▓▓░─░░▓█▓▒░░░░▓░──░░▓██░░─░░█▓██████████████▓\r\n"
						+ "▓████████████████▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒░▒▒▒▒▓▓▒▒▒▒░▒░░▒▒▒▓▓░░░░▓▓█▓░░░▒▓▒░░░▒▓██▒░░░▒███▓▓▓██████████▓\r\n"
						+ "▓█████████████████████████████████████████▓███████████████████████████▓▓▓▓▓▓▓█▓▓▓▓▓▓██░──░▓████████▓\r\n"
						+ "▓██████████████████████████████████████████████████████████████████████████▓█████████░░░──▒████████▓\r\n"
						+ "▓██████████████████████████████████████████████████████████████████████████████████████████████████▓\r\n"
						+ "▓██████████████████████████████████████████████████████████████████████████████████████████████████▓\r\n"
						+ "▓██████████████████████████████████████████████████████████████████████████████████████████████████▓");
				
				
				
				Music hunt = new Music("hunt.mp3",true);
				
				Music death = new Music("death.mp3",true);
				
				Music victory = new Music("victory.mp3",true);
				
				Music clear = new Music("clear.mp3",true);
				
				Music monsterattack = new Music("monsterattack.mp3",true);
				
//				Music potion = new Music("/Users/minbyeongjun/Desktop/java/RPG_game/쓰레드_음악/potion.mp3",true);
				
				hunt.start();
				
				Monster monster = new Monster(); //아래 번호에 따른 몬스터를 생성하기 위해 Monster 클래스로부터 monster 객체를 생성한다.
				
				boolean finish = false;
				System.out.println();
				System.out.println("------------------------------------------------------------");	
				System.out.println("                      사냥터에 입장하였습니다.                      ");
				System.out.println("------------------------------------------------------------");	
				System.out.println("1.언데드(1~5레벨 추천,노멀몬스터) 2.고블린(5~10레벨 추천, 노멀몬스터)");
				System.out.println("3. 고블린보스(15~20레벨 추천, 중간보스몬스터(스킬 사용으로 인해 주의 요망");
				System.out.println("4. 신찬식 2세_나이트메어(25레벨 추천, 보스몬스터(스킬 사용으로 인해 주의 요망 >>>>> 클리어 할 시 게임의 엔딩을 볼 수 있습니다.");
				System.out.println("------------------------------------------------------------");	
				System.out.println("전투할 상대의 번호를 입력하세요");
				System.out.print(">>");
				int a = scanner.nextInt(); //사냥터에 들어 왔을때의 스캐너 문이고, 사냥할 몬스터를 고르기 위함이다.
				
				if(a == 1) { // 사냥터에 들어 왔을때의 스캐너의 값 1을 입력했을때 언데드를 선택한다.
					monster = new Monster_Undead(); // 미리 monster(부모)의 객체를 만들었고, Monster_Undead(자식)의 클래스로부터 객체를 생성을 하여 업캐스팅을 한다.
					monster.name = "언데드";
					monster.hp = 100;
					monster.mp = 0;
					monster.level = 3;
					monster.power = 30;
					monster.defense = 10;
					monster.money = 60;
					monster.exp = 40;
				}
				
				if(a == 2) { // 사냥터에 들어 왔을때의 스캐너의 값 2을 입력했을때 고블린을 선택한다.
					monster = new Monster_Goblin();  // 미리 monster(부모)의 객체를 만들었고, Monster_Goblin(자식)의 클래스로부터 객체를 생성을 하여 업캐스팅을 한다.
					monster.name = "고블린";
					monster.hp = 100;
					monster.mp = 0;
					monster.level = 7; 
					monster.power = 60;
					monster.defense = 20;
					monster.money = 150;
					monster.exp = 40;
				}
				
				if(a == 3) { // 사냥터에 들어 왔을때의 스캐너의 값 3을 입력했을때 고블린 보스를 선택한다.
					monster = new Monster_Goblinboss(); // 미리 monster(부모)의 객체를 만들었고, Monster_Goblinboss(자식)의 클래스로부터 객체를 생성을 하여 업캐스팅을 한다.
					monster.name = "고블린대장";
					monster.hp = 500;
					monster.mp = 20;
					monster.level = 13; 
					monster.power = 60;
					monster.defense = 20;
					monster.money = 150;
					monster.exp = 40;
					
				}
				if(a == 4) { // 사냥터에 들어 왔을때의 스캐너의 값 4를 입력했을때 고블린 보스를 선택한다.
					monster = new Monster_Nightmare(); // 미리 monster(부모)의 객체를 만들었고, Monster_Goblinboss(자식)의 클래스로부터 객체를 생성을 하여 업캐스팅을 한다.
					monster.name = "신찬식 2세_나이트메어";
					monster.hp = 1000;
					monster.mp = 100;
					monster.level = 20; 
					monster.power = 100;
					monster.defense = 40;
					monster.money = 1000;
					monster.exp = 40;
					
				}
				
				
				
				boolean stop =false;
				
				Hunt_thread h2 = new Hunt_thread( me,  a,  monster,  goblinboss_skills, map, nightmare_skills, hunt,death,monsterattack,background);
				Thread hunt_thread= new Thread(new Hunt_thread( me,  a,  monster,  goblinboss_skills, map,nightmare_skills,hunt,death,monsterattack,background));
				
				
				
				
				
				
//				if(h1.getState() == Thread.State.NEW) {
					
					
//					h1.start();
//				}
					
				
				while(true) { //사냥턴에 대한 while 무한 반복 문이다.
//					System.out.println(me.hp + "@@@@@@"); 
					
//					if(me.hp <=1) {
//						h1.stop();
//						System.out.println("사망하셨습니다 메인메뉴로 돌아가겠습니다.");
//						map.mapshow();
//						break;
//						
//					}
					
				if(hunt_thread.getState() == Thread.State.NEW) {
					
					
					hunt_thread.start();
//					break;
					if (me.hp<1) {
						hunt_thread.stop();
						background.resume();
						hunt.stop();
						if(death.getState() == Thread.State.NEW) {
							
							
							death.start();
							death.sleep(2000);
							death.stop();
						}
						
						
					}
				}
					
					if (stop == true) {
						System.out.println("333333333");
						map.mapshow();
						background.resume();
						hunt.stop();
						monsterattack.stop();
						break;
					}
					
					
					if(finish ==true) {
						background.resume();
						hunt.stop();//혹시 모를 때를 대비하여 while문을 나갈 수 있게 방안을 생각해 놓았다.
						monsterattack.stop();
						break;
					}
					
					System.out.println("------------------------------------------------------------");	
					System.out.println("                   홍기의 공격 차례입니다.");
					System.out.println("------------------------------------------------------------");	
					System.out.println("           1번은 기본공격 2번은 스킬공격 3번은 포션사용 4번은 도망가기 입니다.            ");
					System.out.println("------------------------------------------------------------");	
					System.out.println("주의)도망친다면 현재 경험치의 20을 잃고 돈도 100을 잃습니다.");
					System.out.println();
					
					
					
					
//					try {
//						h1.join();
//					}
//					catch(InterruptedException e) {
//						
//					}
//					h1.interrupt();
					
					
					 x1 = scanner.nextInt(); //워리어가 기본공격을 했을때는 1 스킬공격을 했을때는 2로 가정을 하였다.
					
				
					
					if(x1 == 1) { //사냥턴의 스캐너에서 1을 입력하면 워리어의 기본공격을 실행한다.
						
						//2가지 가정을 하였다. 1번째. 가정은 나의 힘이 몬스터의 방어력보다 작을 경우/ 2번째. 가정은 나의 힘이 몬스터의 방어력보다 클 경우로 나누었다.
						if(me.power<monster.defense) {  // 나의 힘이 몬스터의 방어력보다 작을 경우
							monster.hp = monster.hp - 1; // 몬스터의 체력은 1씩만 깎인다.
							if(me.hp >1) {
							if(monster.hp > 0) { //몬스터의 체력이 0보다 크다면 몬스터는 공격할 수 있다고 설정을 하였다.
								System.out.println();
								System.out.println("------------------------------------------------------------");
								System.out.println(me.name + " 데미지는 " + me.power + " 입니다.");	
								System.out.println(monster.name + "에게 " + (me.power-monster.defense) + "만큼의 데미지를 주었지만 내 공격력보다 몬스터의 방어력이 높아 1의 데미지를 입혀" );
								System.out.println(monster.name + " 의 피가 " + monster.hp  + "가 남았습니다.");
								System.out.println();
								Random rand = new Random(System.currentTimeMillis()); // 자바의 랜덤 util을 이용하여 랜덤 객체를 생성한다.
								int q = Math.abs(rand.nextInt(2)+1); // 1,2를 랜덤으로 받아와 1을 받았을때 고블린보스는 기본공격을 / 2를 받았을때 고블린보스는 스킬공격을 하게된다.
								
								
//				
							}
						
							else if (monster.hp <=1) { //몬스터의 체력이 0이거나 0보다 작으면 몬스터를 처치할 경우이다
								h2.Stop(true);
								hunt_thread.stop();
								monsterattack.stop();
								
								if(monster.name =="신찬식 2세_나이트메어") { //신찬식 2세_나이트메어를 처치하였을때
									
									ending.start();
									clear.start();
									hunt.stop();
									background.stop();
									Thread.sleep(10000);
									System.exit(0);
									
								}
							
								else {
								System.out.println(monster.name + "을 처치 하였습니다.");
								me.getexp(monster, me); //몬스터를 처치하여 경험치와 돈을 얻는 메소드이다.
								
								
								Random rand = new Random(System.currentTimeMillis()); // 자바의 랜덤 util을 이용하여 랜덤 객체를 생성한다.
								int w = Math.abs(rand.nextInt(2)+1); //1,2를 랜덤으로 받아와 1을 받았을때 / 2를 받았을때 고블린보스는 스킬공격을 하게된다.
				
							
									if(w==1) { //w 가 1을 받아 왔을때는 아이템을 드롭한다.
										inventory.huntdrop(items, a); //사냥터에 들어갈때 썼던 scanner인 a를 매개변수로 받아
										//a==1일 경우에는 언데드가 드롭하는 아이템 , a==2일 경우에는 고블린이 드롭하는 아이템
										//a==3일 경우에는 고블린보스가 드롭하는 아이템이다.
							
									}
									else if (w==2) { //w 가 2일 경우에는 아무런 행동을 하지 않는다.
									}
								
								
								System.out.println("메인메뉴 창으로 돌아가겠습니다."); // 전투가 끝난 후이다. 즉, 워리어피가 0이 되던지 몬스터의 피가 0이 되면 메인메뉴로 돌아간다. 
								map.mapshow();//메인 메뉴 맵을 띄어준다.
								background.resume();
								
								hunt.stop();
								if(death.getState() == Thread.State.NEW) {
									
									
									victory.start();
									victory.sleep(3800);
									victory.stop();
									
									background.sleep(3800);
									background.resume();
									
								}
								
								break; //사냥턴에 대한 while의 무한반복을 나간다.
							
							}
							
							}
							
							
							}
							else if (me.hp<=1) {
//								h2.Stop(true);
								monsterattack.stop();
								System.out.println("------------------------------------------------------------");
								System.out.println("               몬스터의 공격으로 인해 죽은 상태입니다.                ");
								System.out.println("------------------------------------------------------------");
								
								System.out.println("메인메뉴 창으로 돌아가겠습니다."); // 전투가 끝난 후이다. 즉, 워리어피가 0이 되던지 몬스터의 피가 0이 되면 메인메뉴로 돌아간다. 
								System.out.println();
								map.mapshow();
								background.resume();
								hunt.stop();
								if(death.getState() == Thread.State.NEW) {
									
									
									death.start();
									
									death.sleep(2000);
									death.stop();
								}
								
								break;
								
							}
						
					}
						
					else if(me.power>monster.defense) { //내 공격력이 몬스터의 방어력보다 쌜 경우
							
						monster.hp = monster.hp - me.power + monster.defense;
						if(me.hp >1) { //몬스터의 체력은 몬스터의 체력 - 나의 공격력 + 몬스터의 방어력으로 설정한
						if(monster.hp > 0) { // 몬스터의 체력이 0보다 클 경우
							System.out.println();
							System.out.println("------------------------------------------------------------");
							System.out.println(me.name + " 데미지는 " + me.power + " 입니다.");	
							System.out.println(monster.name + "에게 " + (me.power-monster.defense) + "만큼의 데미지를 주어 " +
									monster.name + "의" +monster.hp  + "가 남았습니다.");
							System.out.println();
						}
						else if (monster.hp <=1) { //몬스터의 체력이 0이거나 0보다 작으면 몬스터를 처치할 경우이다
							h2.Stop(true);
							hunt_thread.stop();
							monsterattack.stop();
							if(monster.name =="신찬식 2세_나이트메어") { //신찬식 2세_나이트메어를 처치하였을때
								ending.start();
								clear.start();
								hunt.stop();
								background.stop();
								Thread.sleep(10000);
								System.exit(0);
							}
							else {
							System.out.println(monster.name + "을 처치 하였습니다.");
							me.getexp(monster, me); //몬스터를 처치하여 경험치와 돈을 얻는 메소드이다.
							
							
							Random rand = new Random(System.currentTimeMillis()); // 자바의 랜덤 util을 이용하여 랜덤 객체를 생성한다.
							int w = Math.abs(rand.nextInt(2)+1); //1,2를 랜덤으로 받아와 1을 받았을때 / 2를 받았을때 고블린보스는 스킬공격을 하게된다.
			
						
								if(w==1) { //w 가 1을 받아 왔을때는 아이템을 드롭한다.
									inventory.huntdrop(items, a); //사냥터에 들어갈때 썼던 scanner인 a를 매개변수로 받아
									//a==1일 경우에는 언데드가 드롭하는 아이템 , a==2일 경우에는 고블린이 드롭하는 아이템
									//a==3일 경우에는 고블린보스가 드롭하는 아이템이다.
						
								}
								else if (w==2) { //w 가 2일 경우에는 아무런 행동을 하지 않는다.
								}
							
							
							System.out.println("메인메뉴 창으로 돌아가겠습니다."); // 전투가 끝난 후이다. 즉, 워리어피가 0이 되던지 몬스터의 피가 0이 되면 메인메뉴로 돌아간다. 
							map.mapshow();//메인 메뉴 맵을 띄어준다.
							background.resume();
							hunt.stop();
							if(death.getState() == Thread.State.NEW) {
								
								
								victory.start();
								victory.sleep(3800);
								victory.stop();
								background.sleep(3800);
								background.resume();
							}
							
							break; //사냥턴에 대한 while의 무한반복을 나간다.
						}
						}
						}
						else if (me.hp<=1) {
//							h2.Stop(true);
							monsterattack.stop();
							System.out.println("------------------------------------------------------------");
							System.out.println("               몬스터의 공격으로 인해 죽은 상태입니다.                ");
							System.out.println("------------------------------------------------------------");
							
							System.out.println("메인메뉴 창으로 돌아가겠습니다."); // 전투가 끝난 후이다. 즉, 워리어피가 0이 되던지 몬스터의 피가 0이 되면 메인메뉴로 돌아간다. 
							System.out.println();
							map.mapshow();
							background.resume();
							hunt.stop();
							if(death.getState() == Thread.State.NEW) {
								
								
								death.start();
								death.sleep(2000);
								death.stop();
							}
							
							
							
							
							break;
							
						}
						
						
						
					}

					
					}
					if(x1 == 2) { //워리어가 스킬 공격을 할 때
						
						System.out.println();
						System.out.println("                   현재 마나는 " + me.mp + "입니다.             ");
						System.out.println("============================================================");
						
						for(int i = 0; i<warrior_skills.length; i++) {
							if(warrior_skills[i].skilllevel>0) { //사용 가능한 스킬 목록 보여줌
								
								System.out.println(i+1 + ". "+warrior_skills[i].name);
								System.out.println(warrior_skills[i].name + "의 마나소모량은" + warrior_skills[i].mpconsume );
								System.out.println("------------------------------------------------------------");	
								
							}
							else {
								System.out.println("사용 가능한 스킬이 없습니다.");
								break;
							}
						}
						
				
						for(int i = 0; i<warrior_skills.length; i++) {
							if(warrior_skills[i].skilllevel>0) {
								
								System.out.println("사용가능한 공격스킬 입니다. 공격할 스킬 번호를 입력해주세요.");
								System.out.println("------------------------------------------------------------");	
								System.out.print(">>");
								int d = scanner.nextInt();
								
							
								
								
								if(me.mp>=warrior_skills[d-1].mpconsume  && monster.hp > 0) {
									monsterattack.stop();
									if(warrior_skills[d-1].skilltotal > monster.defense) { //워리어의 스킬 데미지가 몬스터의 방어력보다 쌜 때
									monster.hp = monster.hp - warrior_skills[d-1].skilltotal + monster.defense;
									
									if(me.hp >1) {
									
										
										
									System.out.println(me.name + "의 "+ warrior_skills[d-1].name +" 스킬 데미지는 " + warrior_skills[d-1].skilltotal + " 입니다.");
									System.out.println("------------------------------------------------------------");	
									me.mp = me.mp - warrior_skills[d-1].mpconsume;
									if(monster.hp<0){
										
										h2.Stop(true);
										hunt_thread.stop();
										monsterattack.stop();
										
										if(monster.name =="신찬식 2세_나이트메어") { //신찬식 2세_나이트메어를 처치하였을때
											ending.start();
											clear.start();
											hunt.stop();
											background.stop();
											Thread.sleep(10000);
											System.exit(0);
										}
										
										else {
										System.out.println(warrior_skills[d-1].name + "의 마나소모량은" + warrior_skills[d-1].mpconsume );
										System.out.println("마나는 "+ me.mp + "가 남았습니다." );
										System.out.println("------------------------------------------------------------");	
										System.out.println(monster.name + "에게 " + (warrior_skills[d-1].skilltotal ) 
												+ "만큼의 데미지를 주어 " +monster.name + "를 처지 했습니다.!!!!!!\n");
										me.getexp(monster, me);
										Random rand = new Random(System.currentTimeMillis());
										int w = Math.abs(rand.nextInt(2)+1);
								
									
											if(w==1) {
												inventory.huntdrop(items, a);
									
											}
											else if (w==2) {
											}
										System.out.println("메인메뉴 창으로 돌아가겠습니다.");
										map.mapshow();
										
										finish =true;
										background.resume();
										hunt.stop();
										if(death.getState() == Thread.State.NEW) {
											
											
											victory.start();
											victory.sleep(3800);
											victory.stop();
											background.sleep(3800);
											background.resume();
										}
										
										break;
									}
										}
										
									
									
									else {
									System.out.println(warrior_skills[d-1].name + "의 마나소모량은 " + warrior_skills[d-1].mpconsume );
									System.out.println("마나는 "+ me.mp + "가 남았습니다." );
									System.out.println("------------------------------------------------------------");	
									System.out.println(monster.name + "에게 " + (warrior_skills[d-1].skilltotal ) 
											+ "만큼의 데미지를 주어 " +monster.name + "의" +monster.hp  + "가 남았습니다.\n");
									
									
//									
									
									break;
									}
									}
								
								
									else if (me.hp<=1) {
//								h2.Stop(true);
										monsterattack.stop();
										System.out.println("------------------------------------------------------------");
										System.out.println("               몬스터의 공격으로 인해 죽은 상태입니다.                ");
										System.out.println("------------------------------------------------------------");
										
										System.out.println("메인메뉴 창으로 돌아가겠습니다."); // 전투가 끝난 후이다. 즉, 워리어피가 0이 되던지 몬스터의 피가 0이 되면 메인메뉴로 돌아간다. 
										System.out.println();
								map.mapshow();
								hunt_thread.stop();
								background.resume();
								hunt.stop();
								if(death.getState() == Thread.State.NEW) {
									
									
									death.start();
									death.sleep(2000);
									death.stop();
								}
								
								break;	
							
									}
									}
								
								
									
								
									else if(warrior_skills[d-1].skilltotal <= monster.defense) {

										monster.hp = monster.hp - 1;
										
										System.out.println(me.name + "의 "+ warrior_skills[d-1].name +" 스킬 데미지는 " + warrior_skills[d-1].skilltotal + " 입니다.");
										System.out.println("------------------------------------------------------------");	
										me.mp = me.mp - warrior_skills[d-1].mpconsume;
										
										if(me.hp>1) {
										
										if(monster.hp<0){
											
											h2.Stop(true);
											hunt_thread.stop();
											monsterattack.stop();
											if(monster.name =="신찬식 2세_나이트메어") { //신찬식 2세_나이트메어를 처치하였을때
												ending.start();
												clear.start();
												hunt.stop();
												background.stop();
												Thread.sleep(10000);
												System.exit(0);
											}
											
											else {
											System.out.println(warrior_skills[d-1].name + "의 마나소모량은" + warrior_skills[d-1].mpconsume );
											System.out.println("마나는 "+ me.mp + "가 남았습니다." );
											System.out.println("------------------------------------------------------------");	
											System.out.println(monster.name + "에게 " + (warrior_skills[d-1].skilltotal ) 
													+ "만큼의 데미지를 주어 " +monster.name + "를 처지 했습니다.@@@@\n");
											me.getexp(monster, me);
											Random rand = new Random(System.currentTimeMillis());
											int w = Math.abs(rand.nextInt(2)+1);
									
										
												if(w==1) {
													inventory.huntdrop(items, a);
										
												}
												else if (w==2) {
												}
											System.out.println("메인메뉴 창으로 돌아가겠습니다.");
											map.mapshow();
											
											finish =true;
											background.resume();
											hunt.stop();
											if(death.getState() == Thread.State.NEW) {
												
												
												victory.start();
												victory.sleep(3800);
												victory.stop();
												background.sleep(3800);
												background.resume();
											}
											
											break;
											}
										}
										
										else {
										System.out.println(warrior_skills[d-1].name + "의 마나소모량은 " + warrior_skills[d-1].mpconsume );
										System.out.println("마나는 "+ me.mp + "가 남았습니다." );
										System.out.println("------------------------------------------------------------");	
										System.out.println(monster.name + "에게 " + (warrior_skills[d-1].skilltotal ) 
												+ "만큼의 데미지를 주어 " +monster.name + "의" +monster.hp  + "가 남았습니다.\n");
										
										if( monster.name == "고블린보스")  { //그 중 몬스터가 고블린 보스 일 경우가 있는데 고블린보스는 기본공격과 스킬공격 둘 다 가지고 있기 때문에 기본공격과 스킬공격 2가지로 나누어서 공격턴을 설정했다.
											Random rand = new Random(System.currentTimeMillis()); // 자바의 랜덤 util을 이용하여 랜덤 객체를 생성한다.
											int w = Math.abs(rand.nextInt(2)+1); // 1,2를 랜덤으로 받아와 1을 받았을때 고블린보스는 기본공격을 / 2를 받았을때 고블린보스는 스킬공격을 하게된다.
											
//												
													
											}
										monsterattack.stop();
										break;
										}
										}
										
									
										else if (me.hp<=1) {
//											h2.Stop(true);
											monsterattack.stop();
											System.out.println("------------------------------------------------------------");
											System.out.println("               몬스터의 공격으로 인해 죽은 상태입니다.                ");
											System.out.println("------------------------------------------------------------");
											
											System.out.println("메인메뉴 창으로 돌아가겠습니다."); // 전투가 끝난 후이다. 즉, 워리어피가 0이 되던지 몬스터의 피가 0이 되면 메인메뉴로 돌아간다. 
											System.out.println();
											
											map.mapshow();
											hunt_thread.stop();
											background.resume();
											hunt.stop();
											if(death.getState() == Thread.State.NEW) {
												
												
												death.start();
												death.sleep(2000);
												death.stop();
											}
											
											break;
											
										}
									
										
									}
								}
							
							else {
								System.out.println("현재 mp가 부족하여 스킬을 사용할 수 없습니다.\n");
								System.out.println();
								break;
							} 
							}
						}
					}
					
					
//							else {
//								
//								System.out.println("현재 스킬을 배우지 않았습니다.");
//								break;
//							}
							
						
						
					
					
					if(x1==3) {
						
						System.out.println("신찬식 2세 현재 체력: " + me.hp + " 현재 마나: " + me.mp );
						System.out.println("------------------------------------------------------------");	
						for(int i =9; i<=9; i++) { //HP물약과 MP물약을 출력하는 문장
							if((items[i].countmax>0 && items[i].power ==0 ) && (items[i].hp==100)){ 
								System.out.println((i-8) + "."+ items[i].name + " +" + items[i].countmax + "(체력+"+ items[i].hp +")");
								
								
							}
							else {
								System.out.println("체력 포션이 없습니다.");
								
								
								
							}
						}
						for(int i =10; i<=10; i++) {	
							if((items[i].countmax>0 && items[i].power ==0 ) && (items[i].mp==100)){ 
								System.out.println((i-8) + "."+ items[i].name + " +" + items[i].countmax + "(마나+"+ items[i].mp +")");
								System.out.println("------------------------------------------------------------");	
						
							}
							else {
								
								System.out.println("마나 포션이 없습니다.");
								System.out.println("------------------------------------------------------------");	
						
							}
						}
							
							
						
//							if((items[i].countmax>0 && items[i].power ==0 ) && (items[i].hp==100 || items[i].hp==100)){ 
//								System.out.println((i-8) + "."+ items[i].name + " +" + items[i].countmax + "("+ items[i].hp );
//								
//							}
							
						
						System.out.println("사용할 물약을 선택하여 주세요(포션이 없거나 뒤로가시려면 0을 누르시오.)");
						int q = scanner.nextInt(); 
						
						if (q == 1 && items[9].countmax >0) {// HP물약 사용했을때
							
							items[9].countmax--;
							me.hp = me.hp +items[9].hp;
							if(me.hp> me.maxhp) {
								me.hp= me.maxhp;
							}
							
							Music potion = new Music("potion.mp3",true);
								
							if(potion.getState() == Thread.State.NEW) {
								
								
								potion.start();
								potion.sleep(1000);
								potion.close();
								
							}
								
								
								

							
							
							System.out.println("체력 포션을 사용하였습니다.");
							
							System.out.println("현재 체력 : "+ me.hp + "/" + me.maxhp );
							System.out.println();
							
//							potion.close();
							
							hunt_thread.resume();
//							if( monster.name == "고블린대장") { //그 중 몬스터가 고블린 보스 일 경우가 있는데 고블린보스는 기본공격과 스킬공격 둘 다 가지고 있기 때문에 기본공격과 스킬공격 2가지로 나누어서 공격턴을 설정했다.
//								Random rand = new Random(System.currentTimeMillis()); // 자바의 랜덤 util을 이용하여 랜덤 객체를 생성한다.
//								int w = Math.abs(rand.nextInt(2)+1); // 1,2를 랜덤으로 받아와 1을 받았을때 고블린보스는 기본공격을 / 2를 받았을때 고블린보스는 스킬공격을 하게된다.
//								
//									if ( w==1) { //고블린 보스의 기본공격 차례일 경우
//										
//										if(me.defense<monster.power) { //몬스터의 공격력이 나의 방어력보다 쌜 경우
//											
//										System.out.println("몬스터의 차례입니다."); 
//										me.hp = me.hp - monster.power + me.defense; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
//										if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
//											me.hp = 0; // 워리어의 피는 0으로 고정한다.
//											System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
//											System.out.println();
//											System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
//											System.out.println("체력과 마나가 1이 되었습니다.");
//											me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//											me.mp=1;
//											map.mapshow(); //다시 메인메뉴로 돌아간다.
//											break;
//										}
//										else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다.
//										System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
//										System.out.println();
//										}
//									}
//										else if(me.defense>=monster.power) { //나의 방어력이 몬스터의 공격력보다 높을 경우
//
//											System.out.println("몬스터의 차례입니다."); 
//											me.hp = me.hp - 1; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
//											if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
//												me.hp = 0; // 워리어의 피는 0으로 고정한다.
//												System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
//												System.out.println();
//												System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
//												System.out.println("체력과 마나가 1이 되었습니다.");
//												me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//												me.mp=1;
//												map.mapshow(); //다시 메인메뉴로 돌아간다.
//												break;
//											}
//											else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다. 하지만 나의 방어력이 높기에 1만 깎인다.
//											System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
//											System.out.println();
//											}
//										
//											
//										}
//									}
//									else if (w==2){ //고블린 보스의 스킬공격 차례일 경우
//										
//										if(me.defense<goblinboss_skills.skilltotal) {
//										
//										System.out.println("몬스터의 차례입니다.");
//										me.hp = me.hp - goblinboss_skills.skilltotal + me.defense; //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
//										monster.mp = monster.mp - goblinboss_skills.mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
//										if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
//											me.hp = 0;
//											System.out.println("몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
//													+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
//											System.out.println();
//											System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
//											System.out.println("체력과 마나가 1이 되었습니다.");
//											me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//											me.mp=1;
//											map.mapshow(); //다시 메인메뉴로 돌아간다.
//											break;
//										}
//										else { //나의 체력이 0이상 일 때
//											System.out.println("몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
//													+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
//						
//										}
//									}
//										
//										else if(me.defense>=goblinboss_skills.skilltotal) {
//
//											System.out.println("몬스터의 차례입니다.");
//											me.hp = me.hp - 1; //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
//											monster.mp = monster.mp - goblinboss_skills.mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
//											if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
//												me.hp = 0;
//												System.out.println("몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
//														+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
//												System.out.println();
//												System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
//												System.out.println("체력과 마나가 1이 되었습니다.");
//												me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//												me.mp=1;
//												map.mapshow(); //다시 메인메뉴로 돌아간다.
//												break;
//											}
//											else { //나의 체력이 0이상 일 때
//												System.out.println("몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
//														+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
//							
//											}
//										
//											
//										}
//										
//									}
//										
//								}
							
							
//							else { //일반 몬스터의 기본공격일 경우
//								
//								if(me.defense<monster.power) { //몬스터의 공격력이 나의 방어력보다 쌜 경우
//									
//								System.out.println("몬스터의 차례입니다."); 
//								me.hp = me.hp - monster.power + me.defense; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
//								if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
//									me.hp = 0; // 워리어의 피는 0으로 고정한다.
//									System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
//									System.out.println();
//									System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
//									System.out.println("체력과 마나가 1이 되었습니다.");
//									me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//									me.mp=1;
//									map.mapshow(); //다시 메인메뉴로 돌아간다.
//									break;
//								}
//								else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다.
//								System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
//								System.out.println();
//								}
//							}
//								else if(me.defense>=monster.power) { //나의 방어력이 몬스터의 공격력보다 높을 경우
//
//									System.out.println("몬스터의 차례입니다."); 
//									me.hp = me.hp - 1; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
//									if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
//										me.hp = 0; // 워리어의 피는 0으로 고정한다.
//										System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
//										System.out.println();
//										System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
//										System.out.println("체력과 마나가 1이 되었습니다.");
//										me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//										me.mp=1;
//										map.mapshow(); //다시 메인메뉴로 돌아간다.
//										break;
//									}
//									else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다. 하지만 나의 방어력이 높기에 1만 깎인다.
//									System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
//									System.out.println();
//									}
//								
//									
//								}
//							}
							
							
							
							
							
							
						}
						else if (q==0) {
							hunt_thread.resume();
							
						}
						
						
						if (q == 2 && items[10].countmax >0) {// MP물약 사용했을때
							
							items[10].countmax--;
							me.mp = me.mp +items[10].mp;
							if(me.mp> me.maxmp) {
								me.mp= me.maxmp;
							}
						
								
							Music potion1= new Music("potion.mp3",true);	
							if(potion1.getState() == Thread.State.NEW) {
								
								
								potion1.start();
								potion1.sleep(1000);
								potion1.close();
								
							}
								
//								break;
								
							
//							
							System.out.println("마나 포션을 사용하였습니다.");
							System.out.println("현재 마나 : "+ me.mp + "/" + me.maxmp );
							System.out.println();
							
							
							
							
							
//							if( monster.name == "고블린대장") { //그 중 몬스터가 고블린 보스 일 경우가 있는데 고블린보스는 기본공격과 스킬공격 둘 다 가지고 있기 때문에 기본공격과 스킬공격 2가지로 나누어서 공격턴을 설정했다.
//								Random rand = new Random(System.currentTimeMillis()); // 자바의 랜덤 util을 이용하여 랜덤 객체를 생성한다.
//								int w = Math.abs(rand.nextInt(2)+1); // 1,2를 랜덤으로 받아와 1을 받았을때 고블린보스는 기본공격을 / 2를 받았을때 고블린보스는 스킬공격을 하게된다.
//								 
//									if ( w==1) { //고블린 보스의 기본공격 차례일 경우
//										
//										if(me.defense<monster.power) { //몬스터의 공격력이 나의 방어력보다 쌜 경우
//											
//										System.out.println("몬스터의 차례입니다."); 
//										me.hp = me.hp - monster.power + me.defense; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
//										if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
//											me.hp = 0; // 워리어의 피는 0으로 고정한다.
//											System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
//											System.out.println();
//											System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
//											System.out.println("체력과 마나가 1이 되었습니다.");
//											me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//											me.mp=1;
//											map.mapshow(); //다시 메인메뉴로 돌아간다.
//											break;
//										}
//										else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다.
//										System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
//										System.out.println();
//										}
//									}
//										else if(me.defense>=monster.power) { //나의 방어력이 몬스터의 공격력보다 높을 경우
//
//											System.out.println("몬스터의 차례입니다."); 
//											me.hp = me.hp - 1; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
//											if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
//												me.hp = 0; // 워리어의 피는 0으로 고정한다.
//												System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
//												System.out.println();
//												System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
//												System.out.println("체력과 마나가 1이 되었습니다.");
//												me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//												me.mp=1;
//												map.mapshow(); //다시 메인메뉴로 돌아간다.
//												break;
//											}
//											else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다. 하지만 나의 방어력이 높기에 1만 깎인다.
//											System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
//											System.out.println();
//											}
//										
//											
//										}
//									}
//									else if (w==2){ //고블린 보스의 스킬공격 차례일 경우
//										
//										if(me.defense<goblinboss_skills.skilltotal) {
//										
//										System.out.println("몬스터의 차례입니다.");
//										me.hp = me.hp - goblinboss_skills.skilltotal + me.defense; //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
//										monster.mp = monster.mp - goblinboss_skills.mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
//										if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
//											me.hp = 0;
//											System.out.println("몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
//													+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
//											System.out.println();
//											System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
//											System.out.println("체력과 마나가 1이 되었습니다.");
//											me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//											me.mp=1;
//											map.mapshow(); //다시 메인메뉴로 돌아간다.
//											break;
//										}
//										else { //나의 체력이 0이상 일 때
//											System.out.println("몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
//													+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
//						
//										}
//									}
//										
//										else if(me.defense>=goblinboss_skills.skilltotal) {
//
//											System.out.println("몬스터의 차례입니다.");
//											me.hp = me.hp - 1; //나의 현재체력은 현재체력-몬스터의 스킬공격력+나의 방어력으로 설정했다.
//											monster.mp = monster.mp - goblinboss_skills.mpconsume; //고블린 보스의 마나는 고블린 보스 마나-고블린보스의스킬소모량으로 설정했다.
//											if(me.hp<=0) { //나의 체력이 0이거나 보다 작을 경우
//												me.hp = 0;
//												System.out.println("몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
//														+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " +  + me.hp +" 남았습니다." );
//												System.out.println();
//												System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //0보다 작거나 0일 경우에 사망�g다고 생각한다.
//												System.out.println("체력과 마나가 1이 되었습니다.");
//												me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//												me.mp=1;
//												map.mapshow(); //다시 메인메뉴로 돌아간다.
//												break;
//											}
//											else { //나의 체력이 0이상 일 때
//												System.out.println("몬스터의 스킬 공격 " +goblinboss_skills.name+ " 로 인해 " 
//														+  goblinboss_skills.skilltotal + " 피해를 받아 " + me.name + "의 피가 " + me.hp + "남았습니다." );
//							
//											}
//										
//											
//										}
//										
//									}
//										
//								}
							
							
//							else { //일반 몬스터의 기본공격일 경우
//								
//								if(me.defense<monster.power) { //몬스터의 공격력이 나의 방어력보다 쌜 경우
//									
//								System.out.println("몬스터의 차례입니다."); 
//								me.hp = me.hp - monster.power + me.defense; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
//								if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
//									me.hp = 0; // 워리어의 피는 0으로 고정한다.
//									System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
//									System.out.println();
//									System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
//									System.out.println("체력과 마나가 1이 되었습니다.");
//									me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//									me.mp=1;
//									map.mapshow(); //다시 메인메뉴로 돌아간다.
//									break;
//								}
//								else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다.
//								System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
//								System.out.println();
//								}
//							}
//								else if(me.defense>=monster.power) { //나의 방어력이 몬스터의 공격력보다 높을 경우
//
//									System.out.println("몬스터의 차례입니다."); 
//									me.hp = me.hp - 1; //몬스터의 공격을 받아 워리어의 체력을 구현한 코드이다.
//									if(me.hp<=0) { //워리어의 피가 0보다 같거나 작을경우
//										me.hp = 0; // 워리어의 피는 0으로 고정한다.
//										System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + " 남았습니다." );
//										System.out.println();
//										System.out.println("신찬식 2세가 체력이 0 이하가 되어 사망하였습니다."); //워리어의 피가 0이되어 사망했다고 생각을 한다.
//										System.out.println("체력과 마나가 1이 되었습니다.");
//										me.hp=1; //현재 체력을 1 마나를 1로 설정한다.
//										me.mp=1;
//										map.mapshow(); //다시 메인메뉴로 돌아간다.
//										break;
//									}
//									else {//워리어의 피가 0보다 클 경우 몬스터의 공격력만큼 내 피가 깎인다. 하지만 나의 방어력이 높기에 1만 깎인다.
//									System.out.println("몬스터의 공격력 " + monster.power + "로 인해 " +me.name + "의 피가 " + me.hp + "남았습니다." );
//									System.out.println();
//									}
//								
//									
//								}
//							}
						
						
						
						
						}
						
//						else if (q == 2 && items[10].countmax <=0) {// HP물약 없는데 사용했을때
//							System.out.println("마나 포션이 없어 사용하지 못하였습니다.");
//						}
						if (q==0) {
							hunt_thread.resume();
							
						}
						
					}
						
						
					
					
					
					
					if(x1 == 4) { //도망치기
						hunt_thread.suspend();
						while(true)	{
						System.out.println("주의)도망친다면 현재 경험치의 20을 잃고 돈도 100을 잃습니다.");
						System.out.println("정말로 도망치시겠습니까? 1.예 2.아니오");
						int t = scanner.nextInt();
						if(t == 1) {
							
							hunt_thread.stop();
							Music runaway = new Music("runaway.mp3",true);
							
							if(runaway.getState() == Thread.State.NEW) {
								
								
								runaway.start();
								runaway.sleep(1400);
								runaway.close();
								
							}
							me.exp = me.exp - 20 ;
							me.money = me.money - 100;
							
							map.mapshow();
							finish =true;
							hunt_thread.resume();
							hunt.close();
							break;
							
						}
						else {
							hunt_thread.resume();
							break;
							
						}
						
						
					}
				}
					
					
				}	
				
			}
						
			if(x == 3) {
				background.suspend();
				while(true){
					Music rest = new Music("rest.mp3",true);
					
					if(rest.getState() == Thread.State.NEW) {
						
						
						rest.start();
						
						
						
					}
				System.out.println("휴식의 방에 입장하였습니다.");
				System.out.println("휴식을 취해 체력과 마나를 모두 채우려면 1을 누르세요(단, " + me.level * 80 + "골드가 소요됩니다.)");
				System.out.println("0을 누르면 메인화면으로 나가게 됩니다.");
				System.out.print(">>");
				int q = scanner.nextInt();
				
				if(q==1) {
					
					int e = me.money;
					if(me.money>=me.level*80) {
						me.money = me.money - me.level * 80;
						System.out.println("현재 체력 : " + me.hp + " >> " + me.maxhp);
						me.hp = me.maxhp;
						System.out.println("현재 마나 : " + me.mp + " >> " + me.maxmp);
						me.mp = me.maxmp;
						System.out.println("현재 골드 : " + e + " >> " + me.money);
						map.mapshow();
						
						
							
							background.sleep(700);
							background.resume();
							
							
							
						
						
						
						rest.close();
						break;
					}
					else {
						System.out.println("휴식할 수 있는 돈이 없어 휴식을 하지 못하고 메인메뉴로 돌아갑니다.");
						map.mapshow();
						
					}
					
				}
				else if(q==0) {
					
					map.mapshow();
				
						
						background.sleep(700);
						background.resume();
						
						
						
					
					rest.close();
					break;
				}
				else {
					System.out.println("잘못된 숫자입니다.");
					System.out.println();
				}
				
				
			}
			}
			
			
			
			
			
			if(x == 4) {
				Music skill = new Music("skill.mp3",true);
				
				if(skill.getState() == Thread.State.NEW) {
					
					
					skill.start();
					
					
					
				}
				while(true) {
					background.suspend();
					
					System.out.println("현재 레벨은 "+me.level+" 현재 스킬포인트는 " + me.skillpoint + "입니다.");
					System.out.println("============================================================");
					for(int i=0; i<warrior_skills.length; i++) {
						System.out.println(i+1 + ". " + warrior_skills[i].name + " +" + warrior_skills[i].skilllevel + "(레벨제한:" + warrior_skills[i].skilllimit+",마나소모:"+warrior_skills[i].mpconsume+",데미지:"+warrior_skills[i].skilltotal+")");
					}
					System.out.println("============================================================");
					System.out.println("스킬 찍을 번호를 입력하거나 뒤로 가시려면 0을 입력하세요.\n");
					System.out.print(">>");
					int q = scanner.nextInt();
					
						if(q-1 == 0) {
							if(me.level >= warrior_skills[0].skilllimit && me.skillpoint >= 1) {
								warrior_skills[0].skilllevel += 1;
								warrior_skills[0].skilllimit += 1;
								warrior_skills[0].mpconsume +=3;
								me.skillpoint -= 1;
								warrior_skills[0].skillincre= warrior_skills[0].skillincre + me.level;
								warrior_skills[0].skilltotal = me.level * warrior_skills[0].skillincre;
							}
							else {
								System.out.println("렙이 낮거나 스킬포인트가 부족합니다.");
								
							}
						}
						if(q == 2) {
							if(me.level >= warrior_skills[1].skilllimit && me.skillpoint >= 1) {
								warrior_skills[1].skilllevel += 1;
								warrior_skills[1].skilllimit += 1;
								warrior_skills[1].mpconsume +=3;
								me.skillpoint -= 1;	
								warrior_skills[1].skillincre= warrior_skills[1].skillincre + me.level;
								warrior_skills[1].skilltotal = me.level * warrior_skills[1].skillincre;
							}
							
							else {
								System.out.println("렙이 낮거나 스킬포인트가 부족합니다.");

							}	
						}
						if(q == 3) {
							if(me.level >= warrior_skills[2].skilllimit && me.skillpoint >= 1) {
								warrior_skills[2].skilllevel += 1;
								warrior_skills[2].skilllimit += 1;
								warrior_skills[2].mpconsume +=3;
								me.skillpoint -= 1;	
								warrior_skills[2].skillincre= warrior_skills[2].skillincre + me.level;
								warrior_skills[2].skilltotal = me.level * warrior_skills[2].skillincre;
							}
							else {
								System.out.println("렙이 낮거나 스킬포인트가 부족합니다.");

							}
						}
						if(q == 0 ) {
							skill.close();
							background.sleep(700);
							background.resume();
							map.mapshow();
							break;
							
						}
					}
			}
			if(x == 5) {
				Music inventorymusic = new Music("inventory.mp3",true);
				
				if(inventorymusic.getState() == Thread.State.NEW) {
					
					
					inventorymusic.start();
					
					
					
				}
				while(true) {
					background.suspend();
					
				System.out.println();
				System.out.println("------------------------------------------------------------");
				System.out.println("                    현재 나의 돈 : " + me.money                  );
				System.out.println("------------------------------------------------------------");
				System.out.println("------------------------------------------------------------");
				System.out.println("                    현재 가지고 있는 아이템의 목록입니다.             ");
				System.out.println("------------------------------------------------------------");

				
				inventory.inventoryshow(items);

				System.out.println("------------------------------------------------------------");
				System.out.println();
				
				System.out.println("                    현재 착용하고 있는아이템의 목록입니다.               ");
				
				
				for(int i =0; i<items.length; i++) {
					if(items[i].countmax>0 && (items[i].weponspace >0 || items[i].armorspace >0)) {
						System.out.println(i + "."+ items[i].name + "를 착용하고 있습니다.");
					
					}
				}
				System.out.println("------------------------------------------------------------");
				System.out.println();
				
				//countmax는 실질적인 아이템의 개수를 보여주는것이고 count는 착용 해지에 관한 변수 items의 weapon,armor의 변수는 무기와 방어구를 구별해주기 위한 변수이다
				//워리어의 weaponspace는 무기 공간을 부여하여 무기를 1개 착용하면 이제 그 공간은 꽉 차서 다른 무기를 착용할 수 없다.
				//워리어의 armorspace는 무기 공간을 부여하여 무기를 1개 착용하면 이제 그 공간은 꽉 차서 다른 무기를 착용할 수 없다.
				//워리어의 weaponmax는 무기 공간을 부여하여 무기를 1개 착용하면 이제 그 공간은 꽉 차서 다른 무기를 착용할 수 없다.
				//워리어의 armormax는 무기 공간을 부여하여 무기를 1개 착용하면 이제 그 공간은 꽉 차서 다른 무기를 착용할 수 없다.
				
				
				System.out.println("1을 누르면 착용 및 사용모드, 2을 누르면 판매모드, 3을 누르면 착용해제모드, 0을 누르면 메인메뉴로 돌아갑니다.");
				System.out.print(">>");
				int n1 = scanner.nextInt();
				
				if (n1==1) {
					System.out.println();
					for(int i =0; i<items.length; i++) {
						if(items[i].countmax>0) {
							System.out.println(i + "."+ items[i].name + " +" + items[i].countmax );
							
						}
					}
					System.out.println();
					System.out.println("------------------------------------------------------------");
					System.out.println("현재 착용 및 사용모드입니다. 착용 및 사용할 아이템 번호를 입력하세요.(0을 누르면 뒤로 갑니다.)");
					System.out.println("------------------------------------------------------------");
					System.out.print(">>");
					int d1 = scanner.nextInt();
					
						
						if(items[d1].countmax>0 && items[d1].power==0 && items[d1].hp==100) {
							me.hp = me.hp + items[d1].hp;
							if(me.maxhp<me.hp) {
								me.hp = me.maxhp;
							}
							
							System.out.println();
							System.out.println("------------------------------------------------------------");//HP 물약
							System.out.println(items[d1].name+"의 아이템을 사용였습니다.");
							System.out.println("신찬식 2세의 체력이 " + items[d1].hp +"만큼 올랐습니다." );
							System.out.println("신찬식 2세의 현재 체력 : " +me.hp + "/" + me.maxhp );
							System.out.println("------------------------------------------------------------");
							me.hp = me.hp + items[d1].hp;
							if(me.maxhp<me.hp) {
								me.hp = me.maxhp;
							}
							items[d1].count--;
							items[d1].countmax--;
							
						}
						else if(items[d1].countmax>0 && items[d1].power==0 && items[d1].mp==100) {
							me.mp = me.mp + items[d1].mp;
							if(me.maxmp<me.mp) {
								me.mp = me.mp;
							}
							
							System.out.println();
							System.out.println("------------------------------------------------------------");//MP 물약
							System.out.println(items[d1].name+"의 아이템을 사용였습니다.");
							System.out.println("신찬식 2세의 마나가 " + items[d1].mp +"만큼 올랐습니다." );
							System.out.println("신찬식 2세의 현재 마나 : " +me.mp + "/" + me.maxmp );
							System.out.println("------------------------------------------------------------");
							me.mp = me.mp + items[d1].mp;
							if(me.maxmp<me.mp) {
								me.mp = me.mp;
							}
							items[d1].count--;
							items[d1].countmax--;
						}
						
						
						else if(items[d1].countmax>0 && items[d1].wepon == 1) { //무기
							if(items[d1].count>0 && me.weponmax == 0) {
							System.out.println();
							System.out.println("------------------------------------------------------------");
							System.out.println(items[d1].name+"의 아이템을 착용하였습니다.");
							System.out.println(items[d1].name + "의 효과로 " + "체력+" + items[d1].hp+""
									+ " ,마나+"+items[d1].mp +" ,힘+" + items[d1].power + " ,방어력+" + items[d1].defense +" 이 올랐습니다."  );
							System.out.println("------------------------------------------------------------");
							items[d1].count--;
							
							me.maxhp=me.maxhp + items[d1].hp;
							
							if(me.maxhp<me.hp) {
								me.hp = me.maxhp;
							}
							
							me.maxmp=me.maxmp + items[d1].mp;
							
							if(me.maxmp<me.mp) {
								me.mp = me.mp;
							}
							
							me.power=me.power + items[d1].power;
							me.defense=me.defense + items[d1].defense;
							me.weponmax++;
							items[d1].weponspace++;
							}
							else if(items[d1].count >0 && me.weponmax>0) {
								
								for(int i =0; i<items.length; i++) {
									if(items[i].weponspace>0) {
										System.out.println("------------------------------------------------------------");
										System.out.println("현재 다른 무기(" + items[i].name + ")를 착용중이니 "+ items[i].name + "를 해제하고 다시 착용해주세요.");
									}

								}				
								
							}
							else if(items[d1].count<=0) {
								System.out.println("------------------------------------------------------------");
								System.out.println("이미 장착중인 무기 아이템입니다.");
								System.out.println("------------------------------------------------------------");
							}
					
						}
						
						
						else if(items[d1].countmax>0 && items[d1].armor == 1) { //방어구 
							if(items[d1].count>0 && me.armormax == 0) {
							System.out.println();
							System.out.println("------------------------------------------------------------");
							System.out.println(items[d1].name+"의 아이템을 착용하였습니다.");
							System.out.println(items[d1].name + "의 효과로 " + "체력+" + items[d1].hp+""
									+ " ,마나+"+items[d1].mp +" ,힘+" + items[d1].power + " ,방어력+" + items[d1].defense +" 이 올랐습니다."  );
							System.out.println("------------------------------------------------------------");
							items[d1].count--;
							me.maxhp=me.maxhp + items[d1].hp;
							
							if(me.maxhp<me.hp) {
								me.hp = me.maxhp;
							}
							
							me.maxmp=me.maxmp + items[d1].mp;
							
							if(me.maxmp<me.mp) {
								me.mp = me.mp;
							}
							me.power=me.power + items[d1].power;
							me.defense=me.defense + items[d1].defense;
							me.armormax++;
							items[d1].armorspace++;
							}
							else if(items[d1].count >0 && me.weponmax>0) {
								
								for(int i =0; i<items.length; i++) {
									if(items[i].armorspace>0) {
										System.out.println();
										System.out.println("------------------------------------------------------------");
										System.out.println("현재 다른 방어구(" + items[i].name + ")를 착용중이니 "+ items[i].name + "를 해제하고 다시 착용해주세요.");
										System.out.println("------------------------------------------------------------");
									}

								}				
								
							}
							else if(items[d1].count<=0) {
								System.out.println();
								System.out.println("------------------------------------------------------------");
								System.out.println("이미 장착중인 방어구 아이템입니다.");
								System.out.println("------------------------------------------------------------");
							}
//						
						}
						
						else if(items[d1].level==0 && items[d1].armorspace == -9999 && items[d1].count>0) {
							
							System.out.println("착용 할 수 없는 아이템 입니다.");
							
							
						}
						else if(d1 == 0) {
							
						}
//					}
				}
				if (n1 == 2) { 
					System.out.println();
					
					System.out.println("------------------------------------------------------------");
					System.out.println("                         나의 가방                           ");
					inventory.inventoryshow(items);
					System.out.println();
					System.out.println("------------------------------------------------------------");
					System.out.println("현재 판매 모드입니다. 판매할 번호를 입력해주세요.(0을 누르면 뒤로 갑니다.)");
					System.out.println("------------------------------------------------------------");
					System.out.println();
					System.out.print(">>");
					int d1 = scanner.nextInt();
					
//					for( d1 =0; d1<items.length; d1++) {
						
						if(items[d1].countmax>0 && items[d1].power==0 && items[d1].hp==100) { //HP 포션의 경우
							System.out.println();
							System.out.println("------------------------------------------------------------");
							System.out.println(items[d1].name+"의 아이템을 판매하였습니다.");
							me.money = me.money  + items[d1].sellprice;
							System.out.println("신찬식 2세의 돈이 " + items[d1].sellprice +" 만큼 올랐습니다." );
							System.out.println("------------------------------------------------------------");
							items[d1].count--;
							items[d1].countmax--;
							
						}
						else if(items[d1].countmax>0 && items[d1].power==0 && items[d1].mp==100) { //MP 포션의 경우
							System.out.println();
							System.out.println("------------------------------------------------------------");
							System.out.println(items[d1].name+"의 아이템을 판매하였습니다.");
							me.money = me.money  + items[d1].sellprice;
							System.out.println("신찬식 2세의 돈이 " + items[d1].sellprice +" 만큼 올랐습니다." );
							System.out.println("------------------------------------------------------------");
							items[d1].count--;
							items[d1].countmax--;
						}
						
						
						
//						else if(items[d1].countmax>0 && (items[d1].weponspace>0 || items[d1].armorspace >0)) {
//							System.out.println("장착중인 아이템입니다. 해제후에 팔아주세요.");
//						}
						
						else if(items[d1].countmax>0) { //방어구 경우, 무기
							
//							if(items[d1].countmax>0) {
							if(items[d1].armorspace>0 || items[d1].weponspace>0) {
								System.out.println("장착중인 아이템입니다. 해제후에 팔아주세요.");
							}
							else {
							System.out.println();
							System.out.println("------------------------------------------------------------");	
							System.out.println(items[d1].name+"의 아이템을 판매하였습니다.");
								me.money = me.money  + items[d1].sellprice;
								System.out.println("신찬식 2세의 돈이 " + items[d1].sellprice +" 만큼 올랐습니다." );
								System.out.println("------------------------------------------------------------");
								items[d1].count--;
								items[d1].countmax--;
							
//							}
//							else if(items[d1].count<=0 ) {
//								System.out.println("이미 장착중인 아이템입니다.");
//							}
//						
							}
						}
						
						else if(d1 == 0) {
							
						}
						

//					}
				
					
					
				
					
					
				}
				
				if (n1==3) {
					System.out.println();
					for(int i =0; i<items.length; i++) {
						if(items[i].countmax>0 && (items[i].weponspace >0 || items[i].armorspace >0)) {
							System.out.println("------------------------------------------------------------");
							System.out.println(i + "."+ items[i].name + "를 착용하고 있습니다.");
							System.out.println("------------------------------------------------------------");
						
						}
						
							
					}
					System.out.println();
					System.out.println("------------------------------------------------------------");
					System.out.println("현재 착용해지 모드입니다. 착용 해제 할 번호를 입력해주세요.(0을 누르면 뒤로 갑니다.)");
					System.out.println("------------------------------------------------------------");
					System.out.print(">>");
					int d1 = scanner.nextInt();
					
					if(items[d1].countmax>0 && (items[d1].weponspace >0 || items[d1].armorspace >0)) {
						if(items[d1].weponspace >0 ) {
							System.out.println();
							System.out.println("------------------------------------------------------------");
							System.out.println(items[d1].name + "의 무기를 해제하였습니다");
							System.out.println(items[d1].name + "의 착용해제로 " + "체력-" + items[d1].hp+""
									+ " ,마나-"+items[d1].mp +" ,힘-" + items[d1].power + " ,방어력-" + items[d1].defense +" 이 감소하였습니다."  );
							System.out.println("------------------------------------------------------------");
							
							items[d1].weponspace--; 
							items[d1].count++;
							
							me.maxhp=me.maxhp - items[d1].hp;
//							me.hp=me.hp - items[d1].hp;
							if(me.hp<=0) {
								me.hp = 0;
							}
							
							me.maxmp=me.maxmp - items[d1].mp;
//							me.mp=me.mp - items[d1].mp;
							if(me.mp<=0) {
								me.mp = 0;
							}
											
							
							
							me.power=me.power - items[d1].power;
							me.defense=me.defense - items[d1].defense;
							me.weponmax = 0;
						
							
							
						}
						
						else if(items[d1].armorspace >0 ) {
							System.out.println();
							System.out.println("------------------------------------------------------------");
							System.out.println(items[d1].name + "의 방어구를 해제하였습니다");
							System.out.println(items[d1].name + "의 착용해제로 " + "체력-" + items[d1].hp+""
									+ " ,마나-"+items[d1].mp +" ,힘-" + items[d1].power + " ,방어력-" + items[d1].defense +" 이 감소하였습니다."  );
							System.out.println("------------------------------------------------------------");
							
							items[d1].armorspace--; 
							items[d1].count++;
							
							me.maxhp=me.maxhp - items[d1].hp;
							me.maxmp=me.maxmp - items[d1].mp;
							me.power=me.power - items[d1].power;
							me.defense=me.defense - items[d1].defense;
							me.armormax = 0;
							
						}
						
					}
					if(d1 == 0) {
						{
							
						}
					}
					
				}
				
				
				
				
				if (n1==0) {
					inventorymusic.close();
					background.sleep(700);
					background.resume();
					map.mapshow();
					break;
				
				}
			}
		}
			if(x == 6) {
				Music storemusic = new Music("inventory.mp3",true);
				
				if(storemusic.getState() == Thread.State.NEW) {
					
					
					storemusic.start();
					
					
					
				}
				while(true) {
					background.suspend();
					
					
				System.out.println("                    현재 나의 돈 : " + me.money +"원"               );
				System.out.println("------------------------------------------------------------");
				System.out.println("                         나의 가방                           ");
				
				for(int i =0; i<items.length; i++) {
					if(items[i].countmax>0) {
						System.out.println( items[i].name + " +" + items[i].countmax + "(판매가격 : " + items[i].sellprice + ")");
					
					}
				}
				System.out.println("------------------------------------------------------------");
				System.out.println("                           상점                               ");
				System.out.println("------------------------------------------------------------");
				inventory.store(items);
				System.out.println("------------------------------------------------------------");
				System.out.println("구매모드는 1, 판매모드는 2, 메인메뉴는 3을 누르세요.");
				System.out.print(">>");
				int r = scanner.nextInt();
				
				if(r==1) {
					inventory.store(items);
					System.out.println("------------------------------------------------------------");
					System.out.println("구매하려는 물품의 번호를 입력하세요.");
					System.out.print(">>");
				int t = scanner.nextInt();
				
							if(items[t+2].power==0 && items[t+2].level >= 1) {
					if(items[t+2].price<=me.money){
						System.out.println();
						System.out.println(items[t+2].name+"의 아이템을 구매하였습니다.");
						System.out.println("------------------------------------------------------------");
						items[t+2].count++;
						items[t+2].countmax++;
						me.money= me.money-items[t+2].price;
					}
					else {
						System.out.println("돈이 부족해 구매를 하지 못하였습니다.");
					}
				
				}
				
			
				
				else {
					
					if(items[t+2].price<=me.money&& items[t+2].count == 1 && items[t+2].level<=me.level) {
						System.out.println();
						System.out.println("이미 가지고 있는 아이템 입니다.");
						
						System.out.println();
					}
					else if(items[t+2].level<=me.level && items[t+2].price>me.money && items[t+2].count <=1 ){
						System.out.println();
						System.out.println("돈이 부족합니다.");
						System.out.println();
					}
					else if(items[t+2].price<=me.money && items[t+2].level>me.level && items[t+2].count <=1 ) {
						System.out.println();
						System.out.println("레벨이 부족합니다.");
						System.out.println();
					}
					else if(items[t+2].price<=me.money && items[t+2].level<=me.level && items[t+2].count <= 1) {
						System.out.println();
						System.out.println(items[t+2].name+"의 아이템을 구매하였습니다.");
					
//						System.out.println(items[t+2].name + "의 효과로 " + "체력:" + items[t+2].hp+""
//								+ " ,마나:"+items[t+2].mp +" ,힘:" + items[t+2].power + " ,방어력" + items[t+2].defense +" 이 올랐습니다."  );
						System.out.println("------------------------------------------------------------");
						items[t+2].count++;
						items[t+2].countmax++;
//						me.hp=me.hp + items[t+2].hp;
//						me.mp=me.mp + items[t+2].mp;
//						me.power=me.power + items[t+2].power;
//						me.defense=me.defense + items[t+2].defense;
						me.money= me.money-items[t+2].price;
					
 
					}
				}
				}
				else if(r==2) { 
					System.out.println();
					
					System.out.println("------------------------------------------------------------");
					System.out.println("                         나의 가방                           ");
					inventory.inventoryshow(items);
					System.out.println();
					System.out.println("------------------------------------------------------------");
					System.out.println("현재 판매 모드입니다. 판매할 번호를 입력해주세요.(0을 누르면 뒤로 갑니다.)");
					System.out.println("------------------------------------------------------------");
					System.out.println();
					System.out.print(">>");
					int d1 = scanner.nextInt();
					
//					for( d1 =0; d1<items.length; d1++) {
						
						if(items[d1].countmax>0 && items[d1].power==0 && items[d1].hp==100) { //HP 포션의 경우
							System.out.println();
							System.out.println("------------------------------------------------------------");
							System.out.println(items[d1].name+"의 아이템을 판매하였습니다.");
							me.money = me.money  + items[d1].sellprice;
							System.out.println("신찬식 2세의 돈이 " + items[d1].sellprice +" 만큼 올랐습니다." );
							System.out.println("------------------------------------------------------------");
							items[d1].count--;
							items[d1].countmax--;
							
						}
						else if(items[d1].countmax>0 && items[d1].power==0 && items[d1].mp==100) { //MP 포션의 경우
							System.out.println();
							System.out.println("------------------------------------------------------------");
							System.out.println(items[d1].name+"의 아이템을 판매하였습니다.");
							me.money = me.money  + items[d1].sellprice;
							System.out.println("신찬식 2세의 돈이 " + items[d1].sellprice +" 만큼 올랐습니다." );
							System.out.println("------------------------------------------------------------");
							items[d1].count--;
							items[d1].countmax--;
						}
						
						
						
//						else if(items[d1].countmax>0 && (items[d1].weponspace>0 || items[d1].armorspace >0)) {
//							System.out.println("장착중인 아이템입니다. 해제후에 팔아주세요.");
//						}
						
						else if(items[d1].countmax>0) { //방어구 경우, 무기
							
//							if(items[d1].countmax>0) {
							if(items[d1].armorspace>0 || items[d1].weponspace>0) {
								System.out.println("장착중인 아이템입니다. 해제후에 팔아주세요.");
							}
							else {
							System.out.println();
							System.out.println("------------------------------------------------------------");	
							System.out.println(items[d1].name+"의 아이템을 판매하였습니다.");
								me.money = me.money  + items[d1].sellprice;
								System.out.println("신찬식 2세의 돈이 " + items[d1].sellprice +" 만큼 올랐습니다." );
								System.out.println("------------------------------------------------------------");
								items[d1].count--;
								items[d1].countmax--;
							
//							}
//							else if(items[d1].count<=0 ) {
//								System.out.println("이미 장착중인 아이템입니다.");
//							}
//						
							}
						}
						
						else if(d1 == 0) {
							
						}
						

//					}
				
					
					
				
					
					
				}
				
				
				
				else if(r==3) {
					map.mapshow();
					storemusic.close();
					background.sleep(700);
					background.resume();
					break;
				}
				
			
			}
				
		}
//			else {
//				System.out.println("유효하지 않은 값을 입력하였습니다.");
//				System.out.println();
//				map.mapshow();
//				
//			}
		}
		
	}
}




//@Override
//public void actionPerformed(ActionEvent arg0) {
//	// TODO Auto-generated method stub
//	Time_thread Time_thread = new Time_thread(blThread);
//	Time_thread.start();
//}
}


