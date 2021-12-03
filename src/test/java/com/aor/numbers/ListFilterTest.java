package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ListFilterTest {
    @Test
    public void filtrar(){
        List<Integer> Inicial= Arrays.asList(-3,-2,1,3,4,6);


        GenericListFilter filter=Mockito.mock(GenericListFilter.class);
        Mockito.when(filter.accept(-3)).thenReturn(false);
        Mockito.when(filter.accept(-2)).thenReturn(false);
        Mockito.when(filter.accept(1)).thenReturn(false);
        Mockito.when(filter.accept(3)).thenReturn(false);
        Mockito.when(filter.accept(4)).thenReturn(true);
        Mockito.when(filter.accept(6)).thenReturn(true);

        ListFilterer filterer=new ListFilterer(filter);
        List<Integer> Filtrada=filterer.filter(Inicial);

        Assertions.assertEquals(Arrays.asList(4,6), Filtrada);

    }
}
