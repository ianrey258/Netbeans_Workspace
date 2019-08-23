/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmeal;

/**
 *
 * @author ianrey258
 */
public class Hieght {
    private String dM_H = "";
    private String dF_H = "";
    private final String M_H [] ={"5'2","5'3","5'4","5'5","5'6",
                                    "5'7","5'8","5'9","5'10","5'11",
                                    "6'0","6'1","6'2","6'3","6'4"};
    private final String F_H [] ={"4'11","5'0","5'1","5'2","5'3",
                                    "5'4","5'5","5'6","5'7","5'8",
                                    "5'9","5'10","5'11","6'0","6'1"};
    Hieght(){}
    public String [] getM_H(){return M_H;};
    public String [] getF_H(){return F_H;};
    public String getdM_H(){
        for(int i=0;i<M_H.length;i++){
            dM_H += M_H[i]+"\n";
        }
        return dM_H;
    }
    public String getdF_H(){
        for(int i=0;i<F_H.length;i++){
            dF_H += F_H[i]+"\n";
        }
        return dF_H;
    }
}
