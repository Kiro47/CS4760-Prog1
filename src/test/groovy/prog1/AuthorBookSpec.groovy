package prog1

import grails.testing.gorm.DataTest
import org.grails.testing.GrailsUnitTest
import spock.lang.Specification

class AuthorBookSpec extends Specification implements  DataTest{

    @Override
    boolean equals(Object o) {
        return super.equals(o)
    }

    def setup() {
        mockDomains(Author, Book)
    }

    def cleanup() {
    }

    void "test something"() {
        setup:
        new Author(name:"Stephen King")
                .addToBooks(new Book(title:"The Stand", publishYear:1978))
                .addToBooks(new Book(title:"The Shining", publishYear:1977))
                .save(flush: true, failOnError: true)

        new Author(name:"Mark Twain")
                .addToBooks(new Book(title:"Tom Sawyer", publishYear:1876))
                .addToBooks(new Book(title:"Huckelberry Finn", publishYear:1884))
                .save(flush: true, failOnError: true)

        expect:
        Author.count == 2
        Book.count == 4

        Author.findByName("Stephen King").books.size() == 2
        Author.findByName("Mark Twain").books.size() == 2
    }
}