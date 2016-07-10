
/*
	Classname: QuadrantUsr
	Author: Callum Warrilow
	Desc: Class to implement menu bar with save, undo, redo and open functions
*/

// ----- IMPORT STATEMENTS -----
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class TopMenu extends JMenuBar {

	// ----- CONSTRUCTOR -----
	public TopMenu(){
		super();
		add(createMenu("test"));
	} // end of CONSTRUCTOR

	private JMenu createMenu(String title){
		JMenu menu = new JMenu(title);
		menu.add(addMenuItem());

		return menu;
	} // end of createMenu() method

	private JMenuItem addMenuItem(){
		JMenuItem menuItem = new JMenuItem("test");

		return menuItem;
	}
}
