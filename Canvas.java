

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Canvas extends JFrame {
	JButton n = new JButton();
	 public Canvas() {
		// super ("Hang Man");
		 //JFrame h = new JFrame();
		 //h.setDefaultCloseOperation(h.EXIT_ON_CLOSE);
		 //h.setSize(1000,800);
		 //h.setLocation(100,100);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(1000,800);
		 GraphicalGuessingGame  g = new GraphicalGuessingGame();
		 g.addMouseListener(g);
		 getContentPane().add(g);
	 }
	 public void done(){
	     	JOptionPane.showConfirmDialog(null,"Congrats you won","",JOptionPane.CLOSED_OPTION);
	     	System.exit(0);
	 }
	public void gameover() {
		JOptionPane.showConfirmDialog(null,"You lost","",JOptionPane.CLOSED_OPTION);
     	System.exit(0);
		
	}

}
