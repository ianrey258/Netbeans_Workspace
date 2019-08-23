
package maincar;

import java.awt.event.*;
import javax.swing.*;

public class MainCar extends JFrame implements ActionListener{
    
    public static void main(String[] args) {
        Carlist car = new Carlist();// class instanciation
        Carsort sort = new Carsort();
        
        JFrame main = new JFrame();
        JFrame carlist = new JFrame();
        JFrame carinfo = new JFrame();
        
        JLabel lname = new JLabel("Name:");JLabel lspeed = new JLabel("Speed:");JLabel lsort = new JLabel("Sort");
        JLabel ldistance = new JLabel("Distance:");JLabel lkm = new JLabel("per Km");
        JLabel lname1 = new JLabel("Name");JLabel lspeed1 = new JLabel("Speed");JLabel ldistance1 = new JLabel("Distance");
        JTextField tname = new JTextField();JTextField tspeed = new JTextField();JTextField tdistance = new JTextField();
        JButton bcreate = new JButton("Create");JButton binfo = new JButton("Info");JButton bcarlist = new JButton("Car List");
        JButton bsort = new JButton("Sort");JButton bnumcar = new JButton("Total Cars");
        JTable tcars = new JTable(car.getCars(),car.getCarThead());
        
        main.setSize(300,250);
        main.setVisible(true);
        main.setTitle("Car");
        main.setLayout(null);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(main.EXIT_ON_CLOSE);
        
        lname.setBounds(20,15,50,20);tname.setBounds(80,15,180,20);
        main.add(lname);main.add(tname);
        lspeed.setBounds(20,40,50,20);tspeed.setBounds(80,40,120,20);
        main.add(lspeed);main.add(tspeed);
        ldistance.setBounds(20,65,100,20);tdistance.setBounds(80,65,120,20);//lkm.setBounds(200,65,50,20);
        main.add(ldistance);main.add(tdistance);main.add(lkm);
        bcreate.setBounds(95,100,100,30);main.add(bcreate);
        binfo.setBounds(10,150,100,30);main.add(binfo);
        bcarlist.setBounds(180,150,100,30);main.add(bcarlist);
                
        carlist.setSize(250,300);
        carlist.setVisible(false);
        carlist.setTitle("CarList");
        carlist.setLayout(null);
        carlist.setResizable(false);
        carlist.setLocationRelativeTo(null);
        
        lname1.setBounds(35,13,100,20);carlist.add(lname1);
        lspeed1.setBounds(100,13,100,20);carlist.add(lspeed1);
        ldistance1.setBounds(160,13,100,20);carlist.add(ldistance1);
        tcars.setBounds(20, 30, 200, 160);carlist.add(tcars);tcars.enable(false);
        bsort.setBounds(10,210,100,30);carlist.add(bsort);
        bnumcar.setBounds(130,210,100,30);carlist.add(bnumcar);

        
        bcreate.addActionListener(new ActionListener(){@Override
        public void actionPerformed(ActionEvent e){
            if(tname.getText().isEmpty() == false && tspeed.getText().isEmpty() == false && tdistance.getText().isEmpty() == false){
                car.setCar(tname.getText(), tspeed.getText(), tdistance.getText());
                tname.setText("");tspeed.setText("");tdistance.setText("");
            }
            else if(tname.getText().isEmpty() || tspeed.getText().isEmpty() || tdistance.getText().isEmpty()){
                JOptionPane.showMessageDialog(main,"Error Input!");
            }
                else{
                JOptionPane.showMessageDialog(main,"Error Input!");
            }
        }});
        binfo.addActionListener(new ActionListener(){@Override
        public void actionPerformed(ActionEvent e){
            if(car.countcars()!=0){
                JOptionPane.showMessageDialog(main,"The Fastest car is "+car.getCars()[car.maxSpeed()][0]+" with the speed of "+car.getCars()[car.maxSpeed()][1]);
            }
                else{
                JOptionPane.showMessageDialog(main,"No Record yet!");
            }    
        }});
        bcarlist.addActionListener(new ActionListener(){@Override
        public void actionPerformed(ActionEvent e){
            carlist.setVisible(true);
        }});
        bsort.addActionListener(new ActionListener(){@Override
        public void actionPerformed(ActionEvent e){
            if(car.getCars()[0][0]!=null){
                if(car.getsortbyname()==false){sort.sortbyName(car.getCars());car.setsortbyname(true);}
                else{sort.sortbySpeed(car.getCars());car.setsortbyname(false);}
                car.setsortCars(sort.getcars());
            }
            tcars.updateUI();
        }});
        bnumcar.addActionListener(new ActionListener(){@Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(main,car.countcars()+" No. of Cars");
        }});
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
