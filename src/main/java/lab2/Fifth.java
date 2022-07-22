package lab2;

public class Fifth {
    public static void main(String[] args) {
        double min = 1;
        for(int i = 0 ; i < 3 ; i++){
            double n  = Math.random();
            min = Math.min(min , n);
        }
        System.out.println(min);
    }
}
