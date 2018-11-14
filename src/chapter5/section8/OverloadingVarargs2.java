package chapter5.section8;

public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
        System.out.println(i);
    }
//    static void f(Character... args) {
//        System.out.print("second");
//    }
    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
        char a = 'a';
        float b = a ;
        System.out.println(b);
    }
}
/*
* output
first
1.0
first
97.0
97.0
* */