
package blog;

import java.time.LocalDate;
import java.util.*;

public class Blog {
    private List<Note> notes = new ArrayList();
    private String title;
    
    public Blog(String title){
        this.title=title;
    }
    
   public void add(Note wpis)
   {
       notes.add(wpis);
   }
    public Note mostPopular()
    {
       if(notes.isEmpty()) return null;
       Note result = notes.get(0);
       for(Note note:notes)
       {
           int count= note.numberOfComments();
           if(count> result.numberOfComments())
           {
               result=note;
           } 
       }
       return result;
    }
    public List<Note> mostPopulars()
    {
        return null; 
    }
    public Comment lastComment()
    {
        for(Note note:notes)
        {
            for(Comment comment:note.getComments())
            {
                LocalDate date=comment.getData();
                if(date.)
            }
        }
    }
    public List<Comment> mostComments()
    {
        return null;
    }
}
