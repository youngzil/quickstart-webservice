package org.quickstart.webservice.wink;

/**
 * @author Gabriel Mateescu gabriel@vt.edu
 */

//
// Annotations 
//

// Designate this class as a JAX-RS resource/service
import javax.ws.rs.Path;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
//import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;

// Util classes
import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
//import java.util.List;

// Exceptions
import javax.ws.rs.WebApplicationException;

//import org.apache.wink.common.model.synd.SyndLink;
//import org.apache.wink.server.utils.LinkBuilders;
//import org.apache.wink.server.utils.SystemLinksBuilder;
//import org.apache.wink.server.utils.BaseLinksBuilder;

/**
 * A Singleton class that uses an in-memory map to keep the book objects. This way, we maintain the state of the resources in memory.
 * 
 */
@Path("/books")
public class BookServiceImpl implements BookService {

    private static BookServiceImpl instance = null;

    private BookServiceImpl() {
        // Prevent instantiation by clients
    }

    public synchronized static BookServiceImpl getInstance() {
        if (instance == null) {
            instance = new BookServiceImpl();
        }
        return instance;
    }

    // Map to store Book objects in memory and retrieve them by id
    // To be thread-save, use either ComcurrentHashMap or Hashtable
    private Map<Integer, Book> bookMap = new ConcurrentHashMap<Integer, Book>();

    // Atomic operations on integers
    private AtomicInteger seqNumber = new AtomicInteger();

    /**
     * Create a Book resource to respond to an HTTP request
     * 
     * POST /books
     * 
     * @param uriInfo
     * @param Book
     * @return Response
     */
    public Response createBook(@Context UriInfo uriInfo, Book book) throws WebApplicationException {

        // Set the Book's id and link fields and put the book in the map
        int id = seqNumber.incrementAndGet();
        book.setId(id);
        String uri_book = uriInfo.getAbsolutePath().toString() + "/" + id;
        book.setLink(uri_book);
        bookMap.put(id, book);

        // Return HTTP response with status code 201 Created
        String uri = "/books/" + book.getId();
        return Response.created(URI.create(uri)).build();
    }

    /**
     * Return a Book collection resource in response to an HTTP request
     * 
     * GET /books
     * 
     * @param id
     * @return Response
     */
    public BookList getBook() {

        BookList bl = new BookList(bookMap);
        return bl;
    }

    /**
     * Return a Book resource in response to an HTTP request
     * 
     * GET /books/{id}
     * 
     * @param id
     * @return Response
     */
    public Book getBook(@PathParam("id") int id) throws WebApplicationException {

        // The id parameter is used to query for
        // a Book object in the bookMap map.
        // If the book with that id does not exist, throw an
        // WebApplicationException, which sets the HTTP response
        // code to 404 Not Found.
        final Book book = bookMap.get(id);
        if (book == null) {
            // sets HTTP status code 404 Not Found
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return book;
    }

    /**
     * Update a Book resource in response to an HTTP request
     * 
     * PUT /books/{id}
     * 
     * @param id
     */
    public void updateBook(@PathParam("id") int id, Book book_updated) throws WebApplicationException {

        Book book = bookMap.get(id);
        if (book == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        // Book book_updated = convertXmlToBook(is);
        book.setTitle(book_updated.getTitle());
        book.setISBN(book_updated.getISBN());
    }

    /**
     * Delete a Book resource in response to an HTTP request
     * 
     * DELETE /books/{id}
     * 
     * @param id
     */
    public void deleteBook(@PathParam("id") int id) throws WebApplicationException {

        Book book = bookMap.get(id);
        if (book == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        bookMap.remove(id);
    }
}
