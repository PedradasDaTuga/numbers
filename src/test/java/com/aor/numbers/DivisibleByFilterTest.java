
package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
    @Test
    public void filtrodivisivelpor2(){
        DivisibleByFilter filter= new DivisibleByFilter(2);
        List<Integer> divisivel=Arrays.asList(-2,2,4,6,8,80000,5000,1000);
        List<Integer> naodiv=Arrays.asList(1,3,-3,69,42069);
        for (int i: divisivel)
            Assertions.assertTrue(filter.accept(i));

        for (int i: naodiv)
            Assertions.assertFalse(filter.accept(i));
    }
    @Test
    public void filtrodivisivelpor3(){
        DivisibleByFilter filter= new DivisibleByFilter(3);
        List<Integer> divisivel=Arrays.asList(-3,3,9,6,12,30,333,69,666);
        List<Integer> naodiv=Arrays.asList(1,2,-2,421,1000);
        for (int i: divisivel)
            Assertions.assertTrue(filter.accept(i));

        for (int i: naodiv)
            Assertions.assertFalse(filter.accept(i));
    }

}
