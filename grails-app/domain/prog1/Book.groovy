package prog1

class Book {

    String title
    Integer publishYear

    static belongsTo = [author:Author]

    static constraints = {
    }
}
