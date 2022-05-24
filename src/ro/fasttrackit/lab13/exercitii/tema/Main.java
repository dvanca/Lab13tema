package ro.fasttrackit.lab13.exercitii.tema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DailyPlanner planner = new DailyPlanner();
//        List<String> listaActivitati = new ArrayList<>();
//        listaActivitati.add("paintball");
//        listaActivitati.add("bowling");
        planner.addActivity(EnumDays.MONDAY, "activitate2");
        planner.addActivity(EnumDays.MONDAY, ("basket"));
        System.out.println(planner);
        planner.removeActivity(EnumDays.MONDAY, "activitate1");
        System.out.println(planner);
        planner.addActivity(EnumDays.MONDAY, ("fotbal"));
        System.out.println(planner);
        planner.addActivity(EnumDays.TUESDAY, "fussball");
        System.out.println(planner);
        System.out.println(planner.getActivities(EnumDays.MONDAY));
        try{
            System.out.println(planner.getActivities(EnumDays.THURSDAY));
        }
        catch (NoActivityExeption e){
            System.out.println(planner);
            System.out.println("Am prins eroarea :" + e.getMessage());
        }

    }
}
