public class Professor {
    private String prof_name;

    public String getProf_name(){
        return prof_name;
    }

    public void setProf_name(String prof_name) {
        this.prof_name = prof_name;
    }

    /*Professor(String name){
        prof_name = name;
    }*/
    void teaches(){ //it is a method
       System.out.println("Prof " + getProf_name() + " is teaching now.");
    }


}
