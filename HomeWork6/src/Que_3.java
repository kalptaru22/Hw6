public class Que_3 {
    /*
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.
 */
    int x= 3333, y=1234;
    int xy=(x-y);
    static String xyz="Jai Ho";

    public static void main(String[] args) {
        Que_3 z1 = new Que_3();//constructor
        z1.hw();
        Que_3 k= new Que_3();//constructor
        k.maulik();
    }


         public static void maulik() {//static method
        Que_3 obj= new Que_3();
             String p= "patel";
             System.out.println("static method");
             System.out.println("x= "+obj.x );
             System.out.println("y= "+obj.y);
             System.out.println("xy= "+obj.xy);
             System.out.println(p);

         }
        public void hw(){
            System.out.println("instance method");
            System.out.println("x= "+x);
            System.out.println("y= "+y);
            System.out.println("xy= "+xy);
            System.out.println(xyz+" java");
    }


}
