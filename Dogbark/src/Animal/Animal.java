/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author ianrey258
 */
public class Animal{
    private String Color = null;
    private String Habitat = null;
    private Double Weight = 0.00;
    //Constructors
    Animal(){}
    Animal(String color){
        Color = color;
    }
    Animal(String color,String habitat){
        Color = color;Habitat = habitat;
    }
    Animal(String color,String habitat,Double weight){
        Color = color;Habitat = habitat;Weight = weight;
    }
    //Mutators and Accessors
    void setColor(String color){Color = color;}
    void setHabitat(String habitat){Habitat = habitat;}
    void setWeight(Double weight){Weight = weight;}
    String getColor(){return Color;}
    String getHabitat(){return Habitat;}
    Double getWeight(){return Weight;}
    //Methods
    void viewInfo(){
        System.out.println("Color "+Color);
        System.out.println("Habitat "+Habitat);
        System.out.println("Weight "+Weight);
    }
    Double Eat(){return Weight+=1;}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Animal anim = new Animal();
        Animal dog = new Dog();
        anim.Eat();
        anim.viewInfo();
        System.out.println();
        dog.Eat();
        dog.viewInfo();
    }
    
}

