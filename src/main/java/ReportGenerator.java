import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReportGenerator {
    static class TaskRunnable implements Runnable {
        private final String path;
        private double totalCost;
        private int totalAmount;
        private int totalDiscountSum;
        private int totalLines;
        private Product mostExpensiveProduct;
        private double highestCostAfterDiscount;

        public TaskRunnable(String path) {
            this.path = path;
            this.totalCost = 0;
            this.totalAmount = 0;
            this.totalDiscountSum = 0;
            this.totalLines = 0;
            this.highestCostAfterDiscount = 0;
            this.mostExpensiveProduct = null;
        }

        @Override
        public void run() {
            //TODO:
            // - Read all lines from the input file (path)
            // - For each line, parse product ID, amount, and discount
            // - The format of the files are like this:
            //      [productId],[amount],[discountAmount]
            // - Find the corresponding product from catalog
            // - Calculate discounted cost and update total stats (totalAmount, totalCost, totalDiscountSum, totalLines)
            // - Track the most expensive purchase after discount
        }

        public void makeReport() {
            // TODO:
            // - Print the filename
            // - Print total cost and total items bought
            // - Calculate and print average discount
            // - Display info about the most expensive purchase after discount
        }
    }

    static class Product {
        private int productID;
        private String productName;
        private double price;

        public Product(int productID, String productName, double price) {
            this.productID = productID;
            this.productName = productName;
            this.price = price;
        }

        public int getProductID() {
            return productID;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }
    }
    private static final String[] ORDER_FILES = {
            // TODO: Define the paths to the order detail text files in the resources folder
    };

    static Product[] productCatalog = new Product[10];

    public static void loadProducts() throws IOException {
        // TODO:
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\main\\resources\\Products.txt"))){
            String line = "";
            for (int i = 0 ;(line = reader.readLine()) != null && i < 9 ; i++){
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                Double price = Double.parseDouble(parts[2]);
                Product product = new Product(id,parts[1],price);
                productCatalog[i] = product;

            }

        }
        // - Read lines from Products.txt
        // - For each line, parse product ID, name, and price
        // - The format of the file is like this:
        //      [productId],[name],[price]
        // - Store Product objects in the productCatalog array
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO:
        // - Create one TaskRunnable and Thread for each order file
        // - Start all threads
        // - Wait for all threads to finish
        // - After all threads are done, call makeReport() on each TaskRunnable
    }

}