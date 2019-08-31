package prog1

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class AuthorServiceSpec extends Specification {

    AuthorService authorService
    SessionFactory sessionFactory

    private Long setupData() {
        // Need to remove all data from tables just in case hibernate is already running.
        // https://stackoverflow.com/questions/8160296/grails-delete-all-data-from-table-domain-class-i-e-deleteall
        // Note even the deletes will be rolled backed.
        Book.executeUpdate('delete from Book')
        Author.executeUpdate('delete from Author')

        // Add to the tables
        Author testAuthor = new Author(name: "Test Author").save(flush: true, failOnError: true)
        new Author(name: "Test Author 2").save(flush: true, failOnError: true)
        new Book(title: "Test Book 0", publishYear: 1999, author: testAuthor).save(flush: true, failOnError: true)
        new Book(title: "Test Book 1", publishYear: 1999, author: testAuthor).save(flush: true, failOnError: true)
        new Book(title: "Test Book 2", publishYear: 1999, author: testAuthor).save(flush: true, failOnError: true)
        new Book(title: "Test Book 3", publishYear: 1999, author: testAuthor).save(flush: true, failOnError: true)
        new Book(title: "Test Book 4", publishYear: 1999, author: testAuthor).save(flush: true, failOnError: true)


        testAuthor.id
    }

    void "test get"() {
        long authorID = setupData()

        expect:
        authorService.get(authorID) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Author> authorList = authorService.list(max: 2, offset: 2)

        then:
        authorList.size() == 2
        println(authorList.size())
        authorList[0].name.equalsIgnoreCase("Test Author")
        authorList[1].name.equalsIgnoreCase("Test Author 2")
    }

    void "test count"() {
        setupData()

        expect:
        authorService.count() == 2
    }

    void "test delete"() {
        Long authorId = setupData()

        expect:
        authorService.count() == 2

        when:
        authorService.delete(authorId)
        sessionFactory.currentSession.flush()

        then:
        authorService.count() == 1
    }

    void "test save"() {
        when:
        Author author = new Author(name: "Test Author").save(flush: true, failOnError: true)
        authorService.save(author)

        then:
        author.id != null
    }
}
