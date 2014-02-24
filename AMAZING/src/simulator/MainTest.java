package simulator;

import javax.swing.JOptionPane;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coord x= new Coord(-1,-1);
		
		Coord[] a= {new Coord(0,0), new Coord(0,5), new Coord(5,5), new Coord(0,5)};
		Model model = new Model(a, new Coord(0,0), Math.PI);
		if(model.isInside(x)){
			JOptionPane.showMessageDialog(null, "WORKKS");
		}else{
			JOptionPane.showMessageDialog(null, "FAIL");
		}
	}

}
