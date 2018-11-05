package org.quickstart.webservice.wink;

/**
 * A simple collection of domain model objects: 
 * a list of Book objects
 * 
 * @author Gabriel Mateescu gabriel@vt.edu
 */

import java.util.ArrayList;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementRef;

@XmlRootElement(name = "books")
public class BookList {

    @XmlElementRef
    ArrayList<Book> books;

    public BookList() {}

    public BookList(Map<Integer, Book> bookMap) {
        books = new ArrayList<Book>(bookMap.values());
    }
}
