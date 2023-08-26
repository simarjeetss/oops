public class Main {
    public static void main(String[] args) {
        int[] rno = new int[5]; //for storing roll numbers
        String[] name = new String[5];
        float[] marks = new float[5];


        //whenever a new object is created the program flow
        // goes into the constructor
        Student[] students = new Student[5];

        Student simar = new Student();
        Student rahul = new Student();

        System.out.println(simar.rno);
        System.out.println(simar.marks);
        System.out.println(simar.name);

//        simar.changeName("Rahul");
//        simar.greeting();

        Student random = new Student(); //this one will constructor
                                        //with no parameters
    }
}

class Student {
    int rno;
    String name;
    float marks = 70;

    //we need a way to add the values of the above
    //properties abject by object

    //default constructor
    Student(){
        this.rno = 12;
        this.name = "Simarjeet";
        this.marks = 90;
    }

    //constructor with parameters
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    void greeting(){
        System.out.println("Hello,  my name is " + name);
    }

    void changeName(String newName){
        name = newName;
    }
}
