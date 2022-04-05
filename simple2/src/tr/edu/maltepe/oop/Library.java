package tr.edu.maltepe.oop;

import java.util.Vector;

public class Library {

    private Vector vector;
    public Library(){
        vector = new Vector();
    }

    public void addBook(Books book){
        vector.add(book);
    }

    public void removeBook(Books book){
        vector.remove(book);
    }

    void listBooks(){
        System.out.println("Name of the books:");
        int i;
        for(i=0; i<vector.size(); i++){
            Books temp = (Books) vector.get(i);
            System.out.println(temp.getBookname());
        }
    }
    public void borrowBook(Person person, Books book) {
        if (vector.contains(book)) {
            person.giveBook(book);          //showed borrowed books
            removeBook(book);                // avaliable situation
            System.out.println(book.getBookname() + " borrowed by " + person.getName());
        } else {
            System.out.println(book.getBookname() + " isn't avaliable");
        }
    }
        public void giveBackBook(Person person, Books book){
            person.borrowBook(book);
            addBook(book);
            System.out.println(book.getBookname() + " gave back to library by " + person.getName());
        }
    }



