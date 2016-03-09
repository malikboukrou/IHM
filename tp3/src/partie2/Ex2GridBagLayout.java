package partie2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex2GridBagLayout {


	private static void createAndShowGUI(){
		JFrame jf = new JFrame("Ma Fenêtre");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

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


		//Initialisation du gbc
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.ipady = gbc.anchor = GridBagConstraints.CENTER;
		gbc.weightx = 4;
		gbc.weighty = 5;
		//

		
		gbc.gridx = 0;
		gbc.gridy = 0;
		jf.add(b1, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		jf.add(b2, gbc);

		gbc.gridx = 2;
		gbc.gridy = 0;
		jf.add(b3, gbc);

		gbc.gridx = 3;
		gbc.gridy = 0;
		jf.add(b4, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 4;
		jf.add(b5, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 3;
		jf.add(b6, gbc);

		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		jf.add(b7, gbc);


		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridheight = 2;
		jf.add(b8, gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 3;
		jf.add(b9, gbc);

		gbc.gridx = 1;
		gbc.gridy = 4;
		jf.add(b10, gbc);

		jf.setSize(500, 200);

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
