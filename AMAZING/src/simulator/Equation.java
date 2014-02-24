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
		this.side=side;
		if(a==0){
			b=1;	
			c=p1.getY();
		}else{
			if(b==0){
				a=1;
				c=p1.getX();
			}else{
				 c=a*p1.getX()+b*p2.getY();
				 if(!isInside(new Coord(p1.getX(),p1.getY()+1))){
					a=-a;
					b=-b;
					c=-c;
				 }
				 	
			}
		}

		
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
