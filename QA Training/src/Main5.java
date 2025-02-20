class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog1 extends Animal1 {
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}
public class Main5 {

    public static void main(String[] args) {

        Dog1 obj = new Dog1();

        obj.sound();  

    }

}
