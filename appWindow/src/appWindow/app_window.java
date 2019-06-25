package appWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class app_Window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app_Window window = new app_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public app_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("ColorChooser.background"));
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 852, 649);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 255));
		panel.setBorder(null);
		panel.setBounds(12, 0, 123, 58);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 3, 0, 0));
	     
		JCheckBox[] CheckBox = new JCheckBox[72];
		 CheckBox[0] = new JCheckBox("1");
		CheckBox[0].setBackground(new Color(153, 204, 255));
		panel.add(CheckBox[0]);
		
		 CheckBox[1] = new JCheckBox("2");
		CheckBox[1].setBackground(new Color(153, 204, 255));
		panel.add(CheckBox[1]);
		
		CheckBox[2] = new JCheckBox("3");
		CheckBox[2].setBackground(new Color(153, 204, 255));
		panel.add(CheckBox[2]);
		
		 	CheckBox[3] = new JCheckBox("4");
		CheckBox[3].setBackground(new Color(153, 204, 255));
		panel.add(CheckBox[3]);
		
	    CheckBox[4] = new JCheckBox("5");
		CheckBox[4].setBackground(new Color(153, 204, 255));
		panel.add(CheckBox[4]);
		
	    CheckBox[5] = new JCheckBox("6");
		CheckBox[5].setBackground(new Color(153, 204, 255));
		panel.add(CheckBox[5]);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 70, 123, 58);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(2, 3, 0, 0));
		
		 CheckBox[8] = new JCheckBox("9");
		CheckBox[8].setBackground(new Color(153, 204, 255));
		panel_1.add(CheckBox[8]);
		
	    CheckBox[9] = new JCheckBox("10");
		CheckBox[9].setBackground(new Color(153, 204, 255));
		panel_1.add(CheckBox[9]);
		
		 CheckBox[10] = new JCheckBox("11");
		CheckBox[10].setBackground(new Color(153, 204, 255));
		panel_1.add(CheckBox[10]);
		
	    CheckBox[11] = new JCheckBox("12");
		CheckBox[11].setBackground(new Color(153, 204, 255));
		panel_1.add(CheckBox[11]);
		
		 CheckBox[12] = new JCheckBox("13");
		CheckBox[12].setBackground(new Color(153, 204, 255));
		panel_1.add(CheckBox[12]);
		
		 CheckBox[13] = new JCheckBox("14");
		CheckBox[13].setBackground(new Color(153, 204, 255));
		panel_1.add(CheckBox[13]);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 140, 123, 58);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(2, 3, 0, 0));
		
		 CheckBox[16] = new JCheckBox("17");
		CheckBox[16].setBackground(new Color(153, 204, 255));
		panel_2.add(CheckBox[16]);
		
	    CheckBox[17] = new JCheckBox("18");
		CheckBox[17].setBackground(new Color(153, 204, 255));
		panel_2.add(CheckBox[17]);
		
		 CheckBox[18] = new JCheckBox("19");
		CheckBox[18].setBackground(new Color(153, 204, 255));
		panel_2.add(CheckBox[18]);
		
		 CheckBox[19] = new JCheckBox("20");
		CheckBox[19].setBackground(new Color(153, 204, 255));
		panel_2.add(CheckBox[19]);
		
		 CheckBox[20] = new JCheckBox("21");
		CheckBox[20].setBackground(new Color(153, 204, 255));
		panel_2.add(CheckBox[20]);
		
	    CheckBox[21] = new JCheckBox("22");
		CheckBox[21].setBackground(new Color(153, 204, 255));
		panel_2.add(CheckBox[21]);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 209, 123, 58);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(2, 3, 0, 0));
		
		CheckBox[24] = new JCheckBox("25");
		CheckBox[24].setBackground(new Color(153, 204, 255));
		panel_3.add(CheckBox[24]);
		
		 CheckBox[25] = new JCheckBox("26");
		CheckBox[25].setBackground(new Color(153, 204, 255));
		panel_3.add(CheckBox[25]);
		
	 CheckBox[26] = new JCheckBox("27");
		CheckBox[26].setBackground(new Color(153, 204, 255));
		panel_3.add(CheckBox[26]);
		
		 CheckBox[27] = new JCheckBox("28");
		CheckBox[27].setBackground(new Color(153, 204, 255));
		panel_3.add(CheckBox[27]);
		
		 CheckBox[28] = new JCheckBox("29");
		CheckBox[28].setBackground(new Color(153, 204, 255));
		panel_3.add(CheckBox[28]);
		
		 CheckBox[29] = new JCheckBox("30");
		CheckBox[29].setBackground(new Color(153, 204, 255));
		panel_3.add(CheckBox[29]);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 278, 123, 58);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(2, 3, 0, 0));
		
		 CheckBox[32] = new JCheckBox("33");
		CheckBox[32].setBackground(new Color(153, 204, 255));
		panel_4.add(CheckBox[32]);
		
		 CheckBox[33] = new JCheckBox("34");
		CheckBox[33].setBackground(new Color(153, 204, 255));
		panel_4.add(CheckBox[33]);
		
		 CheckBox[34] = new JCheckBox("35");
		CheckBox[34].setBackground(new Color(153, 204, 255));
		panel_4.add(CheckBox[34]);
		
		 CheckBox[35] = new JCheckBox("36");
		CheckBox[35].setBackground(new Color(153, 204, 255));
		panel_4.add(CheckBox[35]);
		
		 CheckBox[36] = new JCheckBox("37");
		CheckBox[36].setBackground(new Color(153, 204, 255));
		panel_4.add(CheckBox[36]);
		
		CheckBox[37] = new JCheckBox("38");
		CheckBox[37].setBackground(new Color(153, 204, 255));
		panel_4.add(CheckBox[37]);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 348, 123, 58);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(2, 3, 0, 0));
		
		CheckBox[40] = new JCheckBox("41");
		CheckBox[40].setBackground(new Color(153, 204, 255));
		panel_5.add(CheckBox[40]);
		
		 CheckBox[41] = new JCheckBox("42");
		CheckBox[41].setBackground(new Color(153, 204, 255));
		panel_5.add(CheckBox[41]);
		
	 CheckBox[42] = new JCheckBox("43");
		CheckBox[42].setBackground(new Color(153, 204, 255));
		panel_5.add(CheckBox[42]);
		
		 CheckBox[43] = new JCheckBox("44");
		CheckBox[43].setBackground(new Color(153, 204, 255));
		panel_5.add(CheckBox[43]);
		
		 CheckBox[44] = new JCheckBox("45");
		CheckBox[44].setBackground(new Color(153, 204, 255));
		panel_5.add(CheckBox[44]);
		
		CheckBox[45] = new JCheckBox("46");
		CheckBox[45].setBackground(new Color(153, 204, 255));
		panel_5.add(CheckBox[45]);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 418, 123, 58);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new GridLayout(2, 3, 0, 0));
		
		 CheckBox[48] = new JCheckBox("49");
		CheckBox[48].setBackground(new Color(153, 204, 255));
		panel_6.add(CheckBox[48]);
		
	 CheckBox[49] = new JCheckBox("50");
		CheckBox[49].setBackground(new Color(153, 204, 255));
		panel_6.add(CheckBox[49]);
		
		 CheckBox[50] = new JCheckBox("51");
		CheckBox[50].setBackground(new Color(153, 204, 255));
		panel_6.add(CheckBox[50]);
		
		CheckBox[51] = new JCheckBox("52");
		CheckBox[51].setBackground(new Color(153, 204, 255));
		panel_6.add(CheckBox[51]);
		
		 CheckBox[52] = new JCheckBox("53");
		CheckBox[52].setBackground(new Color(153, 204, 255));
		panel_6.add(CheckBox[52]);
		
		 CheckBox[53] = new JCheckBox("54");
		CheckBox[53].setBackground(new Color(153, 204, 255));
		panel_6.add(CheckBox[53]);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(12, 488, 123, 58);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new GridLayout(2, 3, 0, 0));
		
		 CheckBox[56] = new JCheckBox("57");
		CheckBox[56].setBackground(new Color(153, 204, 255));
		panel_7.add(CheckBox[56]);
		
		 CheckBox[57] = new JCheckBox("58");
		CheckBox[57].setBackground(new Color(153, 204, 255));
		panel_7.add(CheckBox[57]);
		
	 CheckBox[58] = new JCheckBox("59");
		CheckBox[58].setBackground(new Color(153, 204, 255));
		panel_7.add(CheckBox[58]);
		
		CheckBox[59] = new JCheckBox("60");
		CheckBox[59].setBackground(new Color(153, 204, 255));
		panel_7.add(CheckBox[59]);
		
		 CheckBox[60] = new JCheckBox("61");
		CheckBox[60].setBackground(new Color(153, 204, 255));
		panel_7.add(CheckBox[60]);
		
		 CheckBox[61] = new JCheckBox("62");
		CheckBox[61].setBackground(new Color(153, 204, 255));
		panel_7.add(CheckBox[61]);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(165, 0, 46, 58);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		 CheckBox[6] = new JCheckBox("7");
		CheckBox[6].setBackground(new Color(153, 204, 255));
		panel_8.add(CheckBox[6]);
		
		 CheckBox[7] = new JCheckBox("8");
		CheckBox[7].setBackground(new Color(153, 204, 255));
		panel_8.add(CheckBox[7]);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(165, 70, 46, 58);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		 CheckBox[14] = new JCheckBox("15");
		CheckBox[14].setBackground(new Color(153, 204, 255));
		panel_9.add(CheckBox[14]);
		
		CheckBox[15] = new JCheckBox("16");
		CheckBox[15].setBackground(new Color(153, 204, 255));
		panel_9.add(CheckBox[15]);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(165, 140, 46, 58);
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new GridLayout(0, 1, 0, 0));
		
	 CheckBox[22] = new JCheckBox("23");
		CheckBox[22].setBackground(new Color(153, 204, 255));
		panel_10.add(CheckBox[22]);
		
	 CheckBox[23] = new JCheckBox("24");
		CheckBox[23].setBackground(new Color(153, 204, 255));
		panel_10.add(CheckBox[23]);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(165, 209, 46, 58);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));
		
		 CheckBox[30] = new JCheckBox("31");
		CheckBox[30].setBackground(new Color(153, 204, 255));
		panel_11.add(CheckBox[30]);
		
		 CheckBox[31] = new JCheckBox("32");
		CheckBox[31].setBackground(new Color(153, 204, 255));
		panel_11.add(CheckBox[31]);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(165, 278, 46, 58);
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new GridLayout(0, 1, 0, 0));
		
		 CheckBox[38] = new JCheckBox("39");
		CheckBox[38].setBackground(new Color(153, 204, 255));
		panel_12.add(CheckBox[38]);
		
		CheckBox[39] = new JCheckBox("40");
		CheckBox[39].setBackground(new Color(153, 204, 255));
		panel_12.add(CheckBox[39]);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(165, 348, 46, 58);
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));
		
		 CheckBox[46] = new JCheckBox("47");
		CheckBox[46].setBackground(new Color(153, 204, 255));
		panel_13.add(CheckBox[46]);
		
		 CheckBox[47] = new JCheckBox("48");
		CheckBox[47].setBackground(new Color(153, 204, 255));
		panel_13.add(CheckBox[47]);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(165, 418, 46, 58);
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(new GridLayout(0, 1, 0, 0));
		
		 CheckBox[54] = new JCheckBox("55");
		CheckBox[54].setBackground(new Color(153, 204, 255));
		panel_14.add(CheckBox[54]);
		
		 CheckBox[55] = new JCheckBox("56");
		CheckBox[55].setBackground(new Color(153, 204, 255));
		panel_14.add(CheckBox[55]);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(165, 488, 46, 58);
		frame.getContentPane().add(panel_15);
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));
		
		 CheckBox[62] = new JCheckBox("63");
		CheckBox[62].setBackground(new Color(153, 204, 255));
		panel_15.add(CheckBox[62]);
		
	 CheckBox[63] = new JCheckBox("64");
		CheckBox[63].setBackground(new Color(153, 204, 255));
		panel_15.add(CheckBox[63]);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(12, 558, 123, 58);
		frame.getContentPane().add(panel_16);
		panel_16.setLayout(new GridLayout(2, 3, 0, 0));
		
		 CheckBox[64] = new JCheckBox("65");
		CheckBox[64].setBackground(new Color(153, 204, 255));
		panel_16.add(CheckBox[64]);
		
		CheckBox[65] = new JCheckBox("66");
		CheckBox[65].setBackground(new Color(153, 204, 255));
		panel_16.add(CheckBox[65]);
		
		 CheckBox[66] = new JCheckBox("67");
		CheckBox[66].setBackground(new Color(153, 204, 255));
		panel_16.add(CheckBox[66]);
		
		CheckBox[67] = new JCheckBox("68");
		CheckBox[67].setBackground(new Color(153, 204, 255));
		panel_16.add(CheckBox[67]);
		
		CheckBox[68] = new JCheckBox("69");
		CheckBox[68].setBackground(new Color(153, 204, 255));
		panel_16.add(CheckBox[68]);
		
		 CheckBox[69] = new JCheckBox("70");
		CheckBox[69].setBackground(new Color(153, 204, 255));
		panel_16.add(CheckBox[69]);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(165, 558, 46, 58);
		frame.getContentPane().add(panel_17);
		panel_17.setLayout(new GridLayout(0, 1, 0, 0));
		
 CheckBox[70] = new JCheckBox("71");
		CheckBox[70].setBackground(new Color(153, 204, 255));
		panel_17.add(CheckBox[70]);
		
		 CheckBox[71] = new JCheckBox("72");
		CheckBox[71].setBackground(new Color(153, 204, 255));
		panel_17.add(CheckBox[71]);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(30, 144, 255));
		panel_18.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Passenger Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_18.setBounds(356, 0, 440, 253);
		frame.getContentPane().add(panel_18);
		panel_18.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(24, 38, 66, 15);
		panel_18.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(108, 36, 320, 19);
		panel_18.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(24, 65, 66, 15);
		panel_18.add(lblAge);
		
		JLabel lblPnr = new JLabel("PNR:");
		lblPnr.setBounds(24, 92, 66, 15);
		panel_18.add(lblPnr);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 90, 320, 19);
		panel_18.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 63, 320, 19);
		panel_18.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStart = new JLabel("Start:");
		lblStart.setBounds(24, 119, 66, 15);
		panel_18.add(lblStart);
		
		textField_3 = new JTextField();
		textField_3.setBounds(108, 117, 320, 19);
		panel_18.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDestination = new JLabel("End:");
		lblDestination.setBounds(24, 146, 66, 15);
		panel_18.add(lblDestination);
		
		textField_4 = new JTextField();
		textField_4.setBounds(108, 144, 320, 19);
		panel_18.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDate = new JLabel("Seat No:");
		lblDate.setBounds(24, 173, 66, 15);
		panel_18.add(lblDate);
		
		textField_5 = new JTextField();
		textField_5.setBounds(108, 171, 47, 19);
		panel_18.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnEnterInformation = new JButton("Enter Information");
		btnEnterInformation.setBounds(108, 202, 162, 25);
		panel_18.add(btnEnterInformation);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(314, 202, 114, 25);
		panel_18.add(btnUpdate);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new TitledBorder(new TitledBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)), "Passenger Information Display", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_19.setBounds(356, 253, 440, 318);
		frame.getContentPane().add(panel_19);
		panel_19.setLayout(null);
		
		JButton btnSync = new JButton("Sync");
		btnSync.setBackground(UIManager.getColor("TabbedPane.borderHightlightColor"));
		//btnSync.setBackground(new Color(220, 220, 220));
	
		btnSync.setForeground(new Color(0, 0, 0));
		btnSync.setBounds(288, 253, 114, 25);
		panel_19.add(btnSync);
		
		JButton button = new JButton("Reported");
		button.setForeground(UIManager.getColor("Button.foreground"));
		button.setBackground(UIManager.getColor("Button.disabledText"));
		button.setBounds(106, 253, 114, 25);
		panel_19.add(button);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new BevelBorder(BevelBorder.LOWERED, UIManager.getColor("ColorChooser.background"), UIManager.getColor("ColorChooser.foreground"), new Color(238, 238, 238), new Color(238, 238, 238)));
		panel_21.setBackground(new Color(0, 153, 255));
		panel_21.setBounds(12, 0, 209, 616);
		frame.getContentPane().add(panel_21);
	}
}
