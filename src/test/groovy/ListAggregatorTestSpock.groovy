package com.aor.numbers
import spock.lang.Specification

class ListAggregatorTestSpock extends Specification{
    def "Sum"(){
        given:
        def list=[1,2,4,2,5]
        def agregator=new ListAggregator()

        expect:
        14==agregator.sum(list)
    }

    def "Max"(){
        given:
        def list=[1,2,4,2,5]
        def agregator=new ListAggregator()

        expect:
        5==agregator.max(list)
    }

    def "Min"(){
        given:
        def list=[1,2,4,2,5]
        def agregator=new ListAggregator()

        expect:
        1==agregator.min(list)
    }

    def " max_bug_7263"(){
        given:
        def ajuda=[-1,-4,-5]
        def agregator=new ListAggregator()

        expect:
        -1==agregator.max(ajuda)
    }

    def"distinct"(){
        given:
        def list=[1,2,4,2,5]
        def agregator=new ListAggregator()
        def deduplicator=Mock(GenericListDeduplicator)
        deduplicator.deduplicate([1,2,4,2,5]) >> [1,2,4,5]

        when:
        int distinct=agregator.distinct(list,deduplicator);

        then:
        4==distinct
    }

    def"DistinctEx5"(){
        given:
        def ajuda = [1,2,4,2]
        def agregator=new ListAggregator()
        def deduplicator=Mock(GenericListDeduplicator)
        deduplicator.deduplicate(ajuda) >> [1,2,4]

        when:
        int distinct=agregator.distinct(ajuda,deduplicator)

        then:
        3==distinct
    }
}
