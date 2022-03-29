package tr.edu.maltepe.oop;

public class simple2Main {

    public static void main(String[] args){
        Professor p1; //pointer(in java referance)
        Professor p2;

        p1 = new Professor(); //object created and p1 point this object
        p1.setName("Ensar Gül");
        p1.teaches();
        p1.football();

        p1.setAge(50);
        System.out.println("Profesor Ensar Gül is "+ p1.getAge() +" years old.");

        p2 = new Professor();
        p2.setName("Raif Ünal");
        p2.teaches();
        p2.swim();


        Student p3,p4;

        p3 = new Student();
        p3.setName("Ebru Yeşil");
        p3.learnes();
        p3.football();
        p3.swim();

        p4 = new Student();
        p4.setName("İrem Yeşil");
        p4.learnes();
        p4.swim();

        Books b1, b2, b3;
        b1 = new Books();
        b1.setBookname("Introduction To Java");


        b2 = new Books();
        b2.setBookname("Java Programming");

        b3 = new Books();
        b3.setBookname("Object Oriented Programming");

        Library lib;
        lib = new Library();

        lib.add_book(b1);
        lib.add_book(b2);
        lib.add_book(b3);

        lib.listBooks();

        lib.lendBook(p1,b1);
        lib.lendBook(p3,b2);
        lib.lendBook(p4,b1);
        lib.borrowBook(p1,b1);
        lib.lendBook(p1,b3);
        lib.lendBook(p4,b1);

        p1.HaveBooks();
        p3.HaveBooks();
        p4.HaveBooks();




    }
}
