import java.awt.FileDialog;

import javax.swing.JFrame;


public class main1 extends JFrame {
	
	public static void main(String[] args){
		
		run();


		
	}
	public static void run(){
		t1.start();
		t2.start();
	}
	static Thread t1 = new Thread(){
		public void run(){
			JFrame a = new JFrame();
			FileDialog fd=new FileDialog(a,"pick a file:",FileDialog.LOAD);
			fd.setFile("*.wav*");	//get only wav files
			fd.setVisible(true);
			String path=fd.getDirectory();
			String file=fd.getFile();
			int num=0;
			//System.out.println("hello");
			//while (t2.isAlive()==true){
				if(num>0){num=0;}
			PlayMusicProgressBar music = new PlayMusicProgressBar();
			music.playMusicProgressBar(path, file, num);
			music.setVisible(true);
			num++;
		}//}
	};
	static Thread t2 = new Thread(){
		public void run(){
			
			Canvas draw = new Canvas();
			draw.setVisible(true);
			//game.main();
		}
	};
}
