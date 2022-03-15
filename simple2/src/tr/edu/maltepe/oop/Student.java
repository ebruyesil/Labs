package tr.edu.maltepe.oop;

public class Student extends Person {


        private String std_name;
        public String getStd_name(){
            return std_name;
        }
    public void setStd_name(String std_name)  {
        this.std_name = std_name;
    }

        /*Student(String name){

            std_name = name;
        }*/
        void learnes(){

            System.out.println("Student " + getStd_name() + " is learning now.");
        }
    }
