public class Que_19 {
    /*
     19.1 Declare one of your group member names as instance variable.
     19.2 Declare one of your group member names as static variable.
     19.3 Declare one instance method name with group name (e.g. selenium())and call both global  variables.
     19.4 Declare static method name agile() and call both variable
     19.5 Call both user defined methods into main method.*/

    String name= "Jignesh";// Global instance variable
    static String name1= "Punam";// Global static variable

        public void postman(){
        String pg=("POSTMAN GROUP");
        System.out.println(pg);
        System.out.println(name);
        System.out.println(name1);
    }
        public static void agile(){
            String pg1=("Postman Group");
            System.out.println(pg1);
            System.out.println(name1);
            Que_19 ll= new Que_19();
            System.out.println(ll. name);
        }
    public static void main(String[] args) {
        Que_19 w= new Que_19();
        w.postman();
        w.agile();
    }
}
