public class SwitchCase {
    public static void main(String[] args) {
        String Colors = "green";
        switch (Colors) {
            case "red":
                System.out.println("STOP.");
                break;
            case "green":
                System.out.println("GO.");
                break;
            case "yellow":
                System.out.println("MOVE SLOW.");
                break;
            case "blue":
                System.out.println("NOT A TRAFFIC LIGHT.");
                break;
            default:
                System.out.println("INVALID COLOR");
        }
    }
}
