package hemant;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class guiMouseEvent extends JFrame{
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public guiMouseEvent(){
		super("Title");
		//setLayout(new FlowLayout());
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener{
		public void mouseClicked(MouseEvent event){
			statusbar.setText(String.format("Clicked at %d %d", event.getX(), event.getY()));	
		}
	
		public void mousePressed(MouseEvent event){
			statusbar.setText("You pressed down the mouse");
		}
		
		public void mouseReleased(MouseEvent event){
			statusbar.setText("You released down the mouse");
		}
		
		public void mouseEntered(MouseEvent event){
			statusbar.setText("You entered the area");
			mousepanel.setBackground(Color.RED);
		}
		
		public void mouseExited (MouseEvent event){
			statusbar.setText("the mouse has left the window");
			mousepanel.setBackground(Color.WHITE);
		}
		
		// these are mouse motion event
		public void mouseDragged (MouseEvent event){
			statusbar.setText("ypu are dragging the mouse");
		}
		
		public void mouseMoved(MouseEvent event){
			statusbar.setText("ou moved the mouse");
		}
	}
}
