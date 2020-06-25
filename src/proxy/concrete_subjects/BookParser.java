package proxy.concrete_subjects;

import proxy.subject_interface.IBookParser;

public class BookParser implements IBookParser {

    private final int numWords;

    public BookParser(String book) {
        numWords = WordCounter.countWords(book);
    }

    @Override
    public int getNumWords() {
        return numWords;
    }
}

class WordCounter {
    static int countWords(String string) {
        int count = 0;

        char[] ch = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }
}
