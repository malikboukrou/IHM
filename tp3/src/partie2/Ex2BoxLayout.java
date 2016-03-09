package partie2;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex2BoxLayout {
	
	
	private static void createAndShowGUI(){
		JFrame jf = new JFrame("Ma Fenêtre");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new BoxLayout(jf.getContentPane(), BoxLayout.Y_AXIS));
		jf.setSize(500, 500);

		JButton b1 = new JButton("Bouton1");
		JButton b2 = new JButton("Bouton2");
		JButton b3 = new JButton("Bouton3");
		
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b2.setAlignmentX(Component.CENTER_ALIGNMENT);
		b3.setAlignmentX(Component.CENTER_ALIGNMENT);

	
		jf.add(b1);
		jf.add(b2);
		jf.add(Box.createRigidArea(new Dimension(0,20)));
		//jf.add(Box.createVerticalGlue());
		jf.add(b3);


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
