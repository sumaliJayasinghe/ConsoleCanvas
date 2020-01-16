package main.shapes;

public class Fill extends Shapes {
	
	private void paint(int x, int y, char color,char[][] canvasArray) {
		if(canvasArray[x][y]== ' ') {
			canvasArray[x][y]= color;
			
			paint(x-1,y,color,canvasArray);
			paint(x+1,y,color,canvasArray);
			paint(x,y-1,color,canvasArray);
			paint(x,y+1,color,canvasArray);
			
		}
	}

	public void fill(int x, int y, char color,char[][] canvasArray) {
	
		paint(x,y,color,canvasArray);
		
	}

	@Override
	public
	void execute(String[] command,char[][] canvasArray) {
		int x1 = 0; 
		int y1 = 0;
		
		x1 = Integer.parseInt(command[1]);
		y1 = Integer.parseInt(command[2]);
		char color = command[3].charAt(0);
		
		fill(x1, y1, color,canvasArray);
	}

}
