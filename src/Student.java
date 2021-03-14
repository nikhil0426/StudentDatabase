import java.text.SimpleDateFormat;
import java.util.*;

public class Student extends Tz {
    /*
      items for student:
      timezone
      address
      attendance
      bus tracking
      schedule/courses
      loans/money management (incl. currency converter, remianing balance, pay portal
      generated student ID
      library loans
     */

    public static ArrayList<String> attendance = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void checkIn() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        getAttendance().add(simpleDateFormat.format(date));
    }

    public static ArrayList<String> getAttendance() {
        return attendance;
    }

    public static void setAttendance(ArrayList<String> attendance) {
        Student.attendance = attendance;
    }
}
