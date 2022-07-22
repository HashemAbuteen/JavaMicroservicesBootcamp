package lab1;

public class Printer {


    public static void main(String[] args) {
        String part1 = "There will be ";
        int visitors = 5;
        String part2 = " people for dinner.";
        // print the message
        System.out.println(part1 + visitors + part2);

        //2.	try to increment the number of visitors to 7 [visitors+2] in the print line
        System.out.println(part1 + (visitors+2) + part2);
        // this won't change the visitors value and just print 7

        // the right way to update the print line
        visitors += 2;
        System.out.println(part1 + visitors + part2);
    }
}
