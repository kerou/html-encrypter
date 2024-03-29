/*
 * By attaching this document to the given files (the �work�), you, the licensee,
 * are hereby granted free usage in both personal and commerical environments, 
 * without any obligation of attribution or payment (monetary or otherwise).
 *  
 * The licensee is free to use, copy, modify, publish, distribute, sublicence, 
 * and/or merchandise the work, subject to the licensee inflecting a positive 
 * message unto someone. This includes (but is not limited to): smiling, 
 * being nice, saying �thank you�, assisting other persons, or any 
 * similar actions percolating the given concept.
 * 
 * The above copyright notice serves as a permissions notice also, 
 * and may optionally be included in copies or portions of the work. 
 * 
 * The work is provided �as is�, without warranty or support, express or implied. 
 * The author(s) are not liable for any damages, misuse, or other claim, whether 
 * from or as a consequence of usage of the given work.
 */
package Proiect;

import java.awt.*;
import javax.swing.*;

/**
 * This class opens a transparent window that loads the spinner
 * 
 * @author Stefan Cosma
 * 
 */
public class loadSpinner extends JWindow {

	private static final long serialVersionUID = 1L;

	private int duration;

	Image bi = Toolkit.getDefaultToolkit().getImage(
			getClass().getClassLoader().getResource("assets/loader.gif"));
	ImageIcon ii = new ImageIcon(bi);

	public loadSpinner(int d) {
		duration = d;
	}

	public void showLoader() {

		int width = 31;
		int height = 31;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		setBounds(x, y, width, height);
		setBackground(new Color(255, 255, 255, 0));
		setVisible(true);

		try {
			Thread.sleep(duration);
		} catch (Exception e) {
		}

		setVisible(false);

	}

	public void showLoaderAndExit() {
		showLoader();
		dispose();
	}

	public void paint(Graphics g) {
		g.drawImage(bi, 0, 0, this);
	}
}