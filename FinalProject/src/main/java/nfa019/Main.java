package nfa019;

import java.awt.EventQueue;

public class Main {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					LoginView frame = new LoginView();
					ProductCreateView frame2 = new ProductCreateView();
					ProductListView frame3 = new ProductListView();
					frame.setVisible(true);
					frame2.setVisible(true);
					frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
