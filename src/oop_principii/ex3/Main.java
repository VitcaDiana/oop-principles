package oop_principii.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Cat cat = new Cat("pisi","de casa");
//cat.greeting();

//Dog dog = new Dog("Azor");
//dog.greeting();
//SecurityDog securityDog = new SecurityDog("politia");
//securityDog.greeting();
//dog.greeting(securityDog);
//securityDog.greeting(dog);

        Animal cat = new Cat("pisi","de casa");
        cat.greeting();
        Animal dog = new Dog("Azor");
        dog.greeting();
        Animal securityDog = new SecurityDog("politia");
        securityDog.greeting();

        Dog copyDog = (Dog) dog;
        SecurityDog copySecurityDog = (SecurityDog) securityDog;
        copyDog.greeting(copySecurityDog);
        copySecurityDog.greeting(copyDog);

      //  Animal animal = getAnimal();
       // animal.greeting();

        Shelter shelter = new Shelter(10);
        shelter.addAnimal(getAnimal());
        System.out.println(Arrays.toString(shelter.getAnimals()));
        shelter.addAnimal(getAnimal());
        shelter.addAnimal(getAnimal());

        shelter.makeNoice();
    }

    public static Animal getAnimal() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                return new Cat("pisi","de casa");
            case 2:
                return new Dog("azor");
            case 3:
                return new SecurityDog("politia");
            default:
                return null;

        }

    }
}
