public class BreakStaement {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 9) {
                break; // Exit the loop when 9 or 16 is encountered
            }
            System.out.println(i);
        }
    }
}
