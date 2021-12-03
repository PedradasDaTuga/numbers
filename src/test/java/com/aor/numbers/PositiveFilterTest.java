package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PositiveFilterTest {

    @Test
    public void filtroPositivo(){
        PositiveFilter filter= new PositiveFilter();
        List<Integer> positiovs=Arrays.asList(1,2,44444,65345,5,Integer.MAX_VALUE);
        List<Integer> negativos=Arrays.asList(-1,-2,-44444,-65345,-5,Integer.MIN_VALUE);

        for(int i: positiovs)
            Assertions.assertTrue(filter.accept(i));

        for(int i: negativos)
            Assertions.assertFalse(filter.accept(i));
    }
}
