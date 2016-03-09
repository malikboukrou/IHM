package partie2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex2FlowLayout {
	
	
	private static void createAndShowGUI(){
		JFrame jf = new JFrame("Ma Fenêtre");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 15));

		JButton b1 = new JButton("Bouton1");
		JButton b2 = new JButton("Bouton2");
		JButton b3 = new JButton("Bouton3");
		JButton b4 = new JButton("Bouton4");
		JButton b5 = new JButton("Bouton5");
		JButton b6 = new JButton("Bouton6");
		JButton b7 = new JButton("Bouton7");
		JButton b8 = new JButton("Bouton8");
		JButton b9 = new JButton("Bouton9");
		JButton b10 = new JButton("Bouton10");
		JButton b11 = new JButton("Bouton11");
		JButton b12 = new JButton("Bouton12");
		JButton b13 = new JButton("Bouton13");
		JButton b14 = new JButton("Bouton14");
		JButton b15 = new JButton("Bouton15");
		JButton b16 = new JButton("Bouton16");

		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
		jf.add(b5);
		jf.add(b6);
		jf.add(b7);
		jf.add(b8);
		jf.add(b9);
		jf.add(b10);
		jf.add(b11);
		jf.add(b12);
		jf.add(b13);
		jf.add(b14);
		jf.add(b15);
		jf.add(b16);

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
