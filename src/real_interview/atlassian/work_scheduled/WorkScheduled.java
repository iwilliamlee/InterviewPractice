package real_interview.atlassian.work_scheduled;

import java.util.ArrayList;
import java.util.List;

public class WorkScheduled {

    public static List<String> workScheduled(int work_hours, int day_hours, String s) {

        int[] week = new int[7];
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '?') {
                week[i] = -1;
            }
            else {
                week[i] = Character.getNumericValue(s.charAt(i));
            }
        }
        return workRecurse(0, 0, work_hours, day_hours, week);
    }

    private static List<String> workRecurse(int index, int currentHours, int work_hours, int day_hours, int[] week) {
        List<String> list = new ArrayList<>();

        //If we're at the end of the list and we reached the target
        if(index == 7 && currentHours == work_hours) {
            list.add(intArrayString(week));
            return list;
        }
        //We exceeded hours || we're at the end of list, return empty list
        else if(currentHours > work_hours || index == 7){
            return list;
        }

        //If it is not empty, then move to next recursion
        if(week[index] != -1) {
            list.addAll(workRecurse(index + 1, currentHours + week[index], work_hours, day_hours, week));
        }
        else {
            int prevHour = week[index];
            for(int i = 0; i <= day_hours; i++) {
                week[index] = i;
                list.addAll(workRecurse(index + 1, currentHours + week[index], work_hours, day_hours, week));
            }
            week[index] = prevHour;
        }
        return list;
    }

    private static String intArrayString(int[] intArray) {
        StringBuilder sb = new StringBuilder();
        for(int i : intArray) {
            sb.append(i);
        }
        return sb.toString();
    }


}
