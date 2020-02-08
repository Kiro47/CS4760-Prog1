package prog1

class HomeController {

    def index() { }

    private static final boolean debugTime = true //flag for debug printing

    def showTime() {
        if(debugTime)println "In showTime"
        render "The time is ${new Date()}"
    }

    def getMostRecentBook(){
        Book lastBook = Book.last()
        render "${lastBook} by ${lastBook.author}"
    }
}
