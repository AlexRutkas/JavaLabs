package edu.labs.LAB11;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderController {
    public TextField nameF;
    public TextField priceF;
    public TextField amountF;

    private List<Product> productList = new ArrayList<>();

    public void nextOrder(ActionEvent actionEvent) {
        String name = nameF.getText();
        double price = Double.parseDouble(priceF.getText());
        int amount = Integer.parseInt(amountF.getText());
        Product p = new Product(name,price,amount);
        productList.add(p);

        nameF.clear();
        priceF.clear();
        amountF.clear();
    }

    public void finishShopping(ActionEvent actionEvent) {
        double totalOrderPrice = 0;
        for (Product p: productList) {
            FileWorker.writeToFile(p.toString());
            totalOrderPrice+=p.getTotalPrice();
        }
        FileWorker.writeToFile("Всього до слати:"+String.valueOf(totalOrderPrice));
    }
}
