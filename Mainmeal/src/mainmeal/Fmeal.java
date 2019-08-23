
package mainmeal;

public class Fmeal {
    private Weight W = new Weight();
    private Hieght H = new Hieght();
    private int pos = 0;
    private final String WieghtGain ="Breakfast:"
            + "\n\t1 ½ cup rice or veggies \n\t 2 palm size fish or chicken"
            + "\nSnack at 9am"
            + "\n\t1 banana or apple \n\t 1 glass of water"
            + "\nLunch:"
            + "\n\t1 ½ cup rice or veggies \n\t2 palm size fish or chicken"
            + "\nSnack at 3pm"
            + "\n\t1 banana or apple \n\t1 glass of water"
            + "\nDinner:"
            + "\n\t1 ½ cup rice or veggies \n\t2 palm size fish or chicken";
    private final String WieghtLoss ="Breakfast:"
            + "\n\t1 cup rice or veggies \n\t1 palm size fish or chicken"
            + "\nLunch:"
            + "\n\t1 cup rice or veggies \n\t1 palm size fish or chicken"
            + "\nDinner:"
            + "\n\t½ cup rice or veggies \n\t1 palm size fish or chicken";
    Fmeal(){}
    public int getpos(){return pos;};
    String getWieghtGain(){
        return WieghtGain;
    }
    String getWieghtLoss(){
        return WieghtLoss;
    }
    public String getIdealWeight(String gender){
        if(gender == "Male"){
            return W.getM_W()[pos];
        }
        else if(gender == "Female"){
            return W.getM_W()[pos];
        }
        return "Error!";
    }
    String getGainOrLoss(String height,int weight,String gender){
        if(gender=="Male"){
            for(int i=0;i<W.getM_W1().length;i++){
                if(height.equals(H.getM_H()[i]) && W.getM_W1()[i][0] < weight && weight < W.getM_W1()[i][1] || W.getM_W1()[i][0] == weight || W.getM_W1()[i][1] == weight){
                    pos = 16;return "No Meal Recommendation.\nYour Weight is Normal with your Height";
                }
                if(height.equals(H.getM_H()[i])  && W.getM_W1()[i][1] < weight){
                    pos = i;return getWieghtLoss();
                }
                if(height.equals(H.getM_H()[i])  && weight < W.getM_W1()[i][0]){
                    pos = i;return getWieghtGain();
                }
            }
        }
        else if(gender=="Female"){
            for(int i=0;i<W.getF_W1().length;i++){
                if(height.equals(H.getF_H()[i]) && W.getF_W1()[i][0] < weight && weight < W.getF_W1()[i][1] || W.getF_W1()[i][0] == weight || W.getF_W1()[i][1] == weight){
                    pos = 16;return "No Meal Recommendation.\nYour Weight is Normal with your Height";
                }
                if(height.equals(H.getF_H()[i]) && W.getF_W1()[i][1] < weight){
                    pos = i;return getWieghtLoss();
                }
                if(height.equals(H.getF_H()[i]) && weight < W.getF_W1()[i][0]){
                    pos = i;return getWieghtGain();
                }
            }
        }
        return "Error!";
    }
}