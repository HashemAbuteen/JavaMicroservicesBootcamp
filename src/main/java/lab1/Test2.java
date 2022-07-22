package lab1;

public class Test2 {
    public static void main(String[] args) {
        int movieLength = (int)(Math.random()*251) + 100;
        System.out.println("The time in Minutes : " + movieLength);

        System.out.println("Which equals  : "
                + movieLength/60 + " hours and " + movieLength%60 + " minutes ");

    }
}
