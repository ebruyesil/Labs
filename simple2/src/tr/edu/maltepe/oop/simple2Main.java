package tr.edu.maltepe.oop;

public class simple2Main {

    public static void main(String[] args){
        Professor p1; //pointer(in java referance)
        Professor p2;

        p1 = new Professor(); //object created and p1 point this object
        p1.setName("Ensar Gül");
        p1.teaches();
       // p1.football();

        p1.setAge(50);
        System.out.println("Profesor Ensar Gül is "+ p1.getAge() +" years old.");

        p2 = new Professor();
        p2.setName("Tuğba Akyel");
        p2.teaches();
       // p2.swim();


        Student s1,s2;

        s1 = new Student();
        s1.setName("Ebru Yeşil");
        s1.learnes();
       // s1.football();
        //s1.swim();

        s2 = new Student();
        s2.setName("İrem Yeşil");
        s2.learnes();
        //s2.swim();

        Books b1, b2, b3;
        b1 = new Books();
        b1.setBookname("Introduction To Java");


        b2 = new Books();
        b2.setBookname("Java Programming");

        b3 = new Books();
        b3.setBookname("Object Oriented Programming");

        Library lib;
        lib = new Library();

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.listBooks();

        lib.borrowBook(p1,b1);
        lib.borrowBook(s1,b2);
        lib.borrowBook(s2,b1);
        lib.giveBackBook(p1,b1);
        lib.borrowBook(p1,b3);
        lib.borrowBook(s2,b1);

        p1.haveBooks();
        s1.haveBooks();
        s2.haveBooks();

        SportCenter c1 = new SportCenter("Kafkale Sport Center",
                "football field","swimming pool.");
        SportCenter c2 = new SportCenter("Maltepe University Sport Center",
                "football field", "swimmig pool.");

        p1.swim(c2);
        s1.football(c1);
        p2.football(c2);
        s2.swim(c1);


    }
}

//next week
//inheritance student and prof to person zaten yapıldı
//override the method student or prof in person class
//interface swim or play football implemet for prof and student
//spor center swim over there spor center classı declare et prof swim where diye göstericek
// futbol da part of filed sport center anlamadım
//sport center have swimming pool and football area
