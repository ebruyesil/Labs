package tr.edu.maltepe.oop;

import java.util.Vector;

public class Library {

    private Vector vector;
    public Library(){

        vector = new Vector();
    }
    public void add_book(Books aBook){

        vector.add(aBook);
    }
    public void remove_book(Books rBook){
        vector.remove(rBook);
    }
    void listBooks(){
        System.out.println("Name of the books:");
        int i;
        for(i=0; i<vector.size(); i++){
            Books temp = (Books) vector.get(i);
            System.out.println(temp.getBookname());
        }
    }
    public void lendBook(Person person, Books book) {
        if (vector.contains(book)) {
            person.borrowBook(book);
            remove_book(book);
            System.out.println(book.getBookname() + " borrowed by " + person.getName());
        } else {
            System.out.println(book.getBookname() + " isn't avaliable");
        }
    }
        public void borrowBook(Person person, Books book){
            person.lendBook(book);
            add_book(book);
            System.out.println(book.getBookname() + " borrowed by " + person.getName());
        }
    }



