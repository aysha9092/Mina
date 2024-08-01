package rain

abstract class Library {
    abstract fun addBook(book:Book)
    abstract fun viewAllBooks()
    abstract fun findBookByAuthor(author:String)
}