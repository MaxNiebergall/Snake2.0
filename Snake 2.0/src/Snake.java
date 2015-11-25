import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Snake{
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		new Snake();
	}
	
	Snake(){
		JFrame frame = new JFrame();
		JPanel pane = new JPanel();
		
		frame.add(pane);
		SnakeObject snake = new SnakeObject();
		
	}
}


