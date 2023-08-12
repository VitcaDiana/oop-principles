package oop_principii.ex3;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println(this.getName()+ " woof");
    }
    public void greeting(Dog anotherGod){
        System.out.println(this.getName() + "face woof catre " + anotherGod.getName());

    }

}
