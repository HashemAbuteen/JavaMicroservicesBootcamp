package lab2;

public class Fourth {
    public static void main(String[] args) {
        double max = -1;
        for(int i = 0 ; i < 3 ; i++){
            double n  = Math.random();
            max = Math.max(max , n);
        }
        System.out.println(max);
    }
}
