
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
        // Comparing size:
        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));    
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));
        // Compare price:
        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt)); 
        // Is it more expensive?:
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt)); 
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt)); 
    }
}
