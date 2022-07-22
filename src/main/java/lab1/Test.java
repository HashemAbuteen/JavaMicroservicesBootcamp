package lab1;

public class Test {
    public static void main(String[] args) {
        int a = (int)(Math.random()*101);
        int b = (int)(Math.random()*101);

        System.out.println("First number : " + a);
        System.out.println("Second number : " + b);

        int sum = a+ b;
        System.out.println("Sum : " + sum);

        double avg = (a + b )/2.0;
        System.out.println("average : " + avg);

        System.out.println("first reminder when dividing on 10 is " + a%10);
        System.out.println("second reminder when dividing on 10 is " + a%10);

        System.out.println("the area of rectangle is " + a*b);



    }
}
