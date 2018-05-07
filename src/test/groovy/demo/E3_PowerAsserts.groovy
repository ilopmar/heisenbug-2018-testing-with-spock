package demo

import spock.lang.Specification

class E3_PowerAsserts extends Specification {

    void 'should fail with numbers'() {
        expect:
            2 * 3 == 5 * 4
    }

    void 'should fail with maps and lists'() {
        given:
            def data = [
                name  : 'Iván',
                age   : 38,
                childs: [
                    [name: 'Judith', age: 10], [name: 'Adriana', age: 7]
                ]
            ]

        expect:
            data.childs.name.first() == 'Adriana'
    }
}
