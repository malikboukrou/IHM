package tp4;

import java.awt.Component;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Q1 extends JFrame {

	private static final long serialVersionUID = 1L;
	protected JButton incr;
	protected static JLabel chiffre;


	public Q1(String title){
		super(title);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//declaration et ajout du label chiffre
		chiffre = new JLabel("0");
		Font boldFont = new Font(chiffre.getFont().getName(), Font.BOLD, 15);
		chiffre.setFont(boldFont);
		this.add(chiffre);
		chiffre.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//declaration et ajout du bouton d'incrementation
		incr = new JButton("Incrementer");
		this.add(incr);
		incr.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//gestion event boutton
		ReponseAuClic boutonEv = new ReponseAuClic(chiffre);
		incr.addActionListener(boutonEv);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	public static void main(String args[]){
		new Q1("Incrémentation");
	}
}
