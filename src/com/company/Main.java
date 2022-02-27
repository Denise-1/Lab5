// Denise Chen
// IS 147-04
// d189@umbc.edu
// 11/12/2021
// part 1 create methods for adding, subtraction, multiplication, division
// part 2 use method overload for a  book description

package com.company;

public class Main {
    static int num1 = 10;    // global variable 1 (for part 1)
    static int num2 = 5;    // global variable 2 (for part 1)

    public static void main(String[] args) {
    // part 1
        System.out.println("[Part 1] Calculations: \n");
        Calc calculation = new Calc();

        System.out.println("The sum of the global variables is: " + calculation.add(num1, num2));
        System.out.println("The difference of the global variables is: " + calculation.subtract(num1, num2));
        System.out.println("The product of the global variables is: " + calculation.multiply(num1, num2));
        System.out.println("The quotient of the global variables is: " + calculation.divide(num1, num2));

        System.out.println("----------------------------");
        System.out.println("[Part 2] Book 1:\n");
    // part 2
        Book book1 = new Book();    // creates new object
        book1.name();

        System.out.println(book1.bookDescription("The Witcher"));
        System.out.println(book1.bookDescription("The author is: ", "Andrzej Sapkowski"));
        System.out.println("The book has: " + book1.bookDescription( 400) + " pages");
        System.out.println("The price of the book is: $" + book1.bookDescription(8.50));

        System.out.println("----------------------------");
        System.out.println("[Part 2] Book 2:\n");
        Book book2 = new Book();
        book2.name();

        System.out.println(book2.bookDescription("Da Vinci Code"));
        System.out.println(book2.bookDescription("The author is: ", "Dan Brown"));
        System.out.println("The book has: " + book2.bookDescription(689) + " pages");
        System.out.println("The price of the book is: $" + book2.bookDescription(3.86));

    }// public static void main END
}// public class Main END