package main.shapes;

public class Rectangle extends Shapes {
	
	private void drawLine(int x1, int y1, int x2, int y2, char[][] canvasArray) {
		
		for(int i = y1; i <= y2;i++) {
			for(int j = x1; j <= x2;j++) {
				canvasArray[i][j] = 'x';
			}			
		}
		
	}
	
	public void drawRectangle(int x1, int y1, int x2, int y2,char[][] canvasArray) {
		
		drawLine(x2,y2,x2,y1,canvasArray);
		drawLine(x1,y2,x2,y2,canvasArray);
		drawLine(x1,y2,x1,y1,canvasArray);
	
	}

	@Override
	public
	void execute(String[] command,char[][] canvasArray) {
		int x1 = 0; 
		int y1 = 0;
		int x2 = 0; 
		int y2 = 0;
		
		x1 = Integer.parseInt(command[1]);
		y1 = Integer.parseInt(command[2]);
		x2 = Integer.parseInt(command[3]);
		y2 = Integer.parseInt(command[4]);
		
		drawRectangle(x1, y1, x2, y2,canvasArray);
	}

}
