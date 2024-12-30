public class Duck extends Animal implements Flyable{

    String name;
    public Duck(String name){
        this.name = name;
    }
    @Override
    void sound() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("prbb prbb");
    }

    @Override
    public void glide() {
        System.out.println("fewwwwwwwww");
    }
    void clean(Animal animal){
        System.out.println(this + " is cleaning " + animal);
    }
    public String toString(){

        return this.name;
    }
}
