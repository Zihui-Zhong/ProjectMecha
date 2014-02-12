package simulator;

public class Model {

	private Equation[] equations;
	private int length;
	public Model(Equation[] a){
		equations=a;
		length=a.length;
	}
	public boolean isInside (Coord coord){
		for(int i=0;i<length;i++){
			if(!equations[i].isInside(coord)){
				return false;
			}
		}
		return true;
	
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
	
}
