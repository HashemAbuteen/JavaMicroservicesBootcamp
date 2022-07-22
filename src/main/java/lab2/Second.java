package lab2;

public class Second {
    public static void main(String[] args) {
        int n = (int)(Math.random()*101);
        if (n<= 50 ){
            System.out.println("Small!");
        }
        else {
            System.out.println("Big!");
        }

        if (n%2==0 ){
            System.out.println("Even!");
        }
        else {
            System.out.println("Odd!");
        }
    }
}
