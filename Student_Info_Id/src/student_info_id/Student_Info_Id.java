
package student_info_id;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Student_Info_Id extends JFrame implements ActionListener{
    public Data_Controller data = new Data_Controller();
    
    int savetype=0;
    JFrame main,Search;
    JTextField tfname,tmname,tlname,tage,tgender,tcourse,tidnum,tsearch,tsearchbar;
    JLabel header,lfname,lmname,llname,lage,lgender,lcourse,lidnum,laddress,lsearch,
            lsfname,lsmname,lslname,lsage,lsgender,lscourse,lsidnum,lsaddress,lsidsearch,
            lsfname1,lsmname1,lslname1,lsage1,lsgender1,lscourse1,lsidnum1;
    JButton save,search,cancel,edit,search1,cancel1;
    JTextArea info,taddress,tsaddress;
    Font fontlabel,fontitle;
    
    public Student_Info_Id(){
        
        //init Components
        header = new JLabel("Student \n Information");
        lfname = new JLabel("FristName:");tfname = new JTextField();
        lmname = new JLabel("MiddleName:");tmname = new JTextField();
        llname = new JLabel("LastName:");tlname = new JTextField();
        lage = new JLabel("Age:");tage = new JTextField();
        lgender = new JLabel("Gender:");tgender = new JTextField();
        lcourse = new JLabel("Course:");tcourse = new JTextField();
        lidnum = new JLabel("Id Number:");tidnum = new JTextField();
        lsearch = new JLabel("ID Number:");tsearch = new JTextField();
        laddress = new JLabel("Address:");taddress = new JTextArea();
        fontlabel = new Font("Arial",Font.BOLD,15);
        fontitle = new Font("Arial",Font.BOLD,30);
        
        lsidsearch = new JLabel("ID No.");tsearchbar = new JTextField();
        lsfname = new JLabel("FristName:");lsfname1 = new JLabel();
        lsmname = new JLabel("MiddleName:");lsmname1 = new JLabel();
        lslname = new JLabel("LastName:");lslname1 = new JLabel();
        lsage = new JLabel("Age:");lsage1 = new JLabel();
        lsgender = new JLabel("Gender:");lsgender1 = new JLabel();
        lscourse = new JLabel("Course:");lscourse1 = new JLabel();
        lsidnum = new JLabel("Id Number:");lsidnum1 = new JLabel();
        lsaddress = new JLabel("Address:");tsaddress = new JTextArea();
                
        save = new JButton("Save");
        cancel = new JButton("Cancel");
        cancel1 = new JButton("Cancel");
        search = new JButton("Search");
        search1 = new JButton("Search");
        edit = new JButton("Edit");
        
        
        //set Components
        header.setBounds(45, 10, 400, 50);
        lidnum.setBounds(20,60,100,50);tidnum.setBounds(120,70,230,25);
        lfname.setBounds(20,90,100,50);tfname.setBounds(120,100,230,25);
        lmname.setBounds(20,120,100,50);tmname.setBounds(120,130,230,25);
        llname.setBounds(20,150,100,50);tlname.setBounds(120,160,230,25);
        lgender.setBounds(20,180,100,50);tgender.setBounds(120,190,230,25);
        lage.setBounds(20,210,100,50);tage.setBounds(120,220,230,25);
        lcourse.setBounds(20,240,100,50);tcourse.setBounds(120,250,230,25);
        laddress.setBounds(20,270,100,50);taddress.setBounds(120,280,230,60);
        save.setBounds(50, 360, 100, 35);cancel.setBounds(250, 360, 100, 35);
        search.setBounds(140, 420, 120, 35);
        
        tsearchbar.setBounds(5, 20, 200, 25);search1.setBounds(210, 20, 80, 25);
        lsidsearch.setBounds(5, 0, 200, 25);
        lsidnum.setBounds(10,60,100,50);lsidnum1.setBounds(120,75,230,25);
        lsfname.setBounds(10,75,100,50);lsfname1.setBounds(120,90,230,25);
        lsmname.setBounds(10,90,100,50);lsmname1.setBounds(120,105,230,25);
        lslname.setBounds(10,105,100,50);lslname1.setBounds(120,120,230,25);
        lsgender.setBounds(10,120,100,50);lsgender1.setBounds(120,135,230,25);
        lsage.setBounds(10,135,100,50);lsage1.setBounds(120,150,230,25);
        lscourse.setBounds(10,150,100,50);lscourse1.setBounds(120,165,230,25);
        lsaddress.setBounds(10,165,100,50);tsaddress.setBounds(120,185,150,50);
        tsaddress.setEditable(false);
        edit.setBounds(100, 240, 80, 25);cancel1.setBounds(210, 50, 80, 25);
        
        header.setFont(fontitle);
        lfname.setFont(fontlabel);
        lmname.setFont(fontlabel);
        llname.setFont(fontlabel);
        lage.setFont(fontlabel);
        lgender.setFont(fontlabel);
        lcourse.setFont(fontlabel);
        lidnum.setFont(fontlabel);
        laddress.setFont(fontlabel);
        
        //declaring main
        main = new JFrame();
        main.setTitle("Student Information");
        main.setSize(400,500);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        main.setLayout(null);
        main.setResizable(false);
        
        //adding Components to main
        main.add(header);
        main.add(lfname);main.add(tfname);
        main.add(lmname);main.add(tmname);
        main.add(llname);main.add(tlname);
        main.add(lage);main.add(tage);
        main.add(lgender);main.add(tgender);
        main.add(lcourse);main.add(tcourse);
        main.add(lidnum);main.add(tidnum);
        main.add(laddress);main.add(taddress);
        main.add(save);
        main.add(search);
        main.add(cancel);
        
        Search = new JFrame();
        Search.setTitle("Student Information");
        Search.setDefaultCloseOperation(1);
        Search.setSize(300,300);
        Search.setVisible(false);
        Search.setLocationRelativeTo(null);
        Search.setLayout(null);
        Search.setResizable(false);
        
        Search.add(tsearchbar);Search.add(search1);
        Search.add(lsidsearch);
        Search.add(lsidnum);Search.add(lsidnum1);
        Search.add(lsfname);Search.add(lsfname1);
        Search.add(lsmname);Search.add(lsmname1);
        Search.add(lslname);Search.add(lslname1);
        Search.add(lsage);Search.add(lsage1);
        Search.add(lsgender);Search.add(lsgender1);
        Search.add(lscourse);Search.add(lscourse1);
        Search.add(lsaddress);Search.add(tsaddress);
        Search.add(edit);Search.add(cancel1);
        
        save.addActionListener(this);
        cancel.addActionListener(this);
        cancel1.addActionListener(this);
        edit.addActionListener(this);
        search.addActionListener(this);
        search1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == save){
            int pos = data.searchlike(tidnum.getText());
            if (pos==0 && tidnum.getText().isEmpty()==false){
                data.setData(tidnum.getText(), tfname.getText(), tmname.getText(), tlname.getText(), tgender.getText(), tage.getText(), tcourse.getText(), taddress.getText(), savetype);
                anim();
                JOptionPane.showMessageDialog(rootPane, "Successfully Save!");
                clear();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Id No. Error!");
            }
        }
        if(e.getSource() == cancel){
            clear();
        }
        if(e.getSource() == cancel1){
            Search.setVisible(false);
        }
        if(e.getSource() == search){
            Search.setVisible(true);
        }
        if(e.getSource() == search1){
            int pos = data.searchlike(tsearchbar.getText());
            lsidnum1.setText(data.getData(pos, 0));lsfname1.setText(data.getData(pos, 1));
            lsmname1.setText(data.getData(pos, 2));lslname1.setText(data.getData(pos, 3));
            lsgender1.setText(data.getData(pos, 4));lsage1.setText(data.getData(pos, 5));
            lscourse1.setText(data.getData(pos, 6));tsaddress.setText(data.getData(pos, 7));
            if(pos==0){
                JOptionPane.showMessageDialog(rootPane, "No Data Retrieve!");
            
            }
        }
        if(e.getSource() == edit){
            int pos = data.searchlike(lsidnum1.getText());tidnum.setEditable(false);savetype=1;
            tidnum.setText(data.getData(pos, 0));tfname.setText(data.getData(pos, 1));
            tmname.setText(data.getData(pos, 2));tlname.setText(data.getData(pos, 3));
            tgender.setText(data.getData(pos, 4));tage.setText(data.getData(pos, 5));
            tcourse.setText(data.getData(pos, 6));taddress.setText(data.getData(pos, 7));
        }
        
    }

    void clear(){
        savetype=0;
        tidnum.setText("");tfname.setText("");tmname.setText("");tlname.setText("");tgender.setText("");
        tage.setText("");tcourse.setText("");taddress.setText("");
        tidnum.setEditable(true);tfname.setEditable(true);tmname.setEditable(true);
        tlname.setEditable(true);tgender.setEditable(true);tage.setEditable(true);
        tcourse.setEditable(true);taddress.setEditable(true);
    }
    
    void anim(){
        tidnum.setEditable(false);tfname.setEditable(false);tmname.setEditable(false);
        tlname.setEditable(false);tgender.setEditable(false);tage.setEditable(false);
        tcourse.setEditable(false);taddress.setEditable(false);
    }
    
    public static void main(String[] args){
        new Student_Info_Id();
    }
    
}
