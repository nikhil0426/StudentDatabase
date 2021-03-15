import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
    /*
      items for student:
      -timezone
      -address
      -attendance
      bus tracking
      -schedule/courses
      loans/money management (incl. currency converter, remaining balance, pay portal
      generated student ID
      library loans
     */

    private Address address;
    private Tz tz;
    private static ArrayList<String> attendance = new ArrayList<>();
    private static ArrayList<String> courseSchedule = new ArrayList<>();
    private static final double avgCollegeCost = 10000.00;
    private static double federalAid = 0.00;
    private static double remainingBalance = 0.00;

    public static void checkIn() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        getAttendance().add(simpleDateFormat.format(date));
    }

    public static void busAssignment() {

    }

    public static void courses() {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            try {
                System.out.println("""
                        List of courses are as follows:\s
                        A.Math
                        B.English
                        C.Science
                        D.History
                        E.Technology
                        F.Art
                        Z.Exit""");
                switch (scan.nextLine().trim().toUpperCase().charAt(0)) {
                    case 'A' -> getCourseSchedule().add("Math");
                    case 'B' -> getCourseSchedule().add("English");
                    case 'C' -> getCourseSchedule().add("Science");
                    case 'D' -> getCourseSchedule().add("History");
                    case 'E' -> getCourseSchedule().add("Technology");
                    case 'F' -> getCourseSchedule().add("Art");
                    case 'Z' -> {
                        System.out.println("Exiting...");
                        running = false;
                    }
                    default -> System.out.println("Not a valid option!");
                }
            } catch (Exception e) {
                System.out.println("Not a valid option! Try again.");
            }
        }
        scan.close();
    }

    public static void balanceCalculator() {

    }

    public static ArrayList<String> getAttendance() {
        return attendance;
    }

    public static void setAttendance(ArrayList<String> attendance) {
        Student.attendance = attendance;
    }

    public static ArrayList<String> getCourseSchedule() {
        return courseSchedule;
    }

    public static void setCourseSchedule(ArrayList<String> courseSchedule) {
        Student.courseSchedule = courseSchedule;
    }

    public static double getAvgCollegeCost() {
        return avgCollegeCost;
    }

    public static double getFederalAid() {
        return federalAid;
    }

    public static void setFederalAid(double federalAid) {
        Student.federalAid = federalAid;
    }

    public static double getRemainingBalance() {
        return remainingBalance;
    }

    public static void setRemainingBalance(double remainingBalance) {
        Student.remainingBalance = remainingBalance;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Tz getTz() {
        return tz;
    }

    public void setTz(Tz tz) {
        this.tz = tz;
    }
}
