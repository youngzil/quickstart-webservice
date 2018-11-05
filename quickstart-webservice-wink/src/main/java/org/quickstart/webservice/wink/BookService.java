package org.quickstart.webservice.wink;

/**
 * 
 * JAX-RS service that provide CRUD ops on Book resources
 *
 * @author Gabriel Mateescu gabriel@vt.edu
 */

// Annotations 

// Service designator
import javax.ws.rs.Path;

// Map HTTP methods to methods in this class
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

// Content handlers 
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

// Parameter injection
import javax.ws.rs.PathParam;

//
// JAX-RS service with relative root URI /books
//
@Path("/books")
public interface BookService {

    /**
     * Create a Book resource. A client issues a
     * 
     * POST /books Content-Type: application/xml
     *
     * request to send XML representation of the Book resource to be created.
     * 
     * @param is XML representation of the new book
     * @return the response to be sent to the client
     */
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response createBook(@Context UriInfo uriInfo, Book book);

    /**
     * Read the Book resources. A client issues a
     *
     * GET /books/ Content-Type: application/xml
     * 
     * request to get the XML representation of the Book resources.
     * 
     * @return response to be sent to the client
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public BookList getBook();

    /**
     * Read a Book resource. A client issues a
     *
     * GET /books/{id} Content-Type: application/xml
     * 
     * request to get the XML representation of the Book resource with this URI pattern.
     * 
     * @param id
     * @return response to be sent to the client
     */
    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Book getBook(@PathParam("id") int id);

    /**
     * Update a Book resource. A client issues a
     *
     * PUT /books/{id} Content-Type: application/xml
     * 
     * request to update the Book resource with the id matching the URI pattern /books/{id}.
     * 
     * @param id
     */
    @Path("{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void updateBook(@PathParam("id") int id, Book book_updated);

    /**
     * Delete a Book resource. A client issues a
     *
     * DELETE /books/{id} Content-Type: application/xml
     * 
     * request to delete the Book resource with the id matching the URI pattern /books/{id}.
     * 
     * @param id
     */
    @Path("{id}")
    @DELETE
    public void deleteBook(@PathParam("id") int id);

}
