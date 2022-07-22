package lab2;

public class TaxCalculator {
    public static void main(String[] args) {
        double salary = Math.random()*50000 + 5000;
        if(salary < 23000){
            System.out.println("before tax : " + salary);
            System.out.println(salary + " + 10% = ");
            System.out.println("after tax : " + salary + 0.1*salary);
        }
        else if(salary < 23000){
            System.out.println("before tax : " + salary);
            System.out.println(salary + " + 10% = ");
            System.out.println("after tax : " + salary + 0.1*salary);
        }
    }
}
