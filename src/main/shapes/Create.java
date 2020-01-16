package main.shapes;

public class Create extends Shapes{
	
	public Create() {}
	
	private void createCanvas(char[][] canvasArray) {
		for (int i = 0; i < canvasArray.length; i++) {
			for (int j = 0; j < canvasArray[i].length; j++) {
				if (i == 0 || i == canvasArray.length - 1) {
					canvasArray[i][j] = '-';
		        } else if (j == 0 || j == canvasArray[i].length - 1) {
		        	canvasArray[i][j] = '|';
		        } else {
		        	canvasArray[i][j] = ' ';
		        }
			}
		}
		
//		return canvasArray;
		
	}
	
	
	@Override
	public
	void execute(String[] command,char[][] canvasArray) {
		createCanvas(canvasArray);
	}

}
