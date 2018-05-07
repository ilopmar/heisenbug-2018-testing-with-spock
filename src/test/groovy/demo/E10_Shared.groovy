package demo

import spock.lang.Shared
import spock.lang.Specification

class E10_Shared extends Specification {

    @Shared
    def user = new User('Iván', 'López')

    void 'should print user'() {
        expect:
            println user
    }

    void 'should println user (II)'() {
        expect:
            println user
    }

}
