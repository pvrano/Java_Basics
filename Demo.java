import java.text.DecimalFormat;
import java.util.Scanner;
public class Demo {
    public static final Scanner takeInput = new Scanner(System.in);
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void greeting()
    {
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name =  takeInput.nextLine();
        System.out.print("Nice to meet you "+name+", where are you travelling to?");
        String city = takeInput.nextLine();
        System.out.println("Great! "+city+" sounds like a great trip");
        System.out.println("***********");
    }

    public static void timeTravelAndBudget()
    {
        System.out.print("How many days are you planning to spend travelling?");
        int days = takeInput.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        float money = Float.parseFloat(takeInput.next());
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String destinationCurrency = takeInput.next();
        System.out.print("How many "+destinationCurrency+" are there in 1 USD?");
        float equivalentCurrency = Float.parseFloat(takeInput.next());
        int totalHours = days*24;
        System.out.println("If you are travelling for "+days+" days that is the same as "+totalHours+" hours or "+(totalHours*60)+" minutes.");
        float perDay = (money/days);
        int first = (int)(perDay*100);
        double second = first/100.0;
        System.out.println("If you are going to spend $"+(int)money+" USD that means per day you can spend up to $"+second+" USD");
        double perDay1 = (money*equivalentCurrency);
        double convertedCapitol = (int)(perDay1*100);
        double converted = (double)(convertedCapitol/100.0);
        double equiPer = perDay1/days;
        double third = (int)(equiPer*100);
        double fourth = (double)(third/100.0);
        System.out.println("Your total budget in "+destinationCurrency+" is "+df.format(converted)+" , which per day is "+fourth+" "+destinationCurrency);
        System.out.println("***********");
    }

    public static void timeDifference()
    {
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        int timeDifferenceUnit = takeInput.nextInt();
        int difference = timeDifferenceUnit%24;
        int noonTime = Math.abs(12+difference);
        int nightTime = Math.abs(0+difference);
        System.out.println("That means that when it is midnight time at home then it will be "+nightTime+":00"+" in your travel destination");
        System.out.println("and when it is noon at home it will be "+noonTime+":00");
        System.out.println("***********");
    }

    public static void countryArea()
    {
        System.out.print("What is the square area of your destination country in km2?");
        long kmSquare = takeInput.nextLong();
        double mileSquare = 0.386102;
        double mileSq = (int)(kmSquare*mileSquare)*100;
        double answerFrmTwo = (double)(mileSq/100.0);
        System.out.println("In miles2 that is "+answerFrmTwo);
        System.out.println("***********");
    }



    public static void main(String args[]){
        greeting();
        timeTravelAndBudget();
        timeDifference();
        countryArea();
    }
}
