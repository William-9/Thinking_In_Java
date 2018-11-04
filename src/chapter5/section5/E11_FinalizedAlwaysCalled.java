package chapter5.section5;

public class E11_FinalizedAlwaysCalled {
    protected void finalized(){
        System.out.println("finalize() called");
    }
    public static void main(String[] args) {
        new E11_FinalizedAlwaysCalled();
        System.gc();
        System.runFinalization();
    }
}
