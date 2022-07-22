package lab2;

public class Eighth {
    public static void main(String[] args) {
        int year = (int)(Math.random()*3000);
        //you can replace this line with if(year%4 == 0)
        //
        if( (year%4==0 && year%100!=0 ) || year%400 == 0){
            System.out.println(year + " is a Leap year");
        }
        else {
            System.out.println(year + " is NOT a Leap year");
        }
    }
}
