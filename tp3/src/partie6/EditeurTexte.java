package partie6;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class EditeurTexte{
	
	static JFrame jf;


	private static void createAndShowGUI(){
		jf = new JFrame("Editeur de texte");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new BoxLayout(jf.getContentPane(), BoxLayout.Y_AXIS));
		jf.setSize(500, 500);

		JTextPane zoneTexte = new JTextPane();
		zoneTexte.setPreferredSize(new Dimension(jf.getWidth(), 450));
		
		JPanel pied = new JPanel();
		JLabel recherche = new JLabel(" Rechercher :");
		JTextField chercher = new JTextField();
		chercher.setPreferredSize(new Dimension(120, 20));
		JButton flecheG = new JButton("<<");
		JButton flecheD = new JButton(">>");
		JButton surligner = new JButton("Tout surligner");

		pied.add(recherche);
		pied.add(chercher);
		pied.add(flecheG);
		pied.add(flecheD);
		pied.add(surligner);
		jf.add(zoneTexte);
		jf.add(pied);

		createMenu();

		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	


	private static void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu;
		JMenuItem menuItem;

		menu = new JMenu("Fichier");
		menuBar.add(menu);
		menuItem = new JMenuItem("Nouveau");
		menu.add(menuItem);
		menuItem = new JMenuItem("Ouvrir");
		menu.add(menuItem);
		menuItem = new JMenuItem("Enregistrer");
		menu.add(menuItem);
		menuItem = new JMenuItem("Enregistrer sous");
		menu.add(menuItem);
		menu.addSeparator();
		menuItem = new JMenuItem("Mise � jour");
		menu.add(menuItem);
		menuItem = new JMenuItem("Imprimer");
		menu.add(menuItem);
		menu.addSeparator();
		menuItem = new JMenuItem("Quitter");
		menu.add(menuItem);

		menu = new JMenu("Edition");
		menuBar.add(menu);
		menuItem = new JMenuItem("Defaire");
		menu.add(menuItem);
		menuItem = new JMenuItem("Refaire");
		menu.add(menuItem);
		menuItem = new JMenuItem("Copier");
		menu.add(menuItem);
		menuItem = new JMenuItem("Coller");
		menu.add(menuItem);
		menuItem = new JMenuItem("Couper");
		menu.add(menuItem);

		menu = new JMenu("Format");
		menuBar.add(menu);

		jf.setJMenuBar(menuBar);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}