/**
 * @name        Simple Java NotePad
 * @package     ph.notepad
 * @file        UI.java
 * @author      Victor Otieno
 * @email       otienovictor502@gmail.com
 * @link        
 * @copyright   Copyright Victor Digital Solutions, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 * @create      2022-8-10
 * @update      2016-8-16
 *
 *

 */

package simplejavatexteditor;

import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SimpleJavaTextEditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "otienovictor502@gmail.com";
    public final static String NAME = "Text Editor";
    public final static String EDITOR_EMAIL = "otienovictor502@gmail.com";
    public final static double VERSION = 3.0;

    /**
     * @param args
     */
    public static void main(String[] args) {
    	try {
    		UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
    		e.printStackTrace();
    	}
    	
        new UI().setVisible(true);
    }

}
