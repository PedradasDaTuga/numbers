package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ListAggregatorTest {
    private List<Integer> list;
  //1  private ListDeduplicator deduplicator;
    private ListSorter sorter;
    @BeforeEach
    public void setup() {
      //  Integer a[]=new Integer[]{1,2,4,2,5};
      //  List<Integer> list=Arrays.asList(a);
       list =Arrays.asList(1,2,4,2,5);

    }

    public List<Integer> preparar(){
        List<Integer> teste=Arrays.asList(1,2,4,2,5);
        return teste;
    }
    @Test
    public void sum() {
        //List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);
       // int sum = aggregator.sum(preparar());

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
      //  List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);
       // int max = aggregator.max(preparar());
        Assertions.assertEquals(5, max);
    }


    @Test
    public void min() {
        // List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);
       // int min = aggregator.min(preparar());
        Assertions.assertEquals(1, min);
    }



    @Test
    public void max_bug_7263(){
        List<Integer> ajuda= Arrays.asList(-1,-4,-5);
        ListAggregator aggregator= new ListAggregator();
        int max= aggregator.max(ajuda);
        Assertions.assertEquals(-1,max);
    }



    @Test
    public void distinct() {
       // List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        sorter=new ListSorter();
      //  sorter.sort(1,2,4,2,5);

        ListDeduplicator deduplicator = new ListDeduplicator(new ListSorter());
        int distinct = aggregator.distinct(list,deduplicator);

        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void DistinctEx5(){
        List<Integer> ajuda = Arrays.asList(1,2,4,2);
        ListAggregator aggregator = new ListAggregator();
       // int distinct = aggregator.distinct(ajuda);
        //ListDeduplicator deduplicator = new ListDeduplicator();

        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList())).thenReturn(Arrays.asList(1, 2, 4));
        int distinct = aggregator.distinct(Arrays.asList(1, 2, 4, 2),deduplicator);

        Assertions.assertEquals(3, distinct);
      //  Assertions.assertEquals(3, 3);
    }
}
