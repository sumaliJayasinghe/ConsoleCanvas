package main.command;

import main.shapes.Heptagon;
import main.shapes.Octagon;
import main.shapes.Pentagon;
import main.shapes.Polygon;
import main.shapes.Square;
import main.shapes.Triangle;

public class CommandFactory {
	public Polygon getPolygon(int numberOfSides) {
        if(numberOfSides == 3) {
            return new Triangle();
        }
        if(numberOfSides == 4) {
            return new Square();
        }
        if(numberOfSides == 5) {
            return new Pentagon();
        }
        if(numberOfSides == 7) {
            return new Heptagon();
        }
        else if(numberOfSides == 8) {
            return new Octagon();
        }
        return null;
    }

}
