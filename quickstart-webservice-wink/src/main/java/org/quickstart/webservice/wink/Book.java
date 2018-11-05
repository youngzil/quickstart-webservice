package org.quickstart.webservice.wink;

/**
 * A simple domain model object: a book having 
 * two attributes: title and ISBN
 * 
 * @author Gabriel Mateescu gabriel@vt.edu
 */

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {

    @XmlAttribute(name = "id")
    private int id;

    @XmlElement(name = "title")
    private String title;

    @XmlElement(name = "isbn")
    private String ISBN;

    @XmlElement(name = "link")
    private Link link;

    public Book() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(String uri) {
        this.link = new Link(uri);
    }

}
