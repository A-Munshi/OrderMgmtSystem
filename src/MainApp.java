import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        try {
            Order order = new Order();

            // Adding products to the order (Flipkart cart simulation)
            order.addItem(new Item(201, "iPhone 15 Pro", 129999));
            order.addItem(new Item(202, "Samsung Galaxy S24 Ultra", 118999));
            order.addItem(new Item(203, "HP Pavilion Laptop", 65999));
            order.addItem(new Item(204, "Nike Running Shoes", 4999));
            order.addItem(new Item(205, "Boat Airdopes 441", 1999));
            order.addItem(new Item(206, "Sony WH-1000XM5 Headphones", 29999));
            order.addItem(new Item(207, "Apple MacBook Air M2", 104999));

            IO.println("---- Flipkart Order: All Products ----");
            order.viewItems();

            IO.println("\n---- Search Product ----");
            IO.println(order.searchItem("HP Pavilion Laptop").toString());

            IO.println("\n---- Update Product (ID 205: Boat Airdopes) ----");
            order.updateItem(205, "Boat Airdopes 441 Pro", 2499);
            order.viewItems();

            IO.println("\n---- Delete Product (ID 204: Nike Shoes) ----");
            order.deleteItem(204);
            order.viewItems();

            IO.println("\n---- Sort Products by Name ----");
            List<Item> listByName = new ArrayList<>(order.getAllItems());
            Collections.sort(listByName, new SortByName());
            listByName.forEach(i -> IO.println(i.toString()));

            IO.println("\n---- Sort Products by Price ----");
            List<Item> listByPrice = new ArrayList<>(order.getAllItems());
            Collections.sort(listByPrice, new SortByPrice());
            listByPrice.forEach(i -> IO.println(i.toString()));

        } catch (Exception e) {
            IO.println("Error: " + e.getMessage());
        }
    }
}
