package tp4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ReponseAuClic implements ActionListener{
	
	JLabel label;
	
	public ReponseAuClic(JLabel label){
		this.label = label;
	}

	public void actionPerformed(ActionEvent ev) {
		int num = Integer.parseInt(label.getText());
		Q1.chiffre.setText(String.valueOf(++num));
		System.out.println(num);
	}

}
