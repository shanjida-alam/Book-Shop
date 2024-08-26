package com.example.lab02;

import java.util.ArrayList;
import java.util.List;

public class BookExpert {
    public List<String> getMenu(String Meal) {
        List<String> Menu = new ArrayList<>();
        if (Meal.equals("Fiction")) {
            Menu.add("The Alchemist");
            Menu.add("The Kite Runner");
            Menu.add("Harry Potter");
        }
        else if (Meal.equals("Non-fiction")) {
            Menu.add("In Cold Blood");
            Menu.add("Into Thin Air");
            Menu.add("The Diary of a Young Girl");
        }
        else if (Meal.equals("Science Fiction")) {
            Menu.add("The Martian");
            Menu.add("Brave New World");
            Menu.add("Fahrenheit 451");
        }
        return Menu;
    }
}
