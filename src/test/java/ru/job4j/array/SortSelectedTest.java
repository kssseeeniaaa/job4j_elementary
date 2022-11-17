package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3numbers() {
        int[] data = new int[] {17, 2, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 8, 17};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5numbers() {
        int[] data = new int[] {3, 0, 11, 15, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 3, 11, 15};
        assertThat(result).containsExactly(expected);
    }
}