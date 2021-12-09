package com.aor.numbers
import spock.lang.Specification

class DivisiblebyFilterTestSpock extends Specification{
    def "filtro divisivel por 2"(){
        given:

        def filter=new com.aor.numbers.DivisibleByFilter(2);

        when:
        def divisivel=[-2,2,4,6,8,80000,5000,1000]
        def naodiv=[1,3,-3,69,42069]

        then:
        divisivel.every{it->filter.accept(it)}
        naodiv.every{it->!filter.accept(it)}
    }
    def "filtro divisivel por 3"(){
        given:

        def filter=new com.aor.numbers.DivisibleByFilter(3);

        when:
        def divisivel=[-3,3,9,6,12,30,333,69,666]
        def naodiv=[1,2,-2,421,1000]

        then:
        divisivel.every{it->filter.accept(it)}
        naodiv.every{it->!filter.accept(it)}
    }
}
