package ru.netology.javaqamvn.services;

public class MovieManager {

    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 10;

    }

    public MovieManager(int limit) {
        this.limit = limit;

    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;


    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {

        int resultLength;
        if (movies.length < 10) {
            resultLength = movies.length;
        } else {
            resultLength = 10;
        }
        String[] result = new String[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;

    }
}

