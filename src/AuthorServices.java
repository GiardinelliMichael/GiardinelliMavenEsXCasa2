@Path("books/{book_id}/authors")
public class AuthorServices extend {
	@GET
	public List list(@PathParam("{book_id}") long bookId) {
		Author author = new Author();
		author.setId(1);
		author.setName("Joanne");
		author.setSurname("Rowling");
		List authors = new ArrayList();
		authors.add(author);
		return authors;
	}
	
	public void filter(ContainerRequestContext requestContext)
			throws IOException;
	
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException;
	
	Response toResponse(E exception);
	
	public void onStartup(Container container);
	public void onReload(Container container);
	public void onShutdown(Container container);
}