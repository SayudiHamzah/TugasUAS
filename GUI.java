import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField txtNama;
	private JTextField txtNim;
	private JTextField txtJurusan;
	private JTextField txtNilaitugas;
	private JTextField txtNilaiuts;
	private JTextField txtNilaiuas;
	
	ArrayList<Hitungan> ratarata = new ArrayList<Hitungan>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 588, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 11, 550, 71);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Tema = new JLabel("Menghitung Nilai Rata-rata");
		Tema.setForeground(new Color(255, 0, 0));
		Tema.setFont(new Font("Tahoma", Font.BOLD, 22));
		Tema.setBounds(121, 11, 322, 29);
		panel.add(Tema);
		
		JPanel input = new JPanel();
		input.setBackground(Color.GREEN);
		input.setBounds(10, 91, 267, 173);
		frame.getContentPane().add(input);
		input.setLayout(null);
		
		JLabel nama = new JLabel("Nama");
		nama.setBounds(10, 11, 72, 14);
		input.add(nama);
		
		JLabel nim = new JLabel("NIM");
		nim.setBounds(10, 35, 72, 14);
		input.add(nim);
		
		JLabel jurusan = new JLabel("Jurusan");
		jurusan.setBounds(10, 60, 72, 14);
		input.add(jurusan);
		
		JLabel nilaitugas = new JLabel("Nilai Tugas");
		nilaitugas.setBounds(10, 84, 72, 14);
		input.add(nilaitugas);
		
		JLabel nilaiuts_1 = new JLabel("Nilai UTS");
		nilaiuts_1.setBounds(10, 109, 72, 14);
		input.add(nilaiuts_1);
		
		JLabel nilaiuas_1 = new JLabel("Nilai UAS");
		nilaiuas_1.setBounds(10, 134, 72, 14);
		input.add(nilaiuas_1);
		
		txtNama = new JTextField();
		txtNama.setBounds(80, 8, 177, 20);
		input.add(txtNama);
		txtNama.setColumns(10);
		
		txtNim = new JTextField();
		txtNim.setBounds(80, 32, 177, 20);
		input.add(txtNim);
		txtNim.setColumns(10);
		
		txtJurusan = new JTextField();
		txtJurusan.setBounds(80, 57, 177, 20);
		input.add(txtJurusan);
		txtJurusan.setColumns(10);
		
		txtNilaitugas = new JTextField();
		txtNilaitugas.setBounds(81, 81, 176, 20);
		input.add(txtNilaitugas);
		txtNilaitugas.setColumns(10);
		
		txtNilaiuts = new JTextField();
		txtNilaiuts.setBounds(80, 106, 177, 20);
		input.add(txtNilaiuts);
		txtNilaiuts.setColumns(10);
		
		txtNilaiuas = new JTextField();
		txtNilaiuas.setBounds(80, 131, 177, 20);
		input.add(txtNilaiuas);
		txtNilaiuas.setColumns(10);
		
		JPanel output = new JPanel();
		output.setBackground(Color.GREEN);
		output.setBounds(288, 93, 272, 173);
		frame.getContentPane().add(output);
		output.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nama          :");
		lblNewLabel.setBounds(10, 11, 69, 14);
		output.add(lblNewLabel);
		
		JLabel lblNim = new JLabel("NIM            :");
		lblNim.setBounds(10, 36, 71, 14);
		output.add(lblNim);
		
		JLabel lblNewLabel_1 = new JLabel("Rerata        :");
		lblNewLabel_1.setBounds(10, 61, 69, 14);
		output.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Grade         :");
		lblNewLabel_2.setBounds(10, 86, 69, 14);
		output.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Keterangan   :");
		lblNewLabel_3.setBounds(10, 112, 78, 14);
		output.add(lblNewLabel_3);
		
		JLabel outnama = new JLabel("");
		outnama.setBounds(89, 11, 173, 14);
		output.add(outnama);
		
		JLabel outnim = new JLabel("");
		outnim.setBounds(91, 36, 171, 14);
		output.add(outnim);
		
		JLabel outrerata = new JLabel("");
		outrerata.setBounds(91, 61, 171, 14);
		output.add(outrerata);
		
		JLabel outgrade = new JLabel("");
		outgrade.setBounds(91, 86, 171, 14);
		output.add(outgrade);
		
		JLabel outketerangan = new JLabel("");
		outketerangan.setBounds(91, 112, 171, 14);
		output.add(outketerangan);
		
		JButton masuk = new JButton("Masuk");
		masuk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama = txtNama.getText();
				String nim = txtNim.getText();
				if (txtNama.getText().isEmpty()||txtNim.getText().isEmpty()||txtJurusan.getText().isEmpty()||txtNilaitugas.getText().isEmpty()
						||txtNilaiuts.getText().isEmpty()||txtNilaiuas.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Data Terisi");
			
				}
				else {
					Double rerata = (Double.parseDouble(txtNilaitugas.getText())+Double.parseDouble(txtNilaiuts.getText())
						+Double.parseDouble(txtNilaiuas.getText()))/3;
					outrerata.setText(rerata.toString());
					outnama.setText(nama);
					outnim.setText(nim);
					
						}
				
				Double a = Double.parseDouble(outrerata.getText());
				char grade = ' ';
				if (a >=90) {
					grade = 'A';
					outgrade.setText(""+grade);
				}
				else if (a <= 89 && a >= 78) {
					grade = 'B';
					outgrade.setText(""+grade);
				}
				else if (a <= 77 && a >= 68) {
					grade = 'C';
					outgrade.setText(""+grade);
				}
				else if (a <= 67 && a >= 58) {
					grade = 'D';
					outgrade.setText(""+grade);
				}
				else {
					grade = 'E';
					outgrade.setText(""+grade);
				}
				
				if (grade == 'A' || grade == 'B' || grade == 'C') {
					outketerangan.setText("Dinyatakan Lulus");
				}
				else {
					outketerangan.setText("Dinyatakan Tidak Lulus");
				}

				}
		});
		masuk.setBounds(100, 294, 89, 23);
		frame.getContentPane().add(masuk);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNama.setText(null);
				txtNim.setText(null);
				txtJurusan.setText(null);
				txtNilaitugas.setText(null);
				txtNilaiuts.setText(null);
				txtNilaiuas.setText(null);
				outnama.setText(null);
				outnim.setText(null);
				outrerata.setText(null);
				outgrade.setText(null);
				outketerangan.setText(null);
			}
		});
		reset.setBounds(237, 294, 89, 23);
		frame.getContentPane().add(reset);
		
		JButton simpan = new JButton("Simpan");
		simpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedWriter simpan = new BufferedWriter (new FileWriter("hasil.txt"));
					String panggil = "Nama :\t\t"+outnama.getText()+"\n"+
									"Nim :\t\t"+outnim.getText()+"\n"+
									"Rerata :\t\t"+outrerata.getText()+"\n"+
									"Grade :\t\t"+outgrade.getText()+"\n"+
									"Keterangan :\t\t"+outketerangan.getText();
					simpan.write(panggil);
					JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
					simpan.close();
				}
				catch (Exception a) {
					JOptionPane.showMessageDialog(null, a);
				}
			}
		});
		simpan.setBounds(381, 294, 89, 23);
		frame.getContentPane().add(simpan);
	}
}
