package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    private List<Integer> list;
    private List<Integer> expected;
   // private GenericListDeduplicator deduplicator;
   private ListSorter sorter;
    @BeforeEach
    public void setup() {
         list =Arrays.asList(1,2,4,2,5);
         expected = Arrays.asList(1,2,4,5);
    }

    public List<Integer> setlist(){
        List<Integer> lista=Arrays.asList(1,2,4,2,5);
        return lista;
    }

    public List<Integer> setexpected(){
        List<Integer> experada= Arrays.asList(1,2,4,5);
        return experada;
    }
    @Test
    public void deduplicate() {
      //  List<Integer> list = Arrays.asList(1,2,4,2,5);
      //  List<Integer> expected = Arrays.asList(1,2,4,5);

        GenericListSorter sorter = Mockito.mock(GenericListSorter.class);
        Mockito.when(sorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,2,4,5));

        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);
       // List<Integer> distinct = deduplicator.deduplicate(setlist());

        Assertions.assertEquals(expected, distinct);
       // Assertions.assertEquals(setexpected(), distinct);
    }

    @Test
    public void DeduplicarEx6(){
        List<Integer> Lista = Arrays.asList(1,2,4,2);

        GenericListSorter sorter= Mockito.mock(GenericListSorter.class);
        Mockito.when(sorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,2,4));

        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(Lista);

        Assertions.assertEquals(Arrays.asList(1,2,4), distinct);
    }
}
