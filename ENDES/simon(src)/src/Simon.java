/**
 * Simon
 *
 * @author Marc Oliveras <admin@oligalma.com> 
 * @link http://www.oligalma.com
 * @copyright 2021 Oligalma
 * @license GPL License v3
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;
import java.util.LinkedList;

public class Simon extends JApplet implements MouseListener, Runnable, ActionListener {
	private static final long serialVersionUID = 1L;
	private boolean suspended = false;
	private int livesint = 3;
	private int bestint = 0;
	private boolean correct = false;
	private int numcolors = 0;
	private int numcolors2 = 0;
	private final int RED = 1;
	private final int YELLOW = 2;
	private final int GREEN = 3;
	private final int BLUE = 4;
	private boolean colormix = true;
	private LinkedList<Integer> list;
	private Thread th, th2;
	private Object o;
	private boolean isStandalone = false;
	private JPanel jPanel1 = new JPanel();
	private JPanel jPanel2 = new JPanel();
	private GridLayout gridLayout1 = new GridLayout();
	private JButton yellow = new JButton();
	private JButton green = new JButton();
	private JButton red = new JButton();
	private JButton blue = new JButton();
	private JButton start = new JButton();
	private JButton about = new JButton();
	private JLabel rightWrong = new JLabel();
	private JLabel best = new JLabel();
	private JLabel score = new JLabel();
	private JLabel lives = new JLabel();
	private JPanel jPanel3 = new JPanel();
	private GridLayout gridLayout2 = new GridLayout();
	private JLabel life1 = new JLabel();
	private JLabel life2 = new JLabel();
	private JLabel life3 = new JLabel();

	// Get a parameter value
	public String getParameter(String key, String def) {
		return isStandalone ? System.getProperty(key, def) : (getParameter(key) != null ? getParameter(key) : def);
	}

	// Construct the applet
	public Simon() {
	}

	// Initialize the applet
	public void init() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Component initialization
	private void jbInit() throws Exception {
		red.addActionListener(this);
		yellow.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		about.addActionListener(this);
		start.addActionListener(this);
		this.setSize(new Dimension(405, 325));
		jPanel1.setBackground(Color.white);
		jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
		jPanel1.setOpaque(true);
		jPanel1.setLayout(null);
		jPanel2.setBackground(Color.white);
		jPanel2.setBorder(BorderFactory.createLineBorder(Color.black));
		jPanel2.setDebugGraphicsOptions(0);
		jPanel2.setMaximumSize(new Dimension(32767, 32767));
		jPanel2.setBounds(new Rectangle(124, 77, 161, 132));
		jPanel2.setLayout(gridLayout1);
		gridLayout1.setColumns(2);
		gridLayout1.setHgap(1);
		gridLayout1.setRows(2);
		gridLayout1.setVgap(1);
		red.setBackground(new Color(255, 245, 245));
		red.setFont(new java.awt.Font("Dialog", 0, 16));
		red.setForeground(new Color(203, 0, 0));
		red.setFocusPainted(false);
		red.setHorizontalTextPosition(SwingConstants.CENTER);
		red.setSelected(false);
		red.addMouseListener(this);
		yellow.setBackground(new Color(255, 255, 245));
		yellow.setFont(new java.awt.Font("Dialog", 0, 16));
		yellow.setForeground(new Color(203, 203, 0));
		yellow.setFocusPainted(false);
		yellow.setHorizontalTextPosition(SwingConstants.CENTER);
		yellow.setSelected(false);
		yellow.addMouseListener(this);
		blue.setBackground(new Color(245, 245, 255));
		blue.setFont(new java.awt.Font("Dialog", 0, 16));
		blue.setForeground(new Color(0, 0, 203));
		blue.setFocusPainted(false);
		blue.setHorizontalTextPosition(SwingConstants.CENTER);
		blue.setSelected(false);
		blue.addMouseListener(this);
		green.setBackground(new Color(245, 255, 245));
		green.setFont(new java.awt.Font("Dialog", 0, 16));
		green.setForeground(new Color(0, 203, 0));
		green.setFocusPainted(false);
		green.setHorizontalTextPosition(SwingConstants.CENTER);
		green.setSelected(false);
		green.addMouseListener(this);
		start.setBounds(new Rectangle(15, 231, 84, 51));
		start.setFont(new java.awt.Font("Dialog", 1, 12));
		start.setText("START");
		about.setBounds(new Rectangle(326, 238, 60, 39));
		about.setFont(new java.awt.Font("Dialog", 1, 12));
		about.setText("?");
		rightWrong.setFont(new java.awt.Font("Dialog", 1, 20));
		rightWrong.setHorizontalAlignment(SwingConstants.CENTER);
		rightWrong.setText("");
		rightWrong.setBounds(new Rectangle(145, 222, 122, 47));
		best.setFont(new java.awt.Font("Dialog", 1, 12));
		best.setRequestFocusEnabled(true);
		best.setHorizontalAlignment(SwingConstants.LEFT);
		best.setText("BEST:   0");
		best.setBounds(new Rectangle(318, 21, 73, 33));
		score.setBounds(new Rectangle(14, 20, 82, 33));
		score.setText("SCORE:   0");
		score.setHorizontalAlignment(SwingConstants.LEFT);
		score.setFont(new java.awt.Font("Dialog", 1, 12));
		score.setRequestFocusEnabled(true);
		lives.setRequestFocusEnabled(true);
		lives.setFont(new java.awt.Font("Dialog", 1, 12));
		lives.setHorizontalAlignment(SwingConstants.LEFT);
		lives.setText("LIVES:");
		lives.setBounds(new Rectangle(148, 20, 45, 33));
		jPanel3.setBackground(Color.white);
		jPanel3.setBounds(new Rectangle(197, 31, 40, 11));
		jPanel3.setLayout(gridLayout2);
		gridLayout2.setColumns(3);
		gridLayout2.setHgap(2);
		gridLayout2.setVgap(2);
		life1.setBackground(Color.red);
		life1.setBorder(BorderFactory.createLineBorder(Color.black));
		life1.setOpaque(true);
		life1.setRequestFocusEnabled(true);
		life1.setText("");
		life2.setBackground(Color.red);
		life2.setBorder(BorderFactory.createLineBorder(Color.black));
		life2.setOpaque(true);
		life2.setRequestFocusEnabled(true);
		life2.setText("");
		life3.setBackground(Color.red);
		life3.setBorder(BorderFactory.createLineBorder(Color.black));
		life3.setOpaque(true);
		life3.setRequestFocusEnabled(true);
		life3.setText("");
		this.getContentPane().add(jPanel1, BorderLayout.CENTER);
		jPanel2.add(red, null);
		jPanel2.add(yellow, null);
		jPanel2.add(green, null);
		jPanel2.add(blue, null);
		jPanel1.add(lives, null);
		jPanel1.add(jPanel3, null);
		jPanel1.add(about, null);
		jPanel1.add(best, null);
		jPanel1.add(score, null);
		jPanel1.add(rightWrong, null);
		jPanel1.add(start, null);
		jPanel1.add(jPanel2, null);
		jPanel3.add(life1, null);
		jPanel3.add(life2, null);
		jPanel3.add(life3, null);
	}

	// Start the applet
	public void start() {
		if (th == null)
			th = new Thread(this);
		th.start();
	}

	// Stop the applet
	public void stop() {
	}

	// Destroy the applet
	public void destroy() {
	}

	// Get Applet information
	public String getAppletInfo() {
		return "Applet Information";
	}

	// Get parameter info
	public String[][] getParameterInfo() {
		return null;
	}

	// Main method
	public static void main(String[] args) {
		Simon applet = new Simon();
		applet.isStandalone = true;
		JFrame frame = new JFrame();
		// EXIT_ON_CLOSE == 3
		frame.setDefaultCloseOperation(3);
		frame.setTitle("Simon");
		frame.getContentPane().add(applet, BorderLayout.CENTER);
		applet.init();
		applet.start();
		frame.setSize(405, 325);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
		frame.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
		o = e.getSource();

		if (o == red)
			red.setBorder(BorderFactory.createLineBorder(Color.black));
		else if (o == yellow)
			yellow.setBorder(BorderFactory.createLineBorder(Color.black));
		else if (o == green)
			green.setBorder(BorderFactory.createLineBorder(Color.black));
		else if (o == blue)
			blue.setBorder(BorderFactory.createLineBorder(Color.black));
	}

	public void mouseEntered(MouseEvent e) {
		o = e.getSource();

		if (o == red)
			red.setBorder(BorderFactory.createLineBorder(Color.red, 2));
		else if (o == yellow)
			yellow.setBorder(BorderFactory.createLineBorder(Color.yellow, 2));
		else if (o == green)
			green.setBorder(BorderFactory.createLineBorder(Color.green, 2));
		else if (o == blue)
			blue.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
	}

	public void run() {
		if (Thread.currentThread() == th) {
			int randomcolor;
			int time = 90;

			while (colormix) {
				switch ((int) (Math.random() * 4 + 1)) {
				case 1:
				case 4:
					for (int i = 0; i < 40 && colormix; i++) {
						randomcolor = (int) (Math.random() * 4 + 1);

						if (randomcolor == 1)
							changeColors(red, Color.red, new Color(255, 245, 245), time);
						else if (randomcolor == 2)
							changeColors(yellow, Color.yellow, new Color(255, 255, 245), time);
						else if (randomcolor == 3)
							changeColors(green, Color.green, new Color(245, 255, 245), time);
						else if (randomcolor == 4)
							changeColors(blue, Color.blue, new Color(245, 245, 255), time);
					}
					break;
				case 2:
					for (int i = 0; i < 30 && colormix; i++) {
						changeColors(red, Color.red, new Color(255, 245, 245), time);
						changeColors(yellow, Color.yellow, new Color(255, 255, 245), time);
						changeColors(blue, Color.blue, new Color(245, 245, 255), time);
						changeColors(green, Color.green, new Color(245, 255, 245), time);
					}
					break;
				case 3:
					for (int i = 0; i < 30 && colormix; i++) {
						changeColors(red, Color.red, new Color(255, 245, 245), time);
						changeColors(green, Color.green, new Color(245, 255, 245), time);
						changeColors(blue, Color.blue, new Color(245, 245, 255), time);
						changeColors(yellow, Color.yellow, new Color(255, 255, 245), time);
					}
					break;
				}
			}
		} else if (Thread.currentThread() == th2) {
			int temps = 500;
			int randomcolor;

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			while (!colormix) {
				randomcolor = (int) (Math.random() * 4 + 1);
				list.add(new Integer(randomcolor));
				numcolors++;

				correct = false;

				while (!correct && !colormix) {
					for (int i = 0; i < numcolors; i++) {
						switch (((Integer) list.get(i)).intValue()) {
						case RED:
							changeColors(red, Color.red, new Color(255, 245, 245), temps);
							break;
						case YELLOW:
							changeColors(yellow, Color.yellow, new Color(255, 255, 245), temps);
							break;
						case GREEN:
							changeColors(green, Color.green, new Color(245, 255, 245), temps);
							break;
						case BLUE:
							changeColors(blue, Color.blue, new Color(245, 245, 255), temps);
							break;
						}
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
						}
					}
					suspended = true;
					if (colormix)
						break;
					rightWrong.setText("GO !");
					th2.suspend();
					suspended = false;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
					rightWrong.setText("");
					try {
						th2.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		}
	}

	void changeColors(JButton b, Color c1, Color c2, int time) {
		b.setBackground(c1);
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
		b.setBackground(c2);
	}

	public void actionPerformed(ActionEvent e) {
		o = e.getSource();

		if (o == about)
			mostrarAbout();

		else if (o == start) {
			if (colormix) {
				colormix = !colormix;
				list = new LinkedList<Integer>();
				rightWrong.setText("");
				start.setText("STOP");
				numcolors2 = 0;
				red.setBackground(new Color(255, 245, 245));
				yellow.setBackground(new Color(255, 255, 245));
				green.setBackground(new Color(245, 255, 245));
				blue.setBackground(new Color(245, 245, 255));
				th2 = new Thread(this);
				th2.start();
			} else {
				parar();
			}
		}

		else if ((o == red || o == yellow || o == green || o == blue) && !colormix && suspended) {
			rightWrong.setText("");
			int i = ((Integer) (list.get(numcolors2))).intValue();

			if ((i == RED && o == red) || (i == YELLOW && o == yellow) || (i == GREEN && o == green)
					|| (i == BLUE && o == blue)) {
				numcolors2++;
				if (numcolors2 == numcolors) {
					rightWrong.setText("OK !");
					score.setText("SCORE:   " + numcolors);
					correct = true;
					numcolors2 = 0;
					th2.resume();
				}
			} else {
				if (livesint == 3)
					life3.setBackground(Color.white);
				else if (livesint == 2)
					life2.setBackground(Color.white);
				else if (livesint == 1)
					life1.setBackground(Color.white);
				else
					parar();
				if (!colormix) {
					numcolors2 = 0;
					livesint--;
					rightWrong.setText("ooooh !");
					correct = false;
					th2.resume();
				}
			}
		}
	}

	void parar() {
		colormix = !colormix;
		suspended = false;
		rightWrong.setText("THE END");
		livesint = 3;
		life1.setBackground(Color.red);
		life2.setBackground(Color.red);
		life3.setBackground(Color.red);
		score.setText("SCORE:   0");
		start.setText("START");
		th = new Thread(this);
		if (bestint < numcolors) {
			best.setText("BEST:   " + Integer.toString(numcolors - 1));
			bestint = numcolors;
		}
		numcolors = 0;
		numcolors2 = 0;
		th.start();
	}

	void mostrarAbout() {
		JOptionPane.showMessageDialog(this,
				"Simon 1.0\n\nby Marc Oliveras, " + Calendar.getInstance().get(Calendar.YEAR) + ". All rights reserved.\n\nadmin@oligalma.com\n\nhttp://www.oligalma.com",
				"About...", JOptionPane.PLAIN_MESSAGE);
	}
}
