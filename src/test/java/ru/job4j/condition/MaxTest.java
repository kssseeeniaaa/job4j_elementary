package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int expected = 3;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To4Then4() {
        int left = 1;
        int right = 4;
        int expected = 4;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To4Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To5Then5() {
        int a = 1;
        int b = 2;
        int c = 5;
        int expected = 5;
        int result = Max.max(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To5To7Then7() {
        int a = 1;
        int b = 2;
        int c = 5;
        int d = 7;
        int expected = 7;
        int result = Max.max(a, b, c, d);
        assertThat(result).isEqualTo(expected);
    }
}