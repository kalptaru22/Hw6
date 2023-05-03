public class Que_17 {
    /*
     17.1 Declare your city as instance variables.
     17.2 Declare your country as static variables.
     17.3 Declare one instance method and call static variable in print statement  17.4 Declare static method and call instance variable in print Statement.
     17.5 Call both user defined methods into main method. */
    String city="london";
    static String country="England";
    public void loc(){//instance method
    Que_17 o= new Que_17();
    System.out.println(city);// direct access
    System.out.println(country);//direct access
    }
    public static void loc1(){//static method
    Que_17 op= new Que_17();
        System.out.println(op.city);// called instance variable using class
        System.out.println(country);//direct access
    }

    public static void main(String[] args) {
        Que_17 opm = new Que_17();
        opm.loc();
        opm.loc1();
    }
}
