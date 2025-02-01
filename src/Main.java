import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;


         System.out.print(" what is the maintenance cost for Spring: ");
         springCost = scanner.nextDouble();

        System.out.print(" what is the maintenance cost for Summer: ");
        summerCost = scanner.nextDouble();


        System.out.print(" what is the maintenance cost for Fall: ");
        fallCost = scanner.nextDouble();


        System.out.print(" what is the maintenance cost for Winter: ");
        winterCost = scanner.nextDouble();

double totalCost = springCost + summerCost + fallCost + winterCost;

System.out.printf(" The maintenance cost for spring was: $" + springCost);
System.out.printf(" The maintenance cost for summer was: $" + summerCost);
System.out.printf(" The maintenance cost for fall was: $" + fallCost);
System.out.printf(" The maintenance cost for winter was: $" + winterCost);
System.out.printf(" The maintenance cost for the year was: $" + totalCost);

scanner.close();
    }
}