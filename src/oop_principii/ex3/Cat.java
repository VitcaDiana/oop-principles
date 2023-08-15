package oop_principii.ex3;

public class Cat extends Animal{
   private String breed ;
    public Cat(String name,String breed) {

        super(name);
        this.breed = breed;
    }

    @Override
    public void greeting() {
        System.out.println(this.getName()+" miau");
    }
}
