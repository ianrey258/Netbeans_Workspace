package mainmeal;

import javax.swing.*;
import java.awt.event.*;

public class Mainmeal extends JFrame implements ActionListener,KeyListener{

    public static void main(String[] args) {
        Fmeal Mdata = new Fmeal();
        Hieght H = new Hieght();
        Weight W = new Weight();
        
        String [] Scale = {"Height","Weight"};
        String [] Gender = {"Male","Female"};
        JTextField txtW, txtH;
        JLabel lblweight, lblAge,lblE,lblmale,lblfemale,lblgender,lblgender1,MH,MP,FH,FP,lblideal;
        JFrame frame;
        JButton bent, bres;
        JTextArea display,MchartH,MchartW,FchartH,FchartW;
        JComboBox dd;
        
       
        MchartH = new JTextArea(H.getdM_H());
        MchartW = new JTextArea(W.getdM_W());
        FchartH = new JTextArea(H.getdF_H());
        FchartW = new JTextArea(W.getdF_W());
        dd = new JComboBox(Gender);
        MH = new JLabel(Scale[0]);
        FH = new JLabel(Scale[0]);
        MP = new JLabel(Scale[1]);
        FP = new JLabel(Scale[1]);
        lblgender = new JLabel("Gender");
        lblgender = new JLabel("Gender:");
        lblmale = new JLabel(Gender[0]);
        lblfemale = new JLabel(Gender[1]);
        lblideal = new JLabel();
    	lblweight = new JLabel("Enter Weight in Lbs:");
    	lblAge = new JLabel("Enter Height in Ft:");
    	lblE = new JLabel("");
    	txtW = new JTextField();
    	txtH = new JTextField();
    	display = new JTextArea();
    	bent = new JButton("Enter");
    	bres = new JButton("Reset");
        frame = new JFrame();
    	       
    	frame.setSize(800,500);
        frame.setVisible(true);
        frame.setTitle("Meal Plan by: Pams");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(MH);
        MH.setBounds(380,35,100,25);
        frame.add(MP);
        MP.setBounds(455,35,100,25);
        frame.add(lblmale);
        lblmale.setBounds(440,320,100,25);
        frame.add(MchartH);
        MchartH.setBounds(390, 60, 25, 240);
        MchartH.setEditable(false);
        frame.add(MchartW);
        MchartW.setBounds(450, 60, 50, 240);
        MchartW.setEditable(false);
        
        frame.add(FH);
        FH.setBounds(600,35,100,25);
        frame.add(FP);
        FP.setBounds(675,35,100,25);
        frame.add(lblfemale);
        lblfemale.setBounds(660,320,100,25);
        frame.add(FchartH);
        FchartH.setBounds(610, 60, 25, 240);
        FchartH.setEditable(false);
        frame.add(FchartW);
        FchartW.setBounds(670, 60, 50, 240);
        FchartW.setEditable(false);
        
        frame.add(lblideal);
        lblideal.setBounds(380, 380, 350, 20);
        
        frame.add(dd);
        dd.setBounds(190, 320, 120, 25);
        
        frame.add(lblgender);
        lblgender.setBounds(70, 320, 180, 30);
        
        frame.add(lblAge);
        lblAge.setBounds(70,350,180,30);
        
        frame.add(lblweight);
        lblweight.setBounds(70,380,180,30);
        
        frame.add(txtH);
   	txtH.setBounds(190,350,120,25);
        
   	 	
   	frame.add(txtW);
   	txtW.setBounds(190,380,120,25);
        
        frame.add(display);
        display.setBounds(50,20,300, 280);
        display.setEditable(false);
        
        
        frame.add(bent);
        bent.setBounds(200,430,80,30);
        
        frame.add(bres);
        bres.setBounds(100,430,80,30);
        
        frame.add(lblE);
        lblE.setBounds(0,0,500,500);
        
        bent.addActionListener(new ActionListener(){@Override
        public void actionPerformed(ActionEvent e){
            if(txtW.getText().isEmpty() != true){
                String result = Mdata.getGainOrLoss(txtH.getText(),Integer.parseInt(txtW.getText()), dd.getSelectedItem().toString());
                if(result != "Error!"){
                    lblideal.setText("");
                    display.setText(result);
                    String result1 = "";
                    if(result == Mdata.getWieghtGain()){
                        result1 = "You Lack Nutrients";
                    }
                    else{
                        result1 = "You Gain More Weight";
                    }
                     
                    if(dd.getSelectedItem().toString()=="Male" && Mdata.getpos()!=16){
                        lblideal.setText("Sir! "+result1+" You're Ideal Weight is "+Mdata.getIdealWeight(dd.getSelectedItem().toString()));
                    }
                    else if(dd.getSelectedItem().toString()=="Female" && Mdata.getpos()!=16){
                        lblideal.setText("Maam! "+result1+" You're Ideal Weight is "+Mdata.getIdealWeight(dd.getSelectedItem().toString()));
                    }
                }
                else{
                    JOptionPane.showMessageDialog(frame, "You Input Wrong Height or Weight");
                    txtH.setText("");txtW.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(frame, "You Input Wrong Height or Weight");
                txtH.setText("");txtW.setText("");
            }
        }});
        
        bres.addActionListener(new ActionListener(){@Override
        public void actionPerformed(ActionEvent e){
            display.setText("");txtH.setText("");
            lblideal.setText("");txtW.setText("");
        }});
        
//        txtW.addKeyListener(new KeyListener(){@Override
//            public void keyTyped(KeyEvent e) {
//            if(e.getSource() == txtW){
//                if(!(Character.isDigit(e.getKeyChar())) || e.getKeyChar()== KeyEvent.VK_BACK_SPACE){
//                    e.consume();
//                    }
//                }
//            }
//            @Override
//            public void keyPressed(KeyEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//
//            
//        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
