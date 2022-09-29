package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private final ArrayList<String> options;

    public Menu(ArrayList<String> options) {
        this.options = options;
    }

    public String showMenu() {
        int i = 0;
        for (String option : getOptions()) {
            System.out.println(++i + ") " + option);
        }

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public ArrayList<String> getOptions() {
        return options;
    }
}
