package game;

import game.item.Item;
import game.Snake;

public class Cell {
	public Item item;
	
	public Boolean isObstructedTo(Snake snake){
		return snake.head.getToughness()>=item.getToughness();
	}
}
