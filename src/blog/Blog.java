
package blog;

import java.time.LocalDate;
import java.time.Period;
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
      List<Comment> allComents=new ArrayList();
      for(Note note:notes)
      {
          allComents.addAll(note.getComments());
      }
      Comment result= allComents.get(0);
      for(Comment comment:allComents)
      {
          LocalDate d1= comment.getData();
          LocalDate d2= result.getData();
          if(d1.isAfter(d2))
          {
              result=comment;
          }
      }
           
       
    }
    public List<Comment> mostComments()
    {
        return null;
    }
}
