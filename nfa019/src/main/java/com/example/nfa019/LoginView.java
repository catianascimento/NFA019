package com.example.nfa019;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginView extends JFrame {

	public JPanel contentPane;
	private JTextField loginField;
	private JPasswordField passwordField;
	private JLabel passwordLabel;
	private JLabel loginLabel;
	private JButton okButton;
	private JButton cancelButton;

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordLabel.setBounds(52, 120, 85, 14);
		contentPane.add(passwordLabel);

		loginLabel = new JLabel("Login:");
		loginLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginLabel.setBounds(52, 80, 49, 14);
		contentPane.add(loginLabel);

		loginField = new JTextField();
		loginField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginField.setBounds(164, 79, 146, 20);
		contentPane.add(loginField);
		loginField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(164, 119, 146, 20);
		contentPane.add(passwordField);

		okButton = new JButton("OK");
		okButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		okButton.setBounds(102, 184, 89, 23);
		contentPane.add(okButton);

		cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancelButton.setBounds(235, 184, 89, 23);
		contentPane.add(cancelButton);
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public void setLoginField(JTextField loginField) {
		this.loginField = loginField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JLabel getPasswordLabel() {
		return passwordLabel;
	}

	public void setPasswordLabel(JLabel passwordLabel) {
		this.passwordLabel = passwordLabel;
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public void setLoginLabel(JLabel loginLabel) {
		this.loginLabel = loginLabel;
	}

	public JButton getOkButton() {
		return okButton;
	}

	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

}
