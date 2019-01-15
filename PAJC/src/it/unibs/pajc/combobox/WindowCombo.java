package it.unibs.pajc.combobox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.*;
import java.util.ArrayList;

public class WindowCombo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowCombo window = new WindowCombo();
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
	public WindowCombo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		File f;
		FileReader fr;
		BufferedReader br=null;
		
		ArrayList<String> l = new ArrayList<>();
		try {
			f = new File("C:\\Users\\matte\\git\\PAJC\\PAJC\\bin\\it\\unibs\\pajc\\combobox\\lista.txt");
			fr =  new FileReader(f);
			br =  new BufferedReader(fr);
			int i=0;
			String line;
			do {
				line = br.readLine();
				if(line!=null)
					l.add(line);
			}
			while(line!=null);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String[] list = new String[l.size()];
		l.toArray(list);
		JComboBox comboBox = new JComboBox(list);
		
		comboBox.setBounds(141, 106, 169, 51);
		frame.getContentPane().add(comboBox);
	}
}
