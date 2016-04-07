package Communicators;

import networkCommunication.ClientThread;
import game.Snake;

public class netCommunicators extends Communicator {
	
	private ClientThread client;

	public netCommunicators(Snake snake, ClientThread client) {
		super(snake);
		this.client = client;
	}

	@Override
	public String getCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sent(String msg) {
		// TODO Auto-generated method stub

	}

}
