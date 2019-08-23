/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookreservation;

public class Confirmation {
          int  idx = 0;   
          String [][] admin = {
          {"Jemar","123"},{"Eric","456"},{"Patrick","789"}
        };
    public boolean Login(String user){
    	for(int i=0;i<admin.length;i++){
			if(user.equals(admin[i][0])){
				idx = i;
			}
		}
		    if(user.equals(admin[idx][0])){
			    return true;
				
			}
			else{
				return false;
			}
}
   public boolean cpass(String password){
   	if(password.equals(admin[idx][1])){
   		return true;
   	}
   	else{
   		return false;
   	}
   }
  }

