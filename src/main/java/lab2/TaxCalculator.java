package lab2;

public class TaxCalculator {
    public static void main(String[] args) {
        double salary = Math.random()*50000 + 5000;
        double tax;
        if(0<salary && salary<23000){

            tax = salary *0.1;
            System.out.println("before Tax : "+salary);
            System.out.println("Tax : "+tax);
            System.out.println("After tax "+(salary-tax));


        } else if (23000<salary && salary<50000) {
            tax = salary *0.2;
            System.out.println("before Tax : "+salary);
            System.out.println("Tax : "+tax);
            System.out.println("After tax "+(salary-tax));

        }else if (50000<salary && salary<100000) {

            tax = salary *0.3;
            System.out.println("before Tax : "+salary);
            System.out.println("Tax : "+tax);
            System.out.println("After tax "+(salary-tax));
        }else if (100000<salary) {
            tax = salary *0.4;
            System.out.println("before Tax : "+salary);
            System.out.println("Tax : "+tax);
            System.out.println("After tax "+(salary-tax));
        }
    }
}
