package demo

import spock.lang.Specification

class E11_VerifyAll extends Specification {

    void 'should check all the asserts even if one of them fails'() {
        given:
            def user = new User(name: 'Iván', lastName: 'López')

        expect:
            verifyAll {
                user.name != 'Iván'
                user.lastName != 'López'
            }
    }
}
