package Main;

import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {
//        ArrayList<Mat> mats = new ArrayList<Mat>();
//        for(int x=0;x<5;x++) {
//            mats.add(new Dog(
//                (int)(Math.random()*100),
//                (int)(Math.random()*100) ));
//        }
//        
//        for(Mat m:mats) {
//            m.tick();
//            if( m instanceof Dog){
//                Dog dog = (Dog) m;
//                dog.bite();
//            }
//            
//        }
    }
}

abstract class Mat {

    public int x;
    public int y;

    public void tick() {}
}

class Dog extends Mat {
    public Dog(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void bite(){
        System.out.println("MONCH");
    }
}