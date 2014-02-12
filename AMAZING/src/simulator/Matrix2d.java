package simulator;

public class Matrix2d {

	private double [][] matrix;
	
	public Matrix2d(){
		matrix = new double [] [] {{1,0},{0,1}};
	}
	public Matrix2d(double a,double b, double c,double d){
		matrix = new double [] [] {{a,b},{c,d}};
	}
	public Matrix2d(double rotation){
		double cos=Math.cos(rotation);
		double sin=Math.sin(rotation);
		matrix = new double [] [] {{cos,-sin},{sin,cos}};
	}
	public Coord apply(Coord coord){
		return new Coord(coord.getX()*matrix[0][0]+coord.getY()*matrix[0][1],coord.getX()*matrix[1][0]+coord.getY()*matrix[1][1]);
	}
}
