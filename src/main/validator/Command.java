package main.validator;

import main.draw.Canvas;

abstract class Command {
	
	public abstract int execute(String[] parameters);

    public abstract boolean validateLength(String[] parameters);
    
    protected Canvas canvas;

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    
    public boolean validate(String[] parameters) {
        if (parameters == null) {
            return false;
        }
        if (this.canvas == null) {
            System.out.println("You nee to Create a Canvas first");
            return false;
        }
        return validateLength(parameters) && validateTypes(parameters);
    }

    public boolean validateTypes(String[] parameters) {
        for (String param : parameters) {
            if (!isInteger(param)) {
                System.out.println("Parameter (" + param + ") is not and integer");
                return false;
            }
        }
        return true;
    }
    
    protected static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    protected static boolean validateParams(String[] parameters) {
        if (parameters == null) {
            System.out.println("Parameters are missing");
            return false;
        }
        return true;
    }

}
