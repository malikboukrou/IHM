package partie2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex2NoLayout {
	
	public static int w = 100;
	public static int h = 25;


	private static void createAndShowGUI(){
		JFrame jf = new JFrame("Ma Fenêtre");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);

		JButton b1 = new JButton("Bouton1");
		JButton b2 = new JButton("Bouton2");
		JButton b3 = new JButton("Bouton3");
		JButton b4 = new JButton("Bouton4");
		JButton b5 = new JButton("Bouton5");
		JButton b6 = new JButton("Bouton6");
		JButton b7 = new JButton("Bouton7");
		JButton b8 = new JButton("Bouton8");
		JButton b9 = new JButton("Bouton9");


		b1.setBounds(5, 5, w, h);
		b1.repaint();
		jf.add(b1);

		b2.setBounds(55, 35, w, h);
		b2.repaint();
		jf.add(b2);

		b3.setBounds(105, 65, w, h);
		b3.repaint();
		jf.add(b3);

		b4.setBounds(155, 95, w, h);
		b4.repaint();
		jf.add(b4);

		b5.setBounds(205, 125, w, h);
		b5.repaint();
		jf.add(b5);

		b6.setBounds(255, 155, w, h);
		b6.repaint();
		jf.add(b6);

		b7.setBounds(305, 185, w, h);
		//b7.repaint();
		jf.add(b7);

		b8.setBounds(355, 215, w, h);
		//b8.repaint();
		jf.add(b8);

		b9.setBounds(405, 245, w, h);
		//b9.repaint();
		jf.add(b9);

		
		jf.setSize(520, 300);
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
