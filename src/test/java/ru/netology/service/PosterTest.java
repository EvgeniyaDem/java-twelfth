package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PosterTest {
    @Test
    void shouldFindAll() {
        Poster poster = new Poster();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        String[] actual = poster.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastLessLimit() {
        Poster poster = new Poster();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        String[] actual = poster.findlast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void shouldFindLastLessNewLimit() {
        Poster poster = new Poster(7);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        String[] actual = poster.findlast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void shouldFindLastMoreLimit() {
        Poster poster = new Poster();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель Белград";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-Невидимка";
        String movie6 = "Тролли";
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        String[] actual = poster.findlast();
        String[] expected = {movie6, movie5, movie4, movie3, movie2};
        Assertions.assertArrayEquals(expected, actual);

    }
}
