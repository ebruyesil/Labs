package tr.edu.maltepe.oop;

    public class Professor extends Person implements doSport{
       /* private String prof_name;

        public String getProf_name(){
            return prof_name;
        }

        public void setProf_name(String prof_name)  {
            this.prof_name = prof_name;
        }*/

    /*Professor(String name){
        prof_name = name;
    }*/
    void teaches(){ //it is a method

        System.out.println("Prof " + getName() + " is teaching now.");
    }
        public void football(){
            System.out.println("Professor also playing football");
        }
        public void swim(){
            System.out.println("Professor also swimming");
        }


    }


