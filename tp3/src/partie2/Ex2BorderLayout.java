package partie2;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Ex2BorderLayout {


	private static void createAndShowGUI(){
		JFrame jf = new JFrame("Ma Fenêtre");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new BorderLayout());

		JButton nord = new JButton("Nord");
		JButton sud = new JButton("Sud");
		JButton est = new JButton("Est");
		JButton ouest = new JButton("Ouest");
		JButton centre = new JButton("Centre");
		
		jf.add(nord, BorderLayout.NORTH);
		jf.add(sud, BorderLayout.SOUTH);
		jf.add(est, BorderLayout.EAST);
		jf.add(ouest, BorderLayout.WEST);
		jf.add(centre, BorderLayout.CENTER);

		jf.setSize(500, 500);

		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

}
