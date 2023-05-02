package com.sparta.lmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classifications_Tests {
    @ParameterizedTest
    @ValueSource(ints = {5,10,12})
    @DisplayName("checks film classifications for children under 12")
    void checkUnderTwelve(int age){
        Assertions.assertEquals("U & PG films are available.",FilmClassifications.availableClassifications(age));
    }
    @ParameterizedTest
    @ValueSource(ints = {12,14,15})
    @DisplayName("checks film classifications for children between 12 and 14")
    void checkBetweenTwelveAndFourteen(int age){
        Assertions.assertEquals("U, PG, 12A & 12 films are available.",FilmClassifications.availableClassifications(age));
    }
    @ParameterizedTest
    @ValueSource(ints = {15,17,18})
    @DisplayName("checks film classifications for children between 15 and 17")
    void checkBetweenFifteenAndSeventeen(int age){
        Assertions.assertEquals("U, PG, 12A, 12 & 15 films are available.",FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {14,18,63})
    @DisplayName("checks film classifications for people over 18")
    void checkAboveEighteen(int age){
        Assertions.assertEquals("All films are available.", FilmClassifications.availableClassifications(age));
    }


}
