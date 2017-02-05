/*
Classname: QuadrantUser
Version:
Date: 28/03/16

Author: Callum Warrilow
Class Description: A UserClass to begin use of the ApplicationClasses for
the Quadrant Time Management program
*/

public class QuadrantUsr {

    /* ---------- METHODS ---------- */

    // ----- MAIN METHOD
    public static void main(String[] args){
        // setting to use native macOS menu bar
        System.setProperty("apple.laf.useScreenMenuBar", "true");

        // instantiates new main window
        MainFrame mFrame = new MainFrame();
    } // end main()
} // end QuadrantUsr
