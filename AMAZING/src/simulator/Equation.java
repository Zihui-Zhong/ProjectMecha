package simulator;

public class Equation {

	//aX+bY=c
	private double a,b,c;
	//true = up, false = down
	private boolean side;
	
	public Equation(double a, double b, double c,boolean side){
		this.a=a;
		this.b=b;
		this.c=c;
		this.side=side;
	}
	
	public Equation(Coord p1, Coord p2,boolean side){
		a=p2.getY()-p1.getY();
		b=-(p2.getX()-p1.getX());
		c=a*p1.getX()+b*p1.getY();
		
		if(c<0){
			a=-a;
			b=-b;
			c=-c;
		}
		this.side=side;
	}
	
	public boolean isInside(Coord coord){
		if(side){
			if((coord.getX()*a+coord.getY()*b)>=c)
				return true;
		}else{
			if(((coord.getX()*a+coord.getY()*b)<=c))
				return true;
		}
		return false;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public boolean isSide() {
		return side;
	}

	public void setSide(boolean side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Equation [a=" + a + ", b=" + b + ", c=" + c + ", side=" + side
				+ "]";
	}
	
	
}
