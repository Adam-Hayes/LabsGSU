package lab1;

import lab1.Product;

public class Main {


    public static void Print(Product products[]) {
        for (Product products1 : products
                ) {
            System.out.println(products1.toString());
        }
    }


    public static int ShowFullPrice(Product products[]) {
        int fullPrice = 0;
        for (Product products1 : products
                ) {
            fullPrice = products1.getPrice() + fullPrice;
        }
        return fullPrice;
    }


    public static int ShowAvailable(Product products[]) {
        int i = 0;
        for (Product products1 : products) {
            if (products1.getAvailable() == true) {
                i = i+1;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product("Bread", 15, true),
                new Product("Milk", 30, true),
                new Product("Tomato", 27, false),
                new Product("Potatoe", 10, true),
                new Product("Pasta", 25, true),
                new Product("Apple", 20, false),
                new Product("Lemon", 33, true),
                new Product("Orange", 22, true),
                new Product("Chiken", 50, false),
                new Product("Oil", 40, false),
        };



        System.out.println();
        System.out.println(ShowFullPrice(products));
        System.out.println();
        System.out.println(ShowAvailable(products));


    }
}
