package proxy.book_parser_proxy;

import proxy.concrete_subjects.BookParser;
import proxy.subject_interface.IBookParser;

public class LazyBookParserProxy implements IBookParser {
    private BookParser bookParser = null;
    private String book;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumWords() {
        if (bookParser == null) {
            bookParser = new BookParser(book);
        }
        return bookParser.getNumWords();
    }
}
