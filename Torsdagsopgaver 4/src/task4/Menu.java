package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<String> options;

    public Menu(ArrayList<String> options) {
        this.options = options;
    }

    public String showMenu() {
        int i = 0;
        for (String option : options) {
            System.out.println(++i + ") " + option);
        }

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }



    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }
}
