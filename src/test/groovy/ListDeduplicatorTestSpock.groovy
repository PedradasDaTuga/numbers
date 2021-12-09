package com.aor.numbers

import spock.lang.Specification

class ListDeduplicatorTestSpock extends Specification{
        def "Deduplicate"(){
            given:
            def inical=[1,2,4,2,5]
            def sorter=Mock(GenericListSorter)
            def deduplicator= new ListDeduplicator(sorter)
            sorter.sort(inical)>>[1,2,2,4,5]

            when:
            def distinct=deduplicator.deduplicate(inical)
            then:
            [1,2,4,5]==distinct
        }
    def "DeduplicarEx6" (){
        given:
        def lista=[1,2,4,2]
        def sorter=Mock(GenericListSorter)
        sorter.sort(lista)>>[1,2,2,4]
        def deduplicator=new ListDeduplicator(sorter)

        when:
        def distinct=deduplicator.deduplicate(lista)

        then:
        [1,2,4]==distinct
    }

}
