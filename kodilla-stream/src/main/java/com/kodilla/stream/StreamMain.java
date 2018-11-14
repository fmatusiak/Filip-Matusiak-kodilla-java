package com.kodilla.stream;


import com.kodilla.stream.beautifer.PoemBeautifer;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.sql.SQLOutput;

public class StreamMain {
    public static void main(String[] args) {
        /*//System.out.println("Welcome to module 7 - Stream");
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is example text.");
        processor.execute(codeToExecute);
        processor.execute(() -> System.out.println("Sample text"));*/

       /* System.out.println("Calculation with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 15, (a, b) -> a + b);
        expressionExecutor.executeExpression(20, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(50, 10, (a, b) -> a / b);

        System.out.println("Calculating with method references");
        expressionExecutor.executeExpression(10, 15, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(20, 5,FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(50, 10,FunctionalCalculator::divideAByB);
*/
        PoemBeautifer poemBeautifer = new PoemBeautifer();
        poemBeautifer.beautify("Edward",(decorate -> decorate.toUpperCase()));
        poemBeautifer.beautify("janek",(decorate -> decorate.toLowerCase()));
        poemBeautifer.beautify("zenek",decorate -> decorate + "ABC");
        poemBeautifer.beautify("marian",decorate -> "$$$ " +  decorate + " @@");


    }
}
