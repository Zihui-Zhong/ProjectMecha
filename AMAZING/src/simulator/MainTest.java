package simulator;

import javax.swing.JOptionPane;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coord a= new Coord(0,0);
		Coord b= new Coord(5,0);
		Coord c= new Coord(0,5);
		Coord d= new Coord(5,5);
		Model model = new Model(new Equation[] {new Equation(a,b,true),new Equation(a,c,true),new Equation(b,d,false),new Equation(c,d,false)});
		if(model.isInside(a)){
			JOptionPane.showMessageDialog(null, "WORKKS");
		}else{
			JOptionPane.showMessageDialog(null, "FAIL");
		}
	}

}
