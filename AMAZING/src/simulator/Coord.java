package simulator;

public class Coord 
{

	private double x, y;
	public Coord(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Coord minus(Coord coord) {
		return new Coord(this.x-coord.getX(),this.y-coord.getY());
	}
	
}
