

public class Inventory {
	
	Item items[] = new Item[10];
	public Inventory() {
	
//		items[0] = new Item("언데드의 심장",0,0,0,0,0,100,0);
//		items[1] = new Item("오크의 사념",0,0,0,0,0,300,0);
//		items[2] = new Item("오크대장의 큰 뿔",0,0,0,0,0,1000,0);
//		items[3] = new Item("33",0,0,0,0,0,100,0);
//		items[4] = new Item("44",0,0,0,0,0,100,0);
//		items[5] = new Item("55",0,0,0,0,0,100,0);
//		items[6] = new Item("66",0,0,0,0,0,100,0);
//		items[7] = new Item("77",0,0,0,0,0,100,0);
//		items[8] = new Item("88",0,0,0,0,0,100,0);
//		items[9] = new Item("99",0,0,0,0,0,100,0);
	}
	
	public void store(Item[] items) { 
		
		for(int i =3 ; i<items.length; i++) {
			if(items[i]!=null) {
				System.out.println((i-2)+"." + items[i].name + "의 가격 : " + items[i].price +"원"+"(공격력:+"+items[i].power+" 방어력:+"+items[i].defense+" 체력:+"+items[i].hp+" 마나:+"+items[i].mp+")");
			}
		}
		
	
	}
	
		
	
	
	
	public void inventoryshow(Item[] items){				
		for(int i =0; i<items.length; i++) {
			if(items[i].countmax>0) {
//				System.out.println(i + "."+ items[i].name + "이 " + items[i].countmax + "개 있습니다."+"(판매가격 : " + items[i].sellprice + ")");
				System.out.println(i + "."+ items[i].name + " +" + items[i].countmax + "(판매가격 : " + items[i].sellprice + ")");
			}

		}
	}
//
	public void huntdrop(Item[] items, int a) {
		for(int i =0; i<items.length; i++) {
			if(items[i].name == "언데드의 심장" && a==1) {
				items[i].countmax++;
				
				System.out.println("------------------------------------------------------------");
				System.out.println(items[i].name + "의 개수 1개를 획득하였습니다.");
				System.out.println("------------------------------------------------------------");
				System.out.println();
			}
			else if(items[i].name == "고블린의 사념"&& a==2) {
				items[i].countmax++;
				
				System.out.println("------------------------------------------------------------");
				System.out.println(items[i].name + "의 개수 1개를 획득하였습니다.");
				System.out.println("------------------------------------------------------------");
				System.out.println();
			}
			else if(items[i].name == "고블린 대장의 원혼"&& a==3) {
				items[i].countmax++;
				
				System.out.println("------------------------------------------------------------");
				System.out.println(items[i].name + "의 개수 1개를 획득하였습니다.");
				System.out.println("------------------------------------------------------------");
				System.out.println();
			}
			
		}
	}
		





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
