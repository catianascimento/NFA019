package nfa019;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Font;

public class ProductListView extends JFrame {

	public JPanel contentPane;
	public JTable table;
	public JLabel lblNewLabel;
	public ListSelectionModel select;
	public JTable jt;
	public JScrollPane sp;
	public JTable table_1;
	public JLabel lblNewLabel_1;
	public ListSelectionModel select2;
	public JScrollPane sp2;
	private JLabel lblNewLabel_2;

	/**
	 * Create the frame.
	 */
	public ProductListView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 300, 536, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 5, 5, 5));
		
		String data[][] = { { "Product 1", "Category 1", "12/02/2021" }, { "Product 2", "Category 2", "10/03/2021" }, 
				{ "Product 3", "Category 1", "10/05/2021" } };
		String column[] = { "NAME", "CATEGORY", "VALIDITY" };
		final JTable jt = new JTable(data, column);
		jt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jt.setCellSelectionEnabled(true);
		jt.setBounds(100, 300, 536, 233);
		select2 = jt.getSelectionModel();
		select2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		select2.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String Data = null;
				int[] row = jt.getSelectedRows();
				int[] columns = jt.getSelectedColumns();
				for (int i = 0; i < row.length; i++) {
					for (int j = 0; j < columns.length; j++) {
						Data = (String) jt.getValueAt(row[i], columns[j]);
					}
				}
				System.out.println("Table element selected is: " + Data);
			}
		});
		contentPane.setLayout(null);
		
		lblNewLabel_2 = new JLabel("List of products");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(199, 17, 109, 14);
		contentPane.add(lblNewLabel_2);
		sp2 = new JScrollPane(jt);
		sp2.setBounds(40, 63, 452, 255);
		contentPane.add(sp2);
		
		setContentPane(contentPane);
//		contentPane.setLayout(null);
	}
}
