package JUnit.Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import JUnit.Calculadora.Calculos;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblOperacion;

	private boolean op = false;
	private Calculos cal = new Calculos();

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		//-----------JPANELS--------------------
		JPanel numbersPanel = new JPanel();
		numbersPanel.setBounds(10, 91, 414, 159);
		contentPane.add(numbersPanel);
		numbersPanel.setLayout(new GridLayout(3, 5, 0, 0));

		JPanel operationPanel = new JPanel();
		operationPanel.setBounds(0, 11, 434, 69);
		contentPane.add(operationPanel);
		operationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//------------JBUTTONS--------------------
		JButton btn1 = new JButton("1");
		numbersPanel.add(btn1);

		JButton btn2 = new JButton("2");
		numbersPanel.add(btn2);

		JButton btn3 = new JButton("3");
		numbersPanel.add(btn3);

		JButton btnSuma = new JButton("+");
		numbersPanel.add(btnSuma);

		JButton btnResta = new JButton("-");
		numbersPanel.add(btnResta);

		JButton btn4 = new JButton("4");
		numbersPanel.add(btn4);

		JButton btn5 = new JButton("5");
		numbersPanel.add(btn5);

		JButton btn6 = new JButton("6");
		numbersPanel.add(btn6);

		JButton btnMulti = new JButton("*");
		numbersPanel.add(btnMulti);

		JButton btnDiv = new JButton("/");
		numbersPanel.add(btnDiv);

		JButton btn7 = new JButton("7");
		numbersPanel.add(btn7);

		JButton btn8 = new JButton("8");
		numbersPanel.add(btn8);

		JButton btn9 = new JButton("9");
		numbersPanel.add(btn9);

		JButton btn0 = new JButton("0");
		numbersPanel.add(btn0);

		JButton btnResult = new JButton("=");
		numbersPanel.add(btnResult);
		

		//-------JTEXTFIELDS Y JLABELS-----------
		textField = new JTextField();
		textField.setEditable(false);
		operationPanel.add(textField);
		textField.setColumns(10);

		lblOperacion = new JLabel("");
		operationPanel.add(lblOperacion);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		operationPanel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblResult = new JLabel("=");
		operationPanel.add(lblResult);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		operationPanel.add(textField_2);
		textField_2.setColumns(10);

		JButton btnLimpiar = new JButton("Limpiar");
		operationPanel.add(btnLimpiar);

		// ---------------ACTIONLISTENERS---------------
		// ---BTN1
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn1);
			}
		});
		// ---BTN2
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn2);
			}
		});
		// ---BTN3
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn3);
			}
		});
		// ---BTN4
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn4);
			}
		});
		// ---BTN5
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn5);
			}
		});
		// ---BTN6
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn6);
			}
		});
		// ---BTN7
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn7);
			}
		});
		// ---BTN8
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn8);
			}
		});
		// ---BTN9
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn9);
			}
		});
		// ---BTN0
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirValor(btn0);
			}
		});

		// ---BTNSUMA
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirOperacion(btnSuma); 
			}
		});
		// ---BTNRESTA
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirOperacion(btnResta); 
			}
		});
		// ---BTNMULTI
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirOperacion(btnMulti); 
			}
		});
		// ---BTNDIV
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirOperacion(btnDiv); 
			}
		});

		// ---BTNRESULT
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribirResultado();
			}
		});

		// ---BTNLIMPIAR
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpiar();
			}
		});

		setVisible(true);
	}
	
	//-----MÉTODOS----
	
	public void escribirValor(JButton btn) {
		if (!op) {
			textField.setText(textField.getText() + btn.getText());
		} else {
			textField_1.setText(textField_1.getText() + btn.getText());
		}
	}
	
	public void escribirOperacion(JButton btn) {
		op = true;
		lblOperacion.setText(btn.getText());
		
	}
	
	public void escribirResultado() {
		double i1 = Integer.parseInt(textField.getText());
		double i2 = Integer.parseInt(textField_1.getText());
		String oper = lblOperacion.getText();

		switch (oper) {
		case "+":
			textField_2.setText(cal.suma(i1,i2));
			break;
		case "-":
			textField_2.setText(cal.resta(i1,i2));
			break;
		case "*":
			textField_2.setText(cal.multiplicacion(i1,i2));
			break;
		case "/":
			textField_2.setText(cal.division(i1,i2));
			break;

		default:
			System.out.println("Error");
			break;
		}
	}
	
	public void limpiar() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		
		lblOperacion.setText("");
		
		op=false;
	}
	
	
}
