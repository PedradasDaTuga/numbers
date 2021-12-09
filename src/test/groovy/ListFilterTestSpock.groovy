package com.aor.numbers
import spock.lang.Specification

class ListFilterTestSpock extends Specification{
    def "Filtar"(){
        given:
        def inical=[-3,-2,1,3,4,6]
        def esperado=[4,6]
        def filter=Mock(GenericListFilter)
        def filterer= new ListFilterer(filter)
        filter.accept(-3)>>false
        filter.accept(-2)>>false
        filter.accept(1)>>false
        filter.accept(3)>>false
        filter.accept(4)>>true
        filter.accept(6)>> true

        expect:
        esperado==filterer.filter(inical)
    }

}
