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
public class Weight {
    private String dM_W = "";
    private String dF_W = "";
    private final String M_W [] ={"115-121","120-129","125-137","130-145","135-153",
                                    "140-161","145-169","150-177","155-185","160-193",
                                    "165-201","170-209","175-217","180-225","185-233"};
    private final String F_W [] ={"93-100","98-102","103-106","106-112","109-118",
                                    "112-124","115-130","118-136","121-142","124-148",
                                    "127-153","130-158","133-163","136-168","139-173"};
    private final int M_W1 [][] ={{115,121},{120,129},{125,137},{130,145},{135,153},
                                {140,161},{145,169},{150,177},{155,185},{160,193},
                                {165,201},{170,209},{175,217},{180,225},{185,233}};
    private final int F_W1 [][] ={{93,100},{98,102},{103,106},{106,112},{109,118},
                                {112,124},{115,130},{118,136},{121,142},{124,148},
                                {127,153},{130,158},{133,163},{136,168},{139,173}};
    Weight(){}
    public String[] getM_W(){
        return M_W;
    }
    public String[] getF_W(){
        return F_W;
    }
    public String getdM_W(){
        for(int i=0;i<M_W.length;i++){
            dM_W += M_W[i]+"\n";
        }
        return dM_W;
    }
    public String getdF_W(){
        for(int i=0;i<F_W.length;i++){
            dF_W += F_W[i]+"\n";
        }
        return dF_W;
    }
    public int [][] getM_W1(){return M_W1;}
    public int [][] getF_W1(){return F_W1;}
}
