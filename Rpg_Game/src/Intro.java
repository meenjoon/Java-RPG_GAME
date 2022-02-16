
public class Intro extends Thread{

String typing ;
	

	public Intro(String string) {
	
	this.typing = string;
}

	public void run() {
		try {
			  for (int i = 0; i < typing.length(); i++) {
			      Thread.sleep(50);
				  System.out.print( typing.charAt(i) );
			    }
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
