package rain

class PublicLibrary : Library() {
    private val books = mutableListOf<Book>()
    override fun addBook(book: Book) {
        books.add(book)
    }

    override fun viewAllBooks() {
        for( book in books){
            println("Title : ${book.title}")
            println("Title : ${book.author}")
            println("Title : ${book.year}")
        }
    }

    override fun findBookByAuthor(author: String) {
        for (book in books){
            if(book.author == author){
                println("Title : ${book.title}")
                println("Title : ${book.author}")
                println("Title : ${book.year}")
            }
        }
    }

}