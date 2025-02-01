import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;


         System.out.print(" what is the maintenance cost for Spring: ");
         springCost = 50;

        System.out.print(" what is the maintenance cost for Summer: ");
        summerCost = 60;


        System.out.print(" what is the maintenance cost for Fall: ");
        fallCost = 70;


        System.out.print(" what is the maintenance cost for Winter: ");
        winterCost = 80;

double totalCost = springCost + summerCost + fallCost + winterCost;

System.out.printf(" The maintenance cost for spring was: $" + springCost);
System.out.printf(" The maintenance cost for summer was: $" + summerCost);
System.out.printf(" The maintenance cost for fall was: $" + fallCost);
System.out.printf(" The maintenance cost for winter was: $" + winterCost);
System.out.printf(" The maintenance cost for the year was: $" + totalCost);


    }
}