package student_info_id;

public class Data_Controller {
    
    private String [][] data = new String[100][8];
    
    Data_Controller(){}
    
    public void setData(String idnum,String fname,String mname,String lname,String gender,String age,String course, String address,int type){
        if(type == 0){
            int pos = searchnull();
            data[pos][0]=idnum;data[pos][1]=fname.toUpperCase();data[pos][2]=mname.toUpperCase();data[pos][3]=lname.toUpperCase();data[pos][4]=gender.toUpperCase();
            data[pos][5]=age;data[pos][6]=course.toUpperCase();data[pos][7]=address;
        }
        else if(type == 1){
            int pos = searchlike(idnum);
            data[pos][0]=idnum;data[pos][1]=fname;data[pos][2]=mname;data[pos][3]=lname;data[pos][4]=gender;
            data[pos][5]=age;data[pos][6]=course;data[pos][7]=address;
        } 
    }
    
    public String getData(int i,int j){
        return data[i][j];
    }
    
    public int searchnull(){
        int pos=1;
        for(int i=1;i<data.length;i++){
            if(data[i][0]==null){
                pos = i;break;
            }
        }
        return pos;
    }
    
    public int searchlike(String idnum){
        int pos=0;
        for(int i=1;i<data.length;i++){
            if(idnum.equals(data[i][0])){
                pos=i;
            }
        }
        return pos;
    }
}
