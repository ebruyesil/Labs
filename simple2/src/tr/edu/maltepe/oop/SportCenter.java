package tr.edu.maltepe.oop;

import java.util.ArrayList;

public class SportCenter {
    private String name;
    private String footballField;
    private String swimmingPool;

    SportCenter(String name_, String footballField_, String swimmingPool_){
        name = name_;
        footballField = footballField_;
        swimmingPool = swimmingPool_;
    }


    public String getSwimmingPool() {
        return swimmingPool;
    }
    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
    public String getFootballField() {
        return footballField;
    }
    public void setFootballField(String footballField) {
        this.footballField = footballField;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
