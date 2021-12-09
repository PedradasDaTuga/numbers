package com.aor.numbers
import spock.lang.Specification

class PositiveFilterTestSpock extends Specification{
    def "Filtro Positivo"(){
        given:
        def filter= new PositiveFilter()

        when:
        def positivos=[1,2,44444,65345,5,Integer.MAX_VALUE]
        def negativos=[-1,-2,-44444,-65345,-5,Integer.MIN_VALUE]

        then:
        positivos.every{it->filter.accept(it)}
        negativos.every{it->!filter.accept(it)}
    }
}
