package prog1

class Author {

    String name
    static hasMany = [books: Book]
    static constraints = {
    }
}
