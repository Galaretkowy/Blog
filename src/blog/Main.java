
package blog;


public class Main {
    
    public static void main()
    {
        Blog blog = new Blog("Blog programistyczny");
        
        Note note = new Note("Co novego w Java 9","Co novego w Java 9");
        Note note1 = new Note("Kolekcje","Kolekcje");
        Note note2 = new Note("Listy","Listy");
        
        blog.add(note2);
        blog.add(note1);
        blog.add(note);
        
        Comment c1 = new Comment("jan","Kolekcje sa trudne");
        
    }
    
}
