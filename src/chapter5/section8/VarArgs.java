package chapter5.section8;

public class VarArgs {
    static void printArray(Object[] args) {
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"one", "two", "three" });
        printArray(new Object[]{new A(), new A(), new A()});
    }
}
class A{}
/*
output
47 3.14 11.11
one two three
chapter5.section8.A@1540e19d chapter5.section8.A@677327b6 chapter5.section8.A@14ae5a5
**/