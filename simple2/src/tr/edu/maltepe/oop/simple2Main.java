package tr.edu.maltepe.oop;

public class simple2Main {

    public static void main(String[] args){
        Professor p1; //pointer(in java referance)
        Professor p2;

        p1 = new Professor(); //object created and p1 point this object
        p1.setProf_name("Ensar Gül");
        p1.teaches();

        p1.setAge(50);
        System.out.println("Profesor Ensar Gül is "+ p1.getAge() +" years old.");

        p2 = new Professor();
        p2.setProf_name("Raif Ünal");
        p2.teaches();


        Student p3,p4;

        p3 = new Student("Ebru Yeşil");
        p3.learnes();

        p4 = new Student("Efsa Ceren Zengin");
        p4.learnes();

    }
}
