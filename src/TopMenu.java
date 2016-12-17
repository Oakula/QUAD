/*
    Classname: QuadrantUsr
    Author: Callum Warrilow
    Desc: Class to implement menu bar with save, undo, redo and open functions
*/

// ----- IMPORT STATEMENTS -----
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class TopMenu extends JMenuBar implements ActionListener {
    // ----- CLASS DECLARATIONS -----
    private JMenuItem menuItem[] = new JMenuItem[6];

    // ----- CONSTRUCTOR -----
    public TopMenu(String title1, String title2, String title3){
        super();
        String menuTitle[] = {title1, title2, title3};

        createMenuItem();

        // --- for loop to create three dropdown menus
        for(int count = 0; count < 3; count++){
            add(createMenu(menuTitle[count]));
        } // end of for loop
    } // end of CONSTRUCTOR

    // ---- method to create JMenus
    private JMenu createMenu(String title){
        JMenu menu = new JMenu(title);

        if(title == "File"){
            menu.add(menuItem[0]);
            menu.add(menuItem[1]);
        }else if(title == "Edit"){
            menu.add(menuItem[2]);
            menu.add(menuItem[3]);
        }else{
            menu.add(menuItem[4]);
            menu.add(menuItem[5]);
        } // end of if statement

        for(int num = 0; num < 6; num++)
            menuItem[num].addActionListener(this);

        return menu;
    } // end of createMenu() method

    private void createMenuItem(){

        // menu items for File
        menuItem[0] = new JMenuItem("Save");
        menuItem[1] = new JMenuItem("Open");

        // // menu items for Edit
        menuItem[2] = new JMenuItem("Undo");
        menuItem[3] = new JMenuItem("Redo");

        // // menu items for Insert
        menuItem[4] = new JMenuItem("Bullet Point");
        menuItem[5] = new JMenuItem("Arrow");
    } // end of createMenuItem() method

    // ----------------------------
    // EVENT HANDLING
    // ----------------------------

    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();

        if (src == menuItem[0])
            Quadrant.writeToFile();

        if (src == menuItem[1])
            Quadrant.readFromFile();

    } // end of actionPerformed() method
}
