package org.example;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZipItTest
{
    ZipIt z;

    @BeforeEach
    void setUp()
    {
        z = new ZipIt();

    }

    @Test
    void intTest1()
    {
        List<Integer> l1 = List.of(1, 3, 5);
        List<Integer> l2 = List.of(2, 4, 6);
        List<Integer> checkl = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(z.zip(l1, l2), checkl);

    }

    @Test
    void intTest2()
    {
        List<Integer> l1 = List.of(10, 30, 50, 70, 80);
        List<Integer> l2 = List.of(20, 40, 60);
        List<Integer> checkl = List.of(10, 20, 30, 40, 50, 60, 70, 80);
        assertEquals(z.zip(l1, l2), checkl);

    }

    @Test
    void intTest3()
    {
        List<Integer> l1 = List.of(3, 9, 15, 21, 27);
        List<Integer> l2 = List.of(6, 12, 18, 24, 30, 33, 36);
        List<Integer> checkl = List.of(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36);
        assertEquals(z.zip(l1, l2), checkl);

    }

    @Test
    void stringTest1()
    {
        List<String> l1 = List.of("Math", "English", "Science", "History");
        List<String> l2 = List.of("Art", "STEM", "Health", "PE");
        List<String> checkl = List.of("Math", "Art", "English", "STEM", "Science", "Health", "History", "PE");
        assertEquals(z.zip(l1, l2), checkl);

    }

    @Test
    void stringTest2()
    {
        List<String> l1 = List.of("Iron Man", "Hulk", "Thor", "Captain America", "Black Widow", "Hawkeye");
        List<String> l2 = List.of("Batman", "Wonder Woman", "Superman", "The Flash");
        List<String> checkl = List.of("Iron Man", "Batman", "Hulk", "Wonder Woman", "Thor", "Superman", "Captain America", "The Flash", "Black Widow", "Hawkeye");
        assertEquals(z.zip(l1, l2), checkl);

    }

    @Test
    void stringTest3()
    {
        List<String> l1 = List.of("United States");
        List<String> l2 = List.of("Canada", "Mexico", "France", "United Kingdom", "Spain", "Russia", "Japan", "China", "India", "South Africa");
        List<String> checkl = List.of("United States", "Canada", "Mexico", "France", "United Kingdom", "Spain", "Russia", "Japan", "China", "India", "South Africa");
        assertEquals(z.zip(l1, l2), checkl);
        
    }

    @Test
    void doubleTest1()
    {
        List<Double> l1 = List.of(0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2, 1.4, 1.6, 1.8);
        List<Double> l2 = List.of(0.1, 0.3, 0.5, 0.7, 0.9, 1.1, 1.3, 1.5, 1.7, 1.9);
        List<Double> checkl = List.of(0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9);
        assertEquals(z.zip(l1, l2), checkl);

    }

    @Test
    void doubleTest2()
    {
        List<Double> l1 = List.of(1.1, 3.1, 5.1, 7.1, 8.1, 9.1, 10.1, 11.1, 12.1, 13.1, 14.1, 15.1, 16.1, 17.1, 18.1);
        List<Double> l2 = List.of(2.1, 4.1, 6.1);
        List<Double> checkl = List.of(1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1, 8.1, 9.1, 10.1, 11.1, 12.1, 13.1, 14.1, 15.1, 16.1, 17.1, 18.1);
        assertEquals(z.zip(l1, l2), checkl);

    }

    @Test
    void doubleTest3()
    {
        List<Double> l1 = List.of(0.0, 5.0, 10.0, 15.0, 20.0, 25.0, 27.5);
        List<Double> l2 = List.of(2.5, 7.5, 12.5, 17.5, 22.5);
        List<Double> checkl = List.of(0.0, 2.5, 5.0, 7.5, 10.0, 12.5, 15.0, 17.5, 20.0, 22.5, 25.0, 27.5);
        assertEquals(z.zip(l1, l2), checkl);
        
    }

}