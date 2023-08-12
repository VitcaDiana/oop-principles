package oop_principii.ex3;

public class Shelter {
    private Animal[] animals;
    private int numberOfAnimals;

    public Shelter(int size) {
        this.animals = new Animal[size];
        numberOfAnimals = 0;
    }

    public void makeNoice(){
        for (int i=0;i<numberOfAnimals;i++){
            animals[i].greeting();
        }
    }
    public void addAnimal (Animal animal){
        animals[numberOfAnimals] = animal;
        numberOfAnimals++;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }
}
