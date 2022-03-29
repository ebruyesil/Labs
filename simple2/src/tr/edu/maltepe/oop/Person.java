package tr.edu.maltepe.oop;
import java.util.Vector;

public class Person {

    private Vector<Books> books = new Vector<Books>();

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private int age;
    public int getAge(){
        return age;
    }

   public void setAge(int age){
       this.age = age;
   }

   public void borrowBook(Books bBook){
       books.add(bBook);
   }
   public void HaveBooks(){
    System.out.println(name+"'s borrowed books:  ");
    for (int i = 0; i< books.size();i++)
    {
        System.out.println(books.get(i).getBookname());
    }
}
    public void lendBook(Books lbook){
        books.remove(lbook);
    }

}
