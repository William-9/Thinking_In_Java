package chapter5.section4;

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
