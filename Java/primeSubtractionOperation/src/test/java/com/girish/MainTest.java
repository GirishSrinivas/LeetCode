package com.girish;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static Main main;

    @BeforeAll
    static void initAll() {
        main = new Main();
    }

    @Test
    void testMain(){
        assertAll(() -> Main.main(new String[] {"Hello"}));
    }
}