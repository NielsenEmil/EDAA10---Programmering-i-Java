
public class Frog {
	private int x,y;
	
	public Frog(){
		x = 0;
		y = 0;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void jumpNorth(){
		y++;
	}
	public void jumpEast(){
		x++;
	}
	public void jumpSouth(){
		y--;
	}
	public void jumpWest(){
		x--;
	}
	
}
