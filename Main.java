package classwork;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		/*
		 * JmenuBar
		 * File edit source refactor navigate search project run etc. is menubar and each is a menu
		 * JMenuItem is the items within the menu
		 * JmenuItems are same as JButton so they need action performed
		 * submenus are still menus
		 * create menu, then menu, then item, and put item on menu and menu on menu bar.
		 */
		MyMenuFrame mmf=new MyMenuFrame();
		mmf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mmf.setSize(500,200);
		mmf.setVisible(true);
	}

}
