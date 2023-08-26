package properties.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.h = this.l = this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    //copy constructor
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
