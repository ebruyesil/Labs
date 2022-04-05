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
    @Override
    public void teaches(){ //it is a method

        System.out.println("Prof " + getName() + " is teaching now.");
    }
        @Override
        public void swim(SportCenter sportCenter){
            System.out.println("Professor " + getName() + " went to " + sportCenter.getName() +
                    " for swimming in " + sportCenter.getSwimmingPool());
        }
        @Override
        public void football(SportCenter sportCenter){
            System.out.println("Professor " + getName() + " went to " + sportCenter.getName() +
                    " for playing footbal at " + sportCenter.getFootballField());
        }

    }


