package ro.fasttrackit.lab13.exercitii.tema;

import java.util.*;

public class DailyPlanner {
    private Map<EnumDays,DaySchedule> lista;

    DailyPlanner() {
        lista = new HashMap<EnumDays, DaySchedule>();
    }

    public void addActivity(EnumDays day, String activitate) throws NoActivityExeption {
        if (activitate == null) {
            throw new NoActivityExeption("Nu exista activitati alocate !");
        } else {
            DaySchedule existingSchedule = lista.get(day);
            if (existingSchedule != null) {
                ArrayList<String> newList = existingSchedule.getActivitati();
                newList.add(activitate);
                lista.put(day, new DaySchedule(newList));
            }else{
                lista.put(day, new DaySchedule(new ArrayList<String>(Arrays.asList(activitate))));
            }

        }
    }

    public void removeActivity(EnumDays day, String activitate) {
            DaySchedule findSchedule = lista.get(day);
            if(findSchedule!=null){
                ArrayList<String> newActivitati = findSchedule.getActivitati();
                newActivitati.remove(activitate);
            }
        }
       // if (!flag){
           // throw new NoActivityExeption("Nfljalsdfjlk");
       // }


    @Override
    public String toString() {
        return "DailyPlanner{" +
                "lista=" + lista +
                '}';
    }

    public ArrayList<String> getActivities(EnumDays day){
        try {
            return lista.get(day).getActivitati();
        }catch (NullPointerException e) {
            throw new NoActivityExeption("Nu exista !");
        }
    }
}
