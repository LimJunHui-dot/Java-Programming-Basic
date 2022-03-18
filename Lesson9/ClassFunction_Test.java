package Lesson9;

class Mypoint
{
	private int x;
	private int y;
	
	public Mypoint()
	{
		x = 0;
		y = 0;
	}
	
	public Mypoint(int px, int py)
	{
		if(px >= 0 && px <= 100) {
			x = px;
		}
		else x =0;
		
		if(py >= 0 && py <= 100) {
			y = py;
		}
		else y = 0;
	}
	
	public void setX(int px) {
		if(px >= 0 && px <= 100) {
			x = px;
		}
	}
	
	public void setY(int py) {
		if(py >= 0 && py <= 100) {
			y = py;
		}
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
}

public class ClassFunction_Test {

	public static void main(String[] args) {
		Mypoint p1;
		p1 = new Mypoint();
		p1.setX(10);
		p1.setY(5);
		
		int px1 = p1.getX();
		int py1 = p1.getY();
		 
		System.out.println("p1의 X좌표는 " + px1 + " Y 좌표는 " + py1 + " 이었습니다.");
		
		Mypoint p2;
		p2 = new Mypoint(20, 15);
		p2.setX(20);
		p2.setY(15);
		
		int px2 = p2.getX();
		int py2 = p2.getY();
		
		System.out.println("p2의 X좌표는 " + px2 + " Y 좌표는 " + py2 + " 이었습니다.");
		
	}

}
