public class simple2Main {

    public static void main(String[] args){
        Professor p1; //pointer(in java referance)
        Professor p2;

        p1 = new Professor("Ensar Gül"); //object created and p1 point this object
        p1.teaches();

        p2 = new Professor("Raif");
        p2.teaches();

        Student p3,p4;

        p3 = new Student("Ebru Yeşil");
        p3.learnes();

        p4 = new Student("Efsa Ceren Zengin");
        p4.learnes();

    }
}
