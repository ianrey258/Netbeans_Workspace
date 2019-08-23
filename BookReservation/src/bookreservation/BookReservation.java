package bookreservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class BookReservation extends JFrame implements ActionListener {
	
	//components
	JFrame l,m,in;
	JLabel lbl_user,lbl_top, lbl_hello, lbl_01, lbl_02, lbl_03, lbl_04,lbl_05, img_lbl, bk01_lbl, bk02_lbl, bk03_lbl, bk04_lbl, bk05_lbl, bk06_lbl, bk07_lbl, bk08_lbl, bk09_lbl, bk10_lbl, bk11_lbl, bk12_lbl, bk13_lbl, bk14_lbl, bk15_lbl, bk16_lbl, bk17_lbl, bk18_lbl, bk19_lbl, bk20_lbl,
	pr01_lbl, pr02_lbl, pr03_lbl, pr04_lbl, pr05_lbl, pr06_lbl, pr07_lbl, pr08_lbl, pr09_lbl, pr10_lbl, pr11_lbl, pr12_lbl, pr13_lbl, pr14_lbl, pr15_lbl, pr16_lbl, pr17_lbl, pr18_lbl, pr19_lbl, pr20_lbl,
	q01_lbl, q02_lbl, q03_lbl, q04_lbl, q05_lbl, q06_lbl, q07_lbl, q08_lbl, q09_lbl, q10_lbl, q11_lbl, q12_lbl, q13_lbl, q14_lbl, q15_lbl, q16_lbl, q17_lbl, q18_lbl, q19_lbl, q20_lbl;
	JButton btn_total, btn_logoutbtn, btn_clear,btn_new, btn_show, btn_buy01, btn_buy02, btn_buy03, btn_buy04, btn_buy05, btn_buy06, btn_buy07, btn_buy08, btn_buy09, btn_buy10, btn_buy11, btn_buy12, btn_buy13, btn_buy14, btn_buy15, btn_buy16, btn_buy17, btn_buy18, btn_buy19, btn_buy20;
	JTextField txt_01, txt_02, txt_03, txt_04, txt_q01, txt_q02, txt_q03, txt_q04, txt_q05, txt_q06, txt_q07, txt_q08, txt_q09, txt_q10, txt_q11, txt_q12, txt_q13, txt_q14, txt_q15, txt_q16, txt_q17, txt_q18, txt_q19, txt_q20;
	JTextArea txt_display;
	JLabel lblATN, lblUSER, lblPASS, lblx,txtT1,txtT2,txtT3,lblT1,lblT2,lblT3,lblgtotal, lblgcash;
    JButton bEnter, bCancel;
    JTextField txtN1;
    JPasswordField pN2;
	    int erowCnt=0,jrowCnt=0,prowCnt=0;
    	String BookList="";
    	int qty1 = 0;
    	int x1=300,x2=470,x3=270,x4=320,x5=350,x6=215,x7=450,x8=295,x9=390,x0=430;
    	double total = 0, gtotal=0;
    	double pay = 0;
    	double change = pay - total;
    	String img = "F:/JavaProject/img/";
    	int initqty = 0;
    	int totalqty = 0;
    	String admin,user="";
     	String [][] eric = new String[30][4];
    	String [][] jemar = new String[30][4];
    	String [][] patrick = new String[30][4];
    	String [][] cart = new String[30][4];
    	String columnName[]={"Product name","Price","Quantity","Total"};
    	String productN;
    	String price;
    	String tot;
    	String quantity;
    	JTable teric;
        JTable tjemar;
        JTable tpatrick;
        double etotal=0,jtotal=0,ptotal=0;
        int count=0,ecount=0,jcount=0,pcount=0;

        public BookReservation() {

                in = new JFrame("Inventory");
        ///Contruction/Instantiate
        in.setSize(910,500);
        in.setLocationRelativeTo(null);
        in.setVisible(false);
        in.setTitle("Sales");
        in.setResizable(false);
        teric = new JTable(eric,columnName);
        tjemar = new JTable(jemar,columnName);
        tpatrick = new JTable(patrick,columnName);

	JPanel pane1=new JPanel();
	JScrollPane sc1=new JScrollPane(teric);
        lblT1 = new JLabel("Total Sales:");

  	txtT1 = new JLabel("not yet");
	    pane1.add(sc1);
	    pane1.setVisible(false);
	    sc1.setPreferredSize(new Dimension(900, 400));
	    sc1.setBounds(10,10,900,400);
	    pane1.add(lblT1); //totalsale label
	    lblT1.setBounds(700,410,70,25);
  	 	pane1.add(txtT1);//totalsale textbox
  	 //	txtT1.setVisible(true);
  	 	txtT1.setBounds(770,430,100,25);
  	 //	txtT1.setEditable(false);

	    JPanel pane2=new JPanel();
	    JScrollPane sc2=new JScrollPane(tjemar);
	    lblT2 = new JLabel("Total Sales:");

  	    txtT2 = new JLabel("Not Yet");
	    pane2.add(sc2);
	    pane2.setVisible(true);
	    sc2.setPreferredSize(new Dimension(900, 400));
	    sc2.setBounds(10,10,900,400);
	    pane2.add(lblT2); //totalsale label
	    lblT2.setBounds(700,430,70,25);
  	 	pane2.add(txtT2);//totalsale textbox
  	 //	txtT2.setVisible(true);
  	 	txtT2.setBounds(770,430,100,25);
  	 //	txtT2.setEditable(false);

	    JPanel pane3=new JPanel();
	    JScrollPane sc3=new JScrollPane(tpatrick);
	    lblT3 = new JLabel("Total Sales:");

  	    txtT3 = new JLabel("Not Yet");
	    pane3.add(sc3);
	    sc3.setPreferredSize(new Dimension(900, 400));
	    sc3.setBounds(10,10,900,400);
	    pane3.add(lblT3); //totalsale label
	    lblT3.setBounds(700,430,70,25);
	    pane3.add(txtT3);//totalsale textbox
  	 //	txtT3.setVisible(true);
  	 	txtT3.setBounds(770,430,100,25);
  	 //	txtT3.setEditable(false);

	    JTabbedPane tp=new JTabbedPane();
	    in.add(tp);
	    tp.setBounds(50,50,910,500);
	    tp.add("Eric",pane1);
	    tp.add("Jemar",pane2);
	    tp.add("Patrick",pane3);
	    
	    //end of invetory
   			
   			
   			l = new JFrame("Login");
   			l.setSize(400,550);
      	 	l.setVisible(true);
      	 	l.setTitle("Log IN");
      	 	l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	 	l.setLocationRelativeTo(null);
      	 	
      	 	
      	 	//set background for JFrame
      	 	Container C = getContentPane();
      	 	C.setBackground(new Color(102, 163, 255));
      	 	
      	 	img_lbl = new JLabel();
      	 	
      	 	lblATN = new JLabel("Book Fair");
      	 	lblUSER = new JLabel("Username:");
      	 	lblPASS = new JLabel("Password:");
      	 	
      	 	bEnter = new JButton("Log IN");
      	 	bCancel = new JButton("Cancel");
      	 	
      	 	txtN1 = new JTextField(20);
      	 	pN2 = new JPasswordField(20);
      	 	
      	 	lblx= new JLabel("");
      	 	
      	 	
      	 	//Placing Component on the Frame
      	 	
      	 	l.add(img_lbl);
      	 	img_lbl.setIcon(new ImageIcon("F:/JavaProject/img/book-logo.png"));
      	 	img_lbl.setBounds (90,10,200,200);
      	 	
      	 	l.add(lblUSER);
      	 	lblUSER.setBounds(30,230,100,30);
      	 	lblUSER.setFont(new Font("Arial",Font.BOLD,18));
      	 	
      	 	l.add(txtN1);
      	 	txtN1.setBounds(30,275,280,35);
      	 	
      	 	l.add(lblPASS);
      	 	lblPASS.setBounds(30,320,100,30);
      	 	lblPASS.setFont(new Font("Arial",Font.BOLD,18));
      	 	
      	 	l.add(pN2);
      	 	pN2.setBounds(30,365,280,35);
      	 	
      	 	l.add(bEnter);
      	 	bEnter.setBounds(80,430,100, 30);
      	 	
      	 	l.add(bCancel);
      	 	bCancel.setBounds(220,430,100,30);
      	 	
      	 	l.add(lblx);
      	
      	
      	   bEnter.addActionListener(this);
      	   bCancel.addActionListener(this);
   			//end of login
   			m = new JFrame("Main");
   			//constrcution or instantiate
   			m.setSize(1200,900);
   			m.setTitle("BOOK FAIR (Book Sale System)");
   		    m.setLocationRelativeTo(null);
   			
   			//BG COLOR
   			Container BG = getContentPane();
      	 	BG.setBackground(new Color(236,244,146));
      	 	
      	 	
   			
   			//label
   			
   			lbl_user = new JLabel("  "+user);
   			lbl_hello = new JLabel("Hello,  ");
   			lbl_01 = new JLabel("Product:");
   			lbl_02 = new JLabel("Purchase Quantity:");
   			lbl_03 = new JLabel("Cost:");
   			lbl_04 = new JLabel("Total Cost:");
   			lbl_05 = new JLabel("Book Products:");
   			
   			//logo
   			img_lbl = new JLabel();
   			
   			//books
			bk01_lbl = new JLabel();
			bk02_lbl = new JLabel();
			bk03_lbl = new JLabel();
			bk04_lbl = new JLabel();
			bk05_lbl = new JLabel();
			bk06_lbl = new JLabel();
			bk07_lbl = new JLabel();
			bk08_lbl = new JLabel();
			bk09_lbl = new JLabel();
			bk10_lbl = new JLabel();
			bk11_lbl = new JLabel();
			bk12_lbl = new JLabel();
			bk13_lbl = new JLabel();
			bk14_lbl = new JLabel();
			bk15_lbl = new JLabel();
			bk16_lbl = new JLabel();
			bk17_lbl = new JLabel();
			bk17_lbl = new JLabel();
			bk18_lbl = new JLabel();
			bk19_lbl = new JLabel();
			bk20_lbl = new JLabel();
			
			//price
			pr01_lbl = new JLabel("Php 300.00");
			pr02_lbl = new JLabel("Php 470.00");
			pr03_lbl = new JLabel("Php 470.00");
			pr04_lbl = new JLabel("Php 270.00");
			pr05_lbl = new JLabel("Php 320.00");
			pr06_lbl = new JLabel("Php 350.00");
			pr07_lbl = new JLabel("Php 215.00");
			pr08_lbl = new JLabel("Php 450.00");
			pr09_lbl = new JLabel("Php 300.00");
			pr10_lbl = new JLabel("Php 300.00");
			pr11_lbl = new JLabel("Php 300.00");
			pr12_lbl = new JLabel("Php 470.00");
			pr13_lbl = new JLabel("Php 470.00");
			pr14_lbl = new JLabel("Php 270.00");
			pr15_lbl = new JLabel("Php 320.00");
			pr16_lbl = new JLabel("Php 350.00");
			pr17_lbl = new JLabel("Php 295.00");
			pr18_lbl = new JLabel("Php 450.00");
			pr19_lbl = new JLabel("Php 390.00");
			pr20_lbl = new JLabel("Php 430.00");
			
			btn_logoutbtn = new JButton("Log Out");
   			btn_total = new JButton("Payment");
   			btn_clear = new JButton("Clear");
   			btn_new = new JButton("New Customer");
   			btn_show = new JButton("Inventory");
   			//books
   			btn_buy01 = new JButton("Buy");
   			btn_buy02 = new JButton("Buy");
   			btn_buy03 = new JButton("Buy");
   			btn_buy04 = new JButton("Buy");
   			btn_buy05 = new JButton("Buy");
   			btn_buy06 = new JButton("Buy");
   			btn_buy07 = new JButton("Buy");
   			btn_buy08 = new JButton("Buy");
   			btn_buy09 = new JButton("Buy");
   			btn_buy10 = new JButton("Buy");
   			btn_buy11 = new JButton("Buy");
   			btn_buy12 = new JButton("Buy");
   			btn_buy13 = new JButton("Buy");
   			btn_buy14 = new JButton("Buy");
   			btn_buy15 = new JButton("Buy");
   			btn_buy16 = new JButton("Buy");
   			btn_buy17 = new JButton("Buy");
   			btn_buy18 = new JButton("Buy");
   			btn_buy18 = new JButton("Buy");
   			btn_buy19 = new JButton("Buy");
   			btn_buy20 = new JButton("Buy");
   			
   			//book quantity
   			
   			q01_lbl = new JLabel("QTY:");
   			q02_lbl = new JLabel("QTY:");
   			q03_lbl = new JLabel("QTY:");
   			q04_lbl = new JLabel("QTY:");
   			q05_lbl = new JLabel("QTY:");
   			q06_lbl = new JLabel("QTY:");
   			q07_lbl = new JLabel("QTY:");
   			q08_lbl = new JLabel("QTY:");
   			q09_lbl = new JLabel("QTY:");
   			q10_lbl = new JLabel("QTY:");
   			q11_lbl = new JLabel("QTY:");
   			q12_lbl = new JLabel("QTY:");
   			q13_lbl = new JLabel("QTY:");
   			q14_lbl = new JLabel("QTY:");
   			q15_lbl = new JLabel("QTY:");
   			q16_lbl = new JLabel("QTY:");
   			q17_lbl = new JLabel("QTY:");
   			q18_lbl = new JLabel("QTY:");
   			q19_lbl = new JLabel("QTY:");
   			q20_lbl = new JLabel("QTY:");
   			lblgtotal = new JLabel("Grand Total Sales: ");
   			lblgcash = new JLabel("0");
   			
   			
   			txt_01 = new JTextField(20);txt_01.setEditable(false);
   			txt_02 = new JTextField(20); txt_02.setEditable(false);
   			txt_03 = new JTextField(20);txt_03.setEditable(false);
   			txt_04 = new JTextField(20);txt_04.setEditable(false);
   			txt_q01 = new JTextField(20); txt_q01.setText("10"); txt_q01.setEditable(false); 
   			txt_q02 = new JTextField(20); txt_q02.setText("10"); txt_q02.setEditable(false);
   			txt_q03 = new JTextField(20); txt_q03.setText("10"); txt_q03.setEditable(false);
   			txt_q04 = new JTextField(20); txt_q04.setText("10"); txt_q04.setEditable(false);
   			txt_q05 = new JTextField(20); txt_q05.setText("10"); txt_q05.setEditable(false);
   			txt_q06 = new JTextField(20); txt_q06.setText("10"); txt_q06.setEditable(false);
   			txt_q07 = new JTextField(20); txt_q07.setText("10"); txt_q07.setEditable(false);
   			txt_q08 = new JTextField(20); txt_q08.setText("10"); txt_q08.setEditable(false);
   			txt_q09 = new JTextField(20); txt_q09.setText("10"); txt_q09.setEditable(false);
   			txt_q10 = new JTextField(20); txt_q10.setText("10"); txt_q10.setEditable(false);
   			txt_q11 = new JTextField(20); txt_q11.setText("10"); txt_q11.setEditable(false);
   			txt_q12 = new JTextField(20); txt_q12.setText("10"); txt_q12.setEditable(false);
   			txt_q13 = new JTextField(20); txt_q13.setText("10"); txt_q13.setEditable(false);
   			txt_q14 = new JTextField(20); txt_q14.setText("10"); txt_q14.setEditable(false);
   			txt_q15 = new JTextField(20); txt_q15.setText("10"); txt_q15.setEditable(false);
   			txt_q16 = new JTextField(20); txt_q16.setText("10"); txt_q16.setEditable(false);
   			txt_q17 = new JTextField(20); txt_q17.setText("10"); txt_q17.setEditable(false);
   			txt_q18 = new JTextField(20); txt_q18.setText("10"); txt_q18.setEditable(false);
   			txt_q19 = new JTextField(20); txt_q19.setText("10"); txt_q19.setEditable(false);
   			txt_q20 = new JTextField(20); txt_q20.setText("10"); txt_q20.setEditable(false);
   			
   			txt_display = new JTextArea(250, 400); txt_display.setEditable(false);//ROWS & COLUMNS
   			
   			m.add(img_lbl);
      	 	img_lbl.setIcon(new ImageIcon(img + "book-logo.png"));
      	 	img_lbl.setBounds (10,10,200,200);
      	 	
      	 	m.add(lblgtotal);
      	 	lblgtotal.setBounds(10,240,200,40);
      	 	lblgtotal.setFont(new Font("Arial",Font.BOLD,20));
      	 	
      	 	m.add(lblgcash);
      	 	lblgcash.setBounds(10,260,200,40);
      	 	lblgcash.setFont(new Font("Arial",Font.BOLD,20));
      	 	
      	 	m.add(lbl_hello);
      	 	lbl_hello.setBounds(240,10,200,30);
      	 	lbl_hello.setFont(new Font("Arial",Font.BOLD,17));
      	 	
      	 	m.add(lbl_user);
      	 	lbl_user.setBounds(300,10,250,30);
      	 	lbl_user.setFont(new Font("Arial",Font.BOLD,17));
      	 	
      	 	m.add(lbl_01);
      	 	lbl_01.setBounds(240,70,200,30);
      	 	lbl_01.setFont(new Font("Arial",Font.BOLD,16));
      	 	
      	 	m.add(txt_01);
      	 	txt_01.setBounds(390,70,270,30);
      	 	txt_01.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(lbl_02);
      	 	lbl_02.setBounds(240,110,200,30);
      	 	lbl_02.setFont(new Font("Arial",Font.BOLD,16));
      	 	
      	 	m.add(txt_02);
      	 	txt_02.setBounds(390,110,270,30);
      	 	txt_02.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(lbl_03);
      	 	lbl_03.setBounds(240,150,200,30);
      	 	lbl_03.setFont(new Font("Arial",Font.BOLD,16));
      	 	
      	 	m.add(txt_03);
      	 	txt_03.setBounds(390,150,270,30);
      	 	txt_03.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(lbl_04);
      	 	lbl_04.setBounds(240,190,200,30);
      	 	lbl_04.setFont(new Font("Arial",Font.BOLD,16));
      	 	
      	 	m.add(txt_04);
      	 	txt_04.setBounds(390,190,270,30);
      	 	txt_04.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(btn_logoutbtn);
      	 	btn_logoutbtn.setBounds(570,10,90,30);
      	 	
      	 	m.add(btn_total);
      	 	btn_total.setBounds(420,250,90,30);
      	 	
      	 	m.add(btn_clear);
      	 	btn_clear.setBounds(550,250,90,30);
      	 	
      	 	m.add(btn_new);
      	 	btn_new.setBounds(800,250,150,30);
      	 	
      	 	m.add(btn_show);
      	 	btn_show.setBounds(990,250,150,30);
      	 	
      	 	m.add(txt_display);
      	 	txt_display.setBounds(680,10,460,220);
      	 	txt_display.setFont(new Font("Arial",Font.BOLD,15));
      	 	
      	 	m.add(lbl_05);
      	 	lbl_05.setBounds(100,320,200,30);
      	 	lbl_05.setFont(new Font("Arial",Font.BOLD,18));
      	 	
      	 	m.add(bk01_lbl);
      	 	bk01_lbl.setIcon(new ImageIcon(img + "book/bk01.jpg"));
      	 	bk01_lbl.setBounds (100,350,90,130);
      	 	
      	 	m.add(pr01_lbl);
      	 	pr01_lbl.setBounds(105,480,80,30);
      	 	pr01_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q01_lbl);
      	 	q01_lbl.setBounds(105,510,80,25);
      	 	
      	 	m.add(txt_q01);
      	 	txt_q01.setBounds(145,515,40,20);
      	 	
      	 	m.add(btn_buy01);
      	 	btn_buy01.setBounds(105,545,80,30);
      	 	
      	 	m.add(bk02_lbl);
      	 	bk02_lbl.setIcon(new ImageIcon(img + "book/bk02.jpg"));
      	 	bk02_lbl.setBounds (200,350,90,130);
      	 	
      	 	m.add(pr02_lbl);
      	 	pr02_lbl.setBounds(205,480,80,30);
      	 	pr02_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q02_lbl);
      	 	q02_lbl.setBounds(205,510,80,25);
      	 	
      	 	m.add(txt_q02);
      	 	txt_q02.setBounds(245,515,40,20);
      	 	
      	 	
      	 	m.add(btn_buy02);
      	 	btn_buy02.setBounds(205,545,80,30);
      	 	
      	 	m.add(bk03_lbl);
      	 	bk03_lbl.setIcon(new ImageIcon(img + "book/bk03.jpg"));
      	 	bk03_lbl.setBounds (300,350,90,130);
      	 	
      	 	m.add(pr03_lbl);
      	 	pr03_lbl.setBounds(305,480,80,30);
      	 	pr03_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q03_lbl);
      	 	q03_lbl.setBounds(305,510,80,25);
      	 	
      	 	m.add(txt_q03);
      	 	txt_q03.setBounds(345,515,40,20);
      	 	
      	 	m.add(btn_buy03);
      	 	btn_buy03.setBounds(305,545,80,30);
      	 	
      	 	m.add(bk04_lbl);
      	 	bk04_lbl.setIcon(new ImageIcon(img + "book/bk04.jpg"));
      	 	bk04_lbl.setBounds (400,350,90,130);
      	 	
      	 	m.add(pr04_lbl);
      	 	pr04_lbl.setBounds(405,480,80,30);
      	 	pr04_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q04_lbl);
      	 	q04_lbl.setBounds(405,510,80,25);
      	 	
      	 	m.add(txt_q04);
      	 	txt_q04.setBounds(445,515,40,20);
      	 	
      	 	m.add(btn_buy04);
      	 	btn_buy04.setBounds(405,545,80,30);
      	 	
      	 	m.add(bk05_lbl);
      	 	bk05_lbl.setIcon(new ImageIcon(img + "book/bk05.jpg"));
      	 	bk05_lbl.setBounds (500,350,90,130);
      	 	
      	 	m.add(pr05_lbl);
      	 	pr05_lbl.setBounds(505,480,80,30);
      	 	pr05_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q05_lbl);
      	 	q05_lbl.setBounds(505,510,80,25);
      	 	
      	 	m.add(txt_q05);
      	 	txt_q05.setBounds(545,515,40,20);
      	 	
      	 	m.add(btn_buy05);
      	 	btn_buy05.setBounds(505,545,80,30);
      	 	
      	 	m.add(bk06_lbl);
      	 	bk06_lbl.setIcon(new ImageIcon(img + "book/bk06.jpg"));
      	 	bk06_lbl.setBounds (600,350,90,130);
      	 	
      	 	m.add(pr06_lbl);
      	 	pr06_lbl.setBounds(605,480,80,30);
      	 	pr06_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q06_lbl);
      	 	q06_lbl.setBounds(605,510,80,25);
      	 	
      	 	m.add(txt_q06);
      	 	txt_q06.setBounds(645,515,40,20);
      	 	
      	 	m.add(btn_buy06);
      	 	btn_buy06.setBounds(605,545,80,30);
      	 	
      	 	m.add(bk07_lbl);
      	 	bk07_lbl.setIcon(new ImageIcon(img + "book/bk07.jpg"));
      	 	bk07_lbl.setBounds (700,350,90,130);
      	 	
      	 	m.add(pr07_lbl);
      	 	pr07_lbl.setBounds(705,480,80,30);
      	 	pr07_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q07_lbl);
      	 	q07_lbl.setBounds(705,510,80,25);
      	 	
      	 	m.add(txt_q07);
      	 	txt_q07.setBounds(745,515,40,20);
      	 	
      	 	m.add(btn_buy07);
      	 	btn_buy07.setBounds(705,545,80,30);
      	 	
      	 	m.add(bk08_lbl);
      	 	bk08_lbl.setIcon(new ImageIcon(img + "book/bk08.jpg"));
      	 	bk08_lbl.setBounds (800,350,90,130);
      	 	
      	 	m.add(pr08_lbl);
      	 	pr08_lbl.setBounds(805,480,80,30);
      	 	pr08_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q08_lbl);
      	 	q08_lbl.setBounds(805,510,80,25);
      	 	
      	 	m.add(txt_q08);
      	 	txt_q08.setBounds(845,515,40,20);
      	 	
      	 	m.add(btn_buy08);
      	 	btn_buy08.setBounds(805,545,80,30);
      	 	
      	 	m.add(bk09_lbl);
      	 	bk09_lbl.setIcon(new ImageIcon(img + "book/bk09.jpg"));
      	 	bk09_lbl.setBounds (900,350,90,130);
      	 	
      	 	m.add(pr09_lbl);
      	 	pr09_lbl.setBounds(905,480,80,30);
      	 	pr09_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q09_lbl);
      	 	q09_lbl.setBounds(905,510,80,25);
      	 	
      	 	m.add(txt_q09);
      	 	txt_q09.setBounds(945,515,40,20);
      	 	
      	 	m.add(btn_buy09);
      	 	btn_buy09.setBounds(905,545,80,30);
      	 	
      	 	m.add(bk10_lbl);
      	 	bk10_lbl.setIcon(new ImageIcon(img + "book/bk10.jpg"));
      	 	bk10_lbl.setBounds (1000,350,90,130);
      	 	
      	 	m.add(pr10_lbl);
      	 	pr10_lbl.setBounds(1005,480,80,30);
      	 	pr10_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q10_lbl);
      	 	q10_lbl.setBounds(1005,510,80,25);
      	 	
      	 	m.add(txt_q10);
      	 	txt_q10.setBounds(1045,515,40,20);
      	 	
      	 	m.add(btn_buy10);
      	 	btn_buy10.setBounds(1005,545,80,30);
      	 	
      	 	m.add(bk11_lbl);
      	 	bk11_lbl.setIcon(new ImageIcon(img + "book/bk11.jpg"));
      	 	bk11_lbl.setBounds (100,600,90,130);
      	 	
      	 	m.add(pr11_lbl);
      	 	pr11_lbl.setBounds(105,730,80,30);
      	 	pr11_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q11_lbl);
      	 	q11_lbl.setBounds(105,760,80,25);
      	 	
      	 	m.add(txt_q11);
      	 	txt_q11.setBounds(145,760,40,20);
      	 	
      	 	m.add(btn_buy11);
      	 	btn_buy11.setBounds(105,785,80,30);
      	 	
      	 	m.add(bk12_lbl);
      	 	bk12_lbl.setIcon(new ImageIcon(img + "book/bk12.jpg"));
      	 	bk12_lbl.setBounds (200,600,90,130);
      	 	
      	 	m.add(pr12_lbl);
      	 	pr12_lbl.setBounds(205,730,80,30);
      	 	pr12_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q12_lbl);
      	 	q12_lbl.setBounds(205,760,80,25);
      	 	
      	 	m.add(txt_q12);
      	 	txt_q12.setBounds(245,760,40,20);
      	 	
      	 	m.add(btn_buy12);
      	 	btn_buy12.setBounds(205,785,80,30);
      	 	
      	 	m.add(bk13_lbl);
      	 	bk13_lbl.setIcon(new ImageIcon(img + "book/bk13.jpg"));
      	 	bk13_lbl.setBounds (300,600,90,130);
      	 	
      	 	m.add(pr13_lbl);
      	 	pr13_lbl.setBounds(305,730,80,30);
      	 	pr13_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q13_lbl);
      	 	q13_lbl.setBounds(305,760,80,25);
      	 	
      	 	m.add(txt_q13);
      	 	txt_q13.setBounds(345,760,40,20);
      	 	
      	 	m.add(btn_buy13);
      	 	btn_buy13.setBounds(305,785,80,30);
      	 	
      	 	m.add(bk14_lbl);
      	 	bk14_lbl.setIcon(new ImageIcon(img + "book/bk14.jpg"));
      	 	bk14_lbl.setBounds (400,600,90,130);
      	 	
      	 	m.add(pr14_lbl);
      	 	pr14_lbl.setBounds(405,730,80,30);
      	 	pr14_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q14_lbl);
      	 	q14_lbl.setBounds(405,760,80,25);
      	 	
      	 	m.add(txt_q14);
      	 	txt_q14.setBounds(445,760,40,20);
      	 	
      	 	m.add(btn_buy14);
      	 	btn_buy14.setBounds(405,785,80,30);
      	 	
      	 	m.add(bk15_lbl);
      	 	bk15_lbl.setIcon(new ImageIcon(img + "book/bk15.jpg"));
      	 	bk15_lbl.setBounds (500,600,90,130);
      	 	
      	 	m.add(pr15_lbl);
      	 	pr15_lbl.setBounds(505,730,80,30);
      	 	pr15_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	m.add(q15_lbl);
      	 	q15_lbl.setBounds(505,760,80,25);
      	 	
      	 	m.add(txt_q15);
      	 	txt_q15.setBounds(545,760,40,20);
      	 	
      	 	m.add(btn_buy15);
      	 	btn_buy15.setBounds(505,785,80,30);
      	 	
      	 	m.add(bk16_lbl);
      	 	bk16_lbl.setIcon(new ImageIcon(img + "book/bk16.jpg"));
      	 	bk16_lbl.setBounds (600,600,90,130);
      	 	
      	 	m.add(pr16_lbl);
      	 	pr16_lbl.setBounds(605,630,80,30);
      	 	pr16_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q16_lbl);
      	 	q16_lbl.setBounds(605,760,80,25);
      	 	
      	 	m.add(txt_q16);
      	 	txt_q16.setBounds(645,760,40,20);
      	 	
      	 	m.add(btn_buy16);
      	 	btn_buy16.setBounds(605,785,80,30);
      	 	
      	 	m.add(bk17_lbl);
      	 	bk17_lbl.setIcon(new ImageIcon(img + "book/bk17.jpg"));
      	 	bk17_lbl.setBounds (700,600,90,130);
      	 	
      	 	m.add(pr17_lbl);
      	 	pr17_lbl.setBounds(705,730,80,30);
      	 	pr17_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q17_lbl);
      	 	q17_lbl.setBounds(705,760,80,25);
      	 	
      	 	m.add(txt_q17);
      	 	txt_q17.setBounds(745,760,40,20);
      	 	
      	 	m.add(btn_buy17);
      	 	btn_buy17.setBounds(705,785,80,30);
      	 	
      	 	m.add(bk18_lbl);
      	 	bk18_lbl.setIcon(new ImageIcon(img + "book/bk18.jpg"));
      	 	bk18_lbl.setBounds (800,600,90,130);
      	 	
      	 	m.add(pr18_lbl);
      	 	pr18_lbl.setBounds(800,730,80,30);
      	 	pr18_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q18_lbl);
      	 	q18_lbl.setBounds(805,760,80,25);
      	 	
      	 	m.add(txt_q18);
      	 	txt_q18.setBounds(845,760,40,20);
      	 	
      	 	m.add(btn_buy18);
      	 	btn_buy18.setBounds(805,785,80,30);
      	 	
      	 	m.add(bk19_lbl);
      	 	bk19_lbl.setIcon(new ImageIcon(img + "book/bk19.jpg"));
      	 	bk19_lbl.setBounds (900,600,90,130);
      	 	
      	 	m.add(pr19_lbl);
      	 	pr19_lbl.setBounds(905,730,80,30);
      	 	pr19_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q19_lbl);
      	 	q19_lbl.setBounds(905,760,80,25);
      	 	
      	 	m.add(txt_q19);
      	 	txt_q19.setBounds(945,760,40,20);
      	 	
      	 	m.add(btn_buy19);
      	 	btn_buy19.setBounds(905,785,80,30);
      	 	
      	 	m.add(bk20_lbl);
      	 	bk20_lbl.setIcon(new ImageIcon(img + "book/bk20.jpg"));
      	 	bk20_lbl.setBounds (1000,600,90,130);
      	 	
      	 	m.add(pr20_lbl);
      	 	pr20_lbl.setBounds(1005,730,80,30);
      	 	pr20_lbl.setFont(new Font("Arial",Font.BOLD,14));
      	 	
      	 	m.add(q20_lbl);
      	 	q20_lbl.setBounds(1005,760,80,25);
      	 	
      	 	m.add(txt_q20);
      	 	txt_q20.setBounds(1045,760,40,20);
      	 	
      	 	m.add(btn_buy20);
      	 	btn_buy20.setBounds(1005,785,80,30);
      	 	
      	 	
      	 	
      	 	m.setLayout(null);
      	 	
      	 	btn_buy01.addActionListener(this);
      	 	btn_buy02.addActionListener(this);
      	 	btn_buy03.addActionListener(this);
      	 	btn_buy04.addActionListener(this);
      	 	btn_buy05.addActionListener(this);
      	 	btn_buy06.addActionListener(this);
      	 	btn_buy07.addActionListener(this);
      	 	btn_buy08.addActionListener(this);
      	 	btn_buy09.addActionListener(this);
      	 	btn_buy10.addActionListener(this);
      	 	btn_buy11.addActionListener(this);
      	 	btn_buy12.addActionListener(this);
      	 	btn_buy13.addActionListener(this);
      	 	btn_buy14.addActionListener(this);
      	 	btn_buy15.addActionListener(this);
      	 	btn_buy16.addActionListener(this);
      	 	btn_buy17.addActionListener(this);
      	 	btn_buy18.addActionListener(this);
      	 	btn_buy19.addActionListener(this);
      	 	btn_buy20.addActionListener(this);
      	 	btn_clear.addActionListener(this);
      	 	btn_new.addActionListener(this);
      	 	btn_total.addActionListener(this);
      	 	btn_show.addActionListener(this);
      	 	btn_logoutbtn.addActionListener(this);
   		}
   	public String confirm(String username,String password){
  	Confirmation c = new Confirmation();
  	boolean x=c.Login(username);
  	if(x){
  		boolean p=c.cpass(password);
  		if(p){
  			m.setVisible(true);
  			l.setVisible(false);
  			
  		    user = txtN1.getText();
  		    lbl_user.setText(user);
  		    
  		    
  		}
  		else{
  			JOptionPane.showMessageDialog(null,"Invalid Password");
  			l.setVisible(true);
  			txtN1.setText("");
  			pN2.setText("");
  		}
  	}
  	else{
  		JOptionPane.showMessageDialog(null,"Username not found");
  		l.setVisible(true);
  		txtN1.setText("");
  		pN2.setText("");
  	}
  	return user;
  }
   		
   	public void actionPerformed (ActionEvent e){
   		String userName,passWord;
 	if(e.getSource()==bEnter){
 		userName = txtN1.getText();
 		passWord = pN2.getText();
 		confirm(userName,passWord);
 	}
   		if (e.getSource()==btn_total){
   			if (BookList==""){
   				JOptionPane.showMessageDialog(null,"Purchase a Book First");
   		       }	
   			else{
   			double pay = Double.parseDouble(JOptionPane.showInputDialog("Total Cost is: Php " + total + "\nInput Payment: "));	
   				if(pay>total){
   				double change = pay - total;
   				JOptionPane.showMessageDialog(null,"Total Change is: Php " + change);
   				BookList+= "\nTotal Cost: Php " + total + "\nPayment : Php " + pay + "\nChange : Php " + change;
   				txt_display.setText(BookList);
   				}
   				else{
   					JOptionPane.showMessageDialog(null,"Your Payment is Lacking");
   				}
   			}
   	switch(user){
  		case "Eric":
  			for(int j=0; j<count; j++,ecount++){
  			eric[ecount][0]=cart[j][0]; eric[ecount][1]=cart[j][1]; eric[ecount][2]=cart[j][2]; eric[ecount][3]=cart[j][3];
  			}
  			etotal+=total;
  			txtT1.setText(Double.toString(etotal));
  			break;
  		case "Jemar":
  			for(int j=0; j<count; j++,jcount++){
  			jemar[jcount][0]=cart[j][0]; jemar[jcount][1]=cart[j][1]; jemar[jcount][2]=cart[j][2]; jemar[jcount][3]=cart[j][3];
  			}
  			jtotal+=total;
  			txtT2.setText(Double.toString(jtotal));
  			break;
  		case "Patrick":
  			for(int j=0; j<count; j++,pcount++){
  			patrick[pcount][0]=cart[j][0]; patrick[pcount][1]=cart[j][1]; patrick[pcount][2]=cart[j][2]; patrick[pcount][3]=cart[j][3];
  			}
  			ptotal+=total;
  			txtT3.setText(Double.toString(ptotal));
  			break;
   			}
   			gtotal=etotal+jtotal+ptotal;
   			lblgcash.setText(Double.toString(gtotal));
   			
   		   
   		}
   		if (e.getSource()==btn_logoutbtn){
   			l.setVisible(true);
   			m.setVisible(false);
   			lbl_user.setText("");
   			user = "";
   			pN2.setText("");
   			txtN1.setText("");
   			BookList=("");
   		}
   		if (e.getSource()==btn_show){
   			in.setVisible(true);
   			
   		}
 		
   		if (e.getSource()==btn_new){
			txt_01.setText("");
   			txt_02.setText("");
   			txt_03.setText("");
   			BookList=("");
   			total= 0;
   			txt_display.setText(BookList);
   			txt_04.setText(Double.toString(total));
   			txt_04.setText("");
   			BookList=("");
   			txt_display.setText(BookList);
   			for(int j=0; j<count; j++){
   				cart[j][0]=""; cart[j][1]=""; cart[j][2]=""; cart[j][3]=""; 
   			}
   			count=0;
   		}
   		if (e.getSource()==btn_clear){ //clear
   			txt_01.setText("");
   			txt_02.setText("");
   			txt_03.setText("");
   			total = 0;
   			txt_04.setText(Double.toString(total));
   			txt_04.setText("");
   			BookList=("");
   			txt_display.setText(BookList);
   			for(int j=0; j<count; j++){
   				cart[j][0]=""; cart[j][1]=""; cart[j][2]=""; cart[j][3]=""; 
   			}
   			count=0;
   		}   	
   		if(e.getSource()==btn_buy01){
   			int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q01.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   			int rmn = stock - qty;
   			double subtotal = x1 * qty;
   		total += subtotal;
   			 txt_03.setText(Integer.toString(x1));
   			 txt_02.setText(Integer.toString(qty1+qty));
   		     txt_q01.setText(Integer.toString(rmn));
   		     txt_01.setText("American Gods - Neil Gaiman");
   		     txt_04.setText(Double.toString(total));
   		     BookList+= "\nAmerican Gods - Neil Gaiman x" + qty +"   Cost :"+x1+"   Subtotal :"+subtotal;
   		     txt_display.setText(BookList);
   		     productN = ("American Gods - Neil Gaiman");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   			}
   		     else {
   		     	int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q01.setText(Integer.toString(rmn));
   		        txt_01.setText("American Gods - Neil Gaiman");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nAmerican Gods - Neil Gaiman x" + qty+"   Cost :"+x1+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("American Gods - Neil Gaiman");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		        btn_buy01.setEnabled(false);
   		     }
   		}//end btn1
   	//correct
   	   if (e.getSource()==btn_buy02){
   	    	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q02.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q02.setText(Integer.toString(rmn));
   		        txt_01.setText("Patriot Games - Tom Clancy");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nPatriot Games - Tom Clancy x"+qty+"   Cost :"+x2+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		    productN = ("Patriot Games - Tom Clancy");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q02.setText(Integer.toString(rmn));
   		        txt_01.setText("Patriot Games - Tom Clancy");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nPatriot Games - Tom Clancy x"+qty+"   Cost :"+x2+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        btn_buy02.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		       productN = ("Patriot Games - Tom Clancy");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy03){
  	   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q03.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q03.setText(Integer.toString(rmn));
   		        txt_01.setText("Piranha - Michael Dimercurio");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nPiranha - Michael Dimercurio x"+qty+"   Cost :"+x2+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		       productN = ("Piranha - Michael Dimercurio");
   		     price = Integer.toString(x2);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q03.setText(Integer.toString(rmn));
   		        txt_01.setText("Piranha - Michael Dimercurio");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nPiranha - Michael Dimercurio x"+qty+"   Cost :"+x2+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Piranha - Michael Dimercurio");
   		     price = Integer.toString(x2);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy03.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}	
   	 		
   	   	if (e.getSource()==btn_buy04){
   	   		int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q04.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x3 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x3));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q04.setText(Integer.toString(rmn));
   		        txt_01.setText("Hunter Killer - George Wallace");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHunter Killer - George Wallace x"+qty+"   Cost :"+x3+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Hunter Killer - George Wallace");
   		     price = Integer.toString(x3);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x3 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x3));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q04.setText(Integer.toString(rmn));
   		        txt_01.setText("Hunter Killer - George Wallace");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHunter Killer - George Wallace x"+qty+"   Cost :"+x3+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Hunter Killer - George Wallace");
   		     price = Integer.toString(x3);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy04.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   		
   		if (e.getSource()==btn_buy05){
   			int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q05.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x4 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x4));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q05.setText(Integer.toString(rmn));
   		        txt_01.setText("Kilo Class - Patrick Robinson");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nKilo Class - Patrick Robinson x"+qty+"   Cost :"+x4+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Kilo Class - Patrick Robinson");
   		     price = Integer.toString(x4);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x4 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x4));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q05.setText(Integer.toString(rmn));
   		        txt_01.setText("Kilo Class - Patrick Robinson");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nKilo Class - Patrick Robinson x"+qty+"   Cost :"+x4+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Kilo Class - Patrick Robinson");
   		     price = Integer.toString(x4);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy05.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy06){
   	   		int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q06.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x5 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x5));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q06.setText(Integer.toString(rmn));
   		        txt_01.setText("Casino Royale - Ian Fleming");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nCasino Royale - Ian Fleming x"+qty+"   Cost :"+x5+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Casino Royale - Ian Fleming");
   		     price = Integer.toString(x5);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x5 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x5));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q06.setText(Integer.toString(rmn));
   		        txt_01.setText("Casino Royale - Ian Fleming");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nCasino Royale - Ian Fleming x"+qty+"   Cost :"+x5+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Casino Royale - Ian Fleming");
   		     price = Integer.toString(x5);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy06.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy07){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q07.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x6 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x6));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q07.setText(Integer.toString(rmn));
   		        txt_01.setText("The Wrecking Crew - Donald Hamilton");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Wrecking Crew - Donald Hamilton x"+qty+"   Cost :"+x6+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("The Wrecking Crew - Donald Hamilton");
   		     price = Integer.toString(x6);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x6 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x6));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q07.setText(Integer.toString(rmn));
   		        txt_01.setText("The Wrecking Crew - Donald Hamilton");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Wrecking Crew - Donald Hamilton x"+qty+"   Cost :"+x6+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("The Wrecking Crew - Donald Hamilton");
   		     price = Integer.toString(x6);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy07.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}

   		if (e.getSource()==btn_buy08){
   			int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q08.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x7 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x7));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q08.setText(Integer.toString(rmn));
   		        txt_01.setText("The Fault In Our Stars - John Green");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Fault In Our Stars - John Green x"+qty+"   Cost :"+x7+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("The Fault In Our Stars - John Green");
   		     price = Integer.toString(x7);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x7 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x7));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q08.setText(Integer.toString(rmn));
   		        txt_01.setText("The Fault In Our Stars - John Green");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Fault In Our Stars - John Green x"+qty+"   Cost :"+x7+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("The Fault In Our Stars - John Green");
   		     price = Integer.toString(x7);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy08.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy09){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q09.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q09.setText(Integer.toString(rmn));
   		        txt_01.setText("Crazy Rich Asians - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nCrazy Rich Asians - Kevin Kwan x"+qty+"   Cost :"+x1+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Crazy Rich Asians - Kevin Kwan");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q09.setText(Integer.toString(rmn));
   		        txt_01.setText("Crazy Rich Asians - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nCrazy Rich Asians - Kevin Kwan x"+qty+"   Cost :"+x1+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Crazy Rich Asians - Kevin Kwan");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy09.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}	
   		if (e.getSource()==btn_buy10){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q10.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q10.setText(Integer.toString(rmn));
   		        txt_01.setText("China Rich Girlfriend - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nChina Rich Girlfriend - Kevin Kwan x"+qty+"   Cost :"+x1+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("China Rich Girlfriend - Kevin Kwan");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		     int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q10.setText(Integer.toString(rmn));
   		        txt_01.setText("China Rich Girlfriend - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nChina Rich Girlfriend - Kevin Kwan x"+qty+"   Cost :"+x1+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("China Rich Girlfriend - Kevin Kwan");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy10.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy11){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q11.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q11.setText(Integer.toString(rmn));
   		        txt_01.setText("Rich People Problems - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nRich People Problems - Kevin Kwan x"+qty+"   Cost :"+x1+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Rich People Problems - Kevin Kwan");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x1 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x1));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q11.setText(Integer.toString(rmn));
   		        txt_01.setText("Rich People Problems - Kevin Kwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nRich People Problems - Kevin Kwan x"+qty+"   Cost :"+x1+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Rich People Problems - Kevin Kwan");
   		     price = Integer.toString(x1);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy11.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy12){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q12.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q12.setText(Integer.toString(rmn));
   		        txt_01.setText("Harry Potter: Chamber of Secrets - J.K. Rowling");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHarry Potter: Chamber of Secrets - J.K. Rowling x"+qty+"   Cost :"+x2+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Harry Potter: Chamber of Secrets - J.K. Rowling");
   		     price = Integer.toString(x2);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q12.setText(Integer.toString(rmn));
   		        txt_01.setText("Harry Potter: Chamber of Secrets - J.K. Rowling");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHarry Potter: Chamber of Secrets - J.K. Rowling x"+qty+"   Cost :"+x2+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Harry Potter: Chamber of Secrets - J.K. Rowling");
   		     price = Integer.toString(x2);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy12.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   		if (e.getSource()==btn_buy13){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q13.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q13.setText(Integer.toString(rmn));
   		        txt_01.setText("Harry Potter: The Philosophers Stone - J.K. Rowling");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHarry Potter: The Philosophers Stone - J.K. Rowling x"+qty+"   Cost :"+x2+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Harry Potter: The Philosophers Stone - J.K. Rowling");
   		     price = Integer.toString(x2);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x2 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x2));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q13.setText(Integer.toString(rmn));
   		        txt_01.setText("Harry Potter: The Philosophers Stone - J.K. Rowling");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nHarry Potter: The Philosophers Stone - J.K. Rowling x"+qty+"   Cost :"+x2+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Harry Potter: The Philosophers - J.K. Rowling");
   		     price = Integer.toString(x2);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy13.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy14){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q14.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x3 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x3));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q14.setText(Integer.toString(rmn));
   		        txt_01.setText("37 Hours - J.F. Kirwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\n37 Hours - J.F. Kirwan x"+qty+"   Cost :"+x3+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("37 Hours - J.F. Kirwan");
   		     price = Integer.toString(x3);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x3 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x3));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q14.setText(Integer.toString(rmn));
   		        txt_01.setText("37 Hours - J.F. Kirwan");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\n37 Hours - J.F. Kirwan x"+qty+"   Cost :"+x3+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("37 Hours - J.F. Kirwan");
   		     price = Integer.toString(x3);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy14.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy15){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q15.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x4 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x4));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q15.setText(Integer.toString(rmn));
   		        txt_01.setText("The Midnight Cool - Lydia Peele");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Midnight Cool - Lydia Peele x"+qty+"   Cost :"+x4+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("The Midnight Cool - Lydia Peele");
   		     price = Integer.toString(x4);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x4 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x4));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q15.setText(Integer.toString(rmn));
   		        txt_01.setText("The Midnight Cool - Lydia Peele");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nThe Midnight Cool - Lydia Peele x"+qty+"   Cost :"+x4+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("The Midnight Cool - Lydia Peele");
   		     price = Integer.toString(x4);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy15.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
  
   	   	if (e.getSource()==btn_buy16){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q16.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x5 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x5));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q16.setText(Integer.toString(rmn));
   		        txt_01.setText("You Me Everything - Catherine Isaac");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nYou Me Everything - Catherine Isaac x"+qty+"   Cost :"+x5+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("You Me Everything - Catherine Isaac");
   		     price = Integer.toString(x5);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x5 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x5));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q16.setText(Integer.toString(rmn));
   		        txt_01.setText("You Me Everything - Catherine Isaac");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nYou Me Everything - Catherine Isaac x"+qty+"   Cost :"+x5+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("You Me Everything - Catherine Isaac");
   		     price = Integer.toString(x5);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy16.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy17){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q17.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x8 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x8));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q17.setText(Integer.toString(rmn));
   		        txt_01.setText("A Wrinkle In Time - Madeleine L'Engle");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nA Wrinkle In Time - Madeleine L'Engle x"+qty+"   Cost :"+x8+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("A Wrinkle In Time - Madeleine L'Engle");
   		     price = Integer.toString(x8);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x8 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x8));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q17.setText(Integer.toString(rmn));
   		        txt_01.setText("A Wrinkle In Time - Madeleine L'Engle");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nA Wrinkle In Time - Madeleine L'Engle x"+qty+"   Cost :"+x8+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("A Wrinkle In Time - Madeleine L'Engle");
   		     price = Integer.toString(x8);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy17.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy18){
   	   	int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q18.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x7 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x7));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q18.setText(Integer.toString(rmn));
   		        txt_01.setText("IT - Stephen King");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nIT - Stephen King x"+qty+"   Cost :"+x7+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("IT - Stephen King");
   		     price = Integer.toString(x7);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x7 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x7));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q18.setText(Integer.toString(rmn));
   		        txt_01.setText("IT - Stephen King");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nIT - Stephen King x"+qty+"   Cost :"+x7+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("IT - Stephen King");
   		     price = Integer.toString(x7);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy18.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy19){
   	   int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q19.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x9 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x9));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q19.setText(Integer.toString(rmn));
   		        txt_01.setText("Girl At War - Sara Novic");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nGirl At War - Sara Novic x"+qty+"   Cost :"+x9+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Girl At War - Sara Novic");
   		     price = Integer.toString(x9);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x9 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x9));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q19.setText(Integer.toString(rmn));
   		        txt_01.setText("Girl At War - Sara Novic");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nGirl At War - Sara Novic x"+qty+"   Cost :"+x9+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("Girl At War - Sara Novic");
   		     price = Integer.toString(x9);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy19.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   	   	}
   	   	if (e.getSource()==btn_buy20){
   	   		int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity: ")); 
   			int stock = Integer.parseInt(txt_q20.getText());
   			if (qty>stock){
   				JOptionPane.showMessageDialog(null,"We don't have enough stock");
   			}
   			else if (qty<stock){
   				totalqty += qty + initqty;
   				int rmn = stock - qty;
   			    double subtotal = x0 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x0));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q20.setText(Integer.toString(rmn));
   		        txt_01.setText("A Tale For The Time Being - Ruth Ozeki");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nA Tale For The Time Being - Ruth Ozeki x"+qty+"   Cost :"+x0+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("A Tale For The Time Being - Ruth Ozeki");
   		     price = Integer.toString(x0);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   	   }
   			
   		     
   		    else {
   		    	totalqty += qty + initqty;
   		        int rmn = stock - qty;
   			    double subtotal = x0 * qty;
   			    total += subtotal;
   			    txt_03.setText(Integer.toString(x0));
   			    txt_02.setText(Integer.toString(qty1+qty));
   		        txt_q20.setText(Integer.toString(rmn));
   		        txt_01.setText("A Tale For The Time Being - Ruth Ozeki");
   		        txt_04.setText(Double.toString(total));
   		        BookList+= "\nA Tale For The Time Being - Ruth Ozeki x"+qty+"   Cost :"+x0+"   Subtotal :"+subtotal;
   		        txt_display.setText(BookList);
   		        productN = ("A Tale For The Time Being");
   		     price = Integer.toString(x0);
   		     quantity = Integer.toString(qty);
   		     tot = Double.toString(subtotal);
   		     cart[count][0]=productN; cart[count][1]=price; cart[count][2]=quantity; cart[count][3]=tot;
   		     count++;
   		        btn_buy20.setEnabled(false);
   		        JOptionPane.showMessageDialog(null,"Book is Sold Out");
   		     }
   		     
   	   	}	
   	}//emd actionPerformed
   	
  
 public static void main(String[] args) {
    	BookReservation tp = new BookReservation();
    	tp.setVisible(false);
       tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}

