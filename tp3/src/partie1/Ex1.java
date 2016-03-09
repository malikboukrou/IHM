package partie1;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ex1 {



	private static void createAndShowGUI(){
		JFrame jf = new JFrame("Ma Fenêtre");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("Hello world !");
		jf.getContentPane().add(label);
		
		createDialog(jf);

		jf.setSize(500, 500);
		jf.setResizable(false);

		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	
	
	private static void createDialog(JFrame j){
		JDialog jd = new JDialog(j, "Mon Dialog", false);//non modale
		//JDialog jd = new JDialog(j, "Mon Dialog", false);//modale
		
		JPanel panel = new JPanel();
		jd.getContentPane().add(panel);
		jd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		jd.setSize(200,200);
		jd.setResizable(false);
		
		jd.setLocationRelativeTo(null);
		jd.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}

}
