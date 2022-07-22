package lab2;

public class First {
    public static void main(String[] args) {
        int n = (int)(Math.random()*101);
        if( n == 50 ){
            System.out.println("Bingo!");
        }
        else if (n< 50 ){
            System.out.println("Small!");
        }
        else {
            System.out.println("Big!");
        }
    }
}
