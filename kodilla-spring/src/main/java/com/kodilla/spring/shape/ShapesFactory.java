package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {

    @Bean
    public Square createSquare(){
        return new Square();
    }

    @Bean
    public Shape chosenShape(){
        
        Shape theShape = null;
        Random generator = new Random();

        int choosen = generator.nextInt(3);

        if(choosen == 0){
            theShape = new Triangle();
        } else if(choosen == 1){
            theShape = new Circle();
        } else if(choosen == 2){
            theShape = new Square();
        }
        return theShape;
    }
}
