public class Que_20 {
    /*
    20.1 Declare your Spain as static variable.
    20.2 Declare your United Kingdom as instance variable.
    20.3 Declare instance method name homeCountry()and call static variable.
    20.4 Declare static method name holidays() and call instance variable
    20.5 Call both methods in main method.
     */

    static String spain=("Spain");//global variable
    String uk=("United Kingdom");//global variable

    public void Homecountry(){
        Que_20 a= new Que_20();
        System.out.println("HomeCountry ="+a.uk);
    }
    public static void holidays(){
        System.out.println("Holidays =" +spain);
    }

    public static void main(String[] args) {
        Que_20 gb = new Que_20();
        gb.holidays();
        gb.Homecountry();
    }



}
