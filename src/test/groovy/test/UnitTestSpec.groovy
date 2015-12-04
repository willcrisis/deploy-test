package test

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class UnitTestSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
		given:
		def three = 1 + 2
        expect:"Just to see if it is doing it correctly"
        3 == three
    }
}