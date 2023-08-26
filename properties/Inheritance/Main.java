package properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,5);
        System.out.println(box3.h + " " + box3.weight);
    }
}
