package com.example.nfa019;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class Nfa019Application extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private static ConfigurableApplicationContext applicationContext;

	//	public static void main(String[] args) {
//		SpringApplication.run(Nfa019Application.class, args);
//	}
	public Nfa019Application() {
		initUI();
	}

	private void initUI() {

    	try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//		LoginView frame = new LoginView();
//		ProductCreateView frame2 = new ProductCreateView();
//		ProductListView frame3 = new ProductListView();
//		frame.setVisible(true);
//		frame2.setVisible(true);
//		frame3.setVisible(true);
	}

	public static void main(String[] args) {
		Nfa019Application.applicationContext = SpringApplication.run(Nfa019Application.class, args);

        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					LoginView frame = new LoginView();
					ProductCreateView frame2 = new ProductCreateView();
					ProductListView frame3 = new ProductListView();
					frame.setVisible(true);
					frame2.setVisible(true);
					frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

}
