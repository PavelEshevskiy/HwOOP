package exceptions.hw3.model;

import exceptions.hw3.exceptions.EmptyStoreException;
import exceptions.hw3.exceptions.ProductNotFoundException;
import exceptions.hw3.exceptions.WrongNameException;
import exceptions.hw3.exceptions.ZeroPriceException;

public interface OnlineShopUI {

    void addProduct(String product, double price) throws WrongNameException, ZeroPriceException;

    void deleteProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    String getProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    void getAllProducts() throws EmptyStoreException;

}