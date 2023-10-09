package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int left = 2;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To4To3Then6() {
        int left = 6;
        int right = 4;
        int third = 3;
        int result = Max.max(left, right, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To6To10Then10() {
        int left = 2;
        int right = 6;
        int third = 10;
        int result = Max.max(left, right, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To3To8To1Then8() {
        int left = 6;
        int right = 3;
        int third = 8;
        int four = 1;
        int result = Max.max(left, right, third, four);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5To5To5Then5() {
        int left = 5;
        int right = 5;
        int third = 5;
        int four = 5;
        int result = Max.max(left, right, third, four);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}