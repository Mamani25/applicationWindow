import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

public class DashboardFrame extends JFrame {

	private JPanel contentPane;
	private JTextField logTextField;
	private JTextField name;
	private JTextField department;
	private JTextField matric_no;
	private JTextField level;
	public String comPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardFrame frame = new DashboardFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DashboardFrame() {
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1238, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Monitor", null, panel, null);
		panel.setLayout(null);
		
		JComboBox buidingList = new JComboBox();
		buidingList.setBounds(58, 75, 526, 41);
		panel.add(buidingList);
		
		JLabel lblSelectBuilding = new JLabel("SELECT BUILDING");
		lblSelectBuilding.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblSelectBuilding.setBounds(58, 37, 171, 25);
		panel.add(lblSelectBuilding);
		
		logTextField = new JTextField();
		logTextField.setEditable(false);
		logTextField.setBounds(58, 197, 526, 274);
		panel.add(logTextField);
		logTextField.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(563, 197, 21, 274);
		panel.add(scrollBar);
		
		JLabel lblEntryLog = new JLabel("Entry Log");
		lblEntryLog.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblEntryLog.setBounds(58, 167, 143, 25);
		panel.add(lblEntryLog);
		
		JLabel detailLabel = new JLabel("Details of ID");
		detailLabel.setBounds(759, 75, 370, 256);
		panel.add(detailLabel);
		
		JLabel lblConnectedToCom = new JLabel("Connected to COM Port ");
		lblConnectedToCom.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 17));
		lblConnectedToCom.setBounds(841, 485, 226, 41);
		panel.add(lblConnectedToCom);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Register", null, panel_1, null);
		panel_1.setLayout(null);
		
		name = new JTextField();
		name.setBounds(54, 109, 476, 43);
		name.setBackground(Color.LIGHT_GRAY);
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel lblFirstName = new JLabel("Name");
		lblFirstName.setBounds(54, 90, 47, 16);
		lblFirstName.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_1.add(lblFirstName);
		
		JLabel lblFaculty = new JLabel("Faculty");
		lblFaculty.setBounds(54, 178, 58, 16);
		lblFaculty.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_1.add(lblFaculty);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(54, 251, 97, 16);
		lblDepartment.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_1.add(lblDepartment);
		
		department = new JTextField();
		department.setBounds(54, 270, 476, 43);
		department.setBackground(Color.LIGHT_GRAY);
		department.setColumns(10);
		panel_1.add(department);
		
		JLabel lblMatricNo = new JLabel("Matric No.");
		lblMatricNo.setBounds(54, 324, 83, 16);
		lblMatricNo.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_1.add(lblMatricNo);
		
		matric_no = new JTextField();
		matric_no.setBounds(54, 343, 476, 43);
		matric_no.setBackground(Color.LIGHT_GRAY);
		matric_no.setColumns(10);
		panel_1.add(matric_no);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(54, 408, 43, 16);
		lblLevel.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_1.add(lblLevel);
		
		level = new JTextField();
		level.setBounds(54, 427, 476, 43);
		level.setBackground(Color.LIGHT_GRAY);
		level.setColumns(10);
		panel_1.add(level);
		
		JComboBox facultyList = new JComboBox();
		facultyList.setBounds(54, 197, 476, 43);
		panel_1.add(facultyList);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBounds(914, 477, 211, 69);
		panel_1.add(btnRegister);
		
		System.out.println(comPort);
	}
}
