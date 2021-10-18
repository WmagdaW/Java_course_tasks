package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautifier (String text, PoemDecorator poemDecorator){
         String resultText = poemDecorator.decorate (text);
         System.out.println (resultText);
    }
}
