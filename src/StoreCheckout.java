import java.util.Scanner;

class StoreCheckout {
    void main() {
        Scanner sc = new Scanner(System.in);
        int totalsum = 0;
        int sum = 0;
        int q2 = 0;
        while (true) {
            System.out.println(" ========SIMPLE STORE======");
            System.out.println("");
            System.out.println("1. Mouse $20");
            System.out.println("2. Keyboard $40");
            System.out.println("3. Headphones $50");
            System.out.println("4. Laptop Stand $30");
            System.out.println("5. Checkout");
            System.out.println("Choose a product: ");
            int ch = sc.nextInt();
            if (ch < 1 || ch > 5) {
                System.out.println("Invalid option.");
                System.out.println("Please choose a number from 1 to 5. ");
                continue;
            }
            if (ch == 5) {
                System.out.println("--------CHECKOUT------");
                break;
            }
            String name = "";
            int price = 0;
            if (ch == 1) {
                name = "Mouse";
                price = 20;
            } else if (ch == 2) {
                name = "Keyboard";
                price = 40;
            } else if (ch == 3) {
                name = " Headphoneas";
                price = 50;
            } else if (ch == 4) {
                name = "Laptop Stand";
                price = 30;
            }
            System.out.println("You selected:" + name);
            System.out.println("Price: $" + price);
            System.out.println("");
            System.out.println("Enter your quantity:");
            int q1 = sc.nextInt();
            if (q1 <= 0) {
                System.out.println("Invalid option.");
                System.out.println("Quantity must be greater than 0.");
                System.out.println("");
                continue;
            }
            int cost = q1 * price;
            System.out.println(q1 + " * $ " + price + "= $ " + cost);
            System.out.println("");
            totalsum = sum += cost;
            q2 += q1;
            System.out.println(" Added to cart!");
            System.out.println(" Current total: $" + totalsum);
        }
        double discount = 0;
        if (totalsum > 100) {
            discount = (totalsum * 0.10);
        }
        double finaltotal = totalsum - discount;
        System.out.println("Subtotal: $" + totalsum);
        System.out.println("Discount: $" + discount);
        System.out.println("Final total: $" + finaltotal);
        System.out.println("");
        int pay = 0;
        while (true) {
            System.out.println("Enter payment amount: $");
            pay = sc.nextInt();
            if (pay == finaltotal) {
                System.out.println("Payment successful!");
                System.out.println("");
                break;
            } else if (pay > finaltotal) {
                System.out.println("Payment successful!");
                System.out.println("Change: $" + (pay - finaltotal));
                break;
            } else if (pay < finaltotal) {
                System.out.println("Insufficient payment.");
                System.out.println("You still need to pay: $" + (finaltotal - pay));
            }
        }
        System.out.println("========================");
        System.out.println("      SIMPLE STORE      ");
        System.out.println("========================");
        System.out.println("Items purchased: " + q2);
        System.out.println("Subtotal:      $" + totalsum);
        System.out.println("Discount:      $" + discount);
        System.out.println("Final total:   $" + finaltotal);
        System.out.println("");
        System.out.println("Payment:       $" + pay);
        System.out.println("Cange:         $" + (pay - finaltotal));
        System.out.println("=============================");
        System.out.println("  Thank you for shopping!");
        System.out.println("=============================");

    }
}




