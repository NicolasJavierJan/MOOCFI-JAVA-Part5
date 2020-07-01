
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(30,12,1990);
        
        date.advance();
        
        System.out.println(date.toString());
        
        date.advance(8);
        
        System.out.println(date.toString());
        
        SimpleDate date2 = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date2.toString());

        SimpleDate newDate = date2.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }
        
        System.out.println("Try " + date2.afterNumberOfDays(790));
    }
}
