package simulator;

public class Model {

	private Equation[] equations;
	private int length;
	private Coord coord;
	private double rotation;
	private Matrix2d rotationMatrix;
	
	public Model(Equation[] a){
		equations=a;
		length=a.length;
		coord= new Coord(0,0);
		this.rotation=0;
	}
	public Model(Equation[] a, Coord coord){
		equations=a;
		length=a.length;
		this.coord= new Coord(coord.getX(),coord.getY());
		this.rotation=0;
		rotationMatrix= new Matrix2d(0);
	}
	public Model(Equation[] a,Coord coord, double rotation){
		equations=a;
		length=a.length;
		this.coord= new Coord(coord.getX(),coord.getY());
		this.rotation=rotation;
		rotationMatrix= new Matrix2d(rotation);
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
	
}
