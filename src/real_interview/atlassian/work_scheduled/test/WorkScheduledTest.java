import org.junit.Test;
import real_interview.atlassian.work_scheduled.WorkScheduled;

import java.util.List;

public class WorkScheduledTest {


    @Test
    public void Test1() {
        String s = "08??840";
        int work_hours = 24;
        int day_hours = 4;
        List<String> total = WorkScheduled.workScheduled(work_hours, day_hours, s);
        for(String week : total) {
            System.out.println(week);
        }
    }

    @Test
    public void Test2() {
        String s = "???????";
        int work_hours = 28;
        int day_hours = 4;
        List<String> total = WorkScheduled.workScheduled(work_hours, day_hours, s);
        for(String week : total) {
            System.out.println(week);
        }
    }


    @Test
    public void Test3() {
        String s = "?8088??";
        int work_hours = 30;
        int day_hours = 4;
        List<String> total = WorkScheduled.workScheduled(work_hours, day_hours, s);
        for(String week : total) {
            System.out.println(week);
        }
    }

}