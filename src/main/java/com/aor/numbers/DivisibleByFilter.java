package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    private int divisor;

    public DivisibleByFilter(int divisor) {
        this.divisor = divisor;
    }
    public boolean accept(Integer number){
        if((number%divisor)==0)
            return true;
        else
            return false;
    }
}
