import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;


public class Music extends Thread{
	private Player player;
	private boolean isLoop;// 곡이 무한반복인지 한번만 재생되는지 설정
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
    
    
    // constructor that takes the name of an MP3 file
	public Music(String name, boolean isLoop) {//생성자
		// 곡의 제목과 무한반복인지의 유무
		this.isLoop = isLoop;
		try {// 예외처리
			
			file = new File("/Users/minbyeongjun/eclipse-workspace/Rpg_Game/src/music/"+ name);
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
			
		}catch(Exception e) {// 오류 발생 시
			System.out.println(e.getMessage());
		}
	}

	public int getTime() {// 실행되고 있는 음악이 어떤 위치인지 알려줌
		if(player == null)
			return 0;
		return player.getPosition();
	}
	public void close() { // 음악 종료
		isLoop = false;
		player.close();
		this.interrupt();
	}
    // play the MP3 file
	public void run() {
		try {
			do {
				player.play();//곡 실행
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
				
			}while(isLoop);//isLoop가 true이면 무한반복
			
		}catch(Exception e) {// 오류 발생 시
			System.out.println(e.getMessage());
		}
	}
    
    
    

    
    public static void main(String[] args) {
        
        //plays 07.mp3 file located at C drive
    	
  
    	
    }

}