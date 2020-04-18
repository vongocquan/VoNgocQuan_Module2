package AdvancedObjectOrientedDesign.LopAniMalVaInterface;

import AdvancedObjectOrientedDesign.LopAniMalVaInterface.Animal.Animal;
import AdvancedObjectOrientedDesign.LopAniMalVaInterface.Animal.Chicken;
import AdvancedObjectOrientedDesign.LopAniMalVaInterface.Animal.Tiger;
import AdvancedObjectOrientedDesign.LopAniMalVaInterface.Edible.Edible;
import AdvancedObjectOrientedDesign.LopAniMalVaInterface.Fruit.Apple;
import AdvancedObjectOrientedDesign.LopAniMalVaInterface.Fruit.Fruit;
import AdvancedObjectOrientedDesign.LopAniMalVaInterface.Fruit.Orange;

public class Object {
    public static void main(String[] args) {
        Animal[] animal =new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        System.out.println(animal[0].makeSound());
        System.out.println(animal[1].makeSound());
        Edible edible = (Chicken) animal[0];
        System.out.println(edible.howToEat());
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        System.out.println(fruits[0].howToEat());
        System.out.println(fruits[1].howToEat());

    }
}
