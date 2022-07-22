package lab2;

public class SalaryRaiser {
    public static void main(String[] args) {
        double salary = Math.random()*1001 + 5000;
        System.out.println("Current salary : " + salary);
        if(salary + salary*0.1 <= 6000){
            salary += 0.1*salary;
        }
        else {
            salary += 0.05*salary;
        }
        System.out.println("Updated Salary : " + salary);
    }
}
