package prog1

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ControllerListControllerSpec extends Specification implements ControllerUnitTest<ControllerListController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test 200 response"() {
        when:
            controller.index()
        then:
            status == 200
    }
}

