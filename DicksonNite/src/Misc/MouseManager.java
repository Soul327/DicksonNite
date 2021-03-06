package Misc;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager implements MouseListener, MouseMotionListener {

	public static boolean leftPressed, rightPressed;
	public static int mouseX, mouseY;
	
	public MouseManager(){
		
	}
	// Getters
	public boolean isLeftPressed(){return leftPressed;}
	public boolean isRightPressed(){return rightPressed;}
	public int getMouseX(){return mouseX;}
	public int getMouseY(){return mouseY;}
	// Implemented methods
	
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1)
			leftPressed = true;
		else if(e.getButton() == MouseEvent.BUTTON3)
			rightPressed = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1)
			leftPressed = false;
		else if(e.getButton() == MouseEvent.BUTTON3)
			rightPressed = false;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
	}
	@Override
	public void mouseDragged(MouseEvent e){
		mouseX = e.getX();
		mouseY = e.getY();
	}
	@Override
	public void mouseClicked(MouseEvent e){
		//System.out.println("Oh you clicked me! Mouse Clicked Screen");
	}
	@Override
	public void mouseEntered(MouseEvent e){
		//System.out.println("Oh there you are! Mouse Entered Screen");
	}
	@Override
	public void mouseExited(MouseEvent e){
		//System.out.println("Where did you go? Mouse Exited Screen");
	}
}