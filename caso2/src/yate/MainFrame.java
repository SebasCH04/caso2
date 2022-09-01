package yate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.Font;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	JProgressBar panelsolar1 = new JProgressBar();
	JProgressBar panelsolar2 = new JProgressBar();
	JProgressBar panelsolar3 = new JProgressBar();
	JProgressBar bateria1 = new JProgressBar();
	JProgressBar bateria2 = new JProgressBar();
	private JTextField txt_velocidad;
	private JTextField txt_sol;
	private JTextField txt_simulacion;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sebas\\Downloads\\yate ico.png"));
		setTitle("Caso #2 - Yate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Panel Solar 1");
		lblNewLabel.setBounds(10, 11, 146, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblPanelSolar = new JLabel("Panel Solar 2");
		lblPanelSolar.setBounds(10, 88, 146, 31);
		contentPane.add(lblPanelSolar);
		
		JLabel lblPanelSolar_1 = new JLabel("Panel Solar 3");
		lblPanelSolar_1.setBounds(10, 174, 146, 31);
		contentPane.add(lblPanelSolar_1);
		
		panelsolar1.setBounds(10, 39, 146, 14);
		contentPane.add(panelsolar1);
		
		
		panelsolar2.setBounds(10, 118, 146, 14);
		contentPane.add(panelsolar2);
		
		
		panelsolar3.setBounds(10, 205, 146, 14);
		contentPane.add(panelsolar3);
		
		JLabel lblNewLabel_1 = new JLabel("Bateria 1");
		lblNewLabel_1.setBounds(10, 284, 146, 14);
		contentPane.add(lblNewLabel_1);
		
		
		bateria1.setBounds(10, 309, 146, 14);
		contentPane.add(bateria1);
		
		JLabel lblNewLabel_2 = new JLabel("Bateria 2");
		lblNewLabel_2.setBounds(10, 350, 146, 14);
		contentPane.add(lblNewLabel_2);
		
		
		bateria2.setBounds(10, 375, 146, 14);
		contentPane.add(bateria2);
		
		JLabel lblNewLabel_3 = new JLabel("% de Sol");
		lblNewLabel_3.setBounds(405, 96, 123, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Tiempo de Simulación");
		lblNewLabel_5.setBounds(405, 284, 146, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Velocidad");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(405, 182, 136, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IniciarSimulacion();
			}
		});
		btnNewButton.setBounds(465, 393, 89, 23);
		contentPane.add(btnNewButton);
		
		txt_velocidad = new JTextField();
		txt_velocidad.setBounds(405, 207, 86, 20);
		contentPane.add(txt_velocidad);
		txt_velocidad.setColumns(10);
		
		txt_sol = new JTextField();
		txt_sol.setColumns(10);
		txt_sol.setBounds(405, 118, 86, 20);
		contentPane.add(txt_sol);
		
		txt_simulacion = new JTextField();
		txt_simulacion.setColumns(10);
		txt_simulacion.setBounds(405, 309, 86, 20);
		contentPane.add(txt_simulacion);
	}

	public void IniciarSimulacion() {
		txt_velocidad.setText("50");
		txt_sol.setText("100");
		txt_simulacion.setText("0:30");
		bateria1.setValue(DISPOSE_ON_CLOSE);
		bateria2.setValue(DISPOSE_ON_CLOSE);
		panelsolar1.setValue(DISPOSE_ON_CLOSE);
		panelsolar2.setValue(DISPOSE_ON_CLOSE);
		panelsolar3.setValue(DISPOSE_ON_CLOSE);
		
			panelsolar1.setValue(0);
	        while (panelsolar1.getValue() < 100) {
	        	panelsolar1.setValue(panelsolar1.getValue()+ 10);
	        	panelsolar2.setValue(panelsolar1.getValue()+ 10);
	        	panelsolar3.setValue(panelsolar1.getValue()+ 10);
	        	bateria1.setValue(bateria1.getValue());
	        	bateria2.setValue(bateria2.getValue());
	        }
	}
}
