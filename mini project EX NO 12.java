import java.util.Scanner;

class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[10];
        int[] qty = new int[10];
        double[] price = new double[10];

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduct " + (i + 1));
            System.out.print("Enter product name: ");
            name[i] = sc.next();

            System.out.print("Enter quantity: ");
            qty[i] = sc.nextInt();

            System.out.print("Enter price: ");
            price[i] = sc.nextDouble();
        }

        System.out.println("\n--- INVENTORY DETAILS ---");
        System.out.println("Product\tQuantity\tPrice\tTotal");

        for (int i = 0; i < n; i++) {
            double total = qty[i] * price[i];
            System.out.println(name[i] + "\t" + qty[i] + "\t\t" +
                               price[i] + "\t" + total);
        }

        sc.close();
    }
}
output:
Enter number of products: 3

Product 1
Enter product name: Pen
Enter quantity: 10
Enter price: 15

Product 2
Enter product name: Book
Enter quantity: 5
Enter price: 50

Product 3
Enter product name: Bag
Enter quantity: 2
Enter price: 500

--- INVENTORY DETAILS ---
Product Quantity Price Total
Pen     10       15.0  150.0
Book    5        50.0  250.0
Bag     2        500.0 1000.0
