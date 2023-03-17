interface Animal{
    abstract void breathe();
    abstract void eat();
    abstract void sleep();


}

class Dog implements Animal {

    @Override
    public void breathe() {
        System.out.println("Dog is breathing");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating" );
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping" );
    }


}public class demoObj {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.breathe();
        d1.sleep();
        d1.eat();
    }
}