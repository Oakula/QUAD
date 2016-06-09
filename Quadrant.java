/*
	ClassName: quadrants
	Author: Callum Warrilow
	Desc: The view class for the quadrant panels of QUAD app
*/

// ----- IMPORT STATEMENTS -----
import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;

class Quadrant extends JPanel{

	// ----- CONSTRUCTOR -----
	public Quadrant(){
		// set dimensions
		Dimension size = getPreferredSize();
		size.width = 400;
		size.height = 400;
		setPreferredSize(size);

		// set layout manager
		setLayout(new GridLayout(2,2,10,10));

		// add components and make visible
		createQuad();
		setVisible(true);
	} // end of CONSTRUCTOR

	// ----- METHODS -----
	//
	// -------------------

	// method to create quadrant tiles in GUI
	private void createQuad(){
		// color declaration for quadrant backgrounds
		final Color RED = new Color(239,154,154);
		final Color BLUE = new Color(144,202,249);
		final Color GREEN = new Color(165,214,167);
		final Color ORANGE = new Color(255,204,128);

		int count;

		// array of JTextAreas
		JTextArea qArray[] = new JTextArea[4];

		// for loop to create and format each quadrant
		for(count = 0; count < 4; count++){
			qArray[count] = new JTextArea("Text Here",10,15);

			switch(count){
				case 0:
					qArray[count].setBackground(RED);
				break;
				case 1:
					qArray[count].setBackground(BLUE);
				break;
				case 2:
					qArray[count].setBackground(GREEN);
				break;
				case 4:
					qArray[count].setBackground(ORANGE);
				break;
			} // end of switch

			// setting words to wrap
			qArray[count].setWrapStyleWord(true);
			qArray[count].setLineWrap(true);

			// setting margins
			qArray[count].setMargin(new Insets(10,10,10,10));

			add(new JScrollPane(qArray[count]));
		} // end of for loop
	} // end of createQuad() method
}
