package main.command;

import main.exception.ConverseException;

public class CommandR {
	
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
		
		try {
			int x1 = Integer.parseInt(command[1]);
			int y1 = Integer.parseInt(command[2]);
			int x2 = Integer.parseInt(command[3]);
			int y2 = Integer.parseInt(command[4]);
				
		}catch (NumberFormatException e){
				throw e;
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
}
