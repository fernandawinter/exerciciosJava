package com.company.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class Exercicio05Test {

    Exercicio05 exercicio05;

    @BeforeEach
    public void setUp() {
        exercicio05 = new Exercicio05();
    }

    @Test
    public void somar2Com3DeveSer5() {
        int resultado = exercicio05.somar(2, 3);
        assertEquals(5, resultado, 0);
    }
}
