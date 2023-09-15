package exceptions.hw3.presenter;

import exceptions.hw3.exceptions.EmptyStoreException;
import exceptions.hw3.exceptions.ProductNotFoundException;
import exceptions.hw3.exceptions.WrongNameException;
import exceptions.hw3.exceptions.ZeroPriceException;
import exceptions.hw3.model.Model;

public class Presenter {

    private Model model;

    public Presenter() {
        model = new Model();
    }

    public void addProduct(String name, double price) {
        try {
            model.addProduct(name, price);
        } catch (WrongNameException | ZeroPriceException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct(String name) {
        try {
            model.deleteProduct(name);
        } catch (WrongNameException | ProductNotFoundException | EmptyStoreException e) {
            System.out.println(e.getMessage());
        }
    }


    public String getProduct(String name) {
        try {
            return model.getProduct(name);
        } catch (ProductNotFoundException | WrongNameException | EmptyStoreException e) {
            return e.getMessage();
        }

    }

    public void getAllProducts() {
        try {
            model.getAllProducts();
        } catch (EmptyStoreException e) {
            System.out.println(e.getMessage());
        }
    }
}