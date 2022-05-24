package ro.fasttrackit.lab13.exercitii.tema;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private ArrayList<String> activitati;

    DaySchedule( ArrayList<String> activitati) {
        this.activitati = activitati;
    }

    public ArrayList<String> getActivitati() {
        return activitati;
    }

    public void setActivitati(ArrayList<String> activitati) {
        this.activitati = activitati;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "activitati=" + activitati +
                '}';
    }
}
