import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;
public class GraphicalGuessingGame extends JPanel implements MouseListener{
		int count=1, check=0, x , y, answer, run=0, ran=0, complete=0;
		int an_x1, an_x2, an_y1, an_y2, done=0, county=1, countr=1;
		int check2;
		int[]  positionxr, positionyr, positionxy, positionyy;
		
	public void paint(Graphics comp){
		
		System.out.println(run);
		run+=1;
		Graphics2D comp2D = (Graphics2D) comp;
		
		if (ran<1){
			positionxy=new int[10];
			positionyy=new int[10];
			positionxr=new int[10];
			positionyr=new int[10];
		Random rand = new Random();
		answer=1*rand.nextInt(100);
		System.out.println(answer);
		comp2D.setColor(Color.BLACK);
		}
		//box
		for(int i=0;i<=450;i+=50){
			 for(int j=0; j<=450;j+=50){
				 comp2D.drawRect(j, i, 50, 50);
				 if(count==answer){
					 if(ran<1){
					 an_x1=j;
					 an_x2=j+50;
					 an_y1=i;
					 an_y2=i+50;
					 }
				 }
				 if(run==1){
				 comp2D.drawString(String.valueOf(count), j+25, i+25);}
				 count++;
			 }
		 }
		 int m, n, k, l;
if(complete==1){
	if(countr>=1){
	for(int q=0;q==countr;q++){
		comp2D.setColor(Color.RED);
		comp2D.fillRect(positionxr[q], positionyr[q], 50, 50);
	}}
	if (county>=2){
	for(int w=0;w==county;w++){
		comp2D.setColor(Color.YELLOW);
		comp2D.fillRect(positionxy[w],positionyy[w], 50, 50);
	}}
}
	if(x>=an_x1&&x<=an_x2&&y>=an_y1&&y<=an_y2){
    	comp2D.setColor(Color.GREEN);
    	comp2D.fillRect(an_x1, an_y1, 50, 50);
  	  System.out.println("work");
    	//if (done==1){

    	//}
    	}else if(x>an_x2&&y<=an_y2&&y>=an_y1&&x<500&&y<500&&x>0&&done<1||y>an_y2&&x<500&&y<500&&x>0&&done<1){
    		m=x/50;
    		n=y/50;
    		k=m*50;
    		l=n*50;
    		comp2D.setColor(Color.RED);
    		comp2D.fillRect(k, l, 50, 50);
    		positionxr[countr]=k;
    		positionyr[countr]=l;
    		countr++;
    	check++;	
    	}else if(x<an_x1&&x<500&&y<500&&x>0&&done<1||y<an_y1&&y<500&&x<500&&x>0&&done<1){
    		m=x/50;
    		n=y/50;
    		k=m*50;
    		l=n*50;
    		comp2D.setColor(Color.YELLOW);
    		comp2D.fillRect(k, l, 50, 50);
    		positionxy[county]=k;
    		positionyy[county]=l;
    		county++;
    	check++;
    	}
    	 switch(check){
    	 case 1:
    			//head
    			comp2D.setColor(Color.BLACK);
    			comp2D.fillOval(660, 5, 100, 100);
    			if (check2<=1){
    		 break;}
    	 case 2:
    			//eyes
    			comp2D.setColor(Color.WHITE);
    			comp2D.fillOval(670, 30, 25, 25);
    			comp2D.fillOval(720, 30, 25, 25);
    			comp2D.setColor(Color.BLUE);
    			comp2D.fillOval(675, 45, 10, 10);
    			comp2D.fillOval(725, 45, 10, 10);
    			if (check2<=2){
    		 break;}
    	 case 3:
    			//mouth
    			comp2D.setColor(Color.RED);
    			comp2D.fillOval(685, 70, 55, 20);
    			if (check2<=3){
    		 break;}
    	 case 4:
    			//nose
    			comp2D.setColor(Color.ORANGE);
    			comp2D.fillPolygon(new int[] {700,710,720}, new int[] {70,45,70},3);
    			if (check2<=4){
    		 break;}
    	 case 5:
    			//ear
    			comp2D.setColor(Color.CYAN);
    			comp2D.fillOval(650, 35, 15, 30);
    			comp2D.fillOval(750, 35, 15, 30);
    			if (check2<=5){
    		 break;}
    	 case 6:
    		 comp2D.setColor(Color.PINK);
 			comp2D.fillOval(685, 70, 55, 20);
    		//neck
    			comp2D.setColor(Color.BLACK);
    			comp2D.fillRect(705, 100, 10, 35);
    			if (check2<=6){
    		 break;}
    	 case 7:
    		//chest
    		 comp2D.setColor(Color.BLACK);
    			comp2D.fillRect(670, 130, 80, 150);
    			if (check2<=7){
    		 break;}
    	 case 8:
    		//eyes
 			comp2D.setColor(Color.RED);
 			comp2D.fillOval(670, 30, 25, 25);
 			comp2D.fillOval(720, 30, 25, 25);
 			comp2D.setColor(Color.BLUE);
 			comp2D.fillOval(675, 45, 10, 10);
 			comp2D.fillOval(725, 45, 10, 10);
    		//arms
    		 comp2D.setColor(Color.BLACK);
    			comp2D.fillRect(600, 140, 70, 20);
    			comp2D.fillRect(750, 140, 70, 20);
    			if (check2<=8){
    		 break;}
    	 case 9:
    		//arms
    		 comp2D.setColor(Color.GREEN);
 			comp2D.fillRect(600, 140, 70, 20);
 			comp2D.fillRect(750, 140, 70, 20);
    		 comp2D.setColor(Color.BLACK);
    		 //legs
    			comp2D.fillRect(690, 280, 10, 100);
    			comp2D.fillRect(720, 280, 10, 100);
    			comp2D.setColor(Color.MAGENTA);
    			comp2D.drawArc(650, 20, 130, 100, 15, -200);
    		 break;
    		 default://System.out.println("oops");
    			 break;
    	 }
		  if (done==1){
			  done++;
			  count=1;
			  run=0;
			  check2=check;
			  if(check>0){
				 check=1;
				 complete=1;}
			  Canvas c = new Canvas();
		    	repaint();
		    	c.done();  
		  }
	   	  if (check>=9){
	   		count=1;
			  run=0;
			  check2=check;
				 check=0;
				 complete=1;
			 Canvas c = new Canvas();
			 repaint();
			 c.gameover();
		 }
	   	  ran++;
	}
	
	   public void mousePressed(MouseEvent e) {}
	     public void mouseReleased(MouseEvent e) {}
	     public void mouseEntered(MouseEvent e) {}
	     public void mouseExited(MouseEvent e) { }
	     

	     public void mouseClicked(MouseEvent e) {
	    	 
	    	 Point pos=e.getPoint();
	    	 x=(int)(pos.getX());
	    	 y=(int)(pos.getY());
	    	 System.out.println(x);
	    	 System.out.println(y);
	    	 //System.out.println(answer);
		   	  if(x>=an_x1&&x<=an_x2&&y>=an_y1&&y<=an_y2){
				  done=1;
			  }
	    	repaint(); }
	
}