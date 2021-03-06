package partie4;

/**
 * demovbox.java
 *
 * @author <a href="mailto:gery.casiez@lifl.fr">Gery Casiez</a>
 * @version
 */

import java.awt.*;

public class VboxLayout implements LayoutManager {

	private int vgap;//espace vertical entre chaque componant
	private int minWidth = 0, minHeight = 0;//largeur et hauteur minimales du conteneu
	private int preferredWidth = 0, preferredHeight = 0;// largeur et hauteur preferees du conteneur

	//Les constructeurs
	public VboxLayout() {this(2);}
	public VboxLayout(int v) {vgap = v;}


	//M�thodes � ne pas remplir
	public void removeLayoutComponent(Component comp) {}
	public void addLayoutComponent(String name, Component comp) {}


	private void setSizes(Container parent) {
		int nComps = parent.getComponentCount();//nombre de composants du conteneur
		preferredWidth = 0;
		preferredHeight = 0;
		minWidth = 0;
		minHeight = 0;

		// Ecrire le code qui permet de calculer les dimensions minimales et
		// preferees du conteneur en utilisant les dimensions des differents
		// composants qu'il contient
		for (int i=0; i < nComps; i++){
			Component c = parent.getComponent(i);

			minWidth += c.getWidth();
			minHeight += c.getHeight();

			preferredHeight += c.getPreferredSize().height + vgap;
			preferredWidth = Math.max(preferredWidth+vgap, c.getPreferredSize().width+vgap);
		}
	}


	public Dimension preferredLayoutSize(Container parent) {
		Dimension dim = new Dimension(0, 0);
		setSizes(parent);
		Insets in = parent.getInsets();

		if (preferredHeight != 0 && preferredWidth != 0)
			dim = new Dimension(preferredWidth+in.left+in.right, preferredHeight+in.bottom+in.top);

		return dim;
	}


	/* Required by LayoutManager. */
	public Dimension minimumLayoutSize(Container parent) {
		Dimension dim = new Dimension(0, 0);
		setSizes(parent);
		Insets in = parent.getInsets();

		if (minHeight != 0 && minWidth != 0)
			dim = new Dimension(minWidth+in.left+in.right, minHeight+in.bottom+in.top);

		return dim;
	}


	public void layoutContainer(Container parent) {
		int nComps = parent.getComponentCount();
		Insets in = parent.getInsets();
		int savedHeight = 0;
		int x = 0, y = in.top;

		for (int i = 0; i < nComps; i++) {
			Component c = parent.getComponent(i);
			if (c.isVisible()) {
				Dimension d = c.getPreferredSize();

				x = (parent.getWidth() / 2) - (d.width / 2);
				y += savedHeight + vgap;
				c.setBounds(x, y, d.width, d.height);
				savedHeight = d.height;
			}
		}
	}


	public String toString() {
		String str = "";
		return getClass().getName() + "[vgap=" + vgap + str + "]";
	}
}