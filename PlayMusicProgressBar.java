
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;


public class PlayMusicProgressBar extends JFrame {
	
		void playMusicProgressBar(String path, String file, int num){

			JFrame c=new JFrame();
			c.setDefaultCloseOperation(c.EXIT_ON_CLOSE);
			//b.setLocation(100, 100);
			System.out.println("made it");
			File audioFile = new File(path+file);
			try{
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			AudioFormat format = audioStream.getFormat();
			long frames = audioStream.getFrameLength();
			
			int duration=(int) ((frames)/format.getFrameRate());
			JProgressBar pb= new JProgressBar(0, duration);
			pb.setStringPainted(true);
			c.setTitle("Music");
			c.getContentPane().add(pb);
			c.pack();
			c.setVisible(true);
			System.out.println(duration*1000000);
			DataLine.Info info = new DataLine.Info(Clip.class,  format);
			Clip audioClip = (Clip) AudioSystem.getLine(info);
			audioClip.open(audioStream);
			audioClip.start();
	 
			while (num<=duration)
			{
				pb.setValue(num);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){}
				num+=1;
			}
			   audioClip.close();
			}catch(UnsupportedAudioFileException ex){
				System.out.println("audio file does not work");
			}catch(LineUnavailableException ex){
				System.out.println("audio file opened but unable to play");
			}catch(IOException ex){
				System.out.println("oops something went wrong");
			}

		c.dispose();
		}

}

