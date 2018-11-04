package chapter5.section5;

public class E12_TankWithTerminationCondition {
    public static void main(String[] args) {
        new Tank().empty();
        new Tank();
        System.gc();
        System.runFinalization();
    }
}

class Tank {
    static int counter;
    int id = counter++;
    boolean full;

    public Tank() {
        System.out.println("Tank " + id + " created");
        full = true;
    }

    public void empty() {
        full = false;
    }

    public void finalize() {
        if (full) {
            System.out.println("Error: tank " + id + " must be empty at clean up");
        } else
            System.out.println("Tank " + id + " cleaned up OK");

    }

    @Override
    public String toString() {
        return "Tank" + id;
    }
}