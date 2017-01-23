package com.example;

import java.util.ArrayList;
import java.util.Random;
// JOkes from http://www.devtopics.com/best-programming-jokes/
public class JokeLibrary  {
    ArrayList<String> jokes = new ArrayList<>();

    JokeLibrary(){
        jokes.add("Two bytes meet.  The first byte asks, “Are you ill?”  \n" +
                "The second byte replies, “No, just feeling a bit off.”");
        jokes.add("Eight bytes walk into a bar.  The bartender asks, “Can I get you anything?”\n" +
                "\n" +
                "“Yeah,” reply the bytes.  “Make us a double.”");
        jokes.add("Why do programmers always mix up Halloween and Christmas? \n" +
                "Because Oct 31 equals Dec 25.");
        jokes.add("There are only 10 kinds of people in this world: those who know binary and those who don’t.");
        jokes.add("A programmer walks to the butcher shop and buys a kilo of meat.  An hour later he comes back upset that the butcher shortchanged him by 24 grams.");
        jokes.add("There are three kinds of lies: Lies, damned lies, and benchmarks.\n");
    }

    public ArrayList<String> getJokes() {
        return jokes;
    }
    public  String getRandomJoke(){
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size()));
    }
}
