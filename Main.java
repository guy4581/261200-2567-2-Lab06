public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow();
        cow.sound();
        Duck duck = new Duck("Donald");
        duck.sound();
        Pig pig = new Pig();
        pig.sound();
        Owl owl = new Owl();
        owl.sound();

        duck.clean(cow);
        duck.clean(pig);
        duck.clean(owl);

        Duck fourseasons = new PekingDuck("jiaTongheng");
        fourseasons.clean(duck);
        fourseasons.fly();

        duck.clean(new Cow());
        duck.clean(new Cow());
        


    }
}