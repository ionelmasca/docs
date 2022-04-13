package com.company;

import static com.company.Euclid.gcd;
import static org.junit.jupiter.api.Assertions.*;

class EuclidTest {

    @org.junit.jupiter.api.Test
    void gcdtest() {
        assertEquals(2, gcd(2, 4)); //ecp
        assertNotEquals(2.15, gcd(2, 4)); //ecp
        assertNotEquals(2.15f, gcd(2, 4)); //ecp

        assertNotEquals(2.15, gcd(Integer.MAX_VALUE+1, Integer.MAX_VALUE+1)); //bva
        assertEquals(Integer.MAX_VALUE, gcd(Integer.MAX_VALUE, Integer.MAX_VALUE)); //bva
        assertEquals(Integer.MAX_VALUE-1, gcd(Integer.MAX_VALUE-1, Integer.MAX_VALUE-1)); //bva

        assertNotEquals(2.15, gcd(-Integer.MAX_VALUE-2, -Integer.MAX_VALUE-2)); //bva
        assertEquals(-Integer.MAX_VALUE, gcd(-Integer.MAX_VALUE, -Integer.MAX_VALUE)); //bva
        assertEquals(-Integer.MAX_VALUE+1, gcd(-Integer.MAX_VALUE+1, -Integer.MAX_VALUE+1)); //bva

    }
}