/*
	Classname: QuadrantUsr
	Author: Callum Warrilow
	Desc: User class to allow interaction with the QUAD app GUI
*/

// ----- IMPORT STATEMENTS -----
import java.awt.*;
import javax.swing.*;

class MainFrame extends JFrame {

	// ----- CONSTRUCTOR -----
	public MainFrame(){
		super("QUAD");
		setMinimumSize(new Dimension(500,500));
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridBagLayout());

		buildGUI();
		setVisible(true);
	} // end of CONSTRUCTOR

	// ---- method that creates objects of each component of the and positions
	// it into a grid shape
	private void buildGUI(){
		Quadrant quad = new Quadrant();

		GridBagConstraints quadC = new GridBagConstraints();
		quadC.gridx = 10;
		quadC.gridy = 8;
		quadC.weightx = 0;
		quadC.weighty = 0;

		add(quad, quadC);

		QuadLabel hLabel = new QuadLabel("URGENT", "NOT URGENT", false);
		QuadLabel vLabel = new QuadLabel("IMPORTANT", "NOT IMPORTANT", true);

		GridBagConstraints hLabelC = new GridBagConstraints();
		hLabelC.gridx = 10;
		hLabelC.gridy = 7;

		GridBagConstraints vLabelC = new GridBagConstraints();
		vLabelC.gridx = 9;
		vLabelC.gridy = 8;

		add(hLabel, hLabelC);
		add(vLabel, vLabelC);
	} // end of main() method
}
