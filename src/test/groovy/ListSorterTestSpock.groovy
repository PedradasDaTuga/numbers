package com.aor.numbers
import spock.lang.Specification
class ListSorterTestSpock extends Specification{
    def "Sort"(){
        given:
        def sorter =new ListSorter()
        def lista=[3, 2, 6, 1, 4, 5, 7]

        when:
        def sorted=sorter.sort(lista)

        then:
        [1, 2, 3, 4, 5, 6, 7]==sorted
    }

    def "SortEx6"(){
        given:
        def sorter= new ListSorter()
        def lista=[1,2,4,2]

        when:
        def sorted=sorter.sort(lista)

        then:
        [1,2,2,4]==sorted
    }
}
