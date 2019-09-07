package prog1

import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class AuthorsControllerSpec extends Specification implements ControllerUnitTest<AuthorsController>, DataTest {

    void setupSpec(){
        mockDomains Author, Book
    }
    def 'Test the index method returns the correct model'(){
        given:
        new Author(name:"Author A")
                .addToBooks(new Book(title:"Title A", publishYear:1978))
                .save(flush: true, failOnError: true)
        new Author(name:"Author B")
                .addToBooks(new Book(title:"Title B", publishYear:1876))
                .save(flush: true, failOnError: true)
        new Author(name:"Author C")
                .addToBooks(new Book(title:"Title C", publishYear:1876))
                .save(flush: true, failOnError: true)

        when: 'The index action is executed'
        controller.index()

        then: 'The model is correct'
        model.authorList
        model.authorList.size == 3
        model.authorList ==[
                [author: "Author A",],
                [author: "Author B"],
                [author: "Author C"]
        ]

    } // End 'Test the index method returns the correct model'
}
