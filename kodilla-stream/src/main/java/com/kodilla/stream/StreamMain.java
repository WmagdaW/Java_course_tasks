package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautifier("Sample text", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautifier("Sample text", (text) -> "!" + text + "!");
        poemBeautifier.beautifier("Sample text", (text) -> text.toUpperCase());
        poemBeautifier.beautifier("Sample text", (text) -> "#" + text + "#");
    }
}