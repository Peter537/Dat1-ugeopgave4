package task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private final ArrayList<String> coffeeMenu;

    public Cafe() {
        this.coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        File file = new File("src\\task6\\coffees.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                getCoffeeMenu().add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "coffeeMenu=" + getCoffeeMenu() +
                '}';
    }
}