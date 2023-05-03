public class Que_1 {
   /* 1. Write a Java programme using the following steps.
            1.1 Declare two instance variables.
            1.2 Declare one instance method.
            1.3 Call both instance variables into the instance method inside the print statement.
            1.4 Declare the Main method.
            1.5 Call the above instance method into the Main method and run the programme.
*/
    int a = 22,b=84;//here a and b are instance variables

    public static void main(String[] args) {
           Que_1 q1= new Que_1();//calling variables in to main method
           q1.OneMeth();// calling instance method in to main method

    }
    public void OneMeth(){//instance method
        int c = (a+b);
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        System.out.println("a+b= " +c);
    }

}