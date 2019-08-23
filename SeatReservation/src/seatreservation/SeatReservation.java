package SeatReservation;

import java.awt.*;
import java.awt.event.*;
import static java.lang.Double.parseDouble;
import javax.swing.*;
  //defines event handlers

public class SeatReservation extends JFrame implements ActionListener{

  //Step1: declaration of JComponent
        JTextField txtN1,txtN2,txtR;
        JLabel lblTitle,lblN1,lblN2,lblR,lblE,lpic1,lpic2,lpic3,lpic4,lpic5,lpic6,llegend, lg1, lg2,lblBG, lpicNow,valTS1,valTS2,valTS3,gt,valgt,valTS1a,valTS2a,valTS3a;
        JButton bR,bS1,bS2,bS3,bS4,bS5,bS6,bS7,bS8,bS9,bS10,
                bS11,bS12,bS13,bS14,bS15,bS16,bS17,bS18,bS19,bS20,
                bS21,bS22,bS23,bS24,bS25,bS26,bS27,bS28,bS29,bS30,bpay,bN,bNS,bS,buttonIcon,blogout;
        JTextArea txtDisplay;
        //JPanel pane1,pane2,pane3;
        Double cash = 0.00,total =0.00,cost=200.00,allTotal=0.00; 
        int numres=0,customer=1,gencust=1,pamcust=1,nikcust=1,gensales=0,pamsales=0,niksales=0;
        String user="";
        String b1="available",b2="available",b3="available",b4="available",b5="available",b6="available",b7="available",b8="available",b9="available",b10="available",
               b11="available",b12="available",b13="available",b14="available",b15="available",b16="available",b17="available",b18="available",b19="available",b20="available",
               b21="available",b22="available",b23="available",b24="available",b25="available",b26="available",b27="available",b28="available",b29="available",b30="available";
        String bc1="green",bc2="green",bc3="green",bc4="green",bc5="green",bc6="green",bc7="green",bc8="green",bc9="green",bc10="green",
           bc11="green",bc12="green",bc13="green",bc14="green",bc15="green",bc16="green",bc17="green",bc18="green",bc19="green",bc20="green",
           bc21="green",bc22="green",bc23="green",bc24="green",bc25="green",bc26="green",bc27="green",bc28="green",bc29="green",bc30="green";
        String [] seats=new String[30];
        String column[]={"Customer","Seat Reserved","Price","Total"}; 
        String cgen[][] = new String[100][5]; 
        String cpam[][] = new String[100][5]; 
        String cnik[][] = new String[100][5];
        JTabbedPane tp,tp1;
        JPanel pane1,pane2,pane3;
        JFrame frame=new JFrame();
        JFrame main,login,inventory,inventory1,inventory2,inventory3,sales1,sales2,sales3,totalsales;
        //JLabel lblBG;
        Icon Pic1 = new ImageIcon("C:/Users/HEWLETT-PACKARD/Desktop/Apparel/bg.jpg");
        String [][] users = {{"Gen","143"},{"Pams","Pamz"},{"Nik", "Ian"},{"Admin", "admin"}};
        //lblBG = new JLabel(Pic1);

        //lblBG = new JLabel(Pic1);
        JButton blogin = new JButton("Login");
        JPanel panel = new JPanel();
        JTextField txuser = new JTextField();
        JPasswordField pass = new JPasswordField("");

        JLabel username = new JLabel("Username");
        JLabel password = new JLabel("Password");
        

  //Step 2: Construct JComponents
        
   
   public SeatReservation() {
       //frame for login
    login = new JFrame();
    login.setTitle("Login Autentification");
    login.setSize(300,200);
    login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    login.setVisible(true);
    login.setLocationRelativeTo(null);
    login.setLayout(null);
    login.setResizable(false);
    login.add(username);
    username.setBounds(50,30,150,20);
    login.add(password);
    password.setBounds(50,65,150,20); 
    txuser.setBounds(110,30,100,20);
    pass.setBounds(110,65,100,20);
    blogin.setBounds(110,100,80,20);
    login.add(blogin);
    login.add(txuser);
    login.add(pass);
            
    //frame for Inventory
    inventory = new JFrame();
    inventory.setSize(910,500);
    inventory.setLocationRelativeTo(null);
    inventory.setVisible(false);
    inventory.setTitle("Total Sales");
    inventory.setResizable(false);
    
    inventory1 = new JFrame();
    inventory1.setSize(910,500);
    inventory1.setLocationRelativeTo(null);
    inventory1.setVisible(false);
    inventory1.setTitle("Gen's Sales");
    inventory1.setResizable(false);
    
    
    inventory2 = new JFrame();
    inventory2.setSize(910,500);
    inventory2.setLocationRelativeTo(null);
    inventory2.setVisible(false);
    inventory2.setTitle("Pam's Sales");
    inventory2.setResizable(false);
    
    
    inventory3 = new JFrame();
    inventory3.setSize(910,500);
    inventory3.setLocationRelativeTo(null);
    inventory3.setVisible(false);
    inventory3.setTitle("Nikki's Sales");
    inventory3.setResizable(false);
    
    //declare jtable
    JTable gen = new JTable(cgen,column);
    JTable gen1 = new JTable(cgen,column);
    JTable pam = new JTable(cpam,column);
    JTable pam1 = new JTable(cpam,column);
    JTable nikki = new JTable(cnik,column);
    JTable nikki1 = new JTable(cnik,column);

    pane1=new JPanel();
    JScrollPane sp1=new JScrollPane(gen);
    JLabel TS1 = new JLabel("Total Sales:");
    valTS1 = new JLabel("0.00");
    pane1.add(sp1);
    pane1.setVisible(true);
    sp1.setPreferredSize(new Dimension(900, 400));
    sp1.setBounds(10,10,900,400);
    TS1.setBounds(700,410,70,25);
    valTS1.setBounds(770,430,100,25);
    pane1.add(TS1); //totalsale label
    pane1.add(valTS1);//totalsale textbox
    inventory1.add(pane1);
    
    JPanel pane1a=new JPanel();
    JScrollPane sp1a=new JScrollPane(gen1);
    JLabel TS1a = new JLabel("Total Sales:");
    valTS1a = new JLabel("0.00");
    pane1a.add(sp1a);
    pane1a.setVisible(true);
    sp1a.setPreferredSize(new Dimension(900, 400));
    sp1a.setBounds(10,10,900,400);
    TS1a.setBounds(700,410,70,25);
    valTS1a.setBounds(770,430,100,25);
    pane1a.add(TS1a); //totalsale label
    pane1a.add(valTS1a);//totalsale textbox
    
    
    pane2=new JPanel();
    JScrollPane sp2=new JScrollPane(pam);
    JLabel TS2 = new JLabel("Total Sales:");
    valTS2 = new JLabel("0.00");
    pane2.add(sp2);
    pane2.setVisible(true);
    sp2.setPreferredSize(new Dimension(900, 400));
    sp2.setBounds(10,10,900,400);
    TS2.setBounds(700,410,70,25);
    valTS2.setBounds(770,430,100,25);
    pane2.add(TS2); //totalsale label
    pane2.add(valTS2);//totalsale textbox
    inventory2.add(pane2);
    
    JPanel pane2a=new JPanel();
    JScrollPane sp2a = new JScrollPane(pam1);
    JLabel TS2a = new JLabel("Total Sales:");
    valTS2a = new JLabel("0.00");
    pane2a.add(sp2a);
    pane2a.setVisible(true);
    sp2a.setPreferredSize(new Dimension(900, 400));
    sp2a.setBounds(10,10,900,400);
    TS2a.setBounds(700,410,70,25);
    valTS2a.setBounds(770,430,100,25);
    pane2a.add(TS2); //totalsale label
    pane2a.add(valTS2a);//totalsale textbox
    
    pane3=new JPanel();
    JScrollPane sp3=new JScrollPane(nikki);
    JLabel TS3 = new JLabel("Total Sales:");
    valTS3 = new JLabel("0.00");
    pane3.add(sp3);
    pane3.setVisible(true);
    sp3.setPreferredSize(new Dimension(900, 400));
    sp3.setBounds(10,10,900,400);
    TS3.setBounds(700,410,70,25);
    valTS3.setBounds(770,430,100,25);
    pane3.add(TS3); //totalsale label
    pane3.add(valTS3);//totalsale textbox
    inventory3.add(pane3);
    
    JPanel pane3a=new JPanel();
    JScrollPane sp3a=new JScrollPane(nikki1);
    JLabel TS3a = new JLabel("Total Sales:");
    valTS3a = new JLabel("0.00");
    pane3a.add(sp3a);
    pane3a.setVisible(true);
    sp3a.setPreferredSize(new Dimension(900, 400));
    sp3a.setBounds(10,10,900,400);
    TS3a.setBounds(700,410,70,25);
    valTS3a.setBounds(770,430,100,25);
    pane3a.add(TS3a); //totalsale label
    pane3a.add(valTS3a);//totalsale textbox
    
    
    tp=new JTabbedPane();
    tp.setBounds(0,0,910,500);
    tp.add("Gen's Sales",pane1a);
    tp.add("Pam's Sales",pane2a);
    tp.add("Nikki's Sales",pane3a);
    gt=new JLabel("All Total Sales:");
    valgt=new JLabel("0.00");
    gt.setBounds(10, 430, 100, 25);
    valgt.setBounds(100, 430, 100, 25);
    inventory.add(gt);
    inventory.add(valgt);
    inventory.add(tp);
    
    
    //creating the frame for main
     clearview();
     main = new JFrame();
     main.setSize(1200,800);
     main.setVisible(false);
     main.setTitle("SEAT RESERVATION by: JnG");
     main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     main.setLocationRelativeTo(null);
     main.setResizable(false);
     
     Icon pic=new ImageIcon("C:/Users/Gelyn Rose/Desktop/oop final/b9.jpg");
     lblTitle = new JLabel("JnG CINEMA SEAT RESERVATION");
     lblN1 = new JLabel("TOTAL");
     lblN2 = new JLabel("CASH");  
     lblR = new JLabel("CHANGE");
     llegend = new JLabel ("LEGENDS: ");
     lg1 = new JLabel ("RESERVED");
     lg2 = new JLabel ("OCCUPIED");
     lblE = new JLabel(""); 
     lblBG = new JLabel(pic);
     //#button
     //ImageIcon bS1= new ImageIcon("D:/GEN/b5.jpg");
     //JButton bS1 = new JButton(image);
     
     bN= new JButton(" Next Customer");
     bN.setEnabled(false);
     bNS= new JButton(" Next Showing");
     bNS.setEnabled(false);
     bS= new JButton("Sales");
     bS.setEnabled(false);
     
     
     txtN1 = new JTextField(200);   
     txtN2 = new JTextField(200);   
     txtR = new JTextField(200); 
     txtN1.setEditable(false);
     txtR.setEditable(false); 
     txtN1.setText("");
     txtN2.setText("");
     txtR.setText("");
     
     txtDisplay = new JTextArea("Customer's Reserved  \tSubtotal");
     txtDisplay.setEditable(false);
     JScrollPane viewres=new JScrollPane(txtDisplay);
     
     //creating buttons
     bS1 = new JButton("S1");
     bS2 = new JButton("S2");
     bS3 = new JButton("S3");
     bS4 = new JButton("S4");
     bS5 = new JButton("S5");   
     bS6 = new JButton("S6");
     bS7 = new JButton("S7");
     bS8 = new JButton("S8");
     bS9 = new JButton("S9");
     bS10 = new JButton("S10");
     bS11 = new JButton("S11"); 
     bS12 = new JButton("S12");
     bS13 = new JButton("S13");
     bS14 = new JButton("S14");
     bS15 = new JButton("S15"); 
     bS16 = new JButton("S16"); 
     bS17 = new JButton("S17");
     bS18 = new JButton("S18"); 
     bS19 = new JButton("S19");
     bS20 = new JButton("S20");
     bS21 = new JButton("S21");      
     bS22 = new JButton("S22"); 
     bS23 = new JButton("S23");
     bS24 = new JButton("S24");      
     bS25 = new JButton("S25");
     bS26 = new JButton("S26"); 
     bS27 = new JButton("S27");         
     bS28 = new JButton("S28");
     bS29 = new JButton("S29");
     bS30 = new JButton("S30");
     bpay = new JButton("Pay");
     bS = new JButton("Sales");
     blogout= new JButton("Logout");
     //load Images
     ImageIcon picNow = new ImageIcon("C:/Users/Gelyn Rose/Desktop/oop final/cinema-pics/7.gif");
     lpicNow = new JLabel(picNow);

     ImageIcon pic1 = new ImageIcon("C:/Users/Gelyn Rose/Desktop/oop final/cinema-pics/c1.jpg"); 
     lpic1 = new JLabel(pic1); // images are usually place in component.
     
     ImageIcon pic2 = new ImageIcon("C:/Users/Gelyn Rose/Desktop/oop final/cinema-pics/c2.jpg"); 
     lpic2 = new JLabel(pic2);
     
     ImageIcon pic3 = new ImageIcon("C:/Users/Gelyn Rose/Desktop/oop final/cinema-pics/c3.jpg"); 
     lpic3 = new JLabel(pic3);
     
     ImageIcon pic4 = new ImageIcon("C:/Users/Gelyn Rose/Desktop/oop final/cinema-pics/c4.jpg"); 
     lpic4= new JLabel(pic4);
     
     ImageIcon pic5 = new ImageIcon("C:/Users/Gelyn Rose/Desktop/oop final/cinema-pics/c5.jpg"); 
     lpic5 = new JLabel(pic5);
     
     ImageIcon pic6 = new ImageIcon("C:/Users/Gelyn Rose/Desktop/oop final/cinema-pics/c6.jpg"); 
     lpic6 = new JLabel(pic6);
     
    //Add JComponents in the Frame And set Bounderies                  
     main.add(lblTitle);
     lblTitle.setBounds(470,70,600,35);
     lblTitle.setFont (new Font("Montserrat Subrayada",Font.BOLD,35)); //set the font style of the label
     lblTitle.setForeground(Color.BLACK);  //set the text color 
     
     //textfield &txt
     
     main.add (llegend);
     llegend.setBounds(900,330,500,200);    
     llegend.setFont (new Font("Impact",Font.BOLD,20)); //set the font style of the label
     llegend.setForeground(Color.BLUE);  //set the text color
     
     main.add (lg1);
     lg1.setBounds(900,332,550,230);    
     lg1.setFont (new Font("Arial",Font.BOLD,20)); //set the font style of the label
     lg1.setForeground(Color.RED);  //set the text color

     main.add (lg2); 
     lg2.setBounds(900,334,560,260);    
     lg2.setFont (new Font("Arial",Font.BOLD,20)); //set the font style of the label
     lg2.setForeground(Color.GREEN);  //set the text color
     
     main.add(txtDisplay);
     txtDisplay.setBounds(450,380,250,100);
     txtDisplay.setEditable(false);
     
     main.add(lblN1);
     lblN1.setBounds(450,500,60,20);    
     lblN1.setFont (new Font("Impact",Font.BOLD,20)); //set the font style of the label
     lblN1.setForeground(Color.RED);  //set the text color
     
     main.add(txtN1);
     txtN1.setBounds(550,480,150,50);   
     txtN1.setFont (new Font("Impact",Font.BOLD,20));
     txtN1.setForeground(new Color(168,0,0));
     
     main.add(lblN2);
     lblN2.setBounds(450,550,60,20);    
     lblN2.setFont (new Font("Impact",Font.BOLD,20));
     lblN2.setForeground(Color.RED);
     
     main.add(txtN2);
     txtN2.setBounds(550,540,150,50);   
     txtN2.setFont (new Font("Impact",Font.BOLD,20));
     txtN2.setForeground(new Color(168,0,0));
     
     main.add(lblR);
     lblR.setBounds(450,620,80,20); 
     lblR.setFont (new Font("Impact",Font.BOLD,20));
     lblR.setForeground(Color.RED);
     
     main.add(txtR);
     txtR.setBounds(550,600,150,50);
     txtR.setFont (new Font("Impact",Font.BOLD,20));
     txtR.setForeground(new Color(168,0,0));
     
     main.add (lpicNow);
     lpicNow.setBounds(30,0,400,110);
     
     main.add(lpic1);
     lpic1.setBounds(70,120,150,150);
     
     main.add(lpic2);
     lpic2.setBounds(250,120,150,150);
     
     main.add(lpic3);
     lpic3.setBounds(70,310,150,150);
     
     main.add(lpic4);
     lpic4.setBounds(250,310,150,150);
     
     main.add(lpic5);
     lpic5.setBounds(70,490,150,150);
     
     main.add(lpic6);
     lpic6.setBounds(250,490,150,150);
     
     main.add(lblBG);
     lblBG.setBounds(0,0,1200,700);
     
     main.add(lblE);
     //buttons
     
     main.add(bpay);
     bpay.setBounds(910,500,160,33);
     bpay.setFont (new Font("Arial",Font.BOLD,18));
     
     main.add(bN);
     bN.setBounds(910,550,160,33);
     bN.setFont (new Font("Arial",Font.BOLD,18));
     
     main.add(bNS);
     bNS.setBounds(910,600,160,33);
     bNS.setFont (new Font("Arial",Font.BOLD,18));
     
     main.add(bS);
     bS.setBounds(910,650,160,33);
     bS.setFont (new Font("Arial",Font.BOLD,18));
     
     main.add(blogout);
     blogout.setBounds(745, 650, 160, 33);
     blogout.setFont(new Font("Arial",Font.BOLD,18));
     
     main.add(bS1);
     //BufferedImage buttonIcon = ImageIO.read(new File("C:/Users/User/Desktop/GEN/seat.png));
    // bS1 = new JButton(new ImageIcon(buttonIcon));
     bS1.setBounds(425,180,80,30);
     bS1.setBackground(Color.GREEN);
     //bS1.setForeground(ImageIcon("C:/Users/User/Desktop/GEN/seat.png"));
     
     main.add(bS2);
     bS2.setBounds(525,180,80,30);
     bS2.setBackground(Color.GREEN);
     
     main.add(bS3);
     bS3.setBounds(625,180,80,30);
     bS3.setBackground(Color.GREEN);
     
     main.add(bS4);
     bS4.setBounds(775,180,80,30);
     bS4.setBackground(Color.GREEN);
     
     main.add(bS5);
     bS5.setBounds(880,180,80,30);
     bS5.setBackground(Color.GREEN);  
        
     main.add(bS6);
     bS6.setBounds(995,180,80,30);
     bS6.setBackground(Color.GREEN);
      
     main.add(bS7);
     bS7.setBounds(425,220,80,30);
     bS7.setBackground(Color.GREEN);
     
     main.add(bS8);
     bS8.setBounds(525,220,80,30);
     bS8.setBackground(Color.GREEN);
     
     main.add(bS9);
     bS9.setBounds(625,220,80,30);
     bS9.setBackground(Color.GREEN);
     
     main.add(bS10);
     bS10.setBounds(775,220,80,30);
     bS10.setBackground(Color.GREEN); 

     main.add(bS11);
     bS11.setBounds(880,220,80,30);
     bS11.setBackground(Color.GREEN); 

     main.add(bS12);
     bS12.setBounds(995,220,80,30);
     bS12.setBackground(Color.GREEN); 

     main.add(bS13);
     bS13.setBounds(425,260,80,30);
     bS13.setBackground(Color.GREEN); 

     main.add(bS14);
     bS14.setBounds(525,260,80,30);
     bS14.setBackground(Color.GREEN); 

     main.add(bS15);
     bS15.setBounds(625,260,80,30);  
     bS15.setBackground(Color.GREEN); 
    
     main.add(bS16);
     bS16.setBounds(775,260,80,30);
     bS16.setBackground(Color.GREEN); 
 
     main.add(bS17);
     bS17.setBounds(880,260,80,30);
     bS17.setBackground(Color.GREEN); 

     main.add(bS18);
     bS18.setBounds(995,260,80,30);
     bS18.setBackground(Color.GREEN); 

     main.add(bS19);
     bS19.setBounds(425,300,80,30);
     bS19.setBackground(Color.GREEN); 

     main.add(bS20);
     bS20.setBounds(525,300,80,30);  
     bS20.setBackground(Color.GREEN); 

     main.add(bS21);
     bS21.setBounds(625,300,80,30);
     bS21.setBackground(Color.GREEN); 
 
     main.add(bS22);
     bS22.setBounds(775,300,80,30);
     bS22.setBackground(Color.GREEN); 

     main.add(bS23);
     bS23.setBounds(880,300,80,30);
     bS23.setBackground(Color.GREEN); 

     main.add(bS24);
     bS24.setBounds(995,300,80,30);
     bS24.setBackground(Color.GREEN); 

     main.add(bS25);
     bS25.setBounds(425,340,80,30);
     bS25.setBackground(Color.GREEN); 

     main.add(bS26);
     bS26.setBounds(525,340,80,30);
     bS26.setBackground(Color.GREEN); 

     main.add(bS27);
     bS27.setBounds(625,340,80,30);
     bS27.setBackground(Color.GREEN); 

     main.add(bS28);
     bS28.setBounds(775,340,80,30);
     bS28.setBackground(Color.GREEN); 

     main.add(bS29);
     bS29.setBounds(880,340,80,30);
     bS29.setBackground(Color.GREEN); 

     main.add(bS30);
     bS30.setBounds(995,340,80,30);     
     bS30.setBackground(Color.GREEN); 
        
    main.add(lblBG);
    lblBG.setBounds(0,0,1200,700);
             
     main.add(lblE);
     
     //add to ActionListener
     bN.addActionListener(this);
     bpay.addActionListener(this);
     bNS.addActionListener(this);
     bS1.addActionListener(this);
     bS2.addActionListener(this); 
     bS3.addActionListener(this); 
     bS4.addActionListener(this);
     bS5.addActionListener(this);
     bS6.addActionListener(this); 
     bS7.addActionListener(this); 
     bS8.addActionListener(this); 
     bS9.addActionListener(this);
     bS10.addActionListener(this); 
     bS11.addActionListener(this); 
     bS12.addActionListener(this);  
     bS13.addActionListener(this);
     bS14.addActionListener(this); 
     bS15.addActionListener(this); 
     bS16.addActionListener(this); 
     bS17.addActionListener(this);
     bS18.addActionListener(this); 
     bS19.addActionListener(this); 
     bS20.addActionListener(this);
     bS21.addActionListener(this);
     bS22.addActionListener(this); 
     bS23.addActionListener(this); 
     bS24.addActionListener(this);  
     bS25.addActionListener(this);
     bS26.addActionListener(this); 
     bS27.addActionListener(this); 
     bS28.addActionListener(this); 
     bS29.addActionListener(this); 
     bS30.addActionListener(this);
     bS.addActionListener(this);
     blogout.addActionListener(this);
     blogin.addActionListener(this);
   }
   
   //Performing ActionListener
   public void actionPerformed (ActionEvent e){
        if (e.getSource()==bS1) {
            txtR.setText("");
            if(bc1=="green"){
                    seats[0]="1";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS1.setBackground(Color.RED);
                    bc1="red";
                    b1="reserved";
                    }
            else{
                    seats[0]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS1.setBackground(Color.GREEN);
                    bc1="green";
                    b1="available";
                    }
            }
          
        if (e.getSource()==bS2) {
            txtR.setText("");
            if(bc2=="green"){
                    seats[1]="2";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS2.setBackground(Color.RED);
                    bc2="red";
                    b2="reserved";
                    }
            else{
                    seats[1]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS2.setBackground(Color.GREEN);
                    bc2="green";
                    b2="available";
                    }
            }

        if (e.getSource()==bS3) {
            txtR.setText("");
            if(bc3=="green"){
                    seats[2]="3";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS3.setBackground(Color.RED);
                    bc3="red";
                    b3="reserved";
                    }
            else{
                    seats[2]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS3.setBackground(Color.GREEN);
                    bc3="green";
                    b3="available";
                    }
            }
        if (e.getSource()==bS4) {
            txtR.setText("");
            if(bc4=="green"){
                    seats[3]="4";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS4.setBackground(Color.RED);
                    bc4="red";
                    b4="reserved";
                    }
            else{
                    seats[3]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS4.setBackground(Color.GREEN);
                    bc4="green";
                    b4="available";
                    }
            }
        if (e.getSource()==bS5) {
            txtR.setText("");
            if(bc5=="green"){
                    seats[4]="5";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS5.setBackground(Color.RED);
                    bc5="red";
                    b5="reserved";
                    }
            else{
                    seats[4]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS5.setBackground(Color.GREEN);
                    bc5="green";
                    b5="available";
                    }
            }
        if (e.getSource()==bS6) {
            txtR.setText("");
            if(bc6=="green"){
                    seats[5]="6";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS6.setBackground(Color.RED);
                    bc6="red";
                    b6="reserved";
                    }
            else{
                    seats[5]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS6.setBackground(Color.GREEN);
                    bc6="green";
                    b6="available";
                    }
            }
        if (e.getSource()==bS7) {
            txtR.setText("");
            if(bc7=="green"){
                    seats[6]="7";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS7.setBackground(Color.RED);
                    bc7="red";
                    b7="reserved";
                    }
            else{
                    seats[6]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS7.setBackground(Color.GREEN);
                    bc7="green";
                    b7="available";
                    }
            }
        if (e.getSource()==bS8) {
            txtR.setText("");
            if(bc8=="green"){
                    seats[7]="8";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS8.setBackground(Color.RED);
                    bc8="red";
                    b8="reserved";
                    }
            else{
                    seats[7]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS8.setBackground(Color.GREEN);
                    bc8="green";
                    b8="available";
                    }
            }
        if (e.getSource()==bS9) {
            txtR.setText("");
            if(bc9=="green"){
                    seats[8]="9";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS9.setBackground(Color.RED);
                    bc9="red";
                    b9="reserved";
                    }
            else{
                    seats[8]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS9.setBackground(Color.GREEN);
                    bc9="green";
                    b9="available";
                    }
            }
        if (e.getSource()==bS10) {
            txtR.setText("");
            if(bc10=="green"){
                    seats[9]="10";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS10.setBackground(Color.RED);
                    bc10="red";
                    b10="reserved";
                    }
            else{
                    seats[9]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS10.setBackground(Color.GREEN);
                    bc10="green";
                    b10="available";
                    }
            }
        if (e.getSource()==bS11) {
            txtR.setText("");
            if(bc11=="green"){
                    seats[10]="11";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS11.setBackground(Color.RED);
                    bc11="red";
                    b11="reserved";
                    }
            else{
                    seats[10]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS11.setBackground(Color.GREEN);
                    bc11="green";
                    b11="available";
                    }
            }
          
        if (e.getSource()==bS12) {
            txtR.setText("");
            if(bc12=="green"){
                    seats[11]="12";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS12.setBackground(Color.RED);
                    bc12="red";
                    b12="reserved";
                    }
            else{
                    seats[11]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS12.setBackground(Color.GREEN);
                    bc12="green";
                    b12="available";
                    }
            }

        if (e.getSource()==bS13) {
            txtR.setText("");
            if(bc13=="green"){
                    seats[12]="13";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS13.setBackground(Color.RED);
                    bc13="red";
                    b13="reserved";
                    }
            else{
                    seats[12]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS13.setBackground(Color.GREEN);
                    bc13="green";
                    b13="available";
                    }
            }
        if (e.getSource()==bS14) {
            txtR.setText("");
            if(bc14=="green"){
                    seats[13]="14";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS14.setBackground(Color.RED);
                    bc14="red";
                    b14="reserved";
                    }
            else{
                    seats[13]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS14.setBackground(Color.GREEN);
                    bc14="green";
                    b14="available";
                    }
            }
        if (e.getSource()==bS15) {
            txtR.setText("");
            if(bc15=="green"){
                    seats[14]="15";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS15.setBackground(Color.RED);
                    bc15="red";
                    b15="reserved";
                    }
            else{
                    seats[14]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS15.setBackground(Color.GREEN);
                    bc15="green";
                    b15="available";
                    }
            }
        if (e.getSource()==bS16) {
            txtR.setText("");
            if(bc16=="green"){
                    seats[15]="16";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS16.setBackground(Color.RED);
                    bc16="red";
                    b16="reserved";
                    }
            else{
                    seats[15]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS16.setBackground(Color.GREEN);
                    bc16="green";
                    b16="available";
                    }
            }
        if (e.getSource()==bS17) {
            txtR.setText("");
            if(bc17=="green"){
                    seats[16]="17";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS17.setBackground(Color.RED);
                    bc17="red";
                    b17="reserved";
                    }
            else{
                    seats[16]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS17.setBackground(Color.GREEN);
                    bc17="green";
                    b17="available";
                    }
            }
        if (e.getSource()==bS18) {
            txtR.setText("");
            if(bc18=="green"){
                    seats[17]="18";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS18.setBackground(Color.RED);
                    bc18="red";
                    b18="reserved";
                    }
            else{
                    seats[17]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS18.setBackground(Color.GREEN);
                    bc18="green";
                    b18="available";
                    }
            }
        if (e.getSource()==bS19) {
            txtR.setText("");
            if(bc19=="green"){
                    seats[18]="19";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS19.setBackground(Color.RED);
                    bc19="red";
                    b19="reserved";
                    }
            else{
                    seats[18]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS19.setBackground(Color.GREEN);
                    bc19="green";
                    b19="available";
                    }
            }
        if (e.getSource()==bS20) {
            txtR.setText("");
            if(bc20=="green"){
                    seats[19]="20";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS20.setBackground(Color.RED);
                    bc20="red";
                    b20="reserved";
                    }
            else{
                    seats[19]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS20.setBackground(Color.GREEN);
                    bc20="green";
                    b20="available";
                    }
            }
        if (e.getSource()==bS21) {
            txtR.setText("");
            if(bc21=="green"){
                    seats[20]="21";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS21.setBackground(Color.RED);
                    bc21="red";
                    b21="reserved";
                    }
            else{
                    seats[20]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS21.setBackground(Color.GREEN);
                    bc21="green";
                    b21="available";
                    }
            }
          
        if (e.getSource()==bS22) {
            txtR.setText("");
            if(bc22=="green"){
                    seats[21]="22";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS22.setBackground(Color.RED);
                    bc22="red";
                    b22="reserved";
                    }
            else{
                    seats[21]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS22.setBackground(Color.GREEN);
                    bc22="green";
                    b22="available";
                    }
            }

        if (e.getSource()==bS23) {
            txtR.setText("");
            if(bc23=="green"){
                    seats[22]="23";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS23.setBackground(Color.RED);
                    bc23="red";
                    b23="reserved";
                    }
            else{
                    seats[22]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS23.setBackground(Color.GREEN);
                    bc23="green";
                    b23="available";
                    }
            }
        if (e.getSource()==bS24) {
            txtR.setText("");
            if(bc24=="green"){
                    seats[23]="24";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS24.setBackground(Color.RED);
                    bc24="red";
                    b24="reserved";
                    }
            else{
                    seats[23]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS24.setBackground(Color.GREEN);
                    bc24="green";
                    b24="available";
                    }
            }
        if (e.getSource()==bS25) {
            txtR.setText("");
            if(bc25=="green"){
                    seats[24]="25";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS25.setBackground(Color.RED);
                    bc25="red";
                    b25="reserved";
                    }
            else{
                    seats[24]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS25.setBackground(Color.GREEN);
                    bc25="green";
                    b25="available";
                    }
            }
        if (e.getSource()==bS26) {
            txtR.setText("");
            if(bc26=="green"){
                    seats[25]="26";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS26.setBackground(Color.RED);
                    bc26="red";
                    b26="reserved";
                    }
            else{
                    seats[25]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS26.setBackground(Color.GREEN);
                    bc26="green";
                    b26="available";
                    }
            }
        if (e.getSource()==bS27) {
            txtR.setText("");
            if(bc27=="green"){
                    seats[26]="27";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS27.setBackground(Color.RED);
                    bc27="red";
                    b27="reserved";
                    }
            else{
                    seats[26]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS27.setBackground(Color.GREEN);
                    bc27="green";
                    b27="available";
                    }
            }
        if (e.getSource()==bS28) {
            txtR.setText("");
            if(bc28=="green"){
                    seats[27]="28";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS28.setBackground(Color.RED);
                    bc28="red";
                    b28="reserved";
                    }
            else{
                    seats[27]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS28.setBackground(Color.GREEN);
                    bc28="green";
                    b28="available";
                    }
            }
        if (e.getSource()==bS29) {
            txtR.setText("");
            if(bc29=="green"){
                    seats[28]="29";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS29.setBackground(Color.RED);
                    bc29="red";
                    b29="reserved";
                    }
            else{
                    seats[28]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS29.setBackground(Color.GREEN);
                    bc29="green";
                    b29="available";
                    }
            }
        if (e.getSource()==bS30) {
            txtR.setText("");
            if(bc30=="green"){
                    seats[29]="30";
                    total += cost;
                    txtN1.setText(Double.toString(total));
                    bS30.setBackground(Color.RED);
                    bc30="red";
                    b30="reserved";
                    }
            else{
                    seats[29]="";
                    total -= cost;
                    txtN1.setText(Double.toString(total));
                    bS30.setBackground(Color.GREEN);
                    bc30="green";
                    b30="available";
                    }
            }
        if(txtN1.getText().isEmpty()!=true && total!=0.00){
           blogout.setEnabled(false);
       }
       if(txtN1.getText().isEmpty()==true || total==0.00){
            bNS.setEnabled(false);
            bN.setEnabled(false);
            blogout.setEnabled(true);
        }
        if (e.getSource()==bN && txtR.getText().isEmpty()!=true) {
            blogout.setEnabled(true);
            txtN1.setText("");
            txtN2.setText("");
            txtR.setText("");
            total=0.00;
                customer+=1;
                txtDisplay.setText("Customer's Reserved  \tSubtotal");
                txtN2.setEditable(true);
                bpay.setEnabled(true);
                clearview();
                seatres();
            }
        if (e.getSource()==bNS) {
            int ans=JOptionPane.showConfirmDialog(frame,"Are you Sure you want to Reset all Seats?");
            if(ans==0){
                txtN1.setText("");
                txtN2.setText("");
                txtR.setText("");
                txtDisplay.setText("Customer's Reserved  \tSubtotal");
                total=0.00;
                txtN2.setEditable(true);
                bpay.setEnabled(true);
                bN.setEnabled(false);
                seatreset();
            }  
                else {
                    bN.setEnabled(true);
                    bNS.setEnabled(true);  
                }
                
        }
        if(e.getSource()==bS){
            switch(user){
                case "Gen":inventory1.setVisible(true);break;
                case "Pams":inventory2.setVisible(true);break;
                case "Nik":inventory3.setVisible(true);break;
                }
        }
        if(e.getSource()==blogout){
            int ans=JOptionPane.showConfirmDialog(frame,"Do you want to Logout?");
            if(ans==0){
                customer=0;
                txuser.setText("");
                pass.setText("");
                txtN1.setText("");
                txtN2.setText("");
                txtR.setText("");
                login.setVisible(true);
                main.setVisible(false);
                bN.setEnabled(false);
                seatres();
                clearview();
            }
        }
        if(e.getSource()==blogin){
            if(actionlogin(txuser.getText(),pass.getText())==true){
                user=txuser.getText();
                if(user.equals("Admin")){
                    txuser.setText("");
                    pass.setText("");
                    inventory.setVisible(true);
                    
                }
                else{
                    setup();
                    login.setVisible(false);
                    main.setVisible(true);
                    txtN2.setEditable(true);
                    bpay.setEnabled(true);
                    bN.setEnabled(false);
                }
                
            }
            else{
             JOptionPane.showMessageDialog(this,"Sorry Wrong UserName Or Password");
             txuser.setText("");
             pass.setText("");
            }
        }
        if (e.getSource()==bpay){
            if(txtN1.getText().isEmpty()!=true && total!=0.00){
                if(txtN2.getText().isEmpty()!=true && total!=0.00){
                    double total1 = Double.parseDouble(txtN1.getText());
                    double cash = Double.parseDouble(txtN2.getText());
                    if(cash>=total1) {
                        int ans=JOptionPane.showConfirmDialog(frame,"Want to reserve?");
                        if(ans==0){
                            double change = cash - total1;
                            Sales();
                            txtR.setText(String.valueOf(change));
                            txtN2.setEditable(false);
                            bpay.setEnabled(false);
                            bN.setEnabled(true);
                            bNS.setEnabled(true);
                            bS.setEnabled(true);
                            blogout.setEnabled(true);
                            lockseat();
                            JOptionPane.showMessageDialog(frame,"YOU HAVE RESERVED");
                            JOptionPane.showMessageDialog(frame,"Thank You! Enjoy The Movie!");
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(frame,"Insuficient Amount!");    
                    }
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Input Some Cash!");
                }                   
            }
            else{
                JOptionPane.showMessageDialog(frame,"No Seats Reserve!");
            }
        }  
    view();
}
   public void Sales(){
       switch(user){
           case "Gen":
               gencust=customer;
               for(int i=0;i<cgen.length;i++){
                   if(cgen[i][0]==null){
                       cgen[i][0]=String.valueOf(gencust);cgen[i][1]=String.valueOf(numres);cgen[i][2]="200";cgen[i][3]=String.valueOf(total);
                       gensales+=parseDouble(cgen[i][3]);valTS1.setText(String.valueOf(gensales));valTS1a.setText(String.valueOf(gensales)); break;}
               }break;
           case "Pams":
               pamcust=customer;
               for(int i=0;i<cpam.length;i++){
                   if(cpam[i][0]==null){
                       cpam[i][0]=String.valueOf(pamcust);cpam[i][1]=String.valueOf(numres);cpam[i][2]="200";cpam[i][3]=String.valueOf(total);
                       pamsales+=parseDouble(cpam[i][3]);valTS2.setText(String.valueOf(pamsales));valTS2a.setText(String.valueOf(pamsales)); break;}
               }break;
           case "Nik":
               nikcust=customer;
               for(int i=0;i<cgen.length;i++){
                   if(cnik[i][0]==null){
                       cnik[i][0]=String.valueOf(nikcust);cnik[i][1]=String.valueOf(numres);cnik[i][2]="200";cnik[i][3]=String.valueOf(total);
                       niksales+=parseDouble(cnik[i][3]);valTS3.setText(String.valueOf(niksales));valTS3a.setText(String.valueOf(niksales)); break;}
               }break;
       }
       allTotal=Double.valueOf(gensales+pamsales+niksales);
       valgt.setText(String.valueOf(allTotal));
   }
   public void lockseat(){
        bS1.setEnabled(false);
        bS2.setEnabled(false);
        bS3.setEnabled(false);
        bS4.setEnabled(false);
        bS5.setEnabled(false);
        bS6.setEnabled(false);
        bS7.setEnabled(false);
        bS8.setEnabled(false);
        bS9.setEnabled(false);
        bS10.setEnabled(false);
        bS11.setEnabled(false);
        bS12.setEnabled(false);
        bS13.setEnabled(false);
        bS14.setEnabled(false);
        bS15.setEnabled(false);
        bS16.setEnabled(false);
        bS17.setEnabled(false);
        bS18.setEnabled(false);
        bS19.setEnabled(false);
        bS20.setEnabled(false);
        bS21.setEnabled(false);
        bS22.setEnabled(false);
        bS23.setEnabled(false);
        bS24.setEnabled(false);
        bS25.setEnabled(false);
        bS26.setEnabled(false);
        bS27.setEnabled(false);
        bS28.setEnabled(false);
        bS29.setEnabled(false);
        bS30.setEnabled(false);
        
    }
   public void seatreset(){
        bNS.setEnabled(false);
        clearview();
        bS1.setEnabled(true);
        bS1.setBackground(Color.GREEN);
        bS2.setEnabled(true);
        bS2.setBackground(Color.GREEN);
        bS3.setEnabled(true);
        bS3.setBackground(Color.GREEN);
        bS4.setEnabled(true);
        bS4.setBackground(Color.GREEN);
        bS5.setEnabled(true);
        bS5.setBackground(Color.GREEN);
        bS6.setEnabled(true);
        bS6.setBackground(Color.GREEN);
        bS7.setEnabled(true);
        bS7.setBackground(Color.GREEN);
        bS8.setEnabled(true);
        bS8.setBackground(Color.GREEN);
        bS9.setEnabled(true);
        bS9.setBackground(Color.GREEN);
        bS10.setEnabled(true);
        bS10.setBackground(Color.GREEN);
        bS11.setEnabled(true);
        bS11.setBackground(Color.GREEN);
        bS12.setEnabled(true);
        bS12.setBackground(Color.GREEN);
        bS13.setEnabled(true);
        bS13.setBackground(Color.GREEN);
        bS14.setEnabled(true);
        bS14.setBackground(Color.GREEN);
        bS15.setEnabled(true);
        bS15.setBackground(Color.GREEN);
        bS16.setEnabled(true);
        bS16.setBackground(Color.GREEN);
        bS17.setEnabled(true);
        bS17.setBackground(Color.GREEN);
        bS18.setEnabled(true);
        bS18.setBackground(Color.GREEN);
        bS19.setEnabled(true);
        bS19.setBackground(Color.GREEN);
        bS20.setEnabled(true);
        bS20.setBackground(Color.GREEN);
        bS21.setEnabled(true);
        bS21.setBackground(Color.GREEN);
        bS22.setEnabled(true);
        bS22.setBackground(Color.GREEN);
        bS23.setEnabled(true);
        bS23.setBackground(Color.GREEN);
        bS24.setEnabled(true);
        bS24.setBackground(Color.GREEN);
        bS25.setEnabled(true);
        bS25.setBackground(Color.GREEN);
        bS26.setEnabled(true);
        bS26.setBackground(Color.GREEN);
        bS27.setEnabled(true);
        bS27.setBackground(Color.GREEN);
        bS28.setEnabled(true);
        bS28.setBackground(Color.GREEN);
        bS29.setEnabled(true);
        bS29.setBackground(Color.GREEN);
        bS30.setEnabled(true);
        bS30.setBackground(Color.GREEN);
        b1="available";
        b2="available";
        b3="available";
        b4="available";
        b5="available";
        b6="available";
        b7="available";
        b8="available";
        b9="available";
        b10="available";
        b11="availale";
        b12="available";
        b13="available";
        b14="available";
        b15="available";
        b16="available";
        b17="available";
        b18="available";
        b19="available";
        b20="available";
        b21="available";
        b22="available";
        b23="available";
        b24="available";
        b25="available";
        b26="available";
        b27="available";
        b28="available";
        b29="available";
        b30="available";
        bc1="green";
        bc2="green";
        bc3="green";
        bc4="green";
        bc5="green";
        bc6="green";
        bc7="green";
        bc8="green";
        bc9="green";
        bc10="green";
        bc11="green";
        bc12="green";
        bc13="green";
        bc14="green";
        bc15="green";
        bc16="green";
        bc17="green";
        bc18="green";
        bc19="green";
        bc20="green";
        bc21="green";
        bc22="green";
        bc23="green";
        bc24="green";
        bc25="green";
        bc26="green";
        bc27="green";
        bc28="green";
        bc29="green";
        bc30="green";
    }
   public void seatres(){
        bS1.setEnabled(true);
        bS2.setEnabled(true);
        bS3.setEnabled(true);
        bS4.setEnabled(true);
        bS5.setEnabled(true);
        bS5.setEnabled(true);
        bS6.setEnabled(true);
        bS7.setEnabled(true);
        bS8.setEnabled(true);
        bS9.setEnabled(true);
        bS10.setEnabled(true);
        bS11.setEnabled(true);
        bS12.setEnabled(true);
        bS13.setEnabled(true);
        bS14.setEnabled(true);
        bS15.setEnabled(true);
        bS15.setEnabled(true);
        bS16.setEnabled(true);
        bS17.setEnabled(true);
        bS18.setEnabled(true);
        bS19.setEnabled(true);
        bS20.setEnabled(true);
        bS21.setEnabled(true);
        bS22.setEnabled(true);
        bS23.setEnabled(true);
        bS24.setEnabled(true);
        bS25.setEnabled(true);
        bS25.setEnabled(true);
        bS26.setEnabled(true);
        bS27.setEnabled(true);
        bS28.setEnabled(true);
        bS29.setEnabled(true);
        bS30.setEnabled(true);
        
        if(b1!="available"){
            bS1.setEnabled(false);
        }
        if(b2!="available"){
            bS2.setEnabled(false);
        }
        if(b3!="available"){
            bS3.setEnabled(false);
        }
        if(b4!="available"){
            bS4.setEnabled(false);
        }
        if(b5!="available"){
            bS5.setEnabled(false);
        }
        if(b6!="available"){
            bS6.setEnabled(false);
        }
        if(b7!="available"){
            bS7.setEnabled(false);
        }
        if(b8!="available"){
            bS8.setEnabled(false);
        }
        if(b9!="available"){
            bS9.setEnabled(false);
        }
        if(b10!="available"){
            bS10.setEnabled(false);
        } 
        if(b11!="available"){
            bS11.setEnabled(false);
        }
        if(b12!="available"){
            bS12.setEnabled(false);
        }
        if(b13!="available"){
            bS13.setEnabled(false);
        }
        if(b14!="available"){
            bS14.setEnabled(false);
        }
        if(b15!="available"){
            bS15.setEnabled(false);
        }
        if(b16!="available"){
            bS16.setEnabled(false);
        }
        if(b17!="available"){
            bS17.setEnabled(false);
        }
        if(b18!="available"){
            bS18.setEnabled(false);
        }
        if(b19!="available"){
            bS19.setEnabled(false);
        }
        if(b20!="available"){
            bS20.setEnabled(false);
        }        
         if(b21!="available"){
            bS21.setEnabled(false);
        }
        if(b22!="available"){
            bS22.setEnabled(false);
        }
        if(b23!="available"){
            bS23.setEnabled(false);
        }
        if(b24!="available"){
            bS24.setEnabled(false);
        }
        if(b25!="available"){
            bS25.setEnabled(false);
        }
        if(b26!="available"){
            bS26.setEnabled(false);
        }
        if(b27!="available"){
            bS27.setEnabled(false);
        }
        if(b28!="available"){
            bS28.setEnabled(false);
        }
        if(b29!="available"){
            bS29.setEnabled(false);
        }
        if(b30!="available"){
            bS30.setEnabled(false);
        }
        
        bN.setEnabled(false);
        bNS.setEnabled(true);
        
    }
   //clear subtotal view
   public void clearview(){
          for(int i=0;i<seats.length;i++){
                    seats[i]="";
                    }
        }
   //view subtotal
   public void view(){
        txtDisplay.setText("Customer "+customer+" Reserved  \tSubtotal");numres=0;
        for(int i=0;i<seats.length;i++){
                if(seats[i]!=""){
                    txtDisplay.append("\nSeat "+seats[i]+"    \t \t " + cost);
                    numres+=1;
                }
            }
    }
   public void setup(){
       switch(user){
           case "Gen":customer=gencust;break;
           case "Pams":customer=pamcust;break;
           case "Nik":customer=nikcust;break;
       }
   }
   public boolean actionlogin(String name,String password){
        for(int i=0;i<users.length;i++){
            if(name.equals(users[i][0]) && password.equals(users[i][1])){
               return true;             
            }
        }
        return false;
    }
   
    public static void main(String []args){
           new SeatReservation();
    }
}