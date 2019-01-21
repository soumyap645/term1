package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class eventdemo extends JFrame implements ActionListener{
	JButton  btnSubmit,btnCancel;
	JTextField txtNo1;
	JTextField txtNo2;
	JLabel number1;
	JLabel number2;
	JLabel result;
	
	
	eventdemo()
	{
       
        number1=new JLabel ("Number1");
        txtNo1 = new JTextField(10);
        number2=new JLabel ("Number2");
        result=new JLabel("Result");
        btnSubmit = new JButton("Submit");
        btnCancel = new JButton("Cancel");
        btnSubmit.addActionListener(this);
        btnCancel.addActionListener(this);
       
       
        
        add(txtNo1);
        add(txtNo2);
        add(result);
        add(btnSubmit);
        add(btnCancel);
        
        
		setLayout(new FlowLayout());
		setSize(400, 400);
		setTitle("Demo");
	    setVisible(true);
	}


public static void main(String[] args) {
	new eventdemo();
}


@Override
public void actionPerformed(ActionEvent e) {
	int number1=Integer.parseInt(txtNo1.getText());
	int number2=Integer.parseInt(txtNo2.getText());
    Integer Result=0;
	String cmd= e.getActionCommand();
	System.out.println(cmd);
	if(cmd=="Submit")
		Result=number1+number2;
	
	else if (cmd=="Cancel")
	{
		Result=0;
		txtNo1.setText("");
		txtNo2.setText("");
	
}
	result.setText(Result.toString());
	
}
}
	
	