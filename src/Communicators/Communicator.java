package Communicators;

import game.Snake;

public abstract class Communicator {
	
	abstract public String getCommand();
	abstract public void sent(String msg);
	
	private Snake snake;
	
	public Communicator(Snake snake){
		this.snake = snake;
	}
}
