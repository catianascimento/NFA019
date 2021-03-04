package nfa019;

import javax.swing.JOptionPane;

public class LoginController {
	private LoginModel model;
	private LoginView view;

	public LoginController(LoginModel m, LoginView v) {
		model = m;
		view = v;
		initView();
	}

	public void initView() {
		view.getLoginField().setText(model.getLogin());
		view.getPasswordField().setText(model.getPassword());
	}

	public void initController() {
		view.getOkButton().addActionListener(e -> saveLogin());
		view.getCancelButton().addActionListener(e -> savePassword());
		view.getOkButton().addActionListener(e -> sayHello());
		view.getCancelButton().addActionListener(e -> sayBye());
	}

	private void saveLogin() {
		model.setLogin(view.getLoginField().getText());
		JOptionPane.showMessageDialog(null, "Login saved : " + model.getLogin(), "Info",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void savePassword() {
		model.setPassword(view.getPasswordField().getName());
		JOptionPane.showMessageDialog(null, "Password saved : " + model.getPassword(), "Info",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void sayHello() {
		JOptionPane.showMessageDialog(null, "Hello " + model.getLogin() + " " + model.getPassword(), "Info",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void sayBye() {
		System.exit(0);
	}
}
