package com.kodilla.stream;


import com.kodilla.stream.beautifer.PoemBeautifer;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.world.World;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUsers = forum.getUserList().stream().filter(c -> c.getSex() == 'M').filter(c -> c.getBirthdayDate().getYear() <= 1998).filter(c -> c.getCountPosts() >= 1).collect(Collectors.toMap(ForumUser::getId, ForumUser -> ForumUser));
        System.out.println(forumUsers);

        forumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + "  Name: " + entry
                        .getValue().getUserName() + " Birthday: " + entry
                        .getValue().getBirthdayDate() + " Posts: " + entry
                        .getValue().getCountPosts() + " Sex: " + entry
                        .getValue().getSex())
                .forEach(System.out::println);

        World world = new World();
        System.out.println(world.getPeopleQuantity());



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
       /* PoemBeautifer poemBeautifer = new PoemBeautifer();
        poemBeautifer.beautify("Edward", (decorate -> decorate.toUpperCase()));
        poemBeautifer.beautify("janek", (decorate -> decorate.toLowerCase()));
        poemBeautifer.beautify("zenek", decorate -> decorate + "ABC");
        poemBeautifer.beautify("marian", decorate -> "$$$ " + decorate + " @@");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        /*People.getList().stream().forEach(System.out::println);
        People.getList().stream().map(s->s.toUpperCase()).forEach(System.out::println);
        People.getList().stream().filter(s->s.length() > 11).forEach(System.out::println);
        People.getList().stream().map(s->s.toUpperCase()).filter(s -> s.length() > 11).map(s->s.substring(0,s.indexOf(" ") + 2) + ".").filter(s->s.substring(0,1).equals("M")).forEach(System.out::println);
*/
       /* BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream().filter(book -> book.getYearOfPublication() > 2005).collect(Collectors.toList());
        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream().forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

       /* BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream().filter(book -> book.getYearOfPublication() > 2005).map(Book::toString).collect(Collectors.joining(",\n","<<",">>"));
        System.out.println(theResultStringOfBooks);*/

    }
}
