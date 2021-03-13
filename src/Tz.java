import java.util.*;

public class Tz {

    public static void main(String[] args) {
        Tz tester = new Tz();
        System.out.println(tester.tzExists(12));
    }

    public boolean tzExists(int toBeChecked) {
        switch (toBeChecked) {
            case -12:
                return false;
            case -11:
                return false;
            case -10:
                return false;
            case -9:
                return false;
            case -8:
                return false;
            case -7:
                return false;
            case -6:
                return false;
            case -5:
                return false;
            case -4:
                return false;
            case -3:
                return false;
            case -2:
                return false;
            case -1:
                return false;
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            case 11:
                return true;
            case 12:
                return true;
        }
        System.out.println("here");
        return false;
    }

}
