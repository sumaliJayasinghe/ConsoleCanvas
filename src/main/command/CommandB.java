package main.command;

import main.exception.ConverseException;
import main.shapes.Line;

public class CommandB {

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
		
		if(command[3].getClass().getName() == "String") {
			return false;
		}
		
		return true;
	}
	
	
	private boolean validatecommand(String[] command) throws ConverseException {
		
		try {
			return (validateLength(command) && validateCharactors(command));
			
		}catch(Exception e) {
			throw new ConverseException("Please enter valid inputs.") ;
		}
		
	}
	
	
	
}
