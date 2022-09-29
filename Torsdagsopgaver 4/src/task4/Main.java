package task4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>() { {
            add("Start game");
            add("Resume game");
            add("Pause game");
            add("End game");
        }};
        System.out.println(actions.get(2)); // expected output: "Pause game"

        Menu menu = new Menu(actions);
        String response = menu.showMenu();
        try {
            int convertedResponse = Integer.parseInt(response);
            doAction(convertedResponse);
        } catch (Exception e) {
            System.out.println("Please enter a number.");
        }
    }

    public static void doAction(int action) {
        switch (action) {
            case 1 -> System.out.println("Starting the game now");
            case 2 -> System.out.println("Fetching previously saved game data");
            case 3 -> System.out.println("Game paused");
            case 4 -> System.out.println("Ending game");
            default -> System.out.println("Invalid choice");
        }
    }
}