/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookreservation;

/**
 * @(#)login.java
 *
 *
 * @author 
 * @version 1.00 2019/2/16
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener {
	
        
    
      	   //declaring Components
      	   JLabel lblATN, lblUSER, lblPASS, lblx;
      	   JButton bEnter, bCancel;
      	   JTextField txtN1, txtN2;
      	   
    public Login() {
    
    
    ///Contruction/Instantiate
      	 	
      	 	setSize(400,400);
      	 	setVisible(true);
      	 	setTitle("Log IN");
      	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	 	setLocationRelativeTo(null);
      	 	
      	 	
      	 	//set background for JFrame
      	 	Container C = getContentPane();
      	 	C.setBackground(new Color(102, 163, 255));
      	 	
      	 	lblATN = new JLabel("Book Fair");
      	 	lblUSER = new JLabel("Username:");
      	 	lblPASS = new JLabel("Password:");
      	 	
      	 	bEnter = new JButton("Log IN");
      	 	bCancel = new JButton("Cancel");
      	 	
      	 	txtN1 = new JTextField(20);
      	 	txtN2 = new JTextField(20);
      	 	
      	 	lblx= new JLabel("");
      	 	
      	 	
      	 	//Placing Component on the Frame
      	 	
      	 	add(lblATN);
      	 	lblATN.setBounds(110,10,160,50);
      	 	lblATN.setFont(new Font("Kristen ITC",Font.BOLD,30));
      	 	lblATN.setForeground(Color.WHITE);
      	 	
      	 	add(lblUSER);
      	 	lblUSER.setBounds(30,75,100,30);
      	 	lblUSER.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	add(txtN1);
      	 	txtN1.setBounds(30,120,250,35);
      	 	
      	 	add(lblPASS);
      	 	lblPASS.setBounds(30,185,100,30);
      	 	lblPASS.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	add(txtN2);
      	 	txtN2.setBounds(30,230,250,35);
      	 	
      	 	add(bEnter);
      	 	bEnter.setBounds(80,300,100, 30);
      	 	
      	 	add(bCancel);
      	 	bCancel.setBounds(220,300,100,30);
      	 	
      	 	add(lblx);
      	
      	
      	   bEnter.addActionListener(this);
      	   bCancel.addActionListener(this);
      	   
}
void confirm(String username,String password){
  	Confirmation c = new Confirmation();
  	boolean x=c.Login(username);
  	if(x){
  		boolean p=c.cpass(password);
  		if(p){
  			BookReservation tp = new BookReservation();
  			tp.setVisible(true);
  			setVisible(false);
  		}
  		else{
  			JOptionPane.showMessageDialog(null,"Invalid Password");
  			setVisible(true);
  			txtN1.setText("");
  			txtN2.setText("");
  		}
  	}
  	else{
  		JOptionPane.showMessageDialog(null,"Username not found");
  		setVisible(true);
  		txtN1.setText("");
  		txtN2.setText("");
  	}
  }
 public void actionPerformed (ActionEvent e){
 	String userName,passWord;
 	if(e.getSource()==bEnter){
 		userName = txtN1.getText();
 		passWord = txtN2.getText();
 		confirm(userName,passWord);
 	}
    	
    	   
    	}//end of Event Handler  	
      	
      
    
    public static void main(String[] args) {
        // TODO code application logic here
        Login l = new Login();
    }
}
