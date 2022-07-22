package lab1;

public class Test3 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*101);
        int b = (int)(Math.random()*101);

        System.out.println("the numbers are " + a + " and " + b);
        //print the bigger value
        System.out.println("the max is " + Math.max(a,b));
    }
}
