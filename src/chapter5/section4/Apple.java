package chapter5.section4;

public class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
