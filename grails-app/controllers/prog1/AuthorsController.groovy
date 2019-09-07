package prog1

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AuthorsController {
    static final boolean debugIndex = true
    def index() {

        def authors = Author.listOrderByName()

        // println outputs to console
        if(debugIndex){
            println ""
            authors.each {println(it.name + "books: " + it.getBooks().toString())}
        }

        // Make a list of all books title and authors
        def authorList = []
        for(int i=0; i<authors.size; i++){
            def bkAuthor = [:]
            bkAuthor.put('author',authors.get(i))
            authorList << bkAuthor
        }
        if(debugIndex){
            println " "
            println authorList
        }

        // So that the unit test can access the model, we need
        // to explicitly use the render method and specify the model.
        // We also have to explicitly specify the view, or
        // text will be rendered and not the view.
        render view: "index", model: [authorList: authorList]

        // If we did not have to access the model in the view
        // then we could use the default behavior and return
        // [bkList: bkList]
    }
}
