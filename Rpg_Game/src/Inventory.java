

public class Inventory {
	
	Item items[] = new Item[10];
	public Inventory() {
	
//		items[0] = new Item("�𵥵��� ����",0,0,0,0,0,100,0);
//		items[1] = new Item("��ũ�� ���",0,0,0,0,0,300,0);
//		items[2] = new Item("��ũ������ ū ��",0,0,0,0,0,1000,0);
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
				System.out.println((i-2)+"." + items[i].name + "�� ���� : " + items[i].price +"��"+"(���ݷ�:+"+items[i].power+" ����:+"+items[i].defense+" ü��:+"+items[i].hp+" ����:+"+items[i].mp+")");
			}
		}
		
	
	}
	
		
	
	
	
	public void inventoryshow(Item[] items){				
		for(int i =0; i<items.length; i++) {
			if(items[i].countmax>0) {
//				System.out.println(i + "."+ items[i].name + "�� " + items[i].countmax + "�� �ֽ��ϴ�."+"(�ǸŰ��� : " + items[i].sellprice + ")");
				System.out.println(i + "."+ items[i].name + " +" + items[i].countmax + "(�ǸŰ��� : " + items[i].sellprice + ")");
			}

		}
	}
//
	public void huntdrop(Item[] items, int a) {
		for(int i =0; i<items.length; i++) {
			if(items[i].name == "�𵥵��� ����" && a==1) {
				items[i].countmax++;
				
				System.out.println("------------------------------------------------------------");
				System.out.println(items[i].name + "�� ���� 1���� ȹ���Ͽ����ϴ�.");
				System.out.println("------------------------------------------------------------");
				System.out.println();
			}
			else if(items[i].name == "����� ���"&& a==2) {
				items[i].countmax++;
				
				System.out.println("------------------------------------------------------------");
				System.out.println(items[i].name + "�� ���� 1���� ȹ���Ͽ����ϴ�.");
				System.out.println("------------------------------------------------------------");
				System.out.println();
			}
			else if(items[i].name == "��� ������ ��ȥ"&& a==3) {
				items[i].countmax++;
				
				System.out.println("------------------------------------------------------------");
				System.out.println(items[i].name + "�� ���� 1���� ȹ���Ͽ����ϴ�.");
				System.out.println("------------------------------------------------------------");
				System.out.println();
			}
			
		}
	}
		





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
