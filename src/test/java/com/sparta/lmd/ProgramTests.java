package com.sparta.lmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTests {
    @Test
    void basicTest(){
        Assertions.assertEquals(1,1);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 11})
    @DisplayName("check that 5,10,11 returns Good morning!")
    void checkForGoodMorning(int time){
        Assertions.assertEquals("Good morning!", Program.getGreeting(time));
    }
    @ParameterizedTest
    @ValueSource(ints = {14, 15, 12})
    @DisplayName("check that 14, 15, 12 returns Good afternoon!")
    void checkForGoodAfternoon(int time){
        Assertions.assertEquals("Good afternoon!", Program.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {20,22,25}) //25 should be invalid
    @DisplayName("check that 20,22,25 returns Good evening!")
    void checkForGoodEvening(int time){
        Assertions.assertEquals("Good evening!", Program.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {65,26,25}) //25 should be invalid
    @DisplayName("check that 20,22,25 returns Good evening!")
    void checkForInvalidTime(int time){
        Assertions.assertEquals("Invalid Time!", Program.getGreeting(time));
    }


}
