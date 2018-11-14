package com.kodilla.stream.beautifer;

public class PoemBeautifer {
    public void beautify(String decorate,PoemDecorator poemDecorator){
        String decorateText = poemDecorator.decorate(decorate);

        System.out.println("Decorate text: " + decorateText);
    }

}
