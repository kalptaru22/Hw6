public class Que_2 {
    /* 2.1 Declare two static variables.
       2.2 Declare one static method.
       2.3 Call both static variables into the static method inside the print statement.
       2.4 Declare the Main method.
       2.5 Call the static method into the Main method and run the programme.
     */

    static int a=22, b=84;//here a and b are static variables
    static int c=(a+b);// here c is a static variable

    public static void main(String[] args) {
        Que_2 m= new Que_2();//constructor
        m.Method();// calling static method in main method
    }
    public static void Method(){
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        System.out.println("a+b= " +c);
    }
}
