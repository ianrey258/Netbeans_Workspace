
package maincar;

public class Carlist {
    private String carThead [] = {"Name","Speed","Distance"};
    private String cars [][] = new String[10][3];
    private int numcars;
    private boolean sortbyname = false;
    
    
    Carlist(){}
    public String [] getCarThead(){return carThead;}
    public String [][] getCars(){return cars;}
    public boolean getsortbyname(){return sortbyname;}
    public void setsortCars(String [][] sortcars){cars=sortcars;}
    public void setsortbyname(boolean sbn){sortbyname = sbn;};
    public int countcars(){return numcars;};
    public void setCar(String name,String speed,String distance){
        for(int i=0;i<cars.length;i++){
            if(cars[i][0]==null){
                cars[i][0] =  name;cars[i][1] =  speed;cars[i][2] =  distance;
                numcars = i+1;
                break;
            }
        }
    }
    
    public int maxSpeed(){
        int tmp = 0;
        for(int i = 1;i<cars.length;i++){
            if(cars[i][1] != null){
                if(Integer.parseInt(cars[i-1][1])<Integer.parseInt(cars[i][1])){
                  tmp = i;  
                }
            }
            else{
                break;
            }
        }
        return tmp;
    }
}
