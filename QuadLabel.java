/*
	Classname: QuadTitle
	Author: Callum Warrilow
	Desc: A class to implement titles for each quadrant based around
	importance and urgency
*/

// ----- IMPORT STATEMENTS -----
import java.awt.*;
import javax.swing.*;

class QuadLabel extends JPanel {
	// ----- CONSTRUCTOR -----
	public QuadLabel(String title1, String title2, boolean vertical){
		Dimension size = getPreferredSize();
		size.width = 300;
		size.height = 20;
		setPreferredSize(size);

		// set layout manager
		if(vertical == true){
			setLayout(new GridLayout(1,1,10,10));
		}else{
			setLayout(new GridLayout(2,0,10,10));
		} // end of if statement

		// add titles to labels
		setTitle(title1);
		setTitle(title2);

		setVisible(true);
	} // end of CONSTRUCTOR

	// ----- METHODS -----
	//
	// -------------------

	// ---- method to set title to a JLabel
	private void setTitle(String quadTitle){
		JLabel quadLabel = new JLabel(quadTitle);

		add(quadLabel);
	} // end of setTitle1() method
}
