package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 2;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHorizontalHasOneSpace() {
        char[][] input = {
                {'X', ' ', 'X'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
        };
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHorizontalHasAnotherSymbol() {
        char[][] input = {
                {'Y', 'Y', 'Y'},
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
        };
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasNotMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', 'X', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }

    @Test
    public void whenVerticalHasAnotherSymbol() {
        char[][] input = {
                {'Y', ' ', ' '},
                {'Y', 'X', 'X'},
                {'Y', 'X', 'X'},
        };
        int colum = 0;
        boolean result = MatrixCheck.monoHorizontal(input, colum);
        assertThat(result).isFalse();
    }

        @Test
        public void whenDiagonalFullX() {
            char[][] input = {
                    {'X', ' ', ' '},
                    {' ', 'X', ' '},
                    {' ', ' ', 'X'},
            };
            char[] result = MatrixCheck.extractDiagonal(input);
            char[] expected = {'X', 'X', 'X'};
            assertThat(result).containsExactly(expected);
        }

        @Test
        public void whenDiagonalFullOne() {
            char[][] input = {
                    {'1', ' ', ' '},
                    {' ', '1', ' '},
                    {' ', ' ', '1'},
            };
            char[] result = MatrixCheck.extractDiagonal(input);
            char[] expected = {'1', '1', '1'};
            assertThat(result).containsExactly(expected);
        }

        @Test
        public void whenDiagonalMix() {
            char[][] input = {
                    {'X', ' ', ' '},
                    {' ', 'Y', ' '},
                    {' ', ' ', 'Z'},
            };
            char[] result = MatrixCheck.extractDiagonal(input);
            char[] expected = {'X', 'Y', 'Z'};
            assertThat(result).containsExactly(expected);
        }
    }