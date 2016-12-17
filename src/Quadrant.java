/*
    ClassName: quadrants
    Author: Callum Warrilow
    Desc: The view class for the quadrant panels of QUAD app
*/

// ----- IMPORT STATEMENTS -----
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class Quadrant extends JPanel{
    // ----- CLASS DECLARATIONS -----
    private static JTextArea qArray[] = new JTextArea[4];
    private static String userHome = System.getProperty("user.home"); // retrieving current user's home dir

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

    // ---- method to create quadrant tiles in GUI
    private void createQuad(){
        // color declaration for quadrant backgrounds
        final Color RED = new Color(239,154,154);
        final Color BLUE = new Color(144,202,249);
        final Color GREEN = new Color(165,214,167);
        final Color ORANGE = new Color(255,204,128);

        int count;

        // array of JTextAreas

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
                case 3:
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

    // ---- method to write text to a file
    public static void writeToFile(){

        // for loop to save contents of each quadrant in a separate file
        for(int count = 0; count < 4; count++){
            try{
                File file = new File(userHome + "/quad/quad" + count + ".txt");
                file.getParentFile().mkdirs();
                BufferedWriter out = new BufferedWriter(new FileWriter(file));

                out.write(qArray[count].getText());
                out.close();
            }catch (IOException e){}
        } // end of for loop
    } // end of writeToFile() method

    public static void readFromFile(){

        for(int count = 0; count < 4; count++){
            try{
                FileReader reader = new FileReader(userHome + "/quad/quad" + count + ".txt");
                qArray[count].read(reader, userHome + "/quad/quad" + count + ".txt");
            }catch (IOException e){}
        } // end of for loop
    } // end of readFromFile() method
}
