package hemant;
import java.io.IOException;

import javax.swing.JFrame;

// Comment
public class apples {
	public static void main(String args[]) throws IOException{
		
		/*guiAdapter gui = new guiAdapter();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,200);
		gui.setVisible(true);*/ // GUI Operations
		
		fileRead f = new fileRead();
		f.openFile();
		f.readFile();
		f.closeFile();
	}
}
