import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Simulation {
	
	public int popFrontP = 0;
	public int popERP = 0;
	public int popICUP = 0;
	public int popNeoP = 0;
	public int popLobP = 0;
	public int popSarsP = 0;
	public int popVacP = 0;
	public int popVentP = 0;
	public int popRadP = 0;
	public int popFrontS = 0;
	public int popERS = 0;
	public int popICUS = 0;
	public int popNeoS = 0;
	public int popLobS = 0;
	public int popSarsS = 0;
	public int popVacS = 0;
	public int popVentS = 0;
	public int popRadS = 0;
	
	public int staff = 0;

	private JFrame frame;
	private JLabel lblVentSpop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulation window = new Simulation();
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
	public Simulation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
		frame =                                                                                                                               new JFrame();
		frame.setBounds(200, 200, 2000, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image downstairs = new ImageIcon(this.getClass().getResource("/Screen Shot 2020-10-17 at 2.52.30 PM.png")).getImage();
		Image upstairs = new ImageIcon(this.getClass().getResource("/Screen Shot 2020-10-17 at 2.54.18 PM.png")).getImage();
		
		JButton btnEnterMainEnt = new JButton("Enter");
		btnEnterMainEnt.setBounds(147, 75, 95, 16);
		frame.getContentPane().add(btnEnterMainEnt);
		
		JLabel lblRoom = new JLabel("Room");
		lblRoom.setBounds(6, 558, 61, 16);
		frame.getContentPane().add(lblRoom);
		
		JLabel lblpop = new JLabel("Number of Patients");
		lblpop.setBounds(189, 558, 129, 16);
		frame.getContentPane().add(lblpop);
		
		JLabel lblFrontDesk = new JLabel("Front Desk");
		lblFrontDesk.setBounds(6, 606, 95, 16);
		frame.getContentPane().add(lblFrontDesk);
		
		JLabel lblFrontSpop = new JLabel("0");
		lblFrontSpop.setBounds(417, 606, 61, 16);
		frame.getContentPane().add(lblFrontSpop);
		
		JLabel lblStaffpop = new JLabel("Number of Staff");
		lblStaffpop.setBounds(416, 558, 110, 16);
		frame.getContentPane().add(lblStaffpop);
		
		JLabel lblFrontPpop = new JLabel("0");
		lblFrontPpop.setBounds(189, 606, 61, 16);
		frame.getContentPane().add(lblFrontPpop);
		
		JLabel lblErRoom = new JLabel("ER room");
		lblErRoom.setBounds(6, 682, 61, 16);
		frame.getContentPane().add(lblErRoom);
		
		JLabel lblERPpop = new JLabel("0");
		lblERPpop.setBounds(189, 682, 61, 16);
		frame.getContentPane().add(lblERPpop);
		
		JLabel lblERSpop = new JLabel("0");
		lblERSpop.setBounds(417, 682, 73, 16);
		frame.getContentPane().add(lblERSpop);
		
		JLabel lblIcuRoom = new JLabel("ICU Room");
		lblIcuRoom.setBounds(6, 748, 73, 16);
		frame.getContentPane().add(lblIcuRoom);
		
		JLabel lblICUPpop = new JLabel("0");
		lblICUPpop.setBounds(189, 748, 61, 16);
		frame.getContentPane().add(lblICUPpop);
		
		JLabel lblICUSpop = new JLabel("0");
		lblICUSpop.setBounds(416, 748, 61, 16);
		frame.getContentPane().add(lblICUSpop);
		
		JLabel label_2 = new JLabel("Room");
		label_2.setBounds(813, 558, 61, 16);
		frame.getContentPane().add(label_2);
		
		JLabel lblNumberOfPatients = new JLabel("Number of Patients");
		lblNumberOfPatients.setBounds(996, 558, 129, 16);
		frame.getContentPane().add(lblNumberOfPatients);
		
		JLabel lblNeonatal = new JLabel("Neonatal");
		lblNeonatal.setBounds(813, 606, 95, 16);
		frame.getContentPane().add(lblNeonatal);
		
		JLabel lblNeoSpop = new JLabel("0");
		lblNeoSpop.setBounds(1224, 606, 61, 16);
		frame.getContentPane().add(lblNeoSpop);
		
		JLabel label_6 = new JLabel("Number of Staff");
		label_6.setBounds(1223, 558, 110, 16);
		frame.getContentPane().add(label_6);
		
		JLabel lblNeoPpop = new JLabel("0");
		lblNeoPpop.setBounds(996, 606, 61, 16);
		frame.getContentPane().add(lblNeoPpop);
		
		JLabel lblLobby = new JLabel("Lobby");
		lblLobby.setBounds(813, 651, 73, 16);
		frame.getContentPane().add(lblLobby);
		
		JLabel lblLobPpop = new JLabel("0");
		lblLobPpop.setBounds(996, 651, 61, 16);
		frame.getContentPane().add(lblLobPpop);
		
		JLabel lblLobSpop = new JLabel("0");
		lblLobSpop.setBounds(1224, 651, 61, 16);
		frame.getContentPane().add(lblLobSpop);
		
		JLabel lblMainLevel = new JLabel("Main Level");
		lblMainLevel.setBounds(226, 510, 92, 16);
		frame.getContentPane().add(lblMainLevel);
		
		JLabel lblndFloor = new JLabel("2nd Floor");
		lblndFloor.setBounds(1021, 510, 92, 16);
		frame.getContentPane().add(lblndFloor);
		
		JLabel lblSarscov = new JLabel("Sars-Cov 2");
		lblSarscov.setBounds(813, 689, 95, 16);
		frame.getContentPane().add(lblSarscov);
		
		JLabel lblSarsSpop = new JLabel("0");
		lblSarsSpop.setBounds(1224, 689, 61, 16);
		frame.getContentPane().add(lblSarsSpop);
		
		JLabel lblSarsPpop = new JLabel("0");
		lblSarsPpop.setBounds(996, 689, 61, 16);
		frame.getContentPane().add(lblSarsPpop);
		
		JLabel lblVaccine = new JLabel("Vaccine");
		lblVaccine.setBounds(813, 737, 95, 16);
		frame.getContentPane().add(lblVaccine);
		
		JLabel lblVacPpop = new JLabel("0");
		lblVacPpop.setBounds(996, 737, 61, 16);
		frame.getContentPane().add(lblVacPpop);
		
		JLabel lblVacSpop = new JLabel("0");
		lblVacSpop.setBounds(1224, 737, 73, 16);
		frame.getContentPane().add(lblVacSpop);
		
		JLabel lblVentilation = new JLabel("Ventilation");
		lblVentilation.setBounds(813, 777, 73, 16);
		frame.getContentPane().add(lblVentilation);
		
		JLabel lblVentPpop = new JLabel("0");
		lblVentPpop.setBounds(996, 777, 61, 16);
		frame.getContentPane().add(lblVentPpop);
		
		lblVentSpop = new JLabel("0");
		lblVentSpop.setBounds(1224, 777, 61, 16);
		frame.getContentPane().add(lblVentSpop);
		
		JButton btnExitMainEnt = new JButton("Exit");
		btnExitMainEnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExitMainEnt.setBounds(147, 92, 95, 16);
		frame.getContentPane().add(btnExitMainEnt);
		
		JButton btnEnterEr = new JButton("Enter");
		btnEnterEr.setBounds(209, 310, 95, 16);
		frame.getContentPane().add(btnEnterEr);
		
		JButton btnExitER = new JButton("Exit");
		btnExitER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExitER.setBounds(209, 327, 95, 16);
		frame.getContentPane().add(btnExitER);
		
		JButton btnEnterSide = new JButton("Enter");
		btnEnterSide.setBounds(114, 372, 95, 16);
		frame.getContentPane().add(btnEnterSide);
		
		JButton btnExitSide = new JButton("Exit");
		btnExitSide.setBounds(114, 389, 95, 16);
		frame.getContentPane().add(btnExitSide);
		
		JButton btnEnterICU = new JButton("Enter");
		btnEnterICU.setBounds(487, 382, 95, 16);
		frame.getContentPane().add(btnEnterICU);
		
		JButton btnExitICU = new JButton("Exit");
		btnExitICU.setBounds(487, 399, 95, 16);
		frame.getContentPane().add(btnExitICU);
		
		JButton btnEnterNeo = new JButton("Enter");
		
		btnEnterNeo.setBounds(1021, 160, 53, 16);
		frame.getContentPane().add(btnEnterNeo);
		
		JButton btnExitNeo = new JButton("Exit");
		
		btnExitNeo.setBounds(1022, 139, 53, 16);
		frame.getContentPane().add(btnExitNeo);
		
		JButton btnEnterLob = new JButton("Enter");
		btnEnterLob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnterLob.setBounds(901, 203, 53, 16);
		frame.getContentPane().add(btnEnterLob);
		
		JButton btnExitLob = new JButton("Exit");
		
		btnExitLob.setBounds(901, 184, 53, 16);
		frame.getContentPane().add(btnExitLob);
		
		JButton btnEnterVac = new JButton("Enter");
		btnEnterVac.setBounds(901, 389, 53, 16);
		frame.getContentPane().add(btnEnterVac);
		
		JButton btnExitVac = new JButton("Exit");
		btnExitVac.setBounds(901, 361, 53, 16);
		frame.getContentPane().add(btnExitVac);
		
		JButton btnEnterVent = new JButton("Enter");
		btnEnterVent.setBounds(1139, 382, 53, 16);
		frame.getContentPane().add(btnEnterVent);
		
		JButton btnExitVent = new JButton("Exit");
		btnExitVent.setBounds(1140, 361, 53, 16);
		frame.getContentPane().add(btnExitVent);
		
		JButton btnEnterRad = new JButton("Enter");
		btnEnterRad.setBounds(1076, 203, 53, 16);
		frame.getContentPane().add(btnEnterRad);
		
		JButton btnExitRad = new JButton("Exit");
		btnExitRad.setBounds(1077, 182, 53, 16);
		frame.getContentPane().add(btnExitRad);
		
		JButton btnEnterSars = new JButton("Enter");
		btnEnterSars.setBounds(1021, 292, 53, 16);
		frame.getContentPane().add(btnEnterSars);
		
		JButton btnExitSars = new JButton("Exit");
		btnExitSars.setBounds(1021, 310, 53, 16);
		frame.getContentPane().add(btnExitSars);
		
		JButton btnScanner = new JButton("Scanner");
		btnScanner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;
			}
		});
		btnScanner.setBounds(47, 89, 95, 23);
		frame.getContentPane().add(btnScanner);
		
		JButton btnScannerSide = new JButton("Scanner");
		btnScannerSide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;}
		});
		btnScannerSide.setBounds(47, 434, 95, 23);
		frame.getContentPane().add(btnScannerSide);
		
		JButton btnScannerER = new JButton("Scanner");
		btnScannerER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;
			}
		});
		btnScannerER.setBounds(306, 321, 95, 23);
		frame.getContentPane().add(btnScannerER);
		
		JButton btnScannerICU = new JButton("Scanner");
		btnScannerICU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;
			}
		});
		btnScannerICU.setBounds(487, 420, 95, 23);
		frame.getContentPane().add(btnScannerICU);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(downstairs));
		label.setBounds(-18, 28, 741, 466);
		frame.getContentPane().add(label);
		
		JButton btnScannerLobby = new JButton("Scanner");
		btnScannerLobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;
			}
		});
		btnScannerLobby.setBounds(873, 154, 95, 23);
		frame.getContentPane().add(btnScannerLobby);
		
		JButton btnScannerNeonatal = new JButton("Scanner");
		btnScannerNeonatal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;
			}
		});
		btnScannerNeonatal.setBounds(1076, 92, 80, 23);
		frame.getContentPane().add(btnScannerNeonatal);
		
		JButton btnScannerRad = new JButton("Scanner");
		btnScannerRad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;
			}
		});
		btnScannerRad.setBounds(1074, 231, 80, 23);
		frame.getContentPane().add(btnScannerRad);
		
		JButton btnScannerSars = new JButton("Scanner");
		btnScannerSars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;
			}
		});
		btnScannerSars.setBounds(940, 286, 80, 23);
		frame.getContentPane().add(btnScannerSars);
		
		JButton btnScannerVaccine = new JButton("Scanner");
		btnScannerVaccine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;
			}
		});
		btnScannerVaccine.setBounds(901, 417, 80, 23);
		frame.getContentPane().add(btnScannerVaccine);
		
		JButton btnScannerVent = new JButton("Scanner");
		btnScannerVent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff = 1;
			}
		});
		btnScannerVent.setBounds(1127, 399, 80, 23);
		frame.getContentPane().add(btnScannerVent);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(upstairs));
		label_1.setBounds(703, -17, 705, 525);
		frame.getContentPane().add(label_1);
		
		btnEnterMainEnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staff == 1) {
					popFrontS++;
					staff = 0;
				}
				else if(staff == 0){
				popFrontP++;
				}
				lblFrontPpop.setText(Integer.toString(popFrontP) );
				lblFrontSpop.setText(Integer.toString(popFrontS));
			}
			
			
			
		});
		btnExitMainEnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staff == 1) {
					popFrontS--;
					staff = 0;
				}
				else if(staff == 0){
				popFrontP--;
				}
				lblFrontPpop.setText(Integer.toString(popFrontP) );
				lblFrontSpop.setText(Integer.toString(popFrontS));
			}
			
		});
		btnEnterEr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staff == 1) {
					popERS++;
					popFrontS--;
					staff = 0;
				}
				else if(staff == 0){
				popERP++;
				popFrontP--;
				}
				lblFrontPpop.setText(Integer.toString(popFrontP) );
				lblFrontSpop.setText(Integer.toString(popFrontS));
				lblERPpop.setText(Integer.toString(popERP) );
				lblERSpop.setText(Integer.toString(popERS));
			}
			
		});
		btnExitER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staff == 1) {
					popERS--;
					popFrontS++;
					staff = 0;
				}
				else if(staff == 0){
				popERP--;
				popFrontP--;
				}
				lblFrontPpop.setText(Integer.toString(popFrontP) );
				lblFrontSpop.setText(Integer.toString(popFrontS));
				lblERPpop.setText(Integer.toString(popERP) );
				lblERSpop.setText(Integer.toString(popERS));
				lblICUPpop.setText(Integer.toString(popICUP));
				lblICUSpop.setText(Integer.toString(popICUS));
				lblNeoPpop.setText(Integer.toString(popNeoP));
				lblNeoSpop.setText(Integer.toString(popNeoS));
				lblLobPpop.setText(Integer.toString(popLobP));
				lblLobSpop.setText(Integer.toString(popLobS));
				lblSarsPpop.setText(Integer.toString(popSarsP));
				lblSarsSpop.setText(Integer.toString(popSarsS));
				lblVacPpop.setText(Integer.toString(popVacP));
				lblVacSpop.setText(Integer.toString(popVacS));
				lblVentPpop.setText(Integer.toString(popVentP));
				lblVentSpop.setText(Integer.toString(popVentS));
			}
		});
		
		btnEnterLob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staff == 1) {
					popLobS++;
					popFrontS--;
					staff = 0;
				}
				else if(staff == 0){
					popLobP++;
					popFrontP--;
				}
				lblFrontPpop.setText(Integer.toString(popFrontP) );
				lblFrontSpop.setText(Integer.toString(popFrontS));
				lblERPpop.setText(Integer.toString(popERP) );
				lblERSpop.setText(Integer.toString(popERS));
				lblICUPpop.setText(Integer.toString(popICUP));
				lblICUSpop.setText(Integer.toString(popICUS));
				lblNeoPpop.setText(Integer.toString(popNeoP));
				lblNeoSpop.setText(Integer.toString(popNeoS));
				lblLobPpop.setText(Integer.toString(popLobP));
				lblLobSpop.setText(Integer.toString(popLobS));
				lblSarsPpop.setText(Integer.toString(popSarsP));
				lblSarsSpop.setText(Integer.toString(popSarsS));
				lblVacPpop.setText(Integer.toString(popVacP));
				lblVacSpop.setText(Integer.toString(popVacS));
				lblVentPpop.setText(Integer.toString(popVentP));
				lblVentSpop.setText(Integer.toString(popVentS));
			
			}
		});
		btnExitLob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staff == 1) {
					popLobS--;
					popFrontS++;
					staff = 0;
				}
				else if(staff == 0){
					popLobP--;
					popFrontP++;
				}
				lblFrontPpop.setText(Integer.toString(popFrontP) );
				lblFrontSpop.setText(Integer.toString(popFrontS));
				lblERPpop.setText(Integer.toString(popERP) );
				lblERSpop.setText(Integer.toString(popERS));
				lblICUPpop.setText(Integer.toString(popICUP));
				lblICUSpop.setText(Integer.toString(popICUS));
				lblNeoPpop.setText(Integer.toString(popNeoP));
				lblNeoSpop.setText(Integer.toString(popNeoS));
				lblLobPpop.setText(Integer.toString(popLobP));
				lblLobSpop.setText(Integer.toString(popLobS));
				lblSarsPpop.setText(Integer.toString(popSarsP));
				lblSarsSpop.setText(Integer.toString(popSarsS));
				lblVacPpop.setText(Integer.toString(popVacP));
				lblVacSpop.setText(Integer.toString(popVacS));
				lblVentPpop.setText(Integer.toString(popVentP));
				lblVentSpop.setText(Integer.toString(popVentS));
			}
		});
		
		btnEnterNeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staff == 1) {
					popNeoS++;
					popLobS--;
					staff = 0;
				}
				else if(staff == 0){
					popNeoP++;
					popLobP--;
				}
				lblFrontPpop.setText(Integer.toString(popFrontP) );
				lblFrontSpop.setText(Integer.toString(popFrontS));
				lblERPpop.setText(Integer.toString(popERP) );
				lblERSpop.setText(Integer.toString(popERS));
				lblICUPpop.setText(Integer.toString(popICUP));
				lblICUSpop.setText(Integer.toString(popICUS));
				lblNeoPpop.setText(Integer.toString(popNeoP));
				lblNeoSpop.setText(Integer.toString(popNeoS));
				lblLobPpop.setText(Integer.toString(popLobP));
				lblLobSpop.setText(Integer.toString(popLobS));
				lblSarsPpop.setText(Integer.toString(popSarsP));
				lblSarsSpop.setText(Integer.toString(popSarsS));
				lblVacPpop.setText(Integer.toString(popVacP));
				lblVacSpop.setText(Integer.toString(popVacS));
				lblVentPpop.setText(Integer.toString(popVentP));
				lblVentSpop.setText(Integer.toString(popVentS));
			
			}
		});
		btnExitNeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staff == 1) {
					popNeoS--;
					popLobS++;
					staff = 0;
				}
				else if(staff == 0){
					popNeoP--;
					popLobP++;
				}
				lblFrontPpop.setText(Integer.toString(popFrontP) );
				lblFrontSpop.setText(Integer.toString(popFrontS));
				lblERPpop.setText(Integer.toString(popERP) );
				lblERSpop.setText(Integer.toString(popERS));
				lblICUPpop.setText(Integer.toString(popICUP));
				lblICUSpop.setText(Integer.toString(popICUS));
				lblNeoPpop.setText(Integer.toString(popNeoP));
				lblNeoSpop.setText(Integer.toString(popNeoS));
				lblLobPpop.setText(Integer.toString(popLobP));
				lblLobSpop.setText(Integer.toString(popLobS));
				lblSarsPpop.setText(Integer.toString(popSarsP));
				lblSarsSpop.setText(Integer.toString(popSarsS));
				lblVacPpop.setText(Integer.toString(popVacP));
				lblVacSpop.setText(Integer.toString(popVacS));
				lblVentPpop.setText(Integer.toString(popVentP));
				lblVentSpop.setText(Integer.toString(popVentS));
			
			}
		});
	}
}
