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
public class Dog extends Animal{
    
    private String Breed = null; 
    
    Dog(){super();}
    Dog(String breed){super();Breed = breed;}
    
    void viewInfo(){
        super.viewInfo();
        System.out.println("Breed "+Breed);
    }
    Double Eat(){super.setWeight(2.00);return super.getWeight();}
    void Bark(){System.out.println("The Dog is Barking!!");}
}
