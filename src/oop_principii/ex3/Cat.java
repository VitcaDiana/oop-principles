package oop_principii.ex3;

public class Cat extends Animal{
   // String breed ;
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println(this.getName()+" miau");
    }
}
