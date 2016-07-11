
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
	public TopMenu(String title1, String title2, String title3){
		super();
		String menuTitle[] = {title1, title2, title3};

		// --- for loop to create three dropdown menus
		for(int count = 0; count < 3; count++){
			add(createMenu(menuTitle[count]));
		} // end of for loop
	} // end of CONSTRUCTOR

	// ---- method to create JMenus
	private JMenu createMenu(String title){
		JMenu menu = new JMenu(title);

		// menu items for File
		JMenuItem itemSave = new JMenuItem("Save");
		JMenuItem itemOpen = new JMenuItem("Open");

		// menu items for Edit
		JMenuItem itemUndo = new JMenuItem("Undo");
		JMenuItem itemRedo = new JMenuItem("Redo");

		// menu items for Insert
		JMenuItem itemBullet = new JMenuItem("Bullet Point");
		JMenuItem itemArrow = new JMenuItem("Arrow");

		if(title == "File"){
			menu.add(itemSave);
			menu.add(itemOpen);
		}else if(title == "Edit"){
			menu.add(itemUndo);
			menu.add(itemRedo);
		}else{
			menu.add(itemBullet);
			menu.add(itemArrow);
		} // end of if statement

		return menu;
	} // end of createMenu() method
}
