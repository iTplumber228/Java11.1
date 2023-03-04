package ru.netology.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        manager.add("movie 1");
        manager.add("movie 2");
        manager.add("movie 3");

        String[] expected = {"movie 1", "movie 2", "movie 3"};

        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findLast(){
        MovieManager manager = new MovieManager(10);
        manager.add("movie 1");
        manager.add("movie 2");
        manager.add("movie 3");
        manager.add("movie 4");
        manager.add("movie 5");
        manager.add("movie 6");
        manager.add("movie 7");
        manager.add("movie 8");
        manager.add("movie 9");
        manager.add("movie 10");


        String[] expect = manager.findLast();
        String[] actual = {"movie 10", "movie 9", "movie 8", "movie 7", "movie 6", "movie 5", "movie 4", "movie 3", "movie 2", "movie 1"};
        Assertions.assertArrayEquals(expect, actual);
    }
    @Test
    public void findAllWithLimit(){
        MovieManager manager = new MovieManager(10);
        manager.add("movie 1");
        manager.add("movie 2");
        manager.add("movie 3");
        manager.add("movie 4");
        manager.add("movie 5");
        manager.add("movie 6");
        manager.add("movie 7");
        manager.add("movie 8");
        manager.add("movie 9");
        manager.add("movie 10");


        String[] expect = manager.findAll();
        String[] actual = {"movie 1", "movie 2", "movie 3", "movie 4", "movie 5", "movie 6", "movie 7", "movie 8", "movie 9", "movie 10"};
        Assertions.assertArrayEquals(expect, actual);
    }
    @Test
    public void findAllWithoutLimit(){
        MovieManager manager = new MovieManager();
        manager.add("movie 1");
        manager.add("movie 2");
        manager.add("movie 3");
        manager.add("movie 4");
        manager.add("movie 5");
        manager.add("movie 6");
        manager.add("movie 7");
        manager.add("movie 8");
        manager.add("movie 9");
        manager.add("movie 10");

        String[] expect = manager.findAll();
        String[] actual = {"movie 1", "movie 2", "movie 3", "movie 4", "movie 5", "movie 6", "movie 7", "movie 8", "movie 9", "movie 10"};
        Assertions.assertArrayEquals(expect, actual);
    }
    @Test
    public void findAllIfQtyLessLimit(){
        MovieManager manager = new MovieManager(10);
        manager.add("movie 1");
        manager.add("movie 2");
        manager.add("movie 3");
        manager.add("movie 4");
        manager.add("movie 5");
        manager.add("movie 6");
        manager.add("movie 7");
        manager.add("movie 8");
        manager.add("movie 9");
        manager.add("movie 10");

        String[] expect = manager.findLast();
        String[] actual = {"movie 10", "movie 9", "movie 8", "movie 7", "movie 6", "movie 5", "movie 4", "movie 3", "movie 2", "movie 1"};
        Assertions.assertArrayEquals(expect, actual);
    }


}
