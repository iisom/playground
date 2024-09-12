package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    List<String> fileNames = new  ArrayList<>(Arrays.asList("My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc"));
fileNames.forEach(fileName -> { System.out.println(fileName.replaceAll(" ", "-"));

    }

    }
