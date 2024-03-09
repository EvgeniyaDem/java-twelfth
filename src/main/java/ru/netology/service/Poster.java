package ru.netology.service;
import java.util.Arrays;

public class Poster {
    private String[] movies = new String[0];
    private int limit;

    public Poster() {
        this.limit = 5;
    }
    public Poster(int limit) {
        this.limit = limit;
    }
    public void add(String newMovie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }
    public String[] findAll() {
        return movies;
    }
    public String[] findlast() {
        int resLength;
        if (limit < movies.length) {
            resLength = limit;
        } else {
            resLength = movies.length;
        }
        String[] result = new String[resLength];
        for (int i = 0; i < resLength; i++) {
            result[i] = movies[movies.length -1 - i];
        }
        return result;
    }

}
