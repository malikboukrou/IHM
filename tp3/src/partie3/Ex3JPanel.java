package partie3;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ex3JPanel {


	private static void createAndShowGUI(){
		JFrame jf = new JFrame("Ma Fenêtre");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new BorderLayout());

		JPanel nord = new JPanel();
		JButton sud = new JButton("Sud");
		JButton est = new JButton("Est");
		JButton ouest = new JButton("Ouest");
		JButton centre = new JButton("Centre");
		JButton b1 = new JButton("Bouton 1");
		JButton b2 = new JButton("Bouton 2");
		JButton b3 = new JButton("Bouton 3");
		
		nord.add(b1);
		nord.add(b2);
		nord.add(b3);
		
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
