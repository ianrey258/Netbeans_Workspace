/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincar;

/**
 *
 * @author ianrey258
 */
public class Carsort{
    private String tempcars [][] = new String[10][3];
    String tempname = "";String tempspeed = "";String tempdistance = "";
    Carsort(){}
    public String [][] getcars(){return tempcars;}
    public void sortbyName(String [][] cars){
        tempcars = cars;
        for(int i=0;i<tempcars.length;i++){
            for(int j=1;i<tempcars.length-i;j++){  
                if(tempcars[j-1][0]!=null && tempcars[j][0]!=null){
                    if(tempcars[j][0].charAt(0)<tempcars[j-1][0].charAt(0)){
                        tempname = tempcars[j][0];tempspeed = tempcars[j][1];tempdistance = tempcars[j][2];
                        tempcars[j][0] = tempcars[j-1][0];tempcars[j][1] = tempcars[j-1][1];tempcars[j][2] = tempcars[j-1][2];
                        tempcars[j-1][0] = tempname;tempcars[j-1][1] = tempspeed;tempcars[j-1][2] = tempdistance;
                    }
                }
                else{
                    break;
                }
            }
        }    
    }
    public void sortbySpeed(String [][] cars){
        tempcars = cars;
        for(int i=0;i<tempcars.length;i++){
            for(int j=1;i<tempcars.length-i;j++){
                if(tempcars[j-1][0]!=null && tempcars[j][0]!=null){
                    if(Integer.parseInt(tempcars[j][1])>Integer.parseInt(tempcars[j-1][1])){
                        tempname = tempcars[j][0];tempspeed = tempcars[j][1];tempdistance = tempcars[j][2];
                        tempcars[j][0] = tempcars[j-1][0];tempcars[j][1] = tempcars[j-1][1];tempcars[j][2] = tempcars[j-1][2];
                        tempcars[j-1][0] = tempname;tempcars[j-1][1] = tempspeed;tempcars[j-1][2] = tempdistance;
                    }
                }
                else{
                    break;
                }
            }
        }
    }
//    public void display(){
//        for(int i=0;i<super.getCars().length;i++){
//            System.out.println();
//            for(int j=0;j<super.getCars()[i].length;j++){
//                System.out.print(tempcars[i][j]);
//            }
//        }
//    }
}
