public class WrapperExamples { //primitive -> object
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45; //num is an object

        Integer a = 10;
        Integer b = 20;

        swap(a,b);

        System.out.println(a + " " + b);

        final A simar = new A("Simarjeet Singh");
        //changing the value using ref variable can be done
        simar.name = "not Simarjeet";

        // when a non primitive is final you cant reassign it
//        simar = new A("new object");
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}
