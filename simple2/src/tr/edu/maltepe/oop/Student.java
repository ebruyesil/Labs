package tr.edu.maltepe.oop;

public class Student extends Person implements doSport{


      /*  private String std_name;
        public String getStd_name(){
            return std_name;
        }
    public void setStd_name(String std_name)  {

            this.std_name = std_name;
    }*/

        /*Student(String name){

            std_name = name;
        }*/
        void learnes(){

            System.out.println("Student " + getName() + " is learning now.");
        }

        public void football(){
            System.out.println("Student playing football");
        }
        public void swim(){
        System.out.println("Student swimming");
        }


    }
