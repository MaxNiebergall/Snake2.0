import java.awt.Dimension;

public class SnakeObject{
	int size=1;// The length of the snake
	SnakeObject next; // The next part of the snake
	Dimension location = new Dimension(0,0); // The location of this snake part
	boolean hasNextSnake= false;
	
	
	SnakeObject(){
		
	}
	
	public void lengthenSnake(){
		if(hasNextSnake){
			next.lengthenSnake();
		}
		else{
			hasNextSnake=true;
			next = new SnakeObject();
		}
	}
	
	public void moveRight(){
		if(hasNextSnake){
			next.moveRight();
		}
		
		location.width=location.width+1;
	}
	public void moveLeft(){
		if(hasNextSnake){
			next.moveLeft();
		}
		
		location.width=location.width-1;
	}
	public void moveUp(){
		if(hasNextSnake){
			next.moveUp();
		}
		
		location.height=location.height-1;
	}
	public void moveDown(){
		if(hasNextSnake){
			next.moveDown();
		}
		
		location.height=location.height+1;
	}
	
}