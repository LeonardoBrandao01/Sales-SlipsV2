package View;

import Model.Item;
import Model.Product;
import View.ViewBill;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("pessego", 0.50, 10);
        Item item2 = new Item("uvas", 6.50, 5);
        Item item3 = new Item("banana", 0.80, 7);

        List<Product> itemss = new ArrayList<>();
        itemss.add(item1);
        itemss.add(item2);
        itemss.add(item3);

        ViewBill view = new ViewBill();
        view.displayItems(itemss);
    }
}
