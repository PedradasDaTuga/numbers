package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {
    private List<Integer> list;
    private List<Integer> expected;

    @BeforeEach
    public void setup(){
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    }

    public List<Integer> setlist(){
        List<Integer> lista=Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        return lista;
    }

    public List<Integer> setexpected(){
        List<Integer> experada= Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        return experada;
    }
    @Test
    public void sort() {
       // List<Integer> list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
       // List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);
       // List<Integer> sorted = sorter.sort(setlist());


        Assertions.assertEquals(expected, sorted);
       // Assertions.assertEquals(setexpected(), sorted);
    }

    @Test
    public void SortEx6(){
        List<Integer> Lista = Arrays.asList(1,2,4,2);
        List<Integer> Experado = Arrays.asList(1,2,2,4);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(Lista);

        Assertions.assertEquals(Experado,sorted);
    }
}
