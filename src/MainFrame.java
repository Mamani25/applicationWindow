import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import jssc.SerialPort;
import static jssc.SerialPort.MASK_RXCHAR;
import jssc.SerialPortEvent;
import jssc.SerialPortException;
import jssc.SerialPortList;


public class MainFrame {
	
	SerialPort sp = null;
	ObservableList<String> portsAvail;
	int portid;
	String portNumber;
	int i;
	private JFrame frame;
	
	
	private void detectPorts(JComboBox comboBox){
		portsAvail = FXCollections.observableArrayList();
		String[] serialPortNames = SerialPortList.getPortNames();
		
		for(String name: serialPortNames){
		
			portsAvail.add(name);
			comboBox.addItem(name);
		}
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 728, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnConnect = new JButton("CONNECT");
		
		btnConnect.setBounds(275, 274, 144, 46);
		frame.getContentPane().add(btnConnect);
		
		JComboBox comPortSelect = new JComboBox();
		comPortSelect.setBounds(554, 52, 144, 33);
		frame.getContentPane().add(comPortSelect);
		detectPorts(comPortSelect);
		
		
		JLabel lblSelectComPort = new JLabel("SELECT COM PORT");
		lblSelectComPort.setBounds(558, 13, 140, 26);
		frame.getContentPane().add(lblSelectComPort);
		
		JLabel connectStatusLabel = new JLabel("Not connected");
		connectStatusLabel.setBounds(279, 337, 140, 26);
		frame.getContentPane().add(connectStatusLabel);
		
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object s = comPortSelect.getSelectedItem();
				System.out.println(s);
				DashboardFrame dframe = new DashboardFrame();
				dframe.comPort = s.toString();
				
				dframe.setVisible(true);
				frame.dispose();
				
				
//				sp = new SerialPort(s.toString());
//				
//				try {
//				    sp.openPort();
//
//				    sp.setParams(SerialPort.BAUDRATE_9600,
//				                         SerialPort.DATABITS_8,
//				                         SerialPort.STOPBITS_1,
//				                         SerialPort.PARITY_NONE);
//				    
//				    sp.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN | 
//                            SerialPort.FLOWCONTROL_RTSCTS_OUT);
//				    System.out.println("connected");
//				    
//				}
//				catch(SerialPortException ex){
//					System.out.println("error" + ex);
//				}
				
				
								
			}
		});
		
	}
}
