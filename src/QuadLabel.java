/*
	Classname: QuadTitle
	Author: Callum Warrilow
	Desc: A class to implement titles for each quadrant based around
	importance and urgency
*/

// ----- IMPORT STATEMENTS -----
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

class QuadLabel extends JPanel {
	// ----- CONSTRUCTOR -----
	public QuadLabel(String title1, String title2, boolean vertical){
		Dimension size = getPreferredSize();

		// set layout manager
		if(vertical == true){
			size.width = 40;
			size.height = 300;
			setLayout(new GridLayout(2,1,30,30));
		}else{
			size.width = 300;
			size.height = 30;
			setLayout(new GridLayout(1,2,30,30));
		} // end of if statement

		setPreferredSize(size);

		// add titles to labels
		setTitle(title1, vertical);
		setTitle(title2, vertical);

		setVisible(true);
	} // end of CONSTRUCTOR

	// ----- METHODS -----
	//
	// -------------------

	// ---- method to set title to a JLabel
	private void setTitle(String quadTitle, boolean rotate){
		JLabel quadLabel = new JLabel(quadTitle);

		// decides if text needs displaying vertically
		if(rotate == true){
			quadLabel.setBorder(BorderFactory.createEmptyBorder(30, 30, 0, 0));
			quadLabel.setUI(new VerticalLabelUI(true));
		}else{
			quadLabel.setBorder(BorderFactory.createEmptyBorder(0, 60, 0, 0));
		} // end of if statement

		add(quadLabel);
	} // end of setTitle1() method
}
