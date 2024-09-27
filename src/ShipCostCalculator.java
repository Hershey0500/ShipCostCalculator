import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = in.nextDouble();
        double shippingCost = 0;

        if (price >= 100) {
            System.out.println("Shipping is free.");
        } else {
            shippingCost = price * 0.02;
        }

        double totalPrice = price + shippingCost;
        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);
    }
}
