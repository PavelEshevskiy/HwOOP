package exceptions.hw3;

import exceptions.hw3.exceptions.EmptyStoreException;
import exceptions.hw3.exceptions.ProductNotFoundException;
import exceptions.hw3.view.UserGUI;

public class Main {

    public static void main(String[] args) throws ProductNotFoundException, EmptyStoreException {
        UserGUI gui = new UserGUI();
        gui.show();
    }
}