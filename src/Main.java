public class Main {

    /**
     * check the length of the string first
     * check the string to make sure it's has numerical values**/
    public static boolean validatePin(String pin) {
        if (pin == null) {
            return false;
        }
        if (pin.length() != 4 && pin.length() !=6) {
            return false;
        }
        if (pin.matches("\\d+")) {
            return true;
        }
        else
            return false;
    }

    public static int otherAngle(int angle1, int angle2) {
        return 180 - angle1 - angle2;
    }
    public static void main(String[] args) {
        System.out.println(validatePin(""));
        System.out.println(validatePin(null));
        System.out.println(validatePin("567fdfre45"));
        System.out.println(validatePin("5645"));
        System.out.println(validatePin("564556"));

        System.out.println(otherAngle(45, 60));


    }
}
