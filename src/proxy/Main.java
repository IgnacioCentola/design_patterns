package proxy;

import proxy.book_parser_proxy.LazyBookParserProxy;

public class Main {
    public static void main(String[] args) {
        LazyBookParserProxy proxy =
                new LazyBookParserProxy(FakeBookGenerator.generate());

        System.out.println("Nº of words in given book: " + proxy.getNumWords());
    }
}
