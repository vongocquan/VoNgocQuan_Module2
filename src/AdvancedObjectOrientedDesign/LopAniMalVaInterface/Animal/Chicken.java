package AdvancedObjectOrientedDesign.LopAniMalVaInterface.Animal;

import AdvancedObjectOrientedDesign.LopAniMalVaInterface.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
