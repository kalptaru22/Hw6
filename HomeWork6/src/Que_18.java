public class Que_18 {
    /*
     18.1 Declare your council name as static variables.
     18.2 Declare your house number as instance variables.
     18.3 Declare one instance method name borough() and call Static variable  18.4 Declare static method name address() and call instance variable
     18.5 Call both user defined methods into main method.
    */
        static String borough= "Ealing";//static variable
        int address =43;//instance variables
    public void ad(){
        System.out.println(borough);
        System.out.println(address);
    }
    public static void adr(){
        Que_18 l= new Que_18();
        System.out.println(borough);
        System.out.println(l.address);
    }

    public static void main(String[] args) {
        Que_18 k= new Que_18();
        k.ad();
        k.adr();
    }
}

