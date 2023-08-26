package staticExample;


public class Main {
    public static void main(String[] args) {
        Main demo = new Main();
        Human simar = new Human(22, "Simarjeet",10000,false);
        Human rahul = new Human(21, "Rahul",15000,true);

//        System.out.println(simar.name);
//        System.out.println(simar.population);
//        System.out.println(rahul.population);

//        demo.greet();

    }
    //we know that something which is not static, belongs to an object
    //this is dependent on objects
    void greet(){
        System.out.println("Namaste");
        fun(); //static inside a non-static is allowed
    }
    //this is not dependent on objects
    static void fun(){
//        greet();  //you cant use this because ir requires an instance,
                //but the function you are using it in does not depend on instances
    }

}

