package main.draw;

public class Canvas{
	public static char canvas [][];
	
	private static Canvas canvas_instance = null; 
	
	private Canvas() {}
	
	public static Canvas getInstance() {
		if (canvas_instance == null) 
			canvas_instance = new Canvas();
  
        return canvas_instance;
    }
	
	public void createCanvas(int width, int height ){
		int w = width+2; // count the two borders
		int h = height+2; //count the two borders
		canvas = new char [w][h];
	}
	
	/**
	 * Print canvas
	 */
	public void printCanvas() {
		for (int i = 0; i < canvas.length; i++) {
           for (int j = 0; j < canvas[i].length; j++) {
               System.out.print(canvas[i][j]);
           }
           System.out.println();
       }
		
	}
	
}


//package main.draw;
//
//public class Canvas extends AbastractCanvas {
//	private int width;
//	private int height;
//	
//    static char canvas [][];
//    
//	public Canvas(){}
//	
//	public Canvas(int width, int height ){
//		this.setWidth(width+2); // count the two borders
//		this.setHeight(height+2); //count the two borders
//		canvas = new char [width][height];
//	}
//	
//	public int getWidth() {
//		return width;
//	}
//
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
//	
//
//	public int getHeight() {
//		return height;
//	}
//
//
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	
//	public void drawCanvas() {
//		
//	}
//	
//	/**
//	 * Print canvas
//	 */
//	public void printCanvas() {
//		for (int i = 0; i < canvas.length; i++) {
//            for (int j = 0; j < canvas[i].length; j++) {
//                System.out.print(canvas[i][j]);
//            }
//            System.out.println();
//        }
//		
//	}
//	
////	public void createCanvas() {
////		
////		for (int i = 0; i < canvas2d.length; i++) {
////			for (int j = 0; j < canvas2d[i].length; j++) {
////				if (i == 0 || i == canvas2d.length - 1) {
////					canvas2d[i][j] = "-";
////                } else if (j == 0 || j == canvas2d[i].length - 1) {
////                	canvas2d[i][j] = "|";
////                } else {
////                	canvas2d[i][j] = " ";
////                }
////			}
////		}
////		
////		for (int i = 0; i < canvas2d.length; i++) {
////            for (int j = 0; j < canvas2d[i].length; j++) {
////                System.out.print(canvas2d[i][j]);
////            }
////            System.out.println();
////        }
////		
////		
////	}
//	
////	
//	
//	
////public void drawRectangle(int x1, int y1, int x2, int y2) {
////		drawLine(x1,y1,x2,y1);
////		drawLine(x2,y2,x2,y1);
////		drawLine(x1,y2,x2,y2);
////		drawLine(x1,y2,x1,y1);
////		
////	}
//
////	public void fill(int x, int y, String color) {
////		paint(x,y,color);
////		for (int i = 0; i < canvas2d.length; i++) {
////            for (int j = 0; j < canvas2d[i].length; j++) {
////                System.out.print(canvas2d[i][j]);
////            }
////            System.out.println();
////        }
////	}
//
////	private void paint(int x, int y, String color) {
////		
////		if(canvas2d[x][y]== " ") {
////			canvas2d[x][y]= color;
////			paint(x-1,y,color);
////			paint(x+1,y,color);
////			paint(x,y-1,color);
////			paint(x,y+1,color);
////		}
////		
////
////		
////		
////	}
//
//
//
//
//	
//}
