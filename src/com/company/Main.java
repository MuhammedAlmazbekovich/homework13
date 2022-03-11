package com.company;

public class Main {

    public static void main(String[] args) {
    Fish fish = new Fish();  //the first object called Nemo
        fish.setName("Nemo");
        fish.setColor("the color of the Nemo is - red");
            System.out.println("The name  of fish - " + fish.getName() +" " +fish.getColor());

    Fish carp = new Fish(); // the second object is called Marlin
        carp.setName("Marlin. ");
        carp.setColor("the color of the Marlin is - black");
            System.out.println("The name  of fish - " + carp.getName() + " " + carp.getColor());
            System.out.println(" ");

    Cat cat = new Cat(); // the first object called Barsik
        cat.setName("Barsik. ");
        cat.setAge(3);
        cat.setCatBreed("Barsik is a Persian breed cat");
            System.out.println("The name of cat - " + cat.getName() + " Barsik is " + cat.getAge()+ " years old " + cat.getCatBreed());


    Cat secondCat = new Cat(); // the second object called Garfield
        secondCat.setName("Garfield. ");
        secondCat.setAge(3);
        secondCat.setCatBreed("Garfield is a Cymru breed cat");
        System.out.println("The name of cat - " + secondCat.getName() + "Garfield is " + secondCat.getAge()+ " years old " + secondCat.getCatBreed());
            System.out.println(" ");

    Dog firstDog = new Dog(); //the first object called Balto
        firstDog.setName("Balto");
        firstDog.setAge(2);
            System.out.print("The name  of dog - " + firstDog.getName() + "  , " + firstDog.getAge() + " " + "years old. ");
        System.out.println(" ");

    Dog secondDog = new Dog(); // //the second object called Rex
        secondDog.setName("Rex");
        secondDog.setAge(5);
            System.out.println("The name  of dog - " + secondDog.getName() + " , " + secondDog.getAge() + " " + "years old. ");
            System.out.println(" ");

    Parrot parrot = new Parrot();// the first object Jack
        parrot.setName("Jack. ");
        parrot.setSay("Jack can say , \"Hi, Mukhammed\"");
            System.out.println("The name  of parrot - " + parrot.getName() + parrot.getSay());

    Parrot secondParrot = new Parrot();// the second object Kety
        secondParrot.setName("Kety. ");
        secondParrot.setSay("Kety can say , \"Hi, World\"");
        System.out.println("The name  of parrot - " + secondParrot.getName() + secondParrot.getSay()  );

    }
}
