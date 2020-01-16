package main.command;

import main.exception.ConverseException;
import main.shapes.Create;
import main.shapes.Line;

public class CommandC {
	
	private boolean validateLength(String[] splitter) {
		if(splitter.length != 3) {
			return false;
		}
		
		return true;
	}
	
	private boolean validateCharactors(String[] command) {
		
		if(command[0].getClass().getName() == "String") {
			return false;
		}
		
		if(Integer.parseInt(command[1]) < 0) {
			return false;
		}
		
		if(Integer.parseInt(command[1]) < 0) {
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
			Create createM = new Create();
			createM.execute(command,canvasArray);
		}
	}

}
