package game;

import java.util.ArrayList;

import game.item.SnakeBody;

public class Snake {
	public SnakeBody head;
	public SnakeBody tail;
	public ArrayList<SnakeBody> body;
	
	public Snake(int headX, int headY, int tailX, int tailY, Cell[][] grid) throws Exception{
		if (headX == tailX) {
			makeBody(Math.abs(tailY-headY)-1);
			int incY;
			if (tailY>headY) incY = 1; incY = -1;
			putOnGrid(headX, headY, 0, incY, grid);
		}else
		if (headY == tailY) {
			makeBody(Math.abs(tailX-headX)-1);
			int incX;
			if (tailX>headX) incX = 1; incX = -1;
			putOnGrid(headX, headY, incX, 0, grid);
		}else
			throw new Exception("Can not create this snake!");
	}
	
	private void makeBody(int length){
		body.add(new SnakeBody(null, null));
		for (int i=1; i<length; i++){
			body.add(new SnakeBody(body.get(i-1), null));
			body.get(i-1).next = body.get(i);
		}
		head = body.get(0);
		tail = body.get(body.size()-1);
	}
	
	private void putOnGrid(int orginX, int orginY, int incX, int incY, Cell[][] grid){
		int x = orginX;
		int y = orginY;
		for (int i=0; i<body.size(); i++) {
			grid[x][y].item = body.get(i);
			x += incX;
			y += incY;
		}
	}
}
