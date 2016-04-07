package Communicators;

import java.util.function.Consumer;
import java.util.function.Supplier;

import game.Snake;

public class localCommunicator extends Communicator {
	
	private Supplier<String> getUserInput;
	private Consumer<String> sentCommand;

	public localCommunicator(Snake snake, Supplier<String> getUserInput, Consumer<String> sentCommand) {
		super(snake);
		this.getUserInput = getUserInput;
		this.sentCommand = sentCommand;
	}

	@Override
	public String getCommand() {
		return getUserInput.get();
	}

	@Override
	public void sent(String msg) {
		sentCommand.accept(msg);
	}

}
