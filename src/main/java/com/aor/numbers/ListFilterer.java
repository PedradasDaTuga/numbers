package com.aor.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFilterer {
    private GenericListFilter filter;
    public ListFilterer(GenericListFilter filter){
        this.filter=filter;
    }
    public List<Integer> filter(List<Integer> list){
        List<Integer> ListaFinal=new ArrayList<>();
        for(int i: list){
            if(filter.accept(i))
                ListaFinal.add(i);
        }
        return ListaFinal;
    };
}
