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

    public void learnes(){     //it is overriding same name same argument same return type but different implementation
        System.out.println("It is important to learn");
    }

    public void teaches(){
        System.out.println("It is important to teach");
    }

   public void giveBook(Books book){
       books.add(book);
   }
    public void borrowBook(Books book){
        books.remove(book);
    }

    public void haveBooks(){
        System.out.println(getName() + "'s borrowed books:  ");
        for(int i=0; i<books.size(); i++){
            System.out.println(books.get(i).getBookname());
        }
    }


}
