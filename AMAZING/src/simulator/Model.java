package simulator;

public class Model {

	private Equation[] equations;
	private int length;
	private Coord coord;
	private double rotation;
	private Matrix2d rotationMatrix;
	private Coord[] points;
	
	
	public Model(Coord[] a){
		length= a.length;
		points=a;
		generateEquation();
	}
	public Model(Coord[] a, Coord b){
		length= a.length;
		coord=b;
		points=a;
		generateEquation();
	}
	public Model(Coord[] a,Coord b, double c){
		length= a.length;
		coord=b;
		points=a;
		rotation=c;
		rotationMatrix= new Matrix2d(c);
		equations = new Equation[length];
		generateEquation();
	}
	
	private void generateEquation(){
		Coord middle= new Coord(0,0);
		for(int i=0;i<length;i++){
			middle.setY(middle.getY()+points[i].getY());
			middle.setX(middle.getX()+points[i].getX());
			
		}
		middle.setY(middle.getY()/length);
		middle.setX(middle.getX()/length);
	
		for(int i=0;i<length;i++){
			equations[i]= new Equation(points[i],points[(i+1)%length],true);
			if(!equations[i].isInside(middle))
				equations[i].setSide(false);
		}

	}
	public boolean isInside (Coord coord){
		Coord temp=rotationMatrix.apply(coord.minus(this.coord));
		for(int i=0;i<length;i++){
			if(!equations[i].isInside(temp)){
				return false;
			}
		}
		return true;
	
	}
	
	public Coord getPoint(int x){
		return new Coord(0,0);
	}
	public Equation[] getEquations() {
		return equations;
	}
	public void setEquations(Equation[] equations) {
		this.equations = equations;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	
	public Coord calculateMassCenter(){
		
		
		
		return new Coord(23,2);
	}
	public double calculateMass(){
		double mass;
		Coord[] p= new Coord[length];
		Equation[] high = new Equation[length];
		Equation[] low = new Equation[length];
		
		
		
		
		return 2;
		
	}
	
}
