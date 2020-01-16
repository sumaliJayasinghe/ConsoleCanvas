package main.app;

import java.io.InputStreamReader;
import java.util.Scanner;

import main.command.CommandC;
import main.draw.Canvas;
import main.exception.ConverseException;
import main.shapes.Create;
import main.shapes.Line;

public class App {

	
	public static Canvas canvas = null;
	
	public static void main(String args[]) throws Exception {
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new InputStreamReader(System.in));
			
			System.out.print("enter command: ");
			
			String inputCmd = scanner.nextLine();;
			
			
			App canvasApp = new App();
			
			while(!inputCmd.equals("Q")) {
				
				String[] splitCmd = inputCmd.split(" ");
			
				if(!inputCmd.isEmpty()) {
				
					canvasApp.routingCommand(splitCmd);
					
					System.out.print("enter command: ");
					
					inputCmd = scanner.nextLine();
					
				}else {
					System.out.println("********** Thank you for playing with us ********");

				}
			}
				
			
			
		}finally {
			
		    if(scanner!=null)
		        scanner.close();
		}
		
	}
	
	public void routingCommand(String[] splitter) throws ConverseException  {
		
		if(!splitter[0].equals(new String("c")) && canvas == null) {
			new ConverseException("No canvas found");
			
		}else {
			
			switch(splitter[0]) {
			
			case "c":
				int width;
				int height;
				
				if(!splitter[1].isEmpty() && !splitter[2].isEmpty()) {
					try {
						width = Integer.parseInt(splitter[1]);
						
					}catch(Exception e) {
						throw new ConverseException("Width input is wrong") ;
					}
					
					try {
						height = Integer.parseInt(splitter[2]);
						
					}catch(Exception e) {
						throw new ConverseException("Height input is wrong") ;
					}
					
//					System.out.println("Creating Canvas....");
					// create canvas
					canvas = Canvas.getInstance();
					
					canvas.createCanvas(width, height);
					
					CommandC neCreate = new CommandC();
					
					neCreate.execute(splitter,canvas.canvas);
					canvas.printCanvas();
					
				}else {
					System.out.println(" Wrong input command. Please enter your input again ");
				}
				
				break;
//			case "l":
//				int x1;
//				int x2;
//				int y1;
//				int y2;
//				
//				if(!splitter[1].isEmpty() && !splitter[2].isEmpty()&& !splitter[3].isEmpty()&& !splitter[4].isEmpty()) {
//					try {
//						x1 = Integer.parseInt(splitter[1]);
//						y1 = Integer.parseInt(splitter[2]);
//						x2 = Integer.parseInt(splitter[3]);
//						y2 = Integer.parseInt(splitter[4]);
//						
//						
//					}catch(Exception e) {
//						throw new ConverseException("wrong input") ;
//					}
//					
//					
//					int[] firstPoint = {x1,y1};
//					int[] secondPoint = {x2,y2};
//					
//					Line line = new Line();
//					System.out.print("drawing line: ");
//					char[][] canvasArray = line.execute(splitter,canvas.canvas);
//					canvas.printCanvas();
//					
//				}else {
//					System.out.println(" Wrong input command. Please enter your input again ");
//				}
//				
//				break;
//			case "r":
//				int px1;
//				int px2;
//				int py1;
//				int py2;
//				
//				if(!splitter[1].isEmpty() && !splitter[2].isEmpty()&& !splitter[3].isEmpty()&& !splitter[4].isEmpty()) {
//					try {
//						px1 = Integer.parseInt(splitter[1]);
//						py1 = Integer.parseInt(splitter[2]);
//						px2 = Integer.parseInt(splitter[3]);
//						py2 = Integer.parseInt(splitter[4]);
//						
//						
//					}catch(Exception e) {
//						throw new ConverseException("wrong input") ;
//					}
//					
//					
//					int[] firstPoint = {px1,py1};
//					int[] secondPoint = {px2,py2};
//					canvas.drawRectangle(px1, py1,px2,py2);
//					
//				}else {
//					System.out.println(" Wrong input command. Please enter your input again ");
//				}
//				break;
//			case "b":
//				int x = Integer.parseInt(splitter[1]);
//				int y = Integer.parseInt(splitter[2]);
//				
//				canvas.fill(x,y,splitter[3]);
//				break;
//				default:
//					System.out.println(" No command found ");
			}
		
			
		}
		
	}
	
}
