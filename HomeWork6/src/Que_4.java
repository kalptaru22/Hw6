public class Que_4 {
    /*
 4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.
    */
    int p=79;// here p is an instance variable
    double l = 99.99;// Here l is instance variable
    static double e = 99.89;// e is static variable
    static String h=("Home Work Week-6");//h is a static variable

    public static void main(String[] args) {
        Que_4 no= new Que_4();
        no.mx();
        no.m();

    }

    public static void m(){//static method
        Que_4 er= new Que_4();
        String g="Static Method";//Local variable
        System.out.println(g);
        System.out.println(er.l);
        System.out.println(er.p);
        System.out.println(e);
        System.out.println(h);
    }

    public void mx(){//Instance method
        String c="Instance method";
            System.out.println(c);
            System.out.println(l);
            System.out.println(p);
            System.out.println(e);
            System.out.println(h);
    }

}
