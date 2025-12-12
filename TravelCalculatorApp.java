import java.util.Scanner;

public class TravelCalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sheno distancën në kilometra: ");
        double distance = input.nextDouble();

        System.out.println("Zgjedh tipin e udhëtimit:");
        System.out.println("1. Vajtje");
        System.out.println("2. Vajtje-ardhje");
        System.out.print(" Zgjedhja: ");
        int travelType = input.nextInt();

        System.out.print("Shëno moshën: ");
        int age = input.nextInt();

        input.nextLine(); 
        System.out.print("A ke kartë anëtarësie? (po/jo): ");
        String MembershipCard = input.nextLine();

        if (distance <= 0 || age < 0 || (travelType < 1 || travelType > 2)) {
            System.out.println("Hyrje e pavlefshme!");
        }

        double ageDiscount = 0.0;

        double price = distance * 0.50;

        if (age < 12) {
            ageDiscount = 0.50;
        }
        else if (age >= 12 && age <= 24) {
            ageDiscount = 0.10;
        }
        else if (age >= 65) {
            ageDiscount = 0.30;
        }

        double priceAfterAgeDiscount = price - (price * ageDiscount);

        if (travelType == 2) {
            priceAfterAgeDiscount -= (priceAfterAgeDiscount * 0.20);
            priceAfterAgeDiscount *= 2;
        }

        System.out.println("----- Fatura e Udhëtimit -----");
        System.out.println("Distanca: " + distance + " km");
        System.out.println("Lloji i Udhëtimit: " + travelType);
        System.out.println("Çmimi fillestar: " + price + "€");
        System.out.println("Zbritja totale: " + (ageDiscount * 100) + "%");
        System.out.println("Çmimi përfundimtar: " + priceAfterAgeDiscount + "€");
        System.out.println("-------------------------------");
    }
}