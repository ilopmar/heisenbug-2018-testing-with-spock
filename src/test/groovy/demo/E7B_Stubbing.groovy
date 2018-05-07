package demo

import spock.lang.Specification

class E7B_Stubbing extends Specification {

    void 'search some users'() {
        given: 'a stubbed repository service'
            def userRepositoryService = Stub(UserRepository) {
                findAllByLastName(lastName) >> [
                    new User('John', 'Doe'),
                    new User('Jane', 'Doe')
                ]
            }

        and: 'a search service'
            def searchService = new SearchService(userRepositoryService)

        when: 'searching for some users'
            def results = searchService.getUsersNameByLastName(lastName)

        then:
            results == ['JOHN', 'JANE']

        where:
            lastName = 'Doe'
    }
}
