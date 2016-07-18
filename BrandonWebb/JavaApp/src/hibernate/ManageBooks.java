package hibernate;
import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class ManageBooks {
   private static SessionFactory factory;
   public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) {
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex);
      }
      ManageBooks manageBook = new ManageBooks();
 
      /* Let us have a author object */
      Author author = manageBook.addAuthor("Manoj",32);
 
      /* employee record in the database */
     Integer empID1 = manageBook.addBook("One in a million", "Motivation", author);
      /* List all the books */
      manageBook.listBooks();
   }
   /* Method to add an author record in the database */
   public Author addAuthor(String name, int age) {
       // get the session from session factory
      Session session = factory.openSession();
      Transaction tx = null;
      Integer authorID = null;
      Author author = null;
      try{
          // begin the transaction from the sessiom
         tx = session.beginTransaction();
         // create a new object for author
         author = new Author(name, age);
         // save the author . It auto generates the Id .So need to give the id
         authorID = (Integer) session.save(author);
         //The changes to persistent object will be written to database.
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace();
      }finally {
          // close the session
         session.close();
      }
      return author;
   }
   /* Method to add an book record in the database */
   public Integer addBook(String title, String genre,
                              Author author){
       // Get the session from session factory
      Session session = factory.openSession();
      Transaction tx = null;
      Integer bookID = null;
      try{
         //begin the transaction
         tx = session.beginTransaction();
         //Create a new book object
         Book bookEntry = new Book(title, genre, author);
         // save the book object.The changes to persistent object will be written to database.
         bookID = (Integer) session.save(bookEntry);
        //The changes to persistent object will be written to database.
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace();
      }finally {
          //close the session.
         session.close();
      }
      return bookID;
   }
  /* Method to list all the books detail */
  public void listBooks( ){
      //Get the session from the session factory.
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         //Make an HQL query to get the results from books table . You can also use SQL here.
         List books = session.createQuery("FROM Book").list();
         //Iterate over the result and print it.
         for (Iterator iterator =
                           books.iterator(); iterator.hasNext();){
            Book book = (Book) iterator.next();
            System.out.print("Title : " + book.getTitle());
            System.out.print("\tGenre of the  book: " + book.getGenre());
            // Get the author of the book here.
            Author author = book.getAuthor();
            System.out.println("Author of the book ");
            System.out.println("\tname : " +  author.getName());
            System.out.println("\tage : " + author.getAge());
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace();
      }finally {
         session.close();
      }
   }
}