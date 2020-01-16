package main.command;

import main.exception.ConverseException;
import main.shapes.Line;

public class CommandL {
	
	private boolean validateLength(String[] splitter) {
		if(splitter.length != 4) {
			return false;
		}
		
		return true;
	}
	
	private boolean validateCharactors(String[] command) {
		
		if(command[0].getClass().getName() == "String") {
			return false;
		}
		
		return true;
	}
	
	
	public boolean validatecommand(String[] command) throws ConverseException {
		
		try {
			return (validateLength(command) && validateCharactors(command));
			
		}catch(Exception e) {
			throw new ConverseException("Please enter valid inputs.") ;
		}
		
	}
	
	public void execute(String[] command, char[][] canvasArray) throws ConverseException {
		if(validatecommand(command)) {
			Line line = new Line();
			line.execute(command,canvasArray);
		}
	}

}
