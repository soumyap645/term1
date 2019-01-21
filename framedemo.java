package swingdemo;
import java.awt.FlowLayout;

import javax.swing.*;

public class framedemo extends JFrame {
	framedemo() {
		//Name//
		JLabel lblFirstname = new JLabel("First Name");
		JTextField txtFirstname = new JTextField(10);
		JLabel lblLastname = new JLabel("Last Name");
		JTextField txtLastname = new JTextField(10);
		//Dateofbirth//
		JLabel dpdateofbirth = new JLabel("Dateof Birth");
		JTextField txtdateofbirth = new JTextField(10);	
		//Email//
		JLabel emEmail =new JLabel ("EMail");
		JTextField txtemEmail = new JTextField(15);
		//phoneno//
		JLabel phPhoneNo =new JLabel("Phoneno");
		JTextField txtphPhoneNo =new JTextField(10);
		/*//skills//
		JList Skills =new JList(ListModel);
		ListModel= new DefaultListModel();
		ListModel.addelement("c");
		ListModel.addelement("d");
		ListModel.addelement("e");*/
		//gender//
		JRadioButton rdmale = new JRadioButton("Male");
		JRadioButton rdfemale = new JRadioButton("FeMale");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdmale);
		bg.add(rdfemale);
		JButton btnsubmit = new JButton("Submit");
		//Nationality//
		JComboBox cmbnationality = new JComboBox();
		cmbnationality.addItem("Indian");
		cmbnationality.addItem("NRI");
		
		add(lblFirstname);
		add(txtFirstname);
		add(lblLastname);
		add(txtLastname);
		add(dpdateofbirth);
		add(txtdateofbirth);
		add(emEmail);
        add(txtemEmail);
        add (phPhoneNo);
        add (txtphPhoneNo);
		add(rdmale);
		add(rdfemale);
		add(cmbnationality);
		add(btnsubmit);
		setLayout(new FlowLayout());
		setSize(400, 400);
		setTitle("Demo");
		setVisible(true);
   }
	
	public static void main(String[] args) {
		framedemo FD= new framedemo();

	}
}