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
        @Override
        public void learnes(){

            System.out.println("Student " + getName() + " is learning now.");
        }
    @Override
    public void swim(SportCenter sportCenter){
        System.out.println("Student " + getName() + " went to " + sportCenter.getName() +
                " for swimming in " + sportCenter.getSwimmingPool());
    }
    @Override
    public void football(SportCenter sportCenter){
        System.out.println("Student " + getName() + " went to " + sportCenter.getName() +
                " for playing footbal at " + sportCenter.getFootballField());
    }

    }
